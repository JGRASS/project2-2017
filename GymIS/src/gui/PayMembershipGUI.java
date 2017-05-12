package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class PayMembershipGUI extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2761965247939711896L;
	
	private JPanel contentPane;
	private JLabel lblId;
	private JTextField textFieldId;
	private JLabel lblUplataDo;
	private JTextField textField;
	private JLabel lblyyyymmdd;
	private JButton btnUplati;
	private JButton btnOdustani;
	private JLabel lblNepostojeciClanIli;

	/**
	 * Create the frame.
	 */
	public PayMembershipGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PayMembershipGUI.class.getResource("/resources/1493413484_gym.png")));
		setTitle("Uplata clanarine");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 364, 182);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblId());
		contentPane.add(getTextFieldId());
		contentPane.add(getLblUplataDo());
		contentPane.add(getTextField());
		contentPane.add(getLblyyyymmdd());
		contentPane.add(getBtnUplati());
		contentPane.add(getBtnOdustani());
		contentPane.add(getLblNepostojeciClanIli());
		this.getRootPane().setDefaultButton(btnUplati);
		this.setLocationRelativeTo(null);
		this.setModal(true);
	}

	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID:");
			lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblId.setBounds(10, 40, 46, 14);
		}
		return lblId;
	}
	private JTextField getTextFieldId() {
		if (textFieldId == null) {
			textFieldId = new JTextField();
			textFieldId.setBounds(66, 37, 86, 20);
			textFieldId.setColumns(10);
		}
		return textFieldId;
	}
	private JLabel getLblUplataDo() {
		if (lblUplataDo == null) {
			lblUplataDo = new JLabel("Uplata do: ");
			lblUplataDo.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblUplataDo.setBounds(162, 40, 77, 14);
		}
		return lblUplataDo;
	}
	private JTextField getTextField() {
		if (textField == null) {
			try {
				MaskFormatter formatter = new MaskFormatter("####-##-##");
				textField = new JFormattedTextField(formatter);
			} catch (ParseException e) {
				textField = new JFormattedTextField();
			}
			//textField = new JTextField();
			textField.setBounds(249, 37, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblyyyymmdd() {
		if (lblyyyymmdd == null) {
			lblyyyymmdd = new JLabel("*yyyy-mm-dd");
			lblyyyymmdd.setBounds(249, 62, 86, 14);
		}
		return lblyyyymmdd;
	}
	private JButton getBtnUplati() {
		if (btnUplati == null) {
			btnUplati = new JButton("Uplati");
			btnUplati.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int id;
					String endDate = textField.getText();
					try {
						id = Integer.parseInt(textFieldId.getText());
					} catch (NumberFormatException e1) {
						lblNepostojeciClanIli.setVisible(true);
						return;
					}
					
					boolean paid = GUIController.payMembership(id, endDate);
					
					if (paid) {
						lblNepostojeciClanIli.setVisible(false);
						JOptionPane.showMessageDialog(null, "Clanarina uspesno uplacena");
						dispose();
					} else {
						lblNepostojeciClanIli.setVisible(true);
					}
				}
			});
			btnUplati.setBounds(79, 119, 89, 23);
		}
		return btnUplati;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(191, 119, 89, 23);
		}
		return btnOdustani;
	}
	private JLabel getLblNepostojeciClanIli() {
		if (lblNepostojeciClanIli == null) {
			lblNepostojeciClanIli = new JLabel("Nepostojeci clan ili nepravilan unos datuma!");
			lblNepostojeciClanIli.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNepostojeciClanIli.setForeground(Color.RED);
			lblNepostojeciClanIli.setBounds(66, 95, 269, 14);
			lblNepostojeciClanIli.setVisible(false);
		}
		return lblNepostojeciClanIli;
	}
}
