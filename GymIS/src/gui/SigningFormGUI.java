package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class SigningFormGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8988557370745817158L;
	
	private JPanel contentPane;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel label;
	private JTextField textFieldUsername;
	private JButton btnPrijaviSe;
	private JButton btnOdustani;
	private JLabel lblPogresniPodaci;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SigningFormGUI frame = new SigningFormGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SigningFormGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SigningFormGUI.class.getResource("/resources/1493413484_gym.png")));
		setResizable(false);
		setTitle("Prijava");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblUsername());
		contentPane.add(getLblPassword());
		contentPane.add(getLabel());
		contentPane.add(getTextFieldUsername());
		contentPane.add(getBtnPrijaviSe());
		contentPane.add(getBtnOdustani());
		contentPane.add(getLblPogresniPodaci());
		contentPane.add(getPasswordField());
		this.setLocationRelativeTo(null);
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("Username: ");
			lblUsername.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblUsername.setBounds(46, 108, 84, 25);
		}
		return lblUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password: ");
			lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblPassword.setBounds(46, 144, 84, 25);
		}
		return lblPassword;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel(new ImageIcon(SigningFormGUI.class.getResource("/resources/1493411578_app_type_gym_512px_GREY.png")));
			label.setMaximumSize(new Dimension(75, 75));
			label.setMinimumSize(new Dimension(75, 75));
			label.setPreferredSize(new Dimension(75, 75));
			label.setBounds(147, 11, 105, 75);
		}
		return label;
	}
	private JTextField getTextFieldUsername() {
		if (textFieldUsername == null) {
			textFieldUsername = new JTextField();
			textFieldUsername.setBounds(140, 111, 195, 20);
			textFieldUsername.setColumns(10);
		}
		return textFieldUsername;
	}
	private JButton getBtnPrijaviSe() {
		if (btnPrijaviSe == null) {
			btnPrijaviSe = new JButton("Prijavi se");
			btnPrijaviSe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO ovo mora da se zavrsi
					lblPogresniPodaci.setVisible(true);
				}
			});
			btnPrijaviSe.setBounds(88, 180, 89, 23);
		}
		return btnPrijaviSe;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			btnOdustani.setBounds(218, 180, 89, 23);
		}
		return btnOdustani;
	}
	private JLabel getLblPogresniPodaci() {
		if (lblPogresniPodaci == null) {
			lblPogresniPodaci = new JLabel("Pogresni podaci!");
			lblPogresniPodaci.setVisible(false);
			lblPogresniPodaci.setForeground(Color.red);
			lblPogresniPodaci.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblPogresniPodaci.setBounds(140, 97, 112, 14);
		}
		return lblPogresniPodaci;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(140, 147, 195, 20);
		}
		return passwordField;
	}
}
