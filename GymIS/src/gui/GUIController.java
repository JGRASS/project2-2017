package gui;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class GUIController {
	private static MainWindowGUI mainWindowGUI;
	private static AddNewMemberGUI addNewMemberGUI;
	private static EditMemberGUI editMemberGUI;
	private static FindMemberGUI findMemberGUI;
	private static PayMembershipGUI payMembershipGUI;
	private static RecordGUI recordGUI;
	private static RemoveMemberGUI removeMemberGUI;
	private static ShowEvidenceGUI showEvidenceGUI;
	private static SigningFormGUI signingFormGUI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signingFormGUI = new SigningFormGUI();
					signingFormGUI.setVisible(true);
					// -----------------------------------
					mainWindowGUI = new MainWindowGUI();
					mainWindowGUI.setVisible(true);
					mainWindowGUI.setLocationRelativeTo(null);
					mainWindowGUI.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							exitApplication();
						}
					});
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void exitApplication() {
		int option = JOptionPane.showConfirmDialog(mainWindowGUI, "Da li zelite da zatvorite aplikaciju?", "Zatvaranje",
				JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.YES_OPTION)
			System.exit(0);
	}
	
	public static void showMainWindow() {
		mainWindowGUI = new MainWindowGUI();
		mainWindowGUI.setVisible(true);
	}

	public static void showWindowAddNewMember() {
		addNewMemberGUI = new AddNewMemberGUI();
		addNewMemberGUI.setVisible(true);
	}

	public static void showWindowEditMember() {
		editMemberGUI = new EditMemberGUI();
		editMemberGUI.setVisible(true);
	}

	public static void showWindowRemoveMember() {
		removeMemberGUI = new RemoveMemberGUI();
		removeMemberGUI.setVisible(true);
	}

	public static void showWindowFindMember() {
		findMemberGUI = new FindMemberGUI();
		findMemberGUI.setVisible(true);
	}

	public static void showWindowPayMembership() {
		payMembershipGUI = new PayMembershipGUI();
		payMembershipGUI.setVisible(true);

	}

	public static void showWindowShowEvidence() {
		showEvidenceGUI = new ShowEvidenceGUI();
		showEvidenceGUI.setVisible(true);
	}

	public static void showWindowRecord() {
		recordGUI = new RecordGUI();
		recordGUI.setVisible(true);
	}

	public static boolean logIn(String username, String pass) {
		return false;
	}

	

}
