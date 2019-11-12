import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AppPackage.AnimationClass;
import code.classes.Apprenant;

import javax.swing.border.BevelBorder;
import java.awt.Window.Type;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;

public class AcceuilStudent extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_confirm;
	private JTextField textField_nomUt;
	private JPasswordField mdp;
	private JPasswordField mdp_confirm;
	private JPasswordField email;
	private JPasswordField passwordField_newMdp;
	private JPasswordField passwordField_confNewMdp;
	private JPasswordField passwordField_encien;
	private JTable table;
	private JTable table_amis;
	private JTable table_1;
	private JTextField message;
	private JTextField textField_cause;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcceuilStudent frame = new AcceuilStudent();
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
	public AcceuilStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 40, 1080, 650);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_ul = new JPanel();
		panel_ul.setBackground(new Color(255, 255, 255));
//		panel_button.setBounds(10, 11, 163, 101);
		panel_ul.setBounds(10, 115, 186, 441);
		contentPane.add(panel_ul);
		panel_ul.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("U");
		lblNewLabel.setBounds(0, 11, 186, 95);
		panel_ul.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label = new JLabel("-");
		label.setBounds(0, 94, 186, 64);
		panel_ul.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 51, 102));
		label.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		
		JLabel lblL = new JLabel("L");
		lblL.setBounds(0, 169, 186, 64);
		panel_ul.add(lblL);
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setForeground(new Color(0, 51, 102));
		lblL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		
		JLabel lblE = new JLabel("e");
		lblE.setBounds(0, 216, 186, 64);
		panel_ul.add(lblE);
		lblE.setHorizontalAlignment(SwingConstants.CENTER);
		lblE.setForeground(new Color(0, 51, 102));
		lblE.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		
		JLabel lblA = new JLabel("a");
		lblA.setBounds(0, 261, 186, 64);
		panel_ul.add(lblA);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setForeground(new Color(0, 51, 102));
		lblA.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		
		JLabel lblR = new JLabel("r");
		lblR.setBounds(0, 313, 186, 64);
		panel_ul.add(lblR);
		lblR.setHorizontalAlignment(SwingConstants.CENTER);
		lblR.setForeground(new Color(0, 51, 102));
		lblR.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		
		JLabel lblN = new JLabel("n");
		lblN.setBounds(0, 366, 186, 64);
		panel_ul.add(lblN);
		lblN.setHorizontalAlignment(SwingConstants.CENTER);
		lblN.setForeground(new Color(0, 51, 102));
		lblN.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		

	
	//	AnimationClass anim = new AnimationClass();
		
		//anim.jLabelYDown(lblNewLabel.getY(), 1000, 3,1,lblNewLabel);
		
		/*********************************************************************************************/
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(206, 11, 848, 589);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_principal = new JPanel();
		panel_principal.setBackground(new Color(255, 255, 255));
		layeredPane.add(panel_principal, "name_1309925786172900");
		panel_principal.setLayout(null);
		
		JLabel lblApplicationDapprentissage = new JLabel("Application d'apprentissage");
		lblApplicationDapprentissage.setHorizontalAlignment(SwingConstants.CENTER);
		lblApplicationDapprentissage.setForeground(new Color(0, 51, 102));
		lblApplicationDapprentissage.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 55));
		lblApplicationDapprentissage.setBackground(new Color(0, 153, 0));
		lblApplicationDapprentissage.setBounds(10, 50, 828, 76);
		panel_principal.add(lblApplicationDapprentissage);
		
		JLabel lblPour = new JLabel("pour");
		lblPour.setHorizontalAlignment(SwingConstants.CENTER);
		lblPour.setForeground(new Color(0, 51, 102));
		lblPour.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 55));
		lblPour.setBackground(new Color(0, 153, 0));
		lblPour.setBounds(10, 137, 828, 76);
		panel_principal.add(lblPour);
		
		JLabel lblEtudiants = new JLabel("etudiants et enseignats");
		lblEtudiants.setHorizontalAlignment(SwingConstants.CENTER);
		lblEtudiants.setForeground(new Color(0, 51, 102));
		lblEtudiants.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 55));
		lblEtudiants.setBackground(new Color(0, 153, 0));
		lblEtudiants.setBounds(0, 224, 828, 76);
		panel_principal.add(lblEtudiants);
		
		JLabel lblU = new JLabel("U");
		lblU.setHorizontalAlignment(SwingConstants.CENTER);
		lblU.setForeground(new Color(0, 51, 102));
		lblU.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 250));
		lblU.setBackground(new Color(0, 153, 0));
		lblU.setBounds(90, 283, 253, 229);
		panel_principal.add(lblU);
		
		JLabel lblNiversity = new JLabel("-----} niversity");
		lblNiversity.setForeground(new Color(0, 51, 102));
		lblNiversity.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		lblNiversity.setBackground(new Color(0, 153, 0));
		lblNiversity.setBounds(285, 309, 414, 76);
		panel_principal.add(lblNiversity);
		
		JLabel lblLearn = new JLabel("Learn");
		lblLearn.setForeground(new Color(0, 51, 102));
		lblLearn.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 135));
		lblLearn.setBackground(new Color(0, 153, 0));
		lblLearn.setBounds(295, 361, 456, 108);
		panel_principal.add(lblLearn);
		
		JButton btnSeDeconnecter = new JButton("Se deconnecter");
		btnSeDeconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WelcomeHome p = new WelcomeHome();
				setVisible(false);
				p.setVisible(true);
			}
		});
		btnSeDeconnecter.setForeground(new Color(255, 255, 255));
		btnSeDeconnecter.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnSeDeconnecter.setBackground(new Color(0, 51, 102));
		btnSeDeconnecter.setBounds(311, 540, 231, 38);
		panel_principal.add(btnSeDeconnecter);
		panel_principal.setVisible(true);
		
		JPanel panel_parametres = new JPanel();
		panel_parametres.setBackground(new Color(255, 255, 255));
		layeredPane.add(panel_parametres, "name_958506305140500");
		panel_parametres.setLayout(null);
		
	
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(34, 220, 770, 343);
		panel_parametres.add(layeredPane_2);
		layeredPane_2.setLayout(new CardLayout(0, 0));
		
		JPanel panel_supp = new JPanel();
		panel_supp.setBackground(new Color(0, 51, 102));
		layeredPane_2.add(panel_supp, "name_1308317208478600");
		panel_supp.setLayout(null);
		panel_supp.setVisible(false);
		
		JLabel lblMotDePasse = new JLabel("Saisissez mot de passe :");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotDePasse.setForeground(new Color(255, 255, 255));
		lblMotDePasse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblMotDePasse.setBounds(37, 49, 343, 41);
		panel_supp.add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setEchoChar('*');
		passwordField.setForeground(new Color(0, 51, 102));
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		passwordField.setBounds(390, 48, 340, 41);
		panel_supp.add(passwordField);
		
		JLabel lblConfirmezMotDe = new JLabel("Confirmez mot de passe :");
		lblConfirmezMotDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmezMotDe.setForeground(new Color(255, 255, 255));
		lblConfirmezMotDe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblConfirmezMotDe.setBounds(37, 127, 343, 41);
		panel_supp.add(lblConfirmezMotDe);
		
		passwordField_confirm = new JPasswordField();
		passwordField_confirm.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_confirm.setForeground(new Color(0, 51, 102));
		passwordField_confirm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		passwordField_confirm.setEchoChar('*');
		passwordField_confirm.setBounds(390, 127, 340, 41);
		panel_supp.add(passwordField_confirm);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setForeground(new Color(0, 51, 102));
		btnSupprimer.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnSupprimer.setBackground(new Color(255, 255, 255));
		btnSupprimer.setBounds(250, 232, 291, 38);
		panel_supp.add(btnSupprimer);
		
		JPanel panel_signaler = new JPanel();
		panel_signaler.setBackground(new Color(0, 51, 102));
		layeredPane_2.add(panel_signaler, "name_1308335996588600");
		panel_signaler.setLayout(null);
		panel_signaler.setVisible(false);
		
		JLabel lblNomDutilisateur = new JLabel("Nom d'utilisateur :");
		lblNomDutilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomDutilisateur.setForeground(Color.WHITE);
		lblNomDutilisateur.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNomDutilisateur.setBounds(53, 27, 251, 41);
		panel_signaler.add(lblNomDutilisateur);
		
		JLabel lblCauseDeSignal = new JLabel("Cause de signal :");
		lblCauseDeSignal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCauseDeSignal.setForeground(Color.WHITE);
		lblCauseDeSignal.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblCauseDeSignal.setBounds(53, 79, 654, 41);
		panel_signaler.add(lblCauseDeSignal);
		
		JButton btnSignaler = new JButton("Signaler");
		btnSignaler.setForeground(new Color(0, 51, 102));
		btnSignaler.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnSignaler.setBackground(Color.WHITE);
		btnSignaler.setBounds(242, 278, 291, 38);
		panel_signaler.add(btnSignaler);
		
		textField_nomUt = new JTextField();
		textField_nomUt.setForeground(new Color(0, 51, 102));
		textField_nomUt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		textField_nomUt.setBounds(314, 27, 391, 38);
		panel_signaler.add(textField_nomUt);
		textField_nomUt.setColumns(10);
		
		textField_cause = new JTextField();
		textField_cause.setHorizontalAlignment(SwingConstants.CENTER);
		textField_cause.setForeground(new Color(0, 51, 102));
		textField_cause.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		textField_cause.setColumns(10);
		textField_cause.setBounds(53, 131, 654, 122);
		panel_signaler.add(textField_cause);
		
		JLabel lblParametres_1 = new JLabel("Parametes");
		lblParametres_1.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\settings_120px.png"));
		lblParametres_1.setBackground(new Color(0, 51, 102));
		lblParametres_1.setForeground(new Color(0, 51, 102));
		lblParametres_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblParametres_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		lblParametres_1.setBounds(34, 11, 770, 115);
		panel_parametres.add(lblParametres_1);
		
		JLabel lblSignalerUtilisateur = new JLabel("Signaler utilisateur  ");
		lblSignalerUtilisateur.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_supp.setVisible(false);
				panel_signaler.setVisible(true);
			}
		});
		lblSignalerUtilisateur.setForeground(new Color(0, 51, 102));
		lblSignalerUtilisateur.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\attention_40px.png"));
		lblSignalerUtilisateur.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblSignalerUtilisateur.setBounds(481, 137, 323, 65);
		panel_parametres.add(lblSignalerUtilisateur);
		
		JLabel lblSupprimerCompte = new JLabel("Supprimer compte");
		lblSupprimerCompte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_supp.setVisible(true);
				panel_signaler.setVisible(false);
			}
		});
		lblSupprimerCompte.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\delete_sign_40px.png"));
		lblSupprimerCompte.setForeground(new Color(0, 51, 102));
		lblSupprimerCompte.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblSupprimerCompte.setBounds(48, 137, 323, 65);
		panel_parametres.add(lblSupprimerCompte);
		
		JPanel panel_profile = new JPanel();
		panel_profile.setBackground(new Color(255, 255, 255));
		layeredPane.add(panel_profile, "name_1307988979182100");
		panel_profile.setLayout(null);
		
		
		
		JLabel lblProfile = new JLabel("Profile ");
		lblProfile.setToolTipText("Profile");
		lblProfile.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\user_120px.png"));
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setForeground(new Color(0, 51, 102));
		lblProfile.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		lblProfile.setBackground(new Color(0, 51, 102));
		lblProfile.setBounds(24, 11, 797, 129);
		panel_profile.add(lblProfile);
		
		
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(37, 231, 784, 334);
		panel_profile.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		
		
		JPanel panel_adr = new JPanel();
		panel_adr.setBackground(new Color(0, 51, 102));
		layeredPane_1.add(panel_adr, "name_1309200409986500");
		panel_adr.setLayout(null);
		
		JPanel panel_mdp = new JPanel();
		panel_mdp.setBackground(new Color(0, 51, 102));
		layeredPane_1.add(panel_mdp, "name_1309210055688600");
		panel_mdp.setLayout(null);
		
		JLabel lblNouveauMotDe = new JLabel("Nouveau mot de passe :");
		lblNouveauMotDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblNouveauMotDe.setForeground(Color.WHITE);
		lblNouveauMotDe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNouveauMotDe.setBounds(51, 99, 343, 41);
		panel_mdp.add(lblNouveauMotDe);
		
		passwordField_newMdp = new JPasswordField();
		passwordField_newMdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_newMdp.setForeground(new Color(0, 51, 102));
		passwordField_newMdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		passwordField_newMdp.setEchoChar('*');
		passwordField_newMdp.setBounds(404, 102, 340, 41);
		panel_mdp.add(passwordField_newMdp);
		
		JLabel label_6 = new JLabel("Confirmez mot de passe :");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		label_6.setBounds(51, 165, 343, 41);
		panel_mdp.add(label_6);
		
		passwordField_confNewMdp = new JPasswordField();
		passwordField_confNewMdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_confNewMdp.setForeground(new Color(0, 51, 102));
		passwordField_confNewMdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		passwordField_confNewMdp.setEchoChar('*');
		passwordField_confNewMdp.setBounds(404, 165, 340, 41);
		panel_mdp.add(passwordField_confNewMdp);
		
		JButton btnModifier_1 = new JButton("Modifier");
		btnModifier_1.setForeground(new Color(0, 51, 102));
		btnModifier_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnModifier_1.setBackground(Color.WHITE);
		btnModifier_1.setBounds(264, 270, 291, 38);
		panel_mdp.add(btnModifier_1);
		
		JLabel lblEncienMotDe = new JLabel("Encien mot de passe :");
		lblEncienMotDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncienMotDe.setForeground(Color.WHITE);
		lblEncienMotDe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblEncienMotDe.setBounds(51, 34, 343, 41);
		panel_mdp.add(lblEncienMotDe);
		
		passwordField_encien = new JPasswordField();
		passwordField_encien.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_encien.setForeground(new Color(0, 51, 102));
		passwordField_encien.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		passwordField_encien.setEchoChar('*');
		passwordField_encien.setBounds(404, 37, 340, 41);
		panel_mdp.add(passwordField_encien);
		
		JLabel label_2 = new JLabel("Modifier adresse email");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_adr.setVisible(true);
				panel_mdp.setVisible(false);
				
				
			}
		});
		label_2.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\urgent_message_40px.png"));
		label_2.setForeground(new Color(0, 51, 102));
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		label_2.setBounds(37, 151, 342, 65);
		panel_profile.add(label_2);
		
		JLabel label_3 = new JLabel("Saisissez mot de passe :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		label_3.setBounds(40, 102, 343, 41);
		panel_adr.add(label_3);
		
		mdp = new JPasswordField();
		mdp.setHorizontalAlignment(SwingConstants.CENTER);
		mdp.setForeground(new Color(0, 51, 102));
		mdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		mdp.setEchoChar('*');
		mdp.setBounds(393, 105, 340, 41);
		panel_adr.add(mdp);
		
		JLabel label_4 = new JLabel("Confirmez mot de passe :");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		label_4.setBounds(40, 166, 343, 41);
		panel_adr.add(label_4);
		
		mdp_confirm = new JPasswordField();
		mdp_confirm.setHorizontalAlignment(SwingConstants.CENTER);
		mdp_confirm.setForeground(new Color(0, 51, 102));
		mdp_confirm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		mdp_confirm.setEchoChar('*');
		mdp_confirm.setBounds(393, 168, 340, 41);
		panel_adr.add(mdp_confirm);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setForeground(new Color(0, 51, 102));
		btnModifier.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnModifier.setBackground(Color.WHITE);
		btnModifier.setBounds(254, 258, 291, 38);
		panel_adr.add(btnModifier);
		
		JLabel lblNouvelleAdresseEmail = new JLabel("Nouvelle adresse email :");
		lblNouvelleAdresseEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblNouvelleAdresseEmail.setForeground(Color.WHITE);
		lblNouvelleAdresseEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNouvelleAdresseEmail.setBounds(40, 42, 343, 41);
		panel_adr.add(lblNouvelleAdresseEmail);
		
		email = new JPasswordField();
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setForeground(new Color(0, 51, 102));
		email.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		email.setEchoChar('*');
		email.setBounds(393, 41, 340, 41);
		panel_adr.add(email);
		
		
		
		JLabel label_1 = new JLabel("Modifier mot de passe");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_adr.setVisible(false);
				panel_mdp.setVisible(true);
			}
		});
		label_1.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\password_40px.png"));
		label_1.setForeground(new Color(0, 51, 102));
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		label_1.setBounds(479, 151, 342, 65);
		panel_profile.add(label_1);
		
		JPanel panel_cours = new JPanel();
		panel_cours.setBackground(Color.RED);
		layeredPane.add(panel_cours, "name_1369027173701500");
		
		JPanel panel_chat = new JPanel();
		panel_chat.setBackground(new Color(255, 255, 255));
		layeredPane.add(panel_chat, "name_1369063935078100");
		panel_chat.setLayout(null);

		message = new JTextField();
		message.setBounds(333, 513, 448, 32);
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setForeground(new Color(0, 51, 102));
		message.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		message.setColumns(10);
		panel_chat.add(message);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(333, 83, 505, 421);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_chat.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		textArea.setBackground(new Color(51, 153, 255));
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
	//	String msg = message.getText();

		
		table_1 = new JTable();
		table_1.setForeground(new Color(255, 255, 255));
		table_1.setBounds(10, 83, 313, 421);
		table_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		table_1.setBackground(new Color(51, 153, 255));
		panel_chat.add(table_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(780, 507, 58, 46);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String msg = message.getText();
				textArea.append(" - "+ msg+"\n");
				
				textArea.append("\n");
				message.setText("");
				
			
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\paper_plane_38px.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_chat.add(lblNewLabel_1);
		
		
		
		
		
		
		
	
		JLabel lblSs = new JLabel("");
		lblSs.setToolTipText("Menu");
		lblSs.setBounds(10, 23, 186, 81);
		contentPane.add(lblSs);
		
		lblSs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel_ul.setVisible(false);
				if(panel_principal.isVisible()==false)
				{
					panel_parametres.setVisible(false);
					panel_principal.setVisible(true);
					panel_profile.setVisible(false);
					panel_chat.setVisible(false);
					panel_cours.setVisible(false);
				}
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			//	panel_button.setBounds(10, 11, 163, 589);
			}
			@Override
			public void mouseExited(MouseEvent e) {
			//	panel_button.setBounds(10, 11, 163, 101);
			}
		});
		lblSs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSs.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\sorting_options_80px.png"));
		
		JLabel btn_profile = new JLabel("");
		btn_profile.setBounds(10, 115, 186, 75);
		contentPane.add(btn_profile);
		btn_profile.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\user_40px.png"));
		btn_profile.setHorizontalAlignment(SwingConstants.CENTER);
		btn_profile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_parametres.setVisible(false);
				panel_principal.setVisible(false);
				panel_profile.setVisible(true);
				panel_chat.setVisible(false);
				panel_cours.setVisible(false);
				
			}
		});
		
		
		JLabel btn_chat = new JLabel("");
		btn_chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_cours.setVisible(false);
				panel_principal.setVisible(false);
				panel_parametres.setVisible(false);
				panel_profile.setVisible(false);
				panel_chat.setVisible(true);
			}
		});
		btn_chat.setToolTipText("chat");
		btn_chat.setBounds(10, 206, 186, 75);
		contentPane.add(btn_chat);
		btn_chat.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\chat_40px.png"));
		btn_chat.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel btn_cours = new JLabel("");
		btn_cours.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_cours.setVisible(true);
				panel_principal.setVisible(false);
				panel_parametres.setVisible(false);
				panel_profile.setVisible(false);
				panel_chat.setVisible(false);
				
			}
		});
		btn_cours.setToolTipText("cours");
		btn_cours.setBounds(10, 289, 186, 75);
		contentPane.add(btn_cours);
		btn_cours.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\library_40px.png"));
		btn_cours.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel btn_setting = new JLabel("");
		btn_setting.setToolTipText("parametres");
		btn_setting.setBounds(10, 375, 186, 75);
		contentPane.add(btn_setting);
		btn_setting.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_parametres.setVisible(true);
				panel_principal.setVisible(false);
				panel_profile.setVisible(false);
				
			}
		});
		btn_setting.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\settings_40px.png"));
		btn_setting.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel btn_up = new JLabel("");
		btn_up.setBounds(10, 475, 186, 94);
		contentPane.add(btn_up);
		btn_up.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel_ul.setVisible(true);
			//	panel_principal.setVisible(true);
				
				AnimationClass anim = new AnimationClass();
				
			//	anim.jLabelYUp(lblNewLabel.getY(), 300, 3,1,lblNewLabel);
				
				
				
				
			}
		});
		btn_up.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\up_3_80px.png"));
		btn_up.setHorizontalAlignment(SwingConstants.CENTER);
		
			
	
	}
}
