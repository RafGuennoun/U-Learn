import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AppPackage.AnimationClass;
import code.classes.Apprenant;
import code.classes.Commentaire;
import code.classes.Forum;
import code.classes.Utilisateur;
import code.dao.Factory;

import javax.swing.border.BevelBorder;
import java.awt.Window.Type;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.ResourceBundle.Control;

import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Dimension;

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
	private JTextField message;
	private JTextField textField_cause;
	private JTextField titre_forum;
	private JTextField textField_rep;
	private JTextField texte_forum;
	private JTextField textField_RechercheAmis;
	private JTable table_chat;
	private JTable table_forum;

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
		panel_supp.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_supp.setBackground(Color.WHITE);
		layeredPane_2.add(panel_supp, "name_1308317208478600");
		panel_supp.setLayout(null);
		panel_supp.setVisible(false);
		
		JLabel lblMotDePasse = new JLabel("Saisissez mot de passe :");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotDePasse.setForeground(new Color(0, 51, 102));
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
		lblConfirmezMotDe.setForeground(new Color(0, 51, 102));
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
		panel_signaler.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_signaler.setBackground(Color.WHITE);
		layeredPane_2.add(panel_signaler, "name_1308335996588600");
		panel_signaler.setLayout(null);
		panel_signaler.setVisible(false);
		
		JLabel lblNomDutilisateur = new JLabel("Nom d'utilisateur :");
		lblNomDutilisateur.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomDutilisateur.setForeground(new Color(0, 51, 102));
		lblNomDutilisateur.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNomDutilisateur.setBounds(53, 27, 251, 41);
		panel_signaler.add(lblNomDutilisateur);
		
		JLabel lblCauseDeSignal = new JLabel("Cause de signal :");
		lblCauseDeSignal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCauseDeSignal.setForeground(new Color(0, 51, 102));
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
		lblProfile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		lblProfile.setToolTipText("Profile");
		//lblProfile.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\user_120px.png"));
		lblProfile.setHorizontalAlignment(SwingConstants.LEFT);
		lblProfile.setForeground(new Color(0, 51, 102));
		lblProfile.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		lblProfile.setBackground(new Color(0, 51, 102));
		lblProfile.setBounds(377, 11, 444, 129);
		panel_profile.add(lblProfile);
		
		
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(37, 231, 784, 334);
		panel_profile.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		
		
		JPanel panel_adr = new JPanel();
		panel_adr.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_adr.setBackground(Color.WHITE);
		layeredPane_1.add(panel_adr, "name_1309200409986500");
		panel_adr.setLayout(null);
		
		JPanel panel_mdp = new JPanel();
		panel_mdp.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_mdp.setBackground(Color.WHITE);
		layeredPane_1.add(panel_mdp, "name_1309210055688600");
		panel_mdp.setLayout(null);
		
		JLabel lblNouveauMotDe = new JLabel("Nouveau mot de passe :");
		lblNouveauMotDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblNouveauMotDe.setForeground(new Color(0, 51, 102));
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
		label_6.setForeground(new Color(0, 51, 102));
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
		lblEncienMotDe.setForeground(new Color(0, 51, 102));
		lblEncienMotDe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblEncienMotDe.setBounds(51, 34, 343, 41);
		panel_mdp.add(lblEncienMotDe);
		
		JPanel panel_prfl = new JPanel();
		panel_prfl.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_prfl.setBackground(Color.WHITE);
		layeredPane_1.add(panel_prfl, "name_528008969249599");
		panel_prfl.setLayout(null);
		
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
				panel_prfl.setVisible(false);
				
				
				
			}
		});
		label_2.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\urgent_message_40px.png"));
		label_2.setForeground(new Color(0, 51, 102));
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		label_2.setBounds(37, 151, 342, 65);
		panel_profile.add(label_2);
		
		JLabel label_3 = new JLabel("Saisissez mot de passe :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(0, 51, 102));
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
		label_4.setForeground(new Color(0, 51, 102));
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
		lblNouvelleAdresseEmail.setForeground(new Color(0, 51, 102));
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
		
	
		
		JLabel label_9 = new JLabel("Nom :");
		label_9.setForeground(new Color(0, 51, 102));
		label_9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label_9.setBackground(new Color(0, 51, 102));
		label_9.setBounds(361, 22, 413, 30);
		panel_prfl.add(label_9);
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setForeground(new Color(0, 51, 102));
		lblPrenom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblPrenom.setBackground(new Color(0, 51, 102));
		lblPrenom.setBounds(361, 63, 413, 30);
		panel_prfl.add(lblPrenom);
		
		JLabel lblEmail = new JLabel("Email : ");
		lblEmail.setForeground(new Color(0, 51, 102));
		lblEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblEmail.setBackground(new Color(0, 51, 102));
		lblEmail.setBounds(361, 104, 413, 30);
		panel_prfl.add(lblEmail);
		
		JLabel lblNiveau = new JLabel("Niveau :");
		lblNiveau.setForeground(new Color(0, 51, 102));
		lblNiveau.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNiveau.setBackground(new Color(0, 51, 102));
		lblNiveau.setBounds(361, 145, 413, 30);
		panel_prfl.add(lblNiveau);
		
		JLabel lblFormation_1 = new JLabel("Formations suivis :  ");
		lblFormation_1.setForeground(new Color(0, 51, 102));
		lblFormation_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFormation_1.setBackground(new Color(0, 51, 102));
		lblFormation_1.setBounds(361, 186, 413, 30);
		panel_prfl.add(lblFormation_1);
		
		JLabel lblFormationsF = new JLabel("Formations finis : ");
		lblFormationsF.setForeground(new Color(0, 51, 102));
		lblFormationsF.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblFormationsF.setBackground(new Color(0, 51, 102));
		lblFormationsF.setBounds(361, 227, 413, 30);
		panel_prfl.add(lblFormationsF);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 341, 312);
		panel_prfl.add(panel);
		panel.setLayout(null);
		
		JLabel Parcourir = new JLabel("");
		Parcourir.setHorizontalAlignment(SwingConstants.CENTER);
		Parcourir.setIcon(new ImageIcon("C:\\Users\\YACINE\\eclipse-workspace\\U-Learn\\Icons\\user_120px.png"));
		Parcourir.setBounds(10, 11, 321, 290);
		panel.add(Parcourir);
		
		JButton btnModifierPhotoDe = new JButton("Modifier photo de profil");
		btnModifierPhotoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("C:\\Users\\YACINE\\Desktop"));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGE","png","jpg","gif");
				fileChooser.addChoosableFileFilter(filter);
				int result = fileChooser.showSaveDialog(null);
				if(result == JFileChooser.APPROVE_OPTION)
				{
					File selectedfile = fileChooser.getSelectedFile();
					String path = selectedfile.getAbsolutePath();
					ImageIcon myImage = new ImageIcon(path);
					java.awt.Image img = myImage.getImage();
					java.awt.Image NewImage = img.getScaledInstance(Parcourir.getWidth(), Parcourir.getHeight(), java.awt.Image.SCALE_SMOOTH); /* if error check this */
					ImageIcon finalImage = new ImageIcon(NewImage);
					Parcourir.setIcon(finalImage);

				//System.out.println(path);
				}
				else
				{
					if( result == JFileChooser.CANCEL_OPTION)
					{
						JOptionPane.showMessageDialog(null, "Vous avez rien choisi");
					}
				}
			}
		});
		btnModifierPhotoDe.setForeground(Color.WHITE);
		btnModifierPhotoDe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnModifierPhotoDe.setBackground(new Color(0, 51, 102));
		btnModifierPhotoDe.setBounds(455, 280, 256, 30);
		panel_prfl.add(btnModifierPhotoDe);
		
		
		
		
		
		
		
		JLabel label_1 = new JLabel("Modifier mot de passe");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_adr.setVisible(false);
				panel_mdp.setVisible(true);
				panel_prfl.setVisible(false);
			}
		});
		label_1.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\password_40px.png"));
		label_1.setForeground(new Color(0, 51, 102));
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		label_1.setBounds(479, 151, 342, 65);
		panel_profile.add(label_1);
		
		JLabel label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_prfl.setVisible(true);
				panel_adr.setVisible(false);
				panel_mdp.setVisible(false);
			}
		});
		label_10.setIcon(new ImageIcon("C:\\Users\\YACINE\\eclipse-workspace\\U-Learn\\Icons\\user_120px.png"));
		label_10.setToolTipText("Profile");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(new Color(0, 51, 102));
		label_10.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 55));
		label_10.setBackground(new Color(0, 51, 102));
		label_10.setBounds(218, 11, 149, 129);
		panel_profile.add(label_10);
		
		JPanel panel_cours = new JPanel();
		panel_cours.setBackground(Color.WHITE);
		layeredPane.add(panel_cours, "name_1369027173701500");
		panel_cours.setLayout(null);
		
		JLayeredPane layeredPane_cours = new JLayeredPane();
		layeredPane_cours.setBounds(10, 66, 828, 523);
		panel_cours.add(layeredPane_cours);
		layeredPane_cours.setLayout(new CardLayout(0, 0));
		
		JPanel panel_formation = new JPanel();
		panel_formation.setBackground(Color.WHITE);
		layeredPane_cours.add(panel_formation, "name_99652437663700");
		
		JPanel panel_forum = new JPanel();
		panel_forum.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		panel_forum.setForeground(new Color(0, 51, 102));
		panel_forum.setBackground(new Color(255, 255, 255));
		layeredPane_cours.add(panel_forum, "name_99695588436500");
		
		JPanel panel_wiki = new JPanel();
		layeredPane_cours.add(panel_wiki, "name_99708708456700");
		
		JPanel panel_blogs = new JPanel();
		layeredPane_cours.add(panel_blogs, "name_99719566024600");
		
		JLabel lblFormation = new JLabel("Formation");
		lblFormation.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormation.setBounds(92, 11, 117, 49);
		panel_cours.add(lblFormation);
		
		JLabel lblForum = new JLabel("");
		lblForum.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\help_60px.png"));
		lblForum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) table_forum.getModel();
				
				for(Forum f : Factory.getForumDao().getAll())
				{
					model.addRow(new Object [] { f.getNumForum(), f.getNomForum(), f.isResolu() });
				}
			
				panel_forum.setVisible(true);
				panel_formation.setVisible(false);
				panel_wiki.setVisible(false);
				panel_blogs.setVisible(false);
			}
		});
		lblForum.setHorizontalAlignment(SwingConstants.CENTER);
		lblForum.setBounds(291, 0, 117, 69);
		panel_cours.add(lblForum);
		
		JLabel lblWiki = new JLabel("wiki");
		lblWiki.setHorizontalAlignment(SwingConstants.CENTER);
		lblWiki.setBounds(506, 11, 117, 49);
		panel_cours.add(lblWiki);
		
		JLabel lblBlogs = new JLabel("blogs");
		lblBlogs.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlogs.setBounds(687, 11, 117, 49);
		panel_cours.add(lblBlogs);
		panel_forum.setLayout(null);
		
		
	
		JLabel lblCreerMonForum = new JLabel("Cr\u00E9ez votre forum en lui donnant un titre :");
		lblCreerMonForum.setBounds(10, 21, 279, 41);
		lblCreerMonForum.setBackground(new Color(0, 51, 102));
		lblCreerMonForum.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreerMonForum.setForeground(new Color(0, 51, 102));
		lblCreerMonForum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		panel_forum.add(lblCreerMonForum);
		
		String[] titres = {"Titre" , "Probléme"};
		Object[][] data = {
				{"Titre" , "Probléme" },
	
		
		};
		
		titre_forum = new JTextField();
		titre_forum.setBounds(299, 23, 468, 38);
		titre_forum.setHorizontalAlignment(SwingConstants.CENTER);
		titre_forum.setForeground(new Color(0, 51, 102));
		titre_forum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		titre_forum.setColumns(10);
		panel_forum.add(titre_forum);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				Forum f = new Forum(Factory.getForumDao().getMaxNum(),
									titre_forum.getText(),
									texte_forum.getText(),
									Controleur.apprenantCo.getId());
				
				
				Factory.getForumDao().insert(f, Controleur.apprenantCo.getId());
				
				DefaultTableModel model = (DefaultTableModel) table_forum.getModel();
				
				model.addRow(new Object [] { f.getNumForum(), f.getNomForum(), f.isResolu() });

				
				
				titre_forum.setText("");
				texte_forum.setText("");
			
				
				
			}
		});
		label_5.setBounds(777, 21, 41, 93);
		label_5.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\plus_2_math_40px.png"));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_forum.add(label_5);
		
		textField_rep = new JTextField();
		textField_rep.setBounds(10, 474, 693, 38);
		textField_rep.setHorizontalAlignment(SwingConstants.CENTER);
		textField_rep.setForeground(new Color(0, 51, 102));
		textField_rep.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textField_rep.setColumns(10);
		panel_forum.add(textField_rep);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_5.setBounds(488, 285, 330, 126);
		panel_forum.add(scrollPane_5);
		
		JTextArea textArea_Commentaires = new JTextArea();
		textArea_Commentaires.setForeground(new Color(0, 51, 102));
		textArea_Commentaires.setEditable(false);
		textArea_Commentaires.setLineWrap(true);
		textArea_Commentaires.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		scrollPane_5.setViewportView(textArea_Commentaires);
		
		JButton btnRpondre = new JButton("R\u00E9pondre");
		btnRpondre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int index = table_forum.getSelectedRow();
				TableModel model = table_forum.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner un forum)");
				}
				else if(textField_rep.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez introduire un commentaire");
				}
				else
				{
					//le forum selectionné dans la table
					int numF = (Integer)model.getValueAt(index, 0);
					
					Commentaire c = new Commentaire(Factory.getCommentaireDao().getMaxNum(numF)+1,
													textField_rep.getText(),
													Controleur.apprenantCo.getId());
					//ajouter a la base de données 
					Factory.getCommentaireDao().insert(c, numF);
					
					//ajouter le commentaire dans la zone des comms
					textArea_Commentaires.append("  "+Controleur.apprenantCo.getId()+": \n");
					textArea_Commentaires.append("  - "+c.getText() +"\n\n");
					textField_rep.setText("");
				}
				
			}
		});
		btnRpondre.setBounds(713, 473, 105, 38);
		btnRpondre.setForeground(new Color(255, 255, 255));
		btnRpondre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnRpondre.setBackground(new Color(51, 153, 204));
		panel_forum.add(btnRpondre);
		
		JLabel lblCliquezSurUn = new JLabel("Cliquez sur un forum dans le tableau pour lui r\u00E9pondre :");
		lblCliquezSurUn.setBounds(10, 436, 498, 32);
		lblCliquezSurUn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCliquezSurUn.setForeground(new Color(0, 51, 102));
		lblCliquezSurUn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblCliquezSurUn.setBackground(new Color(0, 51, 102));
		panel_forum.add(lblCliquezSurUn);
		
		JLabel lblForum_1 = new JLabel("Probl\u00E9me :");
		lblForum_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblForum_1.setForeground(new Color(0, 51, 102));
		lblForum_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblForum_1.setBackground(new Color(0, 51, 102));
		lblForum_1.setBounds(10, 73, 72, 41);
		panel_forum.add(lblForum_1);
		
		texte_forum = new JTextField();
		texte_forum.setHorizontalAlignment(SwingConstants.CENTER);
		texte_forum.setForeground(new Color(0, 51, 102));
		texte_forum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		texte_forum.setColumns(10);
		texte_forum.setBounds(92, 75, 675, 38);
		panel_forum.add(texte_forum);
		
		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(777, 73, 41, 41);
		panel_forum.add(label_8);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			
			}
		});
		scrollPane_1.setBounds(10, 125, 468, 257);
		panel_forum.add(scrollPane_1);
		
		table_forum = new JTable();
		table_forum.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0", "Titre", "Resolu"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_forum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_1.setViewportView(table_forum);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(488, 124, 330, 38);
		panel_forum.add(scrollPane_3);
		
		JTextArea textArea_Titreforum = new JTextArea();
		textArea_Titreforum.setLineWrap(true);
		textArea_Titreforum.setEditable(false);
		textArea_Titreforum.setForeground(new Color(0, 51, 102));
		textArea_Titreforum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		scrollPane_3.setViewportView(textArea_Titreforum);
		textArea_Titreforum.setText("Titre du Forum");
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_4.setBounds(488, 167, 330, 93);
		panel_forum.add(scrollPane_4);
		
		JTextArea textArea_ProblemeForum = new JTextArea();
		textArea_ProblemeForum.setLineWrap(true);
		textArea_ProblemeForum.setEditable(false);
		textArea_ProblemeForum.setForeground(new Color(0, 51, 102));
		textArea_ProblemeForum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		scrollPane_4.setViewportView(textArea_ProblemeForum);
		textArea_ProblemeForum.setText("Problème du Forum");
		
		JButton btnAfficher = new JButton("Afficher");
		btnAfficher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				int index = table_forum.getSelectedRow();
				TableModel model = table_forum.getModel();
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner un Forum");
				}
				else
				{
					textArea_ProblemeForum.setText("");
					textArea_Commentaires.setText("");
					textArea_ProblemeForum.setText("");
					
					int numF = (Integer)model.getValueAt(index, 0);
					Forum f = Factory.getForumDao().find(numF);
					
					textArea_Titreforum.setText(f.getNomForum());
					textArea_ProblemeForum.setText(f.getProblemeForum());
					
					//affichage des commentaires du forum
					for(Commentaire c : f.getCommentaires())
					{
						//ajouter le commentaire dans la zone des comms
						textArea_Commentaires.append("  "+c.getCreateur()+": \n");
						textArea_Commentaires.append("  - "+c.getText() +"\n\n");
						textField_rep.setText("");
						
					}
				}
			}
		});
		btnAfficher.setForeground(Color.WHITE);
		btnAfficher.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAfficher.setBackground(new Color(51, 153, 204));
		btnAfficher.setBounds(287, 393, 105, 32);
		panel_forum.add(btnAfficher);
		
		JButton btnRsolu = new JButton("R\u00E9solu");
		btnRsolu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/* set resolu to true 
				 * verifie si le forum appartient a l'utilisateur
				 */
				int index = table_forum.getSelectedRow();
				TableModel model = table_forum.getModel();
				
				if (index==-1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner un Forum");
				}
				else
				{
					int numF = (Integer)model.getValueAt(index, 0);
					Forum f = Factory.getForumDao().find(numF);
					if(!f.getCreateur().equals(Controleur.apprenantCo.getId()))
					{
						JOptionPane.showMessageDialog(null, "Ce forum ne vous appartient pas");
					}
					else
					{
						f.resoudre();
						Factory.getForumDao().update(f);
						model.setValueAt(f.isResolu(), index, 2);
					}
				}
		
			}
		});
		btnRsolu.setForeground(Color.WHITE);
		btnRsolu.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnRsolu.setBackground(new Color(51, 153, 204));
		btnRsolu.setBounds(102, 393, 105, 32);
		panel_forum.add(btnRsolu);
		
		JLabel lblCommentaires = new JLabel("Commentaires :");
		lblCommentaires.setHorizontalAlignment(SwingConstants.LEFT);
		lblCommentaires.setForeground(new Color(0, 51, 102));
		lblCommentaires.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblCommentaires.setBackground(new Color(0, 51, 102));
		lblCommentaires.setBounds(508, 259, 310, 24);
		panel_forum.add(lblCommentaires);
		
		
		
		
		
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
		scrollPane.setBounds(333, 178, 505, 326);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_chat.add(scrollPane);
		
		JTextArea textArea_chat = new JTextArea();
		textArea_chat.setLineWrap(true);
		textArea_chat.setForeground(new Color(255, 255, 255));
		textArea_chat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textArea_chat.setBackground(new Color(51, 153, 255));
		textArea_chat.setEditable(false);
		scrollPane.setViewportView(textArea_chat);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(780, 507, 58, 46);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String msg = message.getText();
				textArea_chat.append(" - "+ msg+"\n");
				
				
				message.setText("");
				
			
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\paper_plane_38px.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_chat.add(lblNewLabel_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 178, 312, 326);
		panel_chat.add(scrollPane_2);
		
		table_chat = new JTable();
		table_chat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int index = table_chat.getSelectedRow();
				
				TableModel model = table_chat.getModel();
				
				String ami = (String) model.getValueAt(index, 0);
			//	System.out.println(ami);
				
			//	Utilisateur envoi = new Utilisateur() {};
			//	Utilisateur dest = new Utilisateur() {};
				
				
				
				
				
			}
		});
		table_chat.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Amis"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_chat.getColumnModel().getColumn(0).setResizable(false);
		table_chat.setForeground(new Color(0, 51, 102));
		table_chat.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		scrollPane_2.setViewportView(table_chat);
		
		textField_RechercheAmis = new JTextField();
		textField_RechercheAmis.setHorizontalAlignment(SwingConstants.CENTER);
		textField_RechercheAmis.setForeground(new Color(0, 51, 102));
		textField_RechercheAmis.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		textField_RechercheAmis.setColumns(10);
		textField_RechercheAmis.setBounds(333, 114, 448, 32);
		panel_chat.add(textField_RechercheAmis);
		
		JLabel lblRechercher = new JLabel("Rechercher et ajouter un amis :");
		lblRechercher.setHorizontalAlignment(SwingConstants.CENTER);
		lblRechercher.setForeground(new Color(0, 51, 102));
		lblRechercher.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblRechercher.setBackground(new Color(0, 51, 102));
		lblRechercher.setBounds(10, 110, 312, 41);
		panel_chat.add(lblRechercher);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			if(textField_RechercheAmis.getText().isEmpty()== false)
			{
				DefaultTableModel model = (DefaultTableModel) table_chat.getModel();
				
				model.addRow(new Object [] { textField_RechercheAmis.getText()});
				
				textField_RechercheAmis.setText("");
			}
				
				
				
				
			}
		});
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\plus_2_math_30px.png"));
		label_7.setBounds(791, 114, 36, 32);
		panel_chat.add(label_7);
		
		
		
		
		
		
		
	
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
		lblSs.setIcon(new ImageIcon("D:\\Mes Projets\\ULearn\\Source\\U-Learn\\Icons\\sorting_options_80px.png"));
		
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
				panel_cours.setVisible(false);
				panel_chat.setVisible(false);
				
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
