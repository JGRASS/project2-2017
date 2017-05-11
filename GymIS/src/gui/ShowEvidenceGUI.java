package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ShowEvidenceGUI extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6588263387146736360L;
	
	private JPanel contentPane;
	private JLabel lblId;
	private JTextField textField;
	private JButton btnPrikaziEvidenciju;
	private JButton btnOdustani;
	private JLabel lblNePostojiTakav;

	/**
	 * Create the frame.
	 */
	public ShowEvidenceGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ShowEvidenceGUI.class.getResource("/resources/1493413484_gym.png")));
		setTitle("Prikazi evidenciju za clana");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 354, 178);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblId());
		contentPane.add(getTextField());
		contentPane.add(getBtnPrikaziEvidenciju());
		contentPane.add(getBtnOdustani());
		contentPane.add(getLblNePostojiTakav());
		this.getRootPane().setDefaultButton(btnPrikaziEvidenciju);
		lblNePostojiTakav.setVisible(false);
		this.setLocationRelativeTo(null);
		this.setModal(true);
	}

	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID:");
			lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblId.setBounds(58, 45, 46, 14);
		}
		return lblId;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(114, 43, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnPrikaziEvidenciju() {
		if (btnPrikaziEvidenciju == null) {
			btnPrikaziEvidenciju = new JButton("Prikazi evidenciju");
			btnPrikaziEvidenciju.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int id;
					try {
						id = Integer.parseInt(textField.getText());
					} catch (NumberFormatException e) {
						lblNePostojiTakav.setVisible(true);
						return;
					}
					if(GUIController.showEvidenceForId(id)) {
						dispose();	
					} else {
						lblNePostojiTakav.setVisible(true);
						return;
					}
					
				}
			});
			btnPrikaziEvidenciju.setBounds(30, 103, 140, 23);
		}
		return btnPrikaziEvidenciju;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIController.disposeEvidence();
					dispose();
				}
			});
			btnOdustani.setBounds(180, 103, 140, 23);
		}
		return btnOdustani;
	}
	private JLabel getLblNePostojiTakav() {
		if (lblNePostojiTakav == null) {
			lblNePostojiTakav = new JLabel("Ne postoji takav clan u evidenciji!");
			lblNePostojiTakav.setForeground(Color.RED);
			lblNePostojiTakav.setBounds(114, 74, 224, 14);
		}
		return lblNePostojiTakav;
	}

	protected void setErrorLabelVisible(boolean b) {
		lblNePostojiTakav.setVisible(b);
	}
}
