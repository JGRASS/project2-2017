package gui;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EvidenceGUI extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8190532044550532918L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblId;
	private JTextField textFieldId;
	private JLabel lblIme;
	private JTextField textFieldIme;
	private JLabel lblPrezime;
	private JTextField textFieldPrezime;
	private JLabel lblClanarina;
	private JTextField textFieldClanarina;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Create the frame.
	 */
	public EvidenceGUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(EvidenceGUI.class.getResource("/resources/1493413484_gym.png")));
		setTitle("Evidencija");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 479, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.WEST);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		this.setModal(true);
	}
	
	protected void setTextInTextArea(String text) {
		textArea.setText(text);
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(200, 10));
			panel.setLayout(new MigLayout("", "[][grow]", "[][][][]"));
			panel.add(getLblId(), "cell 0 0,alignx left");
			panel.add(getTextFieldId(), "cell 1 0,growx");
			panel.add(getLblIme(), "cell 0 1,alignx left");
			panel.add(getTextFieldIme(), "cell 1 1,growx");
			panel.add(getLblPrezime(), "cell 0 2,alignx left");
			panel.add(getTextFieldPrezime(), "cell 1 2,growx");
			panel.add(getLblClanarina(), "cell 0 3,alignx left");
			panel.add(getTextFieldClanarina(), "cell 1 3,growx");
		}
		return panel;
	}
	private JLabel getLblId() {
		if (lblId == null) {
			lblId = new JLabel("ID:");
		}
		return lblId;
	}
	private JTextField getTextFieldId() {
		if (textFieldId == null) {
			textFieldId = new JTextField();
			textFieldId.setEditable(false);
			textFieldId.setColumns(10);
		}
		return textFieldId;
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime:");
			lblIme.setAlignmentX(Component.LEFT_ALIGNMENT);
		}
		return lblIme;
	}
	private JTextField getTextFieldIme() {
		if (textFieldIme == null) {
			textFieldIme = new JTextField();
			textFieldIme.setEditable(false);
			textFieldIme.setColumns(10);
		}
		return textFieldIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime:");
		}
		return lblPrezime;
	}
	private JTextField getTextFieldPrezime() {
		if (textFieldPrezime == null) {
			textFieldPrezime = new JTextField();
			textFieldPrezime.setEditable(false);
			textFieldPrezime.setColumns(10);
		}
		return textFieldPrezime;
	}
	private JLabel getLblClanarina() {
		if (lblClanarina == null) {
			lblClanarina = new JLabel("Clanarina:");
		}
		return lblClanarina;
	}
	private JTextField getTextFieldClanarina() {
		if (textFieldClanarina == null) {
			textFieldClanarina = new JTextField();
			textFieldClanarina.setEditable(false);
			textFieldClanarina.setColumns(10);
		}
		return textFieldClanarina;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setEditable(false);
		}
		return textArea;
	}

	protected void setAttributes(int id, String firstName, String lastName, String date) {
		textFieldId.setText(id + "");
		textFieldIme.setText(firstName);
		textFieldPrezime.setText(lastName);
		textFieldClanarina.setText(date);
		
	}
}
