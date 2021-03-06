package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecordGUI extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1983850170058781183L;
	
	private JPanel contentPane;
	private JLabel lblId;
	private JTextField textField;
	private JButton btnEvidentiraj;
	private JButton btnOdustani;
	private JLabel lblNePostojiTakav;

	/**
	 * Create the frame.
	 */
	public RecordGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(RecordGUI.class.getResource("/resources/1493413484_gym.png")));
		setTitle("Evidentiraj dolazak");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 430, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblId());
		contentPane.add(getTextField());
		contentPane.add(getBtnEvidentiraj());
		contentPane.add(getBtnOdustani());
		contentPane.add(getLblNePostojiTakav());
		this.getRootPane().setDefaultButton(btnEvidentiraj);
		lblNePostojiTakav.setVisible(false);
		this.setLocationRelativeTo(null);
		this.setModal(true);
	}

	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID:");
			lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblId.setBounds(64, 47, 46, 14);
		}
		return lblId;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(120, 45, 194, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnEvidentiraj() {
		if (btnEvidentiraj == null) {
			btnEvidentiraj = new JButton("Evidentiraj");
			btnEvidentiraj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					lblNePostojiTakav.setVisible(false);
					int id;
					try {
						 id = Integer.parseInt(textField.getText());
					} catch (NumberFormatException e) {
						lblNePostojiTakav.setVisible(true);
						return;
					}
					int option = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite da evidentirate dolazak clana " + id + " ?", "Paznja!", JOptionPane.YES_NO_OPTION);
					if(option == JOptionPane.YES_OPTION) {
						if(GUIController.enterRecord(id)) {
							JOptionPane.showMessageDialog(null, "Evidentirano!");
							dispose();
							return;
						} else {
							lblNePostojiTakav.setVisible(true);
						}
					}
					
				}
			});
			btnEvidentiraj.setBounds(83, 112, 113, 23);
		}
		return btnEvidentiraj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(206, 112, 113, 23);
		}
		return btnOdustani;
	}
	private JLabel getLblNePostojiTakav() {
		if (lblNePostojiTakav == null) {
			lblNePostojiTakav = new JLabel("Ne postoji takav clan!");
			lblNePostojiTakav.setForeground(Color.RED);
			lblNePostojiTakav.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblNePostojiTakav.setBounds(126, 87, 194, 14);
		}
		return lblNePostojiTakav;
	}
}
