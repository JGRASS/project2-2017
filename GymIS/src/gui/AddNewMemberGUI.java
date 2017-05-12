package gui;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domen.Member;

import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class AddNewMemberGUI extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2204628797640708755L;
	
	private JPanel contentPane;
	private JLabel label;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblPol;
	private JLabel lblBrojTelefona;
	private JLabel lblClanarina;
	private JLabel lblDo;
	private JTextField textFieldIme;
	private JTextField textFieldPrezime;
	private JComboBox comboBox;
	private JTextField textFieldClanarina;
	private JLabel lblyyyymmdd;
	private JLabel lblTelefon;
	private JLabel lblDatumRodjenja;
	private JLabel lblVisina;
	private JLabel lblTezina;
	private JTextField textFieldTelefon;
	private JTextField textFieldDatumRodjenja;
	private JTextField textFieldVisina;
	private JTextField textFieldTezina;
	private JButton btnDodaj;
	private JButton btnOdustani;
	private JLabel lblObaveznaPoljaNisu;
	private JLabel lblobaveznaPolja;
	private JLabel label_1;

	/**
	 * Create the frame.
	 */
	public AddNewMemberGUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(AddNewMemberGUI.class.getResource("/resources/1493411578_app_type_gym_512px_GREY.png")));
		setTitle("Dodaj novog clana");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 580, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel());
		contentPane.add(getLblIme());
		contentPane.add(getLblPrezime());
		contentPane.add(getLblPol());
		contentPane.add(getLblBrojTelefona());
		contentPane.add(getLblClanarina());
		contentPane.add(getLblDo());
		contentPane.add(getTextFieldIme());
		contentPane.add(getTextFieldPrezime());
		contentPane.add(getComboBox());
		contentPane.add(getTextFieldClanarina());
		contentPane.add(getLblyyyymmdd());
		contentPane.add(getLblTelefon());
		contentPane.add(getLblDatumRodjenja());
		contentPane.add(getLblVisina());
		contentPane.add(getLblTezina());
		contentPane.add(getTextFieldTelefon());
		contentPane.add(getTextFieldDatumRodjenja());
		contentPane.add(getTextFieldVisina());
		contentPane.add(getTextFieldTezina());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		contentPane.add(getLblObaveznaPoljaNisu());
		contentPane.add(getLblobaveznaPolja());
		contentPane.add(getLabel_1());
		this.setLocationRelativeTo(null);
		this.setModal(true);
		
		
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel(new ImageIcon(SigningFormGUI.class.getResource("/resources/1493411578_app_type_gym_512px_GREY.png")));
			label.setBounds(10, 11, 111, 90);
		}
		return label;
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime:* ");
			lblIme.setBounds(131, 24, 72, 14);
		}
		return lblIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime:* ");
			lblPrezime.setBounds(131, 49, 72, 14);
		}
		return lblPrezime;
	}
	private JLabel getLblPol() {
		if (lblPol == null) {
			lblPol = new JLabel("Pol:*  ");
			lblPol.setBounds(131, 74, 72, 14);
		}
		return lblPol;
	}
	private JLabel getLblBrojTelefona() {
		if (lblBrojTelefona == null) {
			lblBrojTelefona = new JLabel("Uplacena*");
			lblBrojTelefona.setBounds(131, 99, 72, 14);
		}
		return lblBrojTelefona;
	}
	private JLabel getLblClanarina() {
		if (lblClanarina == null) {
			lblClanarina = new JLabel("clanarina:");
			lblClanarina.setBounds(131, 112, 72, 14);
		}
		return lblClanarina;
	}
	private JLabel getLblDo() {
		if (lblDo == null) {
			lblDo = new JLabel("do");
			lblDo.setBounds(147, 125, 56, 14);
		}
		return lblDo;
	}
	private JTextField getTextFieldIme() {
		if (textFieldIme == null) {
			textFieldIme = new JTextField();
			textFieldIme.setBounds(208, 21, 111, 20);
			textFieldIme.setColumns(10);
		}
		return textFieldIme;
	}
	private JTextField getTextFieldPrezime() {
		if (textFieldPrezime == null) {
			textFieldPrezime = new JTextField();
			textFieldPrezime.setBounds(208, 46, 111, 20);
			textFieldPrezime.setColumns(10);
		}
		return textFieldPrezime;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"M", "Z"}));
			comboBox.setBounds(208, 71, 111, 20);
		}
		return comboBox;
	}
	private JTextField getTextFieldClanarina() {
		if (textFieldClanarina == null) {
			textFieldClanarina = new JTextField();
			textFieldClanarina.setBounds(208, 109, 111, 20);
			textFieldClanarina.setColumns(10);
		}
		return textFieldClanarina;
	}
	private JLabel getLblyyyymmdd() {
		if (lblyyyymmdd == null) {
			lblyyyymmdd = new JLabel("*yyyy-mm-dd");
			lblyyyymmdd.setBounds(208, 125, 106, 14);
		}
		return lblyyyymmdd;
	}
	private JLabel getLblTelefon() {
		if (lblTelefon == null) {
			lblTelefon = new JLabel("Telefon:");
			lblTelefon.setBounds(329, 24, 91, 14);
		}
		return lblTelefon;
	}
	private JLabel getLblDatumRodjenja() {
		if (lblDatumRodjenja == null) {
			lblDatumRodjenja = new JLabel("Datum rodjenja:");
			lblDatumRodjenja.setBounds(329, 49, 91, 14);
		}
		return lblDatumRodjenja;
	}
	private JLabel getLblVisina() {
		if (lblVisina == null) {
			lblVisina = new JLabel("Visina:");
			lblVisina.setBounds(329, 74, 91, 14);
		}
		return lblVisina;
	}
	private JLabel getLblTezina() {
		if (lblTezina == null) {
			lblTezina = new JLabel("Tezina:");
			lblTezina.setBounds(329, 112, 91, 14);
		}
		return lblTezina;
	}
	private JTextField getTextFieldTelefon() {
		if (textFieldTelefon == null) {
			textFieldTelefon = new JTextField();
			textFieldTelefon.setBounds(430, 21, 111, 20);
			textFieldTelefon.setColumns(10);
		}
		return textFieldTelefon;
	}
	private JTextField getTextFieldDatumRodjenja() {
		if (textFieldDatumRodjenja == null) {
			textFieldDatumRodjenja = new JTextField();
			textFieldDatumRodjenja.setBounds(430, 46, 111, 20);
			textFieldDatumRodjenja.setColumns(10);
		}
		return textFieldDatumRodjenja;
	}
	private JTextField getTextFieldVisina() {
		if (textFieldVisina == null) {
			textFieldVisina = new JTextField();
			textFieldVisina.setBounds(430, 71, 111, 20);
			textFieldVisina.setColumns(10);
		}
		return textFieldVisina;
	}
	private JTextField getTextFieldTezina() {
		if (textFieldTezina == null) {
			textFieldTezina = new JTextField();
			textFieldTezina.setBounds(430, 109, 111, 20);
			textFieldTezina.setColumns(10);
		}
		return textFieldTezina;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String firstName = textFieldIme.getText();
					String lastName = textFieldPrezime.getText();
					String gender = comboBox.getSelectedItem().toString();
					String birthdate = textFieldDatumRodjenja.getText();
					String phone = textFieldTelefon.getText();
					String endDate = textFieldClanarina.getText();
					String height = textFieldVisina.getText();
					String weight = textFieldTezina.getText();
					
					if (firstName == null || firstName == "" || lastName == null || lastName == "" ||
							endDate == null || endDate == "" ) {
						lblObaveznaPoljaNisu.setVisible(true);
						return;
					}
					
					Date birth, end;
					double h = 0, w = 0;
					
					try {
						h = Double.parseDouble(height);
						w = Double.parseDouble(weight);
					} catch (NumberFormatException e) {
						
					}
					
					try {
						end = Date.valueOf(endDate);
					} catch (Exception e) {
						lblObaveznaPoljaNisu.setVisible(true);
						return;
					}
					
					try {
						birth = Date.valueOf(birthdate);
					} catch (Exception e2) {
						birth = null;
					}
					
					boolean added = GUIController.addNewMember(firstName, lastName, gender.charAt(0), birth, phone, end, h, w);
					
					if (added) {
						JOptionPane.showMessageDialog(null, "Novi clan uspesno dodat!");
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Clan nije dodat!", "Greska", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnDodaj.setBounds(167, 184, 89, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(318, 184, 89, 23);
		}
		return btnOdustani;
	}
	private JLabel getLblObaveznaPoljaNisu() {
		if (lblObaveznaPoljaNisu == null) {
			lblObaveznaPoljaNisu = new JLabel("Obavezna polja nisu popunjena ili je unos nepravilan!");
			lblObaveznaPoljaNisu.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblObaveznaPoljaNisu.setForeground(Color.RED);
			lblObaveznaPoljaNisu.setBounds(167, 150, 374, 14);
			lblObaveznaPoljaNisu.setVisible(false);
		}
		return lblObaveznaPoljaNisu;
	}
	private JLabel getLblobaveznaPolja() {
		if (lblobaveznaPolja == null) {
			lblobaveznaPolja = new JLabel("*Obavezna polja");
			lblobaveznaPolja.setBounds(430, 188, 111, 14);
		}
		return lblobaveznaPolja;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("!");
			label_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			label_1.setForeground(Color.RED);
			label_1.setBounds(551, 49, 13, 14);
			label_1.setVisible(false);
		}
		return label_1;
	}
}
