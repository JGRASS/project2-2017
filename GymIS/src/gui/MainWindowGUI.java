package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import domen.Member;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;
import java.awt.event.ActionEvent;


public class MainWindowGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7138587389972583147L;
	
	private JPanel contentPane;
	private JPanel eastPanel;
	private JPanel southPanel;
	private JButton btnUcitajSveClanove;
	private JButton btnDodajNovog;
	private JButton btnIzmeniClana;
	private JButton btnIzbrisiClana;
	private JButton btnPretraga;
	private JButton btnUplata;
	private JButton btnOdjaviSe;
	private JLabel label;
	private JScrollPane scrollPane;
	private JTable table;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnAbout;
	private JButton btnEvidencijaDolazaka;
	private JButton btnEvidentiraj;

	/**
	 * Create the frame.
	 */
	public MainWindowGUI() {
		setMinimumSize(new Dimension(870, 498));
		setTitle("GymIS");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 868, 498);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		contentPane.add(getSouthPanel(), BorderLayout.SOUTH);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindowGUI.class.getResource("/resources/1493411578_app_type_gym_512px_GREY.png")));
		this.setLocationRelativeTo(null);

	}

	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setPreferredSize(new Dimension(140, 10));
			eastPanel.add(getBtnUcitajSveClanove());
			eastPanel.add(getBtnDodajNovog());
			eastPanel.add(getBtnIzmeniClana());
			eastPanel.add(getBtnIzbrisiClana());
			eastPanel.add(getBtnPretraga());
			eastPanel.add(getBtnUplata());
			eastPanel.add(getBtnEvidencijaDolazaka());
			eastPanel.add(getBtnEvidentiraj());
			eastPanel.add(getLabel());
			
//			lblLogo = new JLabel(logo);
//			eastPanel.add(lblLogo);
		}
		return eastPanel;
	}
	private JPanel getSouthPanel() {
		if (southPanel == null) {
			southPanel = new JPanel();
			southPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
			southPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			southPanel.setAlignmentY(FlowLayout.TRAILING);
			southPanel.setAlignmentX(FlowLayout.TRAILING);
			southPanel.setPreferredSize(new Dimension(10, 40));
			southPanel.add(getBtnOdjaviSe());
			
			
			
		}
		return southPanel;
	}
	private JButton getBtnUcitajSveClanove() {
		if (btnUcitajSveClanove == null) {
			btnUcitajSveClanove = new JButton("Ucitaj sve clanove");
			btnUcitajSveClanove.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//Clear table
					for(int i = 0; i < 50; i++) {
						for (int j = 0; j < 10; j++) {
							table.setValueAt("", i, j);
						}
					}
					// end Clear table
					LinkedList<Member> tempMembers = GUIController.getAllMembers();
					if (tempMembers != null) {
						int i = 0;
						for (Member m: tempMembers) {
							int j = -1;
							table.setValueAt(m.getId(), i, ++j);
							table.setValueAt(m.getFirstName(), i, ++j);
							table.setValueAt(m.getLastName(), i, ++j);
							table.setValueAt(m.getGender(), i, ++j);
							table.setValueAt(m.getBirthdate(), i, ++j);
							table.setValueAt(m.getPhoneNumber(), i, ++j);
							table.setValueAt(m.getStartDate(), i, ++j);
							table.setValueAt(m.getEndDate(), i, ++j);
							table.setValueAt(m.getHeight(), i, ++j);
							table.setValueAt(m.getWeight(), i, ++j);
							i++;
						}
					}
				}
			});
		}
		return btnUcitajSveClanove;
	}
	
	private JButton getBtnDodajNovog() {
		if (btnDodajNovog == null) {
			btnDodajNovog = new JButton("Dodaj novog");
			btnDodajNovog.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIController.showWindowAddNewMember();
				}
			});
			btnDodajNovog.setPreferredSize(new Dimension(120, 23));
		}
		return btnDodajNovog;
	}
	private JButton getBtnIzmeniClana() {
		if (btnIzmeniClana == null) {
			btnIzmeniClana = new JButton("Izmeni clana");
			btnIzmeniClana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIController.showWindowEditMember();
				}
			});
			btnIzmeniClana.setPreferredSize(new Dimension(120, 23));
		}
		return btnIzmeniClana;
	}
	private JButton getBtnIzbrisiClana() {
		if (btnIzbrisiClana == null) {
			btnIzbrisiClana = new JButton("Izbrisi clana");
			btnIzbrisiClana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIController.showWindowRemoveMember();
				}
			});
			btnIzbrisiClana.setPreferredSize(new Dimension(120, 23));
		}
		return btnIzbrisiClana;
	}
	private JButton getBtnPretraga() {
		if (btnPretraga == null) {
			btnPretraga = new JButton("Pretraga");
			btnPretraga.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIController.showWindowFindMember();
				}
			});
			btnPretraga.setPreferredSize(new Dimension(120, 23));
		}
		return btnPretraga;
	}
	private JButton getBtnUplata() {
		if (btnUplata == null) {
			btnUplata = new JButton("Uplata");
			btnUplata.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIController.showWindowPayMembership();
				}
			});
			btnUplata.setPreferredSize(new Dimension(120, 23));
		}
		return btnUplata;
	}
	private JButton getBtnOdjaviSe() {
		if (btnOdjaviSe == null) {
			btnOdjaviSe = new JButton("Odjavi se");
			btnOdjaviSe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
					GUIController.main(null);
				}
			});
			btnOdjaviSe.setHorizontalTextPosition(SwingConstants.RIGHT);
			btnOdjaviSe.setHorizontalAlignment(SwingConstants.RIGHT);
		}
		return btnOdjaviSe;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel(new ImageIcon(MainWindowGUI.class.getResource("/resources/1493411578_app_type_gym_512px_GREY.png")));
			label.setPreferredSize(new Dimension(110, 75));
			label.setMinimumSize(new Dimension(75, 75));
			label.setMaximumSize(new Dimension(75, 75));
			label.setBounds(0, 0, 75, 75);
		}
		return label;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setEnabled(false);
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null},
				},
				new String[] {
					"ID", "Ime", "Prezime", "Pol", "Datum rodjenja", "Telefon", "Datum upisa", "Uplacena clanarina do", "Visina", "Tezina"
				}
			));
			table.getColumnModel().getColumn(3).setPreferredWidth(55);
			table.getColumnModel().getColumn(4).setPreferredWidth(86);
			table.getColumnModel().getColumn(7).setPreferredWidth(100);
			table.setName("Tabela");
		}
		return table;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnAbout());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
		}
		return mnFile;
	}
	private JMenu getMnAbout() {
		if (mnAbout == null) {
			mnAbout = new JMenu("About");
		}
		return mnAbout;
	}
	private JButton getBtnEvidencijaDolazaka() {
		if (btnEvidencijaDolazaka == null) {
			btnEvidencijaDolazaka = new JButton("Evidencija");
			btnEvidencijaDolazaka.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIController.showWindowShowEvidence();
				}
			});
			btnEvidencijaDolazaka.setPreferredSize(new Dimension(120, 23));
		}
		return btnEvidencijaDolazaka;
	}
	private JButton getBtnEvidentiraj() {
		if (btnEvidentiraj == null) {
			btnEvidentiraj = new JButton("Evidentiraj");
			btnEvidentiraj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GUIController.showWindowRecord();
				}
			});
			btnEvidentiraj.setPreferredSize(new Dimension(120, 23));
		}
		return btnEvidentiraj;
	}
}
