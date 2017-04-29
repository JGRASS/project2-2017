package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class FindMemberGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4094854439029941645L;
	
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panelId;
	private JPanel panelIme;
	private JPanel panelPrezime;
	private JLabel lblId;
	private JTextField textFieldId;
	private JButton btnPronadji;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblPol;
	private JLabel lblClanarinaVaziDo;
	private JLabel lblVaziDo;
	private JLabel lblDatumRodjenja;
	private JLabel lblBrojTelefona;
	private JLabel lblVisina;
	private JLabel lblTezina;
	private JLabel lblDatumUpisa;
	private JLabel lblImePrikaz;
	private JLabel lblPrezimePrikaz;
	private JLabel lblPolPrikaz;
	private JLabel lblClanarinaPrikaz;
	private JLabel lblDatumUpisaPrikaz;
	private JLabel lblDatumRodjenjaPrikaz;
	private JLabel lblTelefonPrikaz;
	private JLabel lblVisinaPrikaz;
	private JLabel lblTezinaPrikaz;
	private JLabel lblNePostojiClan;
	private JLabel lblIme_1;
	private JTextField textFieldIme;
	private JButton btnPretragaIme;
	private JLabel lblSviClanoviSa;
	private JLabel lblNePostojeClanovi;
	private JLabel lblPrezime_1;
	private JTextField textFieldPrezime;
	private JButton btnPronadji_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindMemberGUI frame = new FindMemberGUI();
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
	public FindMemberGUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(FindMemberGUI.class.getResource("/resources/1493413484_gym.png")));
		setTitle("Pretraga");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 488, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getTabbedPane(), BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		lblNePostojiClan.setVisible(false);
		lblSviClanoviSa.setVisible(false);
		lblNePostojeClanovi.setVisible(false);
		lblNewLabel.setVisible(false);
		lblNewLabel_1.setVisible(false);
	}

	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.addTab("ID", null, getPanelId(), null);
			tabbedPane.addTab("Ime", null, getPanelIme(), null);
			tabbedPane.addTab("Prezime", null, getPanelPrezime(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanelId() {
		if (panelId == null) {
			panelId = new JPanel();
			panelId.setLayout(null);
			panelId.add(getLblId());
			panelId.add(getTextFieldId());
			panelId.add(getBtnPronadji());
			panelId.add(getLblIme());
			panelId.add(getLblPrezime());
			panelId.add(getLblPol());
			panelId.add(getLblClanarinaVaziDo());
			panelId.add(getLblVaziDo());
			panelId.add(getLblDatumRodjenja());
			panelId.add(getLblBrojTelefona());
			panelId.add(getLblVisina());
			panelId.add(getLblTezina());
			panelId.add(getLblDatumUpisa());
			panelId.add(getLblImePrikaz());
			panelId.add(getLblPrezimePrikaz());
			panelId.add(getLblPolPrikaz());
			panelId.add(getLblClanarinaPrikaz());
			panelId.add(getLblDatumUpisaPrikaz());
			panelId.add(getLblDatumRodjenjaPrikaz());
			panelId.add(getLblTelefonPrikaz());
			panelId.add(getLblVisinaPrikaz());
			panelId.add(getLblTezinaPrikaz());
			panelId.add(getLblNePostojiClan());
		}
		return panelId;
	}
	private JPanel getPanelIme() {
		if (panelIme == null) {
			panelIme = new JPanel();
			panelIme.setLayout(null);
			panelIme.add(getLblIme_1());
			panelIme.add(getTextFieldIme());
			panelIme.add(getBtnPretragaIme());
			panelIme.add(getLblSviClanoviSa());
			panelIme.add(getLblNePostojeClanovi());
		}
		return panelIme;
	}
	private JPanel getPanelPrezime() {
		if (panelPrezime == null) {
			panelPrezime = new JPanel();
			panelPrezime.setLayout(null);
			panelPrezime.add(getLblPrezime_1());
			panelPrezime.add(getTextFieldPrezime());
			panelPrezime.add(getBtnPronadji_1());
			panelPrezime.add(getLblNewLabel());
			panelPrezime.add(getLblNewLabel_1());
		}
		return panelPrezime;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID: ");
			lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblId.setBounds(10, 11, 46, 14);
		}
		return lblId;
	}
	private JTextField getTextFieldId() {
		if (textFieldId == null) {
			textFieldId = new JTextField();
			textFieldId.setBounds(66, 8, 86, 20);
			textFieldId.setColumns(10);
		}
		return textFieldId;
	}
	private JButton getBtnPronadji() {
		if (btnPronadji == null) {
			btnPronadji = new JButton("Pronadji");
			btnPronadji.setBounds(162, 7, 89, 23);
		}
		return btnPronadji;
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime: ");
			lblIme.setBounds(10, 47, 75, 14);
		}
		return lblIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime: ");
			lblPrezime.setBounds(10, 72, 75, 14);
		}
		return lblPrezime;
	}
	private JLabel getLblPol() {
		if (lblPol == null) {
			lblPol = new JLabel("Pol: ");
			lblPol.setBounds(10, 97, 75, 14);
		}
		return lblPol;
	}
	private JLabel getLblClanarinaVaziDo() {
		if (lblClanarinaVaziDo == null) {
			lblClanarinaVaziDo = new JLabel("Clanarina");
			lblClanarinaVaziDo.setBounds(10, 122, 75, 14);
		}
		return lblClanarinaVaziDo;
	}
	private JLabel getLblVaziDo() {
		if (lblVaziDo == null) {
			lblVaziDo = new JLabel("vazi do:");
			lblVaziDo.setBounds(10, 137, 75, 14);
		}
		return lblVaziDo;
	}
	private JLabel getLblDatumRodjenja() {
		if (lblDatumRodjenja == null) {
			lblDatumRodjenja = new JLabel("Datum rodjenja:");
			lblDatumRodjenja.setBounds(247, 47, 89, 14);
		}
		return lblDatumRodjenja;
	}
	private JLabel getLblBrojTelefona() {
		if (lblBrojTelefona == null) {
			lblBrojTelefona = new JLabel("Broj telefona: ");
			lblBrojTelefona.setBounds(247, 72, 89, 14);
		}
		return lblBrojTelefona;
	}
	private JLabel getLblVisina() {
		if (lblVisina == null) {
			lblVisina = new JLabel("Visina:");
			lblVisina.setBounds(247, 97, 89, 14);
		}
		return lblVisina;
	}
	private JLabel getLblTezina() {
		if (lblTezina == null) {
			lblTezina = new JLabel("Tezina:");
			lblTezina.setBounds(247, 122, 89, 14);
		}
		return lblTezina;
	}
	private JLabel getLblDatumUpisa() {
		if (lblDatumUpisa == null) {
			lblDatumUpisa = new JLabel("Datum upisa:");
			lblDatumUpisa.setBounds(10, 162, 75, 14);
		}
		return lblDatumUpisa;
	}
	private JLabel getLblImePrikaz() {
		if (lblImePrikaz == null) {
			lblImePrikaz = new JLabel("");
			lblImePrikaz.setBounds(95, 47, 142, 14);
		}
		return lblImePrikaz;
	}
	private JLabel getLblPrezimePrikaz() {
		if (lblPrezimePrikaz == null) {
			lblPrezimePrikaz = new JLabel("");
			lblPrezimePrikaz.setBounds(95, 72, 142, 14);
		}
		return lblPrezimePrikaz;
	}
	private JLabel getLblPolPrikaz() {
		if (lblPolPrikaz == null) {
			lblPolPrikaz = new JLabel("");
			lblPolPrikaz.setBounds(95, 97, 142, 14);
		}
		return lblPolPrikaz;
	}
	private JLabel getLblClanarinaPrikaz() {
		if (lblClanarinaPrikaz == null) {
			lblClanarinaPrikaz = new JLabel("");
			lblClanarinaPrikaz.setBounds(95, 122, 142, 14);
		}
		return lblClanarinaPrikaz;
	}
	private JLabel getLblDatumUpisaPrikaz() {
		if (lblDatumUpisaPrikaz == null) {
			lblDatumUpisaPrikaz = new JLabel("");
			lblDatumUpisaPrikaz.setBounds(95, 162, 142, 14);
		}
		return lblDatumUpisaPrikaz;
	}
	private JLabel getLblDatumRodjenjaPrikaz() {
		if (lblDatumRodjenjaPrikaz == null) {
			lblDatumRodjenjaPrikaz = new JLabel("");
			lblDatumRodjenjaPrikaz.setBounds(346, 47, 111, 14);
		}
		return lblDatumRodjenjaPrikaz;
	}
	private JLabel getLblTelefonPrikaz() {
		if (lblTelefonPrikaz == null) {
			lblTelefonPrikaz = new JLabel("");
			lblTelefonPrikaz.setBounds(346, 72, 111, 14);
		}
		return lblTelefonPrikaz;
	}
	private JLabel getLblVisinaPrikaz() {
		if (lblVisinaPrikaz == null) {
			lblVisinaPrikaz = new JLabel("");
			lblVisinaPrikaz.setBounds(346, 97, 111, 14);
		}
		return lblVisinaPrikaz;
	}
	private JLabel getLblTezinaPrikaz() {
		if (lblTezinaPrikaz == null) {
			lblTezinaPrikaz = new JLabel("");
			lblTezinaPrikaz.setBounds(346, 122, 111, 14);
		}
		return lblTezinaPrikaz;
	}
	private JLabel getLblNePostojiClan() {
		if (lblNePostojiClan == null) {
			lblNePostojiClan = new JLabel("Ne postoji clan sa unetim ID brojem!");
			lblNePostojiClan.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNePostojiClan.setForeground(Color.RED);
			lblNePostojiClan.setBounds(10, 196, 447, 26);
		}
		return lblNePostojiClan;
	}
	private JLabel getLblIme_1() {
		if (lblIme_1 == null) {
			lblIme_1 = new JLabel("Ime: ");
			lblIme_1.setBounds(10, 11, 46, 14);
		}
		return lblIme_1;
	}
	private JTextField getTextFieldIme() {
		if (textFieldIme == null) {
			textFieldIme = new JTextField();
			textFieldIme.setBounds(66, 8, 160, 20);
			textFieldIme.setColumns(10);
		}
		return textFieldIme;
	}
	private JButton getBtnPretragaIme() {
		if (btnPretragaIme == null) {
			btnPretragaIme = new JButton("Pronadji");
			btnPretragaIme.setBounds(236, 7, 89, 23);
		}
		return btnPretragaIme;
	}
	private JLabel getLblSviClanoviSa() {
		if (lblSviClanoviSa == null) {
			lblSviClanoviSa = new JLabel("Svi clanovi sa unetim imenom prikazani su u tabeli!");
			lblSviClanoviSa.setForeground(Color.GREEN);
			lblSviClanoviSa.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblSviClanoviSa.setBounds(10, 36, 447, 34);
		}
		return lblSviClanoviSa;
	}
	private JLabel getLblNePostojeClanovi() {
		if (lblNePostojeClanovi == null) {
			lblNePostojeClanovi = new JLabel("Ne postoje clanovi sa unetim imenom!");
			lblNePostojeClanovi.setForeground(Color.RED);
			lblNePostojeClanovi.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNePostojeClanovi.setBounds(10, 81, 447, 34);
		}
		return lblNePostojeClanovi;
	}
	private JLabel getLblPrezime_1() {
		if (lblPrezime_1 == null) {
			lblPrezime_1 = new JLabel("Prezime: ");
			lblPrezime_1.setBounds(10, 11, 67, 14);
		}
		return lblPrezime_1;
	}
	private JTextField getTextFieldPrezime() {
		if (textFieldPrezime == null) {
			textFieldPrezime = new JTextField();
			textFieldPrezime.setBounds(87, 8, 185, 20);
			textFieldPrezime.setColumns(10);
		}
		return textFieldPrezime;
	}
	private JButton getBtnPronadji_1() {
		if (btnPronadji_1 == null) {
			btnPronadji_1 = new JButton("Pronadji");
			btnPronadji_1.setBounds(282, 7, 89, 23);
		}
		return btnPronadji_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Svi clanovi sa unetim imenom prikazani su u tabeli!");
			lblNewLabel.setForeground(Color.GREEN);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel.setBounds(10, 36, 447, 30);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Ne postoje clanovi sa unetim imenom!");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_1.setForeground(Color.RED);
			lblNewLabel_1.setBounds(10, 77, 447, 30);
		}
		return lblNewLabel_1;
	}
}
