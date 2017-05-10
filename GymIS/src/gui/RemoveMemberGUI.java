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

public class RemoveMemberGUI extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2346512954430307786L;
	private JPanel contentPane;
	private JLabel lblId;
	private JTextField textField;
	private JButton btnIzbrisi;
	private JButton btnOdustani;
	private JLabel lblNePostojiTakav;

	/**
	 * Create the frame.
	 */
	public RemoveMemberGUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(RemoveMemberGUI.class.getResource("/resources/1493413484_gym.png")));
		setTitle("Izbrisi clana");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 353, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblId());
		contentPane.add(getTextField());
		contentPane.add(getBtnIzbrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getLblNePostojiTakav());
		lblNePostojiTakav.setVisible(false);
		this.setLocationRelativeTo(null);
		this.setModal(true);
	}

	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID: ");
			lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblId.setBounds(96, 43, 46, 14);
		}
		return lblId;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(154, 41, 144, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnIzbrisi() {
		if (btnIzbrisi == null) {
			btnIzbrisi = new JButton("Izbrisi");
			btnIzbrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int a = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite da izbrisete clana?", "Paznja!",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (a == JOptionPane.YES_OPTION) {
						// TODO
					}
						
				}
			});
			btnIzbrisi.setBounds(53, 107, 89, 23);
		}
		return btnIzbrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(189, 107, 89, 23);
		}
		return btnOdustani;
	}
	private JLabel getLblNePostojiTakav() {
		if (lblNePostojiTakav == null) {
			lblNePostojiTakav = new JLabel("Ne postoji takav clan!");
			lblNePostojiTakav.setForeground(Color.RED);
			lblNePostojiTakav.setBounds(108, 82, 190, 14);
		}
		return lblNePostojiTakav;
	}
}
