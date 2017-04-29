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
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;


public class MainWindowGUI extends JFrame {

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
	private ImageIcon logo = new ImageIcon("/1493413484_gym.png");;
	private JLabel label;

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
		setTitle("GymIS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		contentPane.add(getSouthPanel(), BorderLayout.SOUTH);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(MainWindowGUI.class.getResource("/1493411578_app_type_gym_512px_GREY.png")));
		

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
}
