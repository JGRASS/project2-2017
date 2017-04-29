package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
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
import javax.swing.JMenuBar;
import javax.swing.JMenu;


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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowGUI frame = new MainWindowGUI();
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
	public MainWindowGUI() {
		setMinimumSize(new Dimension(870, 498));
		setTitle("GymIS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		}
		return btnUcitajSveClanove;
	}
	private JButton getBtnDodajNovog() {
		if (btnDodajNovog == null) {
			btnDodajNovog = new JButton("Dodaj novog");
			btnDodajNovog.setPreferredSize(new Dimension(120, 23));
		}
		return btnDodajNovog;
	}
	private JButton getBtnIzmeniClana() {
		if (btnIzmeniClana == null) {
			btnIzmeniClana = new JButton("Izmeni clana");
			btnIzmeniClana.setPreferredSize(new Dimension(120, 23));
		}
		return btnIzmeniClana;
	}
	private JButton getBtnIzbrisiClana() {
		if (btnIzbrisiClana == null) {
			btnIzbrisiClana = new JButton("Izbrisi clana");
			btnIzbrisiClana.setPreferredSize(new Dimension(120, 23));
		}
		return btnIzbrisiClana;
	}
	private JButton getBtnPretraga() {
		if (btnPretraga == null) {
			btnPretraga = new JButton("Pretraga");
			btnPretraga.setPreferredSize(new Dimension(120, 23));
		}
		return btnPretraga;
	}
	private JButton getBtnUplata() {
		if (btnUplata == null) {
			btnUplata = new JButton("Uplata");
			btnUplata.setPreferredSize(new Dimension(120, 23));
		}
		return btnUplata;
	}
	private JButton getBtnOdjaviSe() {
		if (btnOdjaviSe == null) {
			btnOdjaviSe = new JButton("Odjavi se");
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
			btnEvidencijaDolazaka.setPreferredSize(new Dimension(120, 23));
		}
		return btnEvidencijaDolazaka;
	}
}
