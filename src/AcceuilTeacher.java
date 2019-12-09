import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import code.classes.Blog;
import code.classes.Commentaire;
import code.classes.Cour;
import code.classes.Date;
import code.classes.Demande;
import code.classes.EnumDifficulte;
import code.classes.Formation;
import code.classes.Forum;
import code.classes.Question;
import code.classes.Quiz;
import code.classes.Suivre;
import code.classes.Wiki;
import code.dao.Factory;

public class AcceuilTeacher extends JFrame {

	private JPanel contentPane;
	private JPasswordField mdp;
	private JPasswordField mdp_confirm;
	private JPasswordField passwordField_newMdp;
	private JPasswordField passwordField_confNewMdp;
	private JPasswordField passwordField_encien;
	private JTextField email;
	private JTextField titre_forum;
	private JTextField texte_forum;
	private JTextField textField_rep;
	private JTable table_forum;
	private JTextField titre_formation;
	private JTextField desc_formation;
	private JTextField duree_formation;
	private JTextField titre_cours;
	private JTextField desc_cours;
	private JTable table_formations;
	private JTable table_mesFormations;
	private JTable table_coursForm;
	private JTextField txtTitreWiki;
	private JTextField textField_titrWiki2;
	private JTable table_allWikis;

	private JTable table_coursAjouter;
	private JTable table_demandes;
	private JTable table_app;
	private JTable table_frm;
	private JTextField txtDomaineWiki;
	private JTextField txtTitreBlog;
	private JTextField txtTitreBlog_1;
	private JTable table_blogs;
	private JTable table_qst;
	private JTextField textField_qst;
	private JTextField textField_rep1;
	private JTextField textField_rep2;
	private JTextField textField_bnRep;
	
	//variable utilisées dans les traitements
	private String cheminImageWiki="";
	private String cheminImageBlog="";
	private String cheminCour="";
	private int offset=1;
	private int offsetQuest = 1;
	private int parcoureur = 0;
	private int parcoureurB = 0;
	private int wikiSelec;
	private int selectQuiz=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new AcceuilTeacher().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AcceuilTeacher() {
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
		

		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(206, 11, 848, 589);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_principal = new JPanel();
		layeredPane.add(panel_principal, "name_529656929510900");
		panel_principal.setBackground(Color.WHITE);
		panel_principal.setLayout(null);
		
		JPanel panel_profile = new JPanel();
		layeredPane.add(panel_profile, "name_530147814846000");
		
		panel_profile.setBackground(new Color(255, 255, 255));
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
		
		passwordField_newMdp = new JPasswordField();
		passwordField_newMdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_newMdp.setForeground(new Color(0, 51, 102));
		passwordField_newMdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		passwordField_newMdp.setEchoChar('*');
		passwordField_newMdp.setBounds(404, 102, 340, 41);
		panel_mdp.add(passwordField_newMdp);
		
		passwordField_confNewMdp = new JPasswordField();
		passwordField_confNewMdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_confNewMdp.setForeground(new Color(0, 51, 102));
		passwordField_confNewMdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		passwordField_confNewMdp.setEchoChar('*');
		passwordField_confNewMdp.setBounds(404, 167, 340, 41);
		panel_mdp.add(passwordField_confNewMdp);
		
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
		email.setBounds(393, 41, 340, 41);
		panel_adr.add(email);
		
		mdp = new JPasswordField();
		mdp.setHorizontalAlignment(SwingConstants.CENTER);
		mdp.setForeground(new Color(0, 51, 102));
		mdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		mdp.setEchoChar('*');
		mdp.setBounds(393, 105, 340, 41);
		panel_adr.add(mdp);
		
		mdp_confirm = new JPasswordField();
		mdp_confirm.setHorizontalAlignment(SwingConstants.CENTER);
		mdp_confirm.setForeground(new Color(0, 51, 102));
		mdp_confirm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		mdp_confirm.setEchoChar('*');
		mdp_confirm.setBounds(393, 168, 340, 41);
		panel_adr.add(mdp_confirm);
		
		email = new JTextField();
		email.setForeground(new Color(0, 51, 102));
		email.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		email.setColumns(10);
		email.setBounds(393, 46, 340, 38);
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
		
		
		JPanel panel_chat = new JPanel();
		panel_chat.setBackground(new Color(51, 0, 0));
		layeredPane.add(panel_chat, "name_530172613639500");
		
		JPanel panel_cours = new JPanel();
		panel_cours.setBackground(Color.WHITE);
		layeredPane.add(panel_cours, "name_1369027173701500");
		panel_cours.setLayout(null);
		
		JLayeredPane layeredPane_cours = new JLayeredPane();
		layeredPane_cours.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		layeredPane_cours.setBounds(10, 66, 828, 523);
		panel_cours.add(layeredPane_cours);
		layeredPane_cours.setLayout(new CardLayout(0, 0));
		
		JPanel panel_formation = new JPanel();
		panel_formation.setBackground(Color.WHITE);
		layeredPane_cours.add(panel_formation, "name_99652437663700");
		panel_formation.setLayout(null);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(0, 59, 828, 464);
		panel_formation.add(layeredPane_2);
		layeredPane_2.setLayout(new CardLayout(0, 0));
		
		JPanel panel_ajoutFormation = new JPanel();
		panel_ajoutFormation.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_ajoutFormation.setBackground(Color.WHITE);
		layeredPane_2.add(panel_ajoutFormation, "name_223819863362900");
		panel_ajoutFormation.setLayout(null);
		
		JLabel lblTitreDeLa = new JLabel("Titre de la formation : ");
		lblTitreDeLa.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitreDeLa.setForeground(new Color(0, 51, 102));
		lblTitreDeLa.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTitreDeLa.setBackground(new Color(0, 51, 102));
		lblTitreDeLa.setBounds(32, 7, 210, 41);
		panel_ajoutFormation.add(lblTitreDeLa);
		
		titre_formation = new JTextField();
		titre_formation.setHorizontalAlignment(SwingConstants.CENTER);
		titre_formation.setForeground(new Color(0, 51, 102));
		titre_formation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		titre_formation.setColumns(10);
		titre_formation.setBounds(255, 11, 563, 36);
		panel_ajoutFormation.add(titre_formation);
		
		JLabel lblDescription = new JLabel("Description : ");
		lblDescription.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescription.setForeground(new Color(0, 51, 102));
		lblDescription.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblDescription.setBackground(new Color(0, 51, 102));
		lblDescription.setBounds(20, 73, 129, 41);
		panel_ajoutFormation.add(lblDescription);
		
		desc_formation = new JTextField();
		desc_formation.setHorizontalAlignment(SwingConstants.CENTER);
		desc_formation.setForeground(new Color(0, 51, 102));
		desc_formation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		desc_formation.setColumns(10);
		desc_formation.setBounds(159, 58, 448, 75);
		panel_ajoutFormation.add(desc_formation);
		
		JLabel lblDure = new JLabel("Dur\u00E9e :");
		lblDure.setHorizontalAlignment(SwingConstants.LEFT);
		lblDure.setForeground(new Color(0, 51, 102));
		lblDure.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblDure.setBackground(new Color(0, 51, 102));
		lblDure.setBounds(728, 60, 57, 22);
		panel_ajoutFormation.add(lblDure);
		
		duree_formation = new JTextField();
		duree_formation.setHorizontalAlignment(SwingConstants.CENTER);
		duree_formation.setForeground(new Color(0, 51, 102));
		duree_formation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		duree_formation.setColumns(10);
		duree_formation.setBounds(779, 58, 39, 28);
		panel_ajoutFormation.add(duree_formation);
		
		JLabel lblDifficult = new JLabel("Difficult\u00E9 :");
		lblDifficult.setHorizontalAlignment(SwingConstants.LEFT);
		lblDifficult.setForeground(new Color(0, 51, 102));
		lblDifficult.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblDifficult.setBackground(new Color(0, 51, 102));
		lblDifficult.setBounds(617, 94, 75, 22);
		panel_ajoutFormation.add(lblDifficult);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(357, 144, 461, 294);
		panel_ajoutFormation.add(scrollPane);
		
		table_coursAjouter = new JTable();
		table_coursAjouter.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Titre", "Description"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_coursAjouter.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane.setViewportView(table_coursAjouter);
		
		JLabel lblTitreDuCours = new JLabel("Titre du cours : ");
		lblTitreDuCours.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitreDuCours.setForeground(new Color(0, 51, 102));
		lblTitreDuCours.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblTitreDuCours.setBackground(new Color(0, 51, 102));
		lblTitreDuCours.setBounds(10, 147, 107, 31);
		panel_ajoutFormation.add(lblTitreDuCours);
		
		titre_cours = new JTextField();
		titre_cours.setHorizontalAlignment(SwingConstants.CENTER);
		titre_cours.setForeground(new Color(0, 51, 102));
		titre_cours.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		titre_cours.setColumns(10);
		titre_cours.setBounds(127, 145, 220, 31);
		panel_ajoutFormation.add(titre_cours);
		
		JLabel lblDescription_1 = new JLabel("Description :");
		lblDescription_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescription_1.setForeground(new Color(0, 51, 102));
		lblDescription_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblDescription_1.setBackground(new Color(0, 51, 102));
		lblDescription_1.setBounds(10, 201, 97, 31);
		panel_ajoutFormation.add(lblDescription_1);
		
		desc_cours = new JTextField();
		desc_cours.setHorizontalAlignment(SwingConstants.CENTER);
		desc_cours.setForeground(new Color(0, 51, 102));
		desc_cours.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		desc_cours.setColumns(10);
		desc_cours.setBounds(127, 186, 220, 105);
		panel_ajoutFormation.add(desc_cours);
		
		JButton btnAjouterLeCours = new JButton("Ajouter le cours");
		btnAjouterLeCours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(titre_cours.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Titre Cour manquant");
				}
				else if(cheminCour.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Pas de cour selectionné");
				}
				else
				{
					int numC = Factory.getCourDao().getMaxNum()+offset;
					int numF = Factory.getFormationDao().getMaxNum()+1;
					offset++;
					Cour c = new Cour(numC,titre_cours.getText(),desc_cours.getText(),cheminCour,numF);
					Controleur.listeCours.add(c);
					
					cheminCour = "";
					titre_cours.setText("");
					desc_cours.setText("");
					JOptionPane.showMessageDialog(null, "Cour ajouté");
					DefaultTableModel model = (DefaultTableModel)table_coursAjouter.getModel();
					model.addRow(new Object[] {c.getNomCour(), c.getDescription()});
					
				}
			}
		});
		btnAjouterLeCours.setForeground(Color.WHITE);
		btnAjouterLeCours.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAjouterLeCours.setBackground(new Color(51, 153, 204));
		btnAjouterLeCours.setBounds(68, 344, 226, 28);
		panel_ajoutFormation.add(btnAjouterLeCours);
		
		JLabel lblPdf = new JLabel("PDF du cours :");
		lblPdf.setHorizontalAlignment(SwingConstants.CENTER);
		lblPdf.setForeground(new Color(0, 51, 102));
		lblPdf.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblPdf.setBackground(new Color(0, 51, 102));
		lblPdf.setBounds(51, 302, 129, 31);
		panel_ajoutFormation.add(lblPdf);
		
		JButton buttonPDF = new JButton("+");
		buttonPDF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setCurrentDirectory(new File("C:\\Users\\YACINE\\Desktop"));
					FileNameExtensionFilter filter = new FileNameExtensionFilter("pdf","txt","docx");
					fileChooser.addChoosableFileFilter(filter);
					int result = fileChooser.showSaveDialog(null);
					if(result == JFileChooser.APPROVE_OPTION)
					{
						File selectedfile = fileChooser.getSelectedFile();
						cheminCour = selectedfile.getAbsolutePath();
						//System.out.println(path);
						//System.out.println(selectedfile.getName());
						//Desktop.getDesktop().open(new java.io.File(cheminCour));
						
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
				catch( Exception e)
				{
					JOptionPane.showMessageDialog(null, "Erreur");
				}
				
			}
		});
		buttonPDF.setForeground(Color.WHITE);
		buttonPDF.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		buttonPDF.setBackground(new Color(51, 153, 204));
		buttonPDF.setBounds(174, 301, 135, 31);
		panel_ajoutFormation.add(buttonPDF);
		
		JComboBox comboBox_niv = new JComboBox();
		comboBox_niv.setForeground(new Color(0, 51, 102));
		comboBox_niv.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		comboBox_niv.setBorder(null);
		comboBox_niv.setBackground(Color.WHITE);
		comboBox_niv.setBounds(653, 58, 65, 27);
		panel_ajoutFormation.add(comboBox_niv);
		
		comboBox_niv.addItem("L1");
		comboBox_niv.addItem("L2");
		comboBox_niv.addItem("L3");
		comboBox_niv.addItem("M1");
		comboBox_niv.addItem("M2");
		comboBox_niv.setSelectedItem(null);
		
		JComboBox comboBox_diff = new JComboBox();
		comboBox_diff.setForeground(new Color(0, 51, 102));
		comboBox_diff.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		comboBox_diff.setBorder(null);
		comboBox_diff.setBackground(Color.WHITE);
		comboBox_diff.setBounds(702, 93, 116, 27);
		panel_ajoutFormation.add(comboBox_diff);
		
		comboBox_diff.addItem("Facile");
		comboBox_diff.addItem("Moyen");
		comboBox_diff.addItem("Difficile");
		comboBox_diff.setSelectedItem(null);
		
		JPanel panel_quiz_tests = new JPanel();
		panel_quiz_tests.setBackground(Color.WHITE);
		panel_quiz_tests.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		layeredPane_2.add(panel_quiz_tests, "name_223824716719900");
		panel_quiz_tests.setLayout(null);
		
		
		
		JLabel lblNiv = new JLabel("Niv :");
		lblNiv.setHorizontalAlignment(SwingConstants.LEFT);
		lblNiv.setForeground(new Color(0, 51, 102));
		lblNiv.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNiv.setBackground(new Color(0, 51, 102));
		lblNiv.setBounds(617, 60, 39, 22);
		panel_ajoutFormation.add(lblNiv);
		
		
		JPanel panel_mesFormations = new JPanel();
		panel_mesFormations.setBackground(Color.WHITE);
		panel_mesFormations.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		layeredPane_2.add(panel_mesFormations, "name_223822251155400");
		panel_mesFormations.setLayout(null);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_8.setBounds(10, 11, 477, 341);
		panel_mesFormations.add(scrollPane_8);
		
		table_mesFormations = new JTable();
		table_mesFormations.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0", "Nom Formation", "Nb Cours", "Nb Etudiants"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_mesFormations.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		scrollPane_8.setViewportView(table_mesFormations);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(497, 11, 321, 341);
		panel_mesFormations.add(scrollPane_9);
		
		table_coursForm = new JTable();
		table_coursForm.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0 cours", "Titre"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_coursForm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_9.setViewportView(table_coursForm);
		
		JButton btnSupprimerFormation = new JButton("Supprimer formation");
		btnSupprimerFormation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_mesFormations.getSelectedRow();
				TableModel model = table_mesFormations.getModel();
				DefaultTableModel modelCours = (DefaultTableModel)table_coursForm.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner une Formation");
				}
				else
				{
					int numFrm = (Integer)model.getValueAt(index , 0);
					Formation f = Factory.getFormationDao().find(numFrm);
					
					Factory.getFormationDao().delete(f);
					modelCours.setRowCount(0);
					((DefaultTableModel)model).removeRow(index);
					JOptionPane.showMessageDialog(null, "Suppresion réussite");
				}
			}
		});
		btnSupprimerFormation.setForeground(Color.WHITE);
		btnSupprimerFormation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnSupprimerFormation.setBackground(new Color(51, 153, 204));
		btnSupprimerFormation.setBounds(555, 415, 220, 41);
		panel_mesFormations.add(btnSupprimerFormation);
		
		JButton btnSupprimerCours = new JButton("Supprimer cours");
		btnSupprimerCours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_coursForm.getSelectedRow();
				TableModel model = table_coursForm.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez séléctionner un cours");
				}
				else
				{
					int indexF = table_mesFormations.getSelectedRow();
					DefaultTableModel modelF = (DefaultTableModel)table_mesFormations.getModel();
					
					int nbCrs = (Integer)modelF.getValueAt(index, 2);
					
					
					int numC = (Integer)model.getValueAt(index, 0);
					Cour c = Factory.getCourDao().find(numC);
					
					Factory.getCourDao().delete(c);
					((DefaultTableModel)model).removeRow(index);
					modelF.setValueAt(nbCrs-1, index, 2);
					JOptionPane.showMessageDialog(null, "Suppression réussite");
				
				}
			}
		});
		btnSupprimerCours.setForeground(Color.WHITE);
		btnSupprimerCours.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnSupprimerCours.setBackground(new Color(51, 153, 204));
		btnSupprimerCours.setBounds(663, 363, 140, 41);
		panel_mesFormations.add(btnSupprimerCours);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(10, 363, 477, 90);
		panel_mesFormations.add(scrollPane_10);
		
		JTextArea txtrRemarquePour = new JTextArea();
		txtrRemarquePour.setText("* Remarque * \r\n\r\n Pour suppimer une formation :\r\n     - Selectionnez la ligne de la formation . \r\n     - Cliquez sur \"Supprimer formation\" .\r\n\r\n Pour supprimer un cours d'un formation :\r\n     - Selectionnez la ligne de la formation . \r\n     - Selectionnez la ligne du cours .\r\n     - Cliquez sur \"Supprimer cours\" . ");
		txtrRemarquePour.setForeground(Color.WHITE);
		txtrRemarquePour.setBackground(new Color(0, 135, 204));
		txtrRemarquePour.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		scrollPane_10.setViewportView(txtrRemarquePour);
		
		JButton btnAfficherCours = new JButton("Afficher Cours");
		btnAfficherCours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_mesFormations.getSelectedRow();
				TableModel model = table_mesFormations.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner une Formation");
				}
				else
				{
					int numFrm = (Integer)model.getValueAt(index, 0);
					Formation f = Factory.getFormationDao().find(numFrm);
					
					DefaultTableModel modelCours = (DefaultTableModel)table_coursForm.getModel();
					modelCours.setRowCount(0);
					
					for(Cour c : f.getListeCours())
					{
						modelCours.addRow(new Object[] {c.getNumCour(), c.getNomCour()});
					}
				}
			}
		});
		btnAfficherCours.setForeground(Color.WHITE);
		btnAfficherCours.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnAfficherCours.setBackground(new Color(51, 153, 204));
		btnAfficherCours.setBounds(507, 363, 126, 41);
		panel_mesFormations.add(btnAfficherCours);
		
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(10, 11, 375, 152);
		panel_quiz_tests.add(scrollPane_2);
		
		table_formations = new JTable();
		table_formations.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0", "Titre formation"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_formations.getColumnModel().getColumn(0).setResizable(false);
		table_formations.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_2.setViewportView(table_formations);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_6.setBounds(395, 11, 423, 192);
		panel_quiz_tests.add(scrollPane_6);
		
		table_qst = new JTable();
		table_qst.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0 Question", "Question"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_qst.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_6.setViewportView(table_qst);
		
		JButton btnValiderLeTest = new JButton("Valider le test");
		btnValiderLeTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(selectQuiz == 1)
				{
					Factory.getFormationDao().insert(Controleur.formationSelec, Controleur.instructerCo.getId());
					JOptionPane.showMessageDialog(null, "Formation ajoutée");
					
					btnValiderLeTest.setText("Valider le test");
					
					panel_ajoutFormation.setVisible(true);
					panel_quiz_tests.setVisible(false);
					
					offsetQuest = 1;
					selectQuiz = 0;
					
					textField_qst.setText("");
					textField_rep1.setText("");
					textField_rep2.setText("");
					textField_bnRep.setText("");
				}
				else
				{
					
				}
			}
		});
		btnValiderLeTest.setForeground(Color.WHITE);
		btnValiderLeTest.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnValiderLeTest.setBackground(new Color(51, 153, 204));
		btnValiderLeTest.setBounds(286, 410, 289, 43);
		panel_quiz_tests.add(btnValiderLeTest);
		
		JButton btnAjouterLaFormation = new JButton("Ajouter la formation");
		btnAjouterLaFormation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			if(titre_formation.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Titre formation manquant");
			}
			else if(((String)(comboBox_diff.getSelectedItem())).equals(""))
			{
				JOptionPane.showMessageDialog(null, "Difficulté manquante");
			}
			else if(((String)(comboBox_niv.getSelectedItem())).equals(""))
			{
				JOptionPane.showMessageDialog(null, "Niveau manquant");
			}
			else if(Controleur.listeCours.size()==0)
			{
				JOptionPane.showMessageDialog(null, "Vous devez ajouter au moins un cours");
			}
			else
			{
				int numF = Factory.getFormationDao().getMaxNum()+1;
				EnumDifficulte diff = EnumDifficulte.transform((String)(comboBox_diff.getSelectedItem()));
				int duree = Integer.valueOf(duree_formation.getText());
				
				
				Formation f = new Formation(numF, titre_formation.getText(), desc_formation.getText(),
						      comboBox_niv.getSelectedIndex()+1, diff, duree, Controleur.instructerCo.getId());
				Controleur.formationSelec = f;
				
				JOptionPane.showMessageDialog(null, "Parfait, ajoutez un quiz pour finaliser");
				offset = 1;
				
				//ajout de la liste des cours
				Controleur.formationSelec.setListeCours(Controleur.listeCours);
				
				//initialization du quiz
				Quiz q = new Quiz(numF, "Quiz "+Controleur.formationSelec.getNomFormation());
				Controleur.formationSelec.setQuiz(q);
				
				titre_cours.setText("");
				titre_formation.setText("");
				desc_formation.setText("");
				duree_formation.setText("");
				
				
				//mettre la foramtion dans la table de formation dans la table test
				DefaultTableModel model = (DefaultTableModel)table_formations.getModel();
				model.setRowCount(0);
				model.addRow(new Object[] {Controleur.formationSelec.getNumFormation(), Controleur.formationSelec.getNomFormation()});
				
				
				//modification d label du bouton de quiz
				btnValiderLeTest.setText("Finaliser formation");
				
				selectQuiz = 1;
				
				//envoyer l'instructeur a la page des quiz pour ajouter un quiz
				panel_ajoutFormation.setVisible(false);
				panel_quiz_tests.setVisible(true);
				
			}
			
			
			
			}
		});
		btnAjouterLaFormation.setForeground(Color.WHITE);
		btnAjouterLaFormation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnAjouterLaFormation.setBackground(new Color(51, 153, 204));
		btnAjouterLaFormation.setBounds(68, 397, 226, 41);
		panel_ajoutFormation.add(btnAjouterLaFormation);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 214, 808, 185);
		panel_quiz_tests.add(panel_1);
		panel_1.setLayout(null);
		
		textField_qst = new JTextField();
		textField_qst.setHorizontalAlignment(SwingConstants.CENTER);
		textField_qst.setForeground(new Color(0, 51, 102));
		textField_qst.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		textField_qst.setColumns(10);
		textField_qst.setBounds(182, 12, 379, 31);
		panel_1.add(textField_qst);
		
		JLabel label_5 = new JLabel("Question ");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(0, 51, 102));
		label_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label_5.setBackground(new Color(0, 51, 102));
		label_5.setBounds(21, 11, 151, 31);
		panel_1.add(label_5);
		
		JLabel label_15 = new JLabel("1\u00E9re r\u00E9ponse ");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(new Color(0, 51, 102));
		label_15.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label_15.setBackground(new Color(0, 51, 102));
		label_15.setBounds(21, 53, 151, 31);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("2\u00E9me r\u00E9ponse ");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(new Color(0, 51, 102));
		label_16.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label_16.setBackground(new Color(0, 51, 102));
		label_16.setBounds(21, 95, 151, 31);
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("Bonne r\u00E9ponse ");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(new Color(0, 51, 102));
		label_17.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label_17.setBackground(new Color(0, 51, 102));
		label_17.setBounds(21, 137, 151, 31);
		panel_1.add(label_17);
		
		textField_rep1 = new JTextField();
		textField_rep1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_rep1.setForeground(new Color(0, 51, 102));
		textField_rep1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		textField_rep1.setColumns(10);
		textField_rep1.setBounds(182, 54, 379, 31);
		panel_1.add(textField_rep1);
		
		textField_rep2 = new JTextField();
		textField_rep2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_rep2.setForeground(new Color(0, 51, 102));
		textField_rep2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		textField_rep2.setColumns(10);
		textField_rep2.setBounds(182, 96, 379, 31);
		panel_1.add(textField_rep2);
		
		textField_bnRep = new JTextField();
		textField_bnRep.setHorizontalAlignment(SwingConstants.CENTER);
		textField_bnRep.setForeground(new Color(0, 51, 102));
		textField_bnRep.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		textField_bnRep.setColumns(10);
		textField_bnRep.setBounds(182, 138, 379, 31);
		panel_1.add(textField_bnRep);
		
		JButton button_9 = new JButton("Ajouter ");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel)table_qst.getModel();
				
				if(textField_qst.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Question requise");
				}
				else if(textField_bnRep.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Bonne réponse requise");
				}
				else
				{
					int numQ  = Factory.getQuestionDao().getMaxNum()+offsetQuest;
					offsetQuest++;
					
					Question q = new Question(numQ,
							textField_qst.getText(),
							textField_rep1.getText(),
							textField_rep2.getText(),
							textField_bnRep.getText(),
							Controleur.formationSelec.getQuiz().getNumQuiz());
					
					Controleur.formationSelec.getQuiz().ajouterQuestion(q);
					
					model.addRow(new Object[] {q.getNumQuestion(), q.getQuestion()});
					
					
					if(selectQuiz == 0)
					{
						Factory.getQuestionDao().insert(q, Controleur.formationSelec.getQuiz().getNumQuiz());
					}
					
					textField_qst.setText("");
					textField_rep1.setText("");
					textField_rep2.setText("");
					textField_bnRep.setText("");
				}
				
				
			}
		});
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		button_9.setBackground(new Color(51, 153, 204));
		button_9.setBounds(626, 33, 161, 32);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton("Modifier");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TableModel model = table_qst.getModel();
				int index = table_qst.getSelectedRow();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner une question à modifier");
				}
				else if(textField_qst.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Question requise");
				}
				else if(textField_bnRep.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Bonne réponse requise");
				}
				else
				{
					int numQ = (Integer)model.getValueAt(index, 0);
					Question q = Factory.getQuestionDao().find(numQ);
					//mise a jor du pojo
					q.setQuestion(textField_qst.getText());
					q.setReponse1(textField_rep1.getText());
					q.setReponse2(textField_rep2.getText());
					q.setBonneRep(textField_bnRep.getText());
					
					Factory.getQuestionDao().update(q);
					
					JOptionPane.showMessageDialog(null, "Mise a jour réussie");
					model.setValueAt(q.getQuestion(), index, 1);
					
					
					textField_qst.setText("");
					textField_rep1.setText("");
					textField_rep2.setText("");
					textField_bnRep.setText("");
				}
			}
		});
		button_10.setForeground(Color.WHITE);
		button_10.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		button_10.setBackground(new Color(51, 153, 204));
		button_10.setBounds(626, 76, 161, 32);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("Supprimer");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_qst.getSelectedRow();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selection une question à supprimer");
				}
				else
				{
					TableModel model = table_qst.getModel();
					int numQ = (Integer)model.getValueAt(index, 0);
					
					Question q = Factory.getQuestionDao().find(numQ);
					
					//suppression
					Factory.getQuestionDao().delete(q);
					JOptionPane.showMessageDialog(null, "Sippression effectuée");
					((DefaultTableModel)model).removeRow(index);
					
				}
			}
		});
		button_11.setForeground(Color.WHITE);
		button_11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		button_11.setBackground(new Color(51, 153, 204));
		button_11.setBounds(626, 119, 161, 32);
		panel_1.add(button_11);
		
		JButton AfficherQuestions = new JButton("Afficher");
		AfficherQuestions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_formations.getSelectedRow();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionnez une formation");
				}
				else
				{
					TableModel modelFrm = table_formations.getModel();
					DefaultTableModel modelQuest = (DefaultTableModel)table_qst.getModel();
					modelQuest.setRowCount(0);
					
					int numFrm = (Integer)modelFrm.getValueAt(index, 0);
					Controleur.formationSelec = Factory.getFormationDao().find(numFrm);
					
					for(Question q : Controleur.formationSelec.getQuiz().getQuestions())
					{
						modelQuest.addRow(new Object[] {q.getNumQuestion(), q.getQuestion()});
					}
				}
			}
		});
		AfficherQuestions.setBounds(118, 171, 161, 32);
		panel_quiz_tests.add(AfficherQuestions);
		AfficherQuestions.setForeground(Color.WHITE);
		AfficherQuestions.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		AfficherQuestions.setBackground(new Color(51, 153, 204));
		
		JPanel panel_demandes = new JPanel();
		panel_demandes.setBackground(Color.WHITE);
		layeredPane_2.add(panel_demandes, "name_155316224099300");
		panel_demandes.setLayout(null);
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_12.setBounds(10, 11, 808, 387);
		panel_demandes.add(scrollPane_12);
		
		table_demandes = new JTable();
		table_demandes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0 Formation", "Formation", "ID Apprenant", "Niveau"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_demandes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_12.setViewportView(table_demandes);
		
		JButton btnRefuser = new JButton("Refuser\r\n");
		btnRefuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_demandes.getSelectedRow();
				TableModel model = table_demandes.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner une demande");
				}
				else
				{
					String idApp = (String)model.getValueAt(index, 2);
					int numFrm = (Integer)model.getValueAt(index, 0);
					
					//supprimer la demande
					Factory.getDemandeDao().delete(idApp, numFrm);
					
					((DefaultTableModel)model).removeRow(index);
					JOptionPane.showMessageDialog(null, "La demande a été supprimé");
				}
			}
		});
		btnRefuser.setForeground(Color.WHITE);
		btnRefuser.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnRefuser.setBackground(new Color(51, 153, 204));
		btnRefuser.setBounds(465, 409, 200, 44);
		panel_demandes.add(btnRefuser);
		
		JButton btnAccepter = new JButton("Accepter");
		btnAccepter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_demandes.getSelectedRow();
				TableModel model = table_demandes.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner une demande");
				}
				else
				{
					String idApp = (String)model.getValueAt(index, 2);
					int numFrm = (Integer)model.getValueAt(index, 0);
					
					//inserer dans la table suivre
					Factory.getSuivreDao().insert(idApp, numFrm);
					
					//supprimer la demande
					Factory.getDemandeDao().delete(idApp, numFrm);
					
					((DefaultTableModel)model).removeRow(index);
					JOptionPane.showMessageDialog(null, "L'apprenant suit maintenant la formation");
				}

			}
		});
		btnAccepter.setForeground(Color.WHITE);
		btnAccepter.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnAccepter.setBackground(new Color(51, 153, 204));
		btnAccepter.setBounds(155, 409, 200, 44);
		panel_demandes.add(btnAccepter);
		
		JPanel panel_apprenants = new JPanel();
		layeredPane_2.add(panel_apprenants, "name_155876957758000");
		panel_apprenants.setLayout(null);
		
		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_13.setBounds(10, 11, 808, 166);
		panel_apprenants.add(scrollPane_13);
		
		table_frm = new JTable();
		table_frm.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0 formation", "Titre formation", "Niveau formation"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_frm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_13.setViewportView(table_frm);
		
		JScrollPane scrollPane_14 = new JScrollPane();
		scrollPane_14.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_14.setBounds(10, 188, 808, 222);
		panel_apprenants.add(scrollPane_14);
		
		table_app = new JTable();
		table_app.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID Apprenant", "Niveau", "Avencement"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_app.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_14.setViewportView(table_app);
		
		JButton btnSupprimer_1 = new JButton("Supprimer");
		btnSupprimer_1.setForeground(Color.WHITE);
		btnSupprimer_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		btnSupprimer_1.setBackground(new Color(51, 153, 204));
		btnSupprimer_1.setBounds(328, 421, 185, 32);
		panel_apprenants.add(btnSupprimer_1);
		
		
		JButton btnAjouterFormation = new JButton("Ajouter");
		btnAjouterFormation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_ajoutFormation.setVisible(true);
				panel_mesFormations.setVisible(false);
				panel_quiz_tests.setVisible(false);
				panel_demandes.setVisible(false);
				panel_apprenants.setVisible(false);
				
			}
		});
		btnAjouterFormation.setForeground(Color.WHITE);
		btnAjouterFormation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnAjouterFormation.setBackground(new Color(51, 153, 204));
		btnAjouterFormation.setBounds(10, 12, 135, 32);
		panel_formation.add(btnAjouterFormation);
		
		JButton btnMesFormation = new JButton("Mes formations ");
		btnMesFormation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel)table_mesFormations.getModel();
				model.setRowCount(0);
				int nbApp = 0;
				
				for(Formation f : Factory.getFormationDao().getMyAll(Controleur.instructerCo.getId()))
				{
					nbApp = Factory.getSuivreDao().getNbrApp(f.getNumFormation());
					model.addRow(new Object[] {f.getNumFormation(), f.getNomFormation(), f.getListeCours().size(), nbApp});
				}
				
				panel_ajoutFormation.setVisible(false);
				panel_mesFormations.setVisible(true);
				panel_quiz_tests.setVisible(false);
				panel_demandes.setVisible(false);
				panel_apprenants.setVisible(false);
				panel_apprenants.setVisible(false);
			}
		});
		btnMesFormation.setForeground(Color.WHITE);
		btnMesFormation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnMesFormation.setBackground(new Color(51, 153, 204));
		btnMesFormation.setBounds(181, 12, 135, 32);
		panel_formation.add(btnMesFormation);
		
		JButton btnTestsQuiz = new JButton("Tests / Quiz ");
		btnTestsQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				DefaultTableModel model = (DefaultTableModel)table_formations.getModel();
				model.setRowCount(0);
				
				for(Formation f : Factory.getFormationDao().getMyAll(Controleur.instructerCo.getId()))
				{
					model.addRow(new Object[] {f.getNumFormation(), f.getNomFormation()});
				}
				
				
				panel_ajoutFormation.setVisible(false);
				panel_mesFormations.setVisible(false);
				panel_quiz_tests.setVisible(true);
				panel_demandes.setVisible(false);
				panel_apprenants.setVisible(false);
			}
		});
		btnTestsQuiz.setForeground(Color.WHITE);
		btnTestsQuiz.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnTestsQuiz.setBackground(new Color(51, 153, 204));
		btnTestsQuiz.setBounds(347, 12, 135, 32);
		panel_formation.add(btnTestsQuiz);
		
		JButton Demandes = new JButton("Demandes");
		Demandes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel)table_demandes.getModel();
				model.setRowCount(0);
				
				for(Demande d : Factory.getDemandeDao().getAll(Controleur.instructerCo.getId()))
				{
					model.addRow(new Object[] {d.getNumFrm(), d.getTitreFrm(), d.getApprenant().getId(), d.getApprenant().getNiveau()});
				}
			
				panel_ajoutFormation.setVisible(false);
				panel_mesFormations.setVisible(false);
				panel_quiz_tests.setVisible(false);
				panel_demandes.setVisible(true);
				panel_apprenants.setVisible(false);
			}
		});
		Demandes.setForeground(Color.WHITE);
		Demandes.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		Demandes.setBackground(new Color(51, 153, 204));
		Demandes.setBounds(515, 12, 135, 32);
		panel_formation.add(Demandes);
		
		JButton btnApprenatns = new JButton("Apprenatns");
		btnApprenatns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				panel_ajoutFormation.setVisible(false);
				panel_mesFormations.setVisible(false);
				panel_quiz_tests.setVisible(false);
				panel_demandes.setVisible(false);
				panel_apprenants.setVisible(true);
			}
		});
		btnApprenatns.setForeground(Color.WHITE);
		btnApprenatns.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnApprenatns.setBackground(new Color(51, 153, 204));
		btnApprenatns.setBounds(683, 12, 135, 32);
		panel_formation.add(btnApprenatns);
		
	
		
		JPanel panel_forum = new JPanel();
		panel_forum.setBorder(new LineBorder(new Color(0, 51, 102), 2));
		panel_forum.setForeground(new Color(0, 51, 102));
		panel_forum.setBackground(new Color(255, 255, 255));
		layeredPane_cours.add(panel_forum, "name_99695588436500");
		
		JPanel panel_wiki = new JPanel();
		panel_wiki.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_wiki.setBackground(Color.WHITE);
		layeredPane_cours.add(panel_wiki, "name_99708708456700");
		panel_wiki.setLayout(null);
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		layeredPane_4.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		layeredPane_4.setBounds(0, 74, 828, 449);
		panel_wiki.add(layeredPane_4);
		layeredPane_4.setLayout(new CardLayout(0, 0));
		
		JPanel panel_ajouterWiki = new JPanel();
		panel_ajouterWiki.setBackground(Color.WHITE);
		layeredPane_4.add(panel_ajouterWiki, "name_415870858298000");
		panel_ajouterWiki.setLayout(null);
		
		txtTitreWiki = new JTextField();
		txtTitreWiki.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtTitreWiki.setText("");
				txtTitreWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
				txtTitreWiki.setForeground(new Color(0, 51, 102));
			
			}
		});
		txtTitreWiki.setText("Titre Wiki");
		txtTitreWiki.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitreWiki.setForeground(new Color(0, 51, 102));
		txtTitreWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		txtTitreWiki.setColumns(10);
		txtTitreWiki.setBounds(10, 11, 327, 36);
		panel_ajouterWiki.add(txtTitreWiki);
		
		JLabel lblTexteWiki = new JLabel("Texte Wiki");
		lblTexteWiki.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexteWiki.setForeground(new Color(51,153,204));
		lblTexteWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTexteWiki.setBackground(new Color(0, 51, 102));
		lblTexteWiki.setBounds(10, 98, 327, 29);
		panel_ajouterWiki.add(lblTexteWiki);
		
		JScrollPane scrollPane_wiki2 = new JScrollPane();
		scrollPane_wiki2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_wiki2.setBounds(10, 138, 327, 232);
		panel_ajouterWiki.add(scrollPane_wiki2);
		
		JTextArea textArea_textWiki = new JTextArea();
		textArea_textWiki.setForeground(new Color(0, 51, 102));
		textArea_textWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_wiki2.setViewportView(textArea_textWiki);
		
		JLabel photoWiki = new JLabel("Ajoutez des images !");
		photoWiki.setIcon(new ImageIcon("C:\\Users\\YACINE\\eclipse-workspace\\U-Learn\\Icons\\user_120px.png"));
		photoWiki.setBackground(Color.LIGHT_GRAY);
		photoWiki.setHorizontalAlignment(SwingConstants.CENTER);
		photoWiki.setForeground(new Color(0, 51, 102));
		photoWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		photoWiki.setBounds(379, 11, 409, 313);
		panel_ajouterWiki.add(photoWiki);
		
		JButton btnAjouterLeWiki = new JButton("Ajouter le Wiki");
		btnAjouterLeWiki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtTitreWiki.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez entrer un titre");
				}
				else if(txtDomaineWiki.getText().contentEquals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez entrer le domaine du wiki");
				}
				else if(textArea_textWiki.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez entrer un texte");
				}
				else
				{
					//accès au dernier numéro
					int numW = Factory.getWikiDao().getMaxNum()+1;
					//construire le pojo
					Wiki w = new Wiki(numW,
									  txtTitreWiki.getText(),
									  txtDomaineWiki.getText(),
									  textArea_textWiki.getText(),
									  Controleur.instructerCo.getId());
					
					//passer la liste des images
					w.setImages(Controleur.listeImageWiki);
					
					//inserer dans la base de données
					Factory.getWikiDao().insert(w, Controleur.instructerCo.getId());
					
					//vider la liste statique des images
					Controleur.listeImageWiki = new ArrayList<String>();
					
					textArea_textWiki.setText("");
					txtTitreWiki.setText("");
					
					JOptionPane.showMessageDialog(null, "Wiki ajouté avec succès");
				}
			}
		});
		btnAjouterLeWiki.setForeground(Color.WHITE);
		btnAjouterLeWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAjouterLeWiki.setBackground(new Color(51, 153, 204));
		btnAjouterLeWiki.setBounds(20, 381, 306, 46);
		panel_ajouterWiki.add(btnAjouterLeWiki);
		
		JButton btnSelectImageWiki = new JButton("Select Image");
		btnSelectImageWiki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("C:\\Users\\YACINE\\Desktop"));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGE","png","jpg","gif");
				fileChooser.addChoosableFileFilter(filter);
				int result = fileChooser.showSaveDialog(null);
				if(result == JFileChooser.APPROVE_OPTION)
				{
					File selectedfile = fileChooser.getSelectedFile();
					cheminImageWiki = selectedfile.getAbsolutePath();
					ImageIcon myImage = new ImageIcon(cheminImageWiki);
					java.awt.Image img = myImage.getImage();
					java.awt.Image NewImage = img.getScaledInstance(photoWiki.getWidth(), photoWiki.getHeight(), java.awt.Image.SCALE_SMOOTH); /* if error check this */
					ImageIcon finalImage = new ImageIcon(NewImage);
					photoWiki.setIcon(finalImage);

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
		btnSelectImageWiki.setForeground(Color.WHITE);
		btnSelectImageWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSelectImageWiki.setBackground(new Color(51, 153, 204));
		btnSelectImageWiki.setBounds(506, 335, 152, 31);
		panel_ajouterWiki.add(btnSelectImageWiki);
		
		JButton AjouterImageWiki = new JButton("Ajouter");
		AjouterImageWiki.setBackground(new Color(51,153,204));
		AjouterImageWiki.setForeground(Color.WHITE);
		AjouterImageWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		AjouterImageWiki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(cheminImageWiki.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez choisir d'abord une image");
				}
				else
				{
					Controleur.listeImageWiki.add(cheminImageWiki);
				}
			}
		});
		AjouterImageWiki.setBounds(516, 377, 128, 29);
		panel_ajouterWiki.add(AjouterImageWiki);
		
		txtDomaineWiki = new JTextField();
		txtDomaineWiki.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtDomaineWiki.setText("");
				txtDomaineWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
				txtDomaineWiki.setForeground(new Color(0, 51, 102));
			}
		});
		txtDomaineWiki.setText("Domaine Wiki");
		txtDomaineWiki.setHorizontalAlignment(SwingConstants.CENTER);
		txtDomaineWiki.setForeground(new Color(0, 51, 102));
		txtDomaineWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		txtDomaineWiki.setColumns(10);
		txtDomaineWiki.setBounds(10, 58, 327, 36);
		panel_ajouterWiki.add(txtDomaineWiki);
		
		JPanel panel_AllWikis = new JPanel();
		panel_AllWikis.setBackground(Color.WHITE);
		layeredPane_4.add(panel_AllWikis, "name_415881871755500");
		panel_AllWikis.setLayout(null);
		
		textField_titrWiki2 = new JTextField();
		textField_titrWiki2.setEditable(false);
		textField_titrWiki2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_titrWiki2.setForeground(new Color(0, 51, 102));
		textField_titrWiki2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textField_titrWiki2.setColumns(10);
		textField_titrWiki2.setBounds(10, 9, 467, 36);
		panel_AllWikis.add(textField_titrWiki2);
		
		JLabel label_14 = new JLabel("Texte Wiki");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(new Color(0, 51, 102));
		label_14.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label_14.setBackground(new Color(0, 51, 102));
		label_14.setBounds(487, 16, 327, 29);
		panel_AllWikis.add(label_14);
		
		JScrollPane scrollPane_wiki1 = new JScrollPane();
		scrollPane_wiki1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_wiki1.setBounds(487, 56, 327, 142);
		panel_AllWikis.add(scrollPane_wiki1);
		
		JTextArea textArea_WikiModif = new JTextArea();
		textArea_WikiModif.setLineWrap(true);
		textArea_WikiModif.setForeground(new Color(0, 51, 102));
		textArea_WikiModif.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_wiki1.setViewportView(textArea_WikiModif);
		
		JButton btnModifierLeWiki = new JButton("Redistribuer");
		btnModifierLeWiki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(wikiSelec == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez d'abord afficher le wiki que vous voulez redistribuer");
				}
				else
				{
					Wiki w = Factory.getWikiDao().find(wikiSelec);
					w.setTextWiki(textArea_textWiki.getText());
					Factory.getWikiDao().update(w);
					Factory.getRedistributionDao().insert(wikiSelec, Controleur.instructerCo.getId());
					
					JOptionPane.showMessageDialog(null, "Wiki redistribué");
				}
			}
		});
		btnModifierLeWiki.setForeground(Color.WHITE);
		btnModifierLeWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnModifierLeWiki.setBackground(new Color(51, 153, 204));
		btnModifierLeWiki.setBounds(497, 388, 306, 46);
		panel_AllWikis.add(btnModifierLeWiki);
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_11.setBounds(10, 56, 467, 331);
		panel_AllWikis.add(scrollPane_11);
		
		table_allWikis = new JTable();
		table_allWikis.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0", "Titre", "Domaine"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_allWikis.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_11.setViewportView(table_allWikis);
		
		JLabel photoW = new JLabel("Pas de photo !");
		photoW.setForeground(new Color(0, 51, 102));
		photoW.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		photoW.setHorizontalAlignment(SwingConstants.CENTER);
		photoW.setBounds(507, 209, 283, 126);
		panel_AllWikis.add(photoW);
		
		JButton button_2 = new JButton("<");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(Controleur.listeImageAfficherWiki.size()==0)
				{
					JOptionPane.showMessageDialog(null, "Pas de photos à affiher");
				}
				else if(parcoureur==0)
				{
					JOptionPane.showMessageDialog(null, "Il n'y a plus de photos à afficher");
				}
				else
				{
					parcoureur--;
					
					ImageIcon image = new ImageIcon(Controleur.listeImageAfficherWiki.get(parcoureur));
					java.awt.Image im = image.getImage();
					java.awt.Image myImg = im.getScaledInstance(photoW.getWidth(), photoW.getHeight(), java.awt.Image.SCALE_SMOOTH);
					ImageIcon img = new ImageIcon(myImg);
					photoW.setIcon(img);
				}
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		button_2.setBackground(new Color(51, 153, 204));
		button_2.setBounds(517, 346, 125, 31);
		panel_AllWikis.add(button_2);
		
		JButton button_3 = new JButton(">");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(Controleur.listeImageAfficherWiki.size()==0)
				{
					JOptionPane.showMessageDialog(null, "Pas de photos à affiher");
				}
				else if(parcoureur>=Controleur.listeImageAfficherWiki.size()-1)
				{
					JOptionPane.showMessageDialog(null, "Il n'y a plus de photos à afficher");
				}
				else
				{
					parcoureur++;
					
					ImageIcon image = new ImageIcon(Controleur.listeImageAfficherWiki.get(parcoureur));
					java.awt.Image im = image.getImage();
					java.awt.Image myImg = im.getScaledInstance(photoW.getWidth(), photoW.getHeight(), java.awt.Image.SCALE_SMOOTH);
					ImageIcon img = new ImageIcon(myImg);
					photoW.setIcon(img);
				}
				
				
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		button_3.setBackground(new Color(51, 153, 204));
		button_3.setBounds(662, 346, 129, 31);
		panel_AllWikis.add(button_3);
		
		JButton btnAfficher_2 = new JButton("Afficher");
		btnAfficher_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_allWikis.getSelectedRow();
				TableModel model = table_allWikis.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner un wiki");
				}
				else
				{
					int numW = (Integer)model.getValueAt(index, 0);
					wikiSelec = numW;
					Wiki w = Factory.getWikiDao().find(numW);
					textField_titrWiki2.setText(w.getNomWiki());
					textArea_WikiModif.setText(w.getTextWiki());
					
					Controleur.listeImageAfficherWiki = w.getImageAfficher();
					parcoureur = 0;
					
					ImageIcon image = new ImageIcon(Controleur.listeImageAfficherWiki.get(parcoureur));
					java.awt.Image im = image.getImage();
					java.awt.Image myImg = im.getScaledInstance(photoW.getWidth(), photoW.getHeight(), java.awt.Image.SCALE_SMOOTH);
					ImageIcon img = new ImageIcon(myImg);
					photoW.setIcon(img);
				}
			}
		});
		btnAfficher_2.setForeground(Color.WHITE);
		btnAfficher_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAfficher_2.setBackground(new Color(51, 153, 204));
		btnAfficher_2.setBounds(79, 398, 152, 36);
		panel_AllWikis.add(btnAfficher_2);
		
		JButton btnSupprimer_wiki = new JButton("Supprimer");
		btnSupprimer_wiki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_allWikis.getSelectedRow();
				TableModel model = table_allWikis.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner un forum");
				}
				else
				{
					int numW = (Integer)model.getValueAt(index, 0);
					Wiki w = Factory.getWikiDao().find(numW);
					
					if(!w.getCreateur().equals(Controleur.instructerCo.getId()))
					{
						JOptionPane.showMessageDialog(null, "Vous n'avez pas de droits sur ce Wiki");
					}
					else
					{
						Factory.getWikiDao().delete(w);
						JOptionPane.showMessageDialog(null, "Le wiki a été supprimé de la BD");
						((DefaultTableModel)table_allWikis.getModel()).removeRow(index);
					}
				}
			}
		});
		btnSupprimer_wiki.setForeground(Color.WHITE);
		btnSupprimer_wiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSupprimer_wiki.setBackground(new Color(51, 153, 204));
		btnSupprimer_wiki.setBounds(263, 398, 152, 36);
		panel_AllWikis.add(btnSupprimer_wiki);
		
		JButton btnAjouterWiki = new JButton("Ajouter Wiki");
		btnAjouterWiki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_ajouterWiki.setVisible(true);
				panel_AllWikis.setVisible(false);
				
			}
		});
		btnAjouterWiki.setBounds(162, 21, 176, 31);
		btnAjouterWiki.setForeground(Color.WHITE);
		btnAjouterWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAjouterWiki.setBackground(new Color(51, 153, 204));
		panel_wiki.add(btnAjouterWiki);
		
		JButton btnTousLesWikis = new JButton("Tous les Wikis");
		btnTousLesWikis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel)table_allWikis.getModel();
				model.setRowCount(0);
				
				for(Wiki w : Factory.getWikiDao().getAll())
				{
					model.addRow(new Object[] {w.getNumWiki(), w.getNomWiki(), w.getDomaineWiki()});
				}
				
				panel_ajouterWiki.setVisible(false);
				panel_AllWikis.setVisible(true);
			}
		});
		btnTousLesWikis.setBounds(468, 21, 176, 31);
		btnTousLesWikis.setForeground(Color.WHITE);
		btnTousLesWikis.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnTousLesWikis.setBackground(new Color(51, 153, 204));
		panel_wiki.add(btnTousLesWikis);

		
		JPanel panel_blogs = new JPanel();
		panel_blogs.setBackground(Color.WHITE);
		layeredPane_cours.add(panel_blogs, "name_99719566024600");
		panel_blogs.setLayout(null);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		layeredPane_3.setBounds(0, 53, 824, 466);
		panel_blogs.add(layeredPane_3);
		layeredPane_3.setLayout(new CardLayout(0, 0));
		
		JPanel panel_ajouterBlog = new JPanel();
		panel_ajouterBlog.setBackground(Color.WHITE);
		layeredPane_3.add(panel_ajouterBlog, "name_157640361671800");
		panel_ajouterBlog.setLayout(null);
		
		txtTitreBlog = new JTextField();
		txtTitreBlog.setText("Titre Blog");
		txtTitreBlog.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitreBlog.setForeground(new Color(0, 51, 102));
		txtTitreBlog.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		txtTitreBlog.setColumns(10);
		txtTitreBlog.setBounds(10, 11, 327, 36);
		panel_ajouterBlog.add(txtTitreBlog);
		
		JLabel lblTexteBlog = new JLabel("Texte Blog");
		lblTexteBlog.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexteBlog.setForeground(new Color(51, 153, 204));
		lblTexteBlog.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTexteBlog.setBackground(new Color(0, 51, 102));
		lblTexteBlog.setBounds(10, 58, 327, 29);
		panel_ajouterBlog.add(lblTexteBlog);
		
		JLabel lbl_ImageBlog = new JLabel("Ajoutez des images !");
		lbl_ImageBlog.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ImageBlog.setForeground(new Color(0, 51, 102));
		lbl_ImageBlog.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lbl_ImageBlog.setBackground(Color.LIGHT_GRAY);
		lbl_ImageBlog.setBounds(379, 11, 409, 313);
		panel_ajouterBlog.add(lbl_ImageBlog);
		
		JScrollPane scrollPane_15 = new JScrollPane();
		scrollPane_15.setBounds(10, 98, 327, 353);
		panel_ajouterBlog.add(scrollPane_15);
		
		JTextArea textArea_textBlog = new JTextArea();
		scrollPane_15.setViewportView(textArea_textBlog);
		
		JButton btnAjouterLeBlog = new JButton("Ajouter le Blog");
		btnAjouterLeBlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtTitreBlog.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez entrer le titre du Blog");
				}
				else if(textArea_textBlog.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez entrer le text du Blog");
				}
				else if(false) //verifier la date
				{
					JOptionPane.showMessageDialog(null, "Veuillez completer la date");
				}
				else
				{
					
					Date d0 = new Date(2018,05,12); //à enlever, ici en attendant l'interface
					
					int numB = Factory.getBlogDao().getMaxNum()+1;
					Blog b = new Blog(numB,txtTitreBlog.getText(), textArea_textBlog.getText(), d0, Controleur.instructerCo.getId());
					
					b.setPhotos(Controleur.listeImageBlog);
					
					
					txtTitreBlog.setText("");
					textArea_textBlog.setText("");
					//penser a effacer les texte des date une fois ajouté
					if(Factory.getBlogDao().insert(b, Controleur.instructerCo.getId()))
					{
						JOptionPane.showMessageDialog(null, "Blog ajoutée avec succès");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Problème lors de l'ajout du Blog");
					}
				}
			}
		});
		btnAjouterLeBlog.setForeground(Color.WHITE);
		btnAjouterLeBlog.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAjouterLeBlog.setBackground(new Color(51, 153, 204));
		btnAjouterLeBlog.setBounds(401, 405, 387, 46);
		panel_ajouterBlog.add(btnAjouterLeBlog);
		
		JButton button_1 = new JButton("Select Image");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("C:\\Users\\YACINE\\Desktop"));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGE","png","jpg","gif");
				fileChooser.addChoosableFileFilter(filter);
				int result = fileChooser.showSaveDialog(null);
				if(result == JFileChooser.APPROVE_OPTION)
				{
					File selectedfile = fileChooser.getSelectedFile();
					cheminImageBlog = selectedfile.getAbsolutePath();
					ImageIcon myImage = new ImageIcon(cheminImageBlog);
					java.awt.Image img = myImage.getImage();
					java.awt.Image NewImage = img.getScaledInstance(photoWiki.getWidth(), photoWiki.getHeight(), java.awt.Image.SCALE_SMOOTH); /* if error check this */
					ImageIcon finalImage = new ImageIcon(NewImage);
					lbl_ImageBlog.setIcon(finalImage);

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
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		button_1.setBackground(new Color(51, 153, 204));
		button_1.setBounds(494, 328, 196, 31);
		panel_ajouterBlog.add(button_1);
		
		JButton button_4 = new JButton("Ajouter");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(cheminImageBlog.equals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez choisir d'abord une image");
				}
				else
				{
					Controleur.listeImageBlog.add(cheminImageBlog);
					JOptionPane.showMessageDialog(null, "Image ajoutée");
				}
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		button_4.setBackground(new Color(51, 153, 204));
		button_4.setBounds(530, 370, 128, 29);
		panel_ajouterBlog.add(button_4);
		
		
		JPanel panel_allBlogs = new JPanel();
		panel_allBlogs.setBackground(Color.WHITE);
		layeredPane_3.add(panel_allBlogs, "name_157643503149700");
		panel_allBlogs.setLayout(null);
		
		txtTitreBlog_1 = new JTextField();
		txtTitreBlog_1.setText("Titre Blog");
		txtTitreBlog_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTitreBlog_1.setForeground(new Color(0, 51, 102));
		txtTitreBlog_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		txtTitreBlog_1.setEditable(false);
		txtTitreBlog_1.setColumns(10);
		txtTitreBlog_1.setBounds(10, 11, 467, 36);
		panel_allBlogs.add(txtTitreBlog_1);
		
		JLabel lblTexteBlog_1 = new JLabel("Texte Blog");
		lblTexteBlog_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexteBlog_1.setForeground(new Color(0, 51, 102));
		lblTexteBlog_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTexteBlog_1.setBackground(new Color(0, 51, 102));
		lblTexteBlog_1.setBounds(487, 13, 327, 29);
		panel_allBlogs.add(lblTexteBlog_1);
		
		JScrollPane scrollPane_16 = new JScrollPane();
		scrollPane_16.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_16.setBounds(487, 58, 327, 194);
		panel_allBlogs.add(scrollPane_16);
		
		JTextArea textArea_texteBlog2 = new JTextArea();
		scrollPane_16.setViewportView(textArea_texteBlog2);
		
		JScrollPane scrollPane_17 = new JScrollPane();
		scrollPane_17.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_17.setBounds(10, 58, 467, 346);
		panel_allBlogs.add(scrollPane_17);
		
		table_blogs = new JTable();
		table_blogs.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0", "Titre", "Date"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class
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
		table_blogs.setForeground(new Color(0, 0, 0));
		table_blogs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_17.setViewportView(table_blogs);
		
		JLabel label_imageBlog2 = new JLabel("Pas de photo !");
		label_imageBlog2.setHorizontalAlignment(SwingConstants.CENTER);
		label_imageBlog2.setForeground(new Color(0, 51, 102));
		label_imageBlog2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		label_imageBlog2.setBounds(507, 263, 283, 141);
		panel_allBlogs.add(label_imageBlog2);
		
		JButton button_5 = new JButton("<");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(Controleur.listeImageAfficherBlog.size()==0)
				{
					JOptionPane.showMessageDialog(null, "Pas de photos à affiher");
				}
				else if(parcoureurB==0)
				{
					JOptionPane.showMessageDialog(null, "Il n'y a plus de photos à afficher");
				}
				else
				{
					parcoureurB--;
					
					ImageIcon image = new ImageIcon(Controleur.listeImageAfficherBlog.get(parcoureurB));
					java.awt.Image im = image.getImage();
					java.awt.Image myImg = im.getScaledInstance(photoW.getWidth(), photoW.getHeight(), java.awt.Image.SCALE_SMOOTH);
					ImageIcon img = new ImageIcon(myImg);
					label_imageBlog2.setIcon(img);
				}
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		button_5.setBackground(new Color(51, 153, 204));
		button_5.setBounds(507, 415, 125, 31);
		panel_allBlogs.add(button_5);
		
		JButton button_6 = new JButton(">");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(Controleur.listeImageAfficherBlog.size()==0)
				{
					JOptionPane.showMessageDialog(null, "Pas de photos à affiher");
				}
				else if(parcoureurB>=Controleur.listeImageAfficherBlog.size()-1)
				{
					JOptionPane.showMessageDialog(null, "Il n'y a plus de photos à afficher");
				}
				else
				{
					parcoureurB++;
					
					ImageIcon image = new ImageIcon(Controleur.listeImageAfficherBlog.get(parcoureurB));
					java.awt.Image im = image.getImage();
					java.awt.Image myImg = im.getScaledInstance(photoW.getWidth(), photoW.getHeight(), java.awt.Image.SCALE_SMOOTH);
					ImageIcon img = new ImageIcon(myImg);
					label_imageBlog2.setIcon(img);
				}
			}
		});
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		button_6.setBackground(new Color(51, 153, 204));
		button_6.setBounds(661, 415, 129, 31);
		panel_allBlogs.add(button_6);
		
		JButton button_7 = new JButton("Afficher");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_blogs.getSelectedRow();
				TableModel model = table_blogs.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner un wiki");
				}
				else
				{
					int numB = (Integer)model.getValueAt(index, 0);
					Blog b = Factory.getBlogDao().find(numB);
					txtTitreBlog_1.setText(b.getNomBlog());
					textArea_texteBlog2.setText(b.getTextBlog());
					
					Controleur.listeImageAfficherBlog = b.getPhotosAfficher();
					parcoureurB = 0;
					
					ImageIcon image = new ImageIcon(Controleur.listeImageAfficherBlog.get(parcoureurB));
					java.awt.Image im = image.getImage();
					java.awt.Image myImg = im.getScaledInstance(photoW.getWidth(), photoW.getHeight(), java.awt.Image.SCALE_SMOOTH);
					ImageIcon img = new ImageIcon(myImg);
					label_imageBlog2.setIcon(img);
				}
			}
		});
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		button_7.setBackground(new Color(51, 153, 204));
		button_7.setBounds(79, 415, 152, 36);
		panel_allBlogs.add(button_7);
		
		JButton button_8 = new JButton("Supprimer");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int index = table_blogs.getSelectedRow();
				TableModel model = table_blogs.getModel();
				
				if(index == -1)
				{
					JOptionPane.showMessageDialog(null, "Veuillez selectionner un blog");
				}
				else
				{
					int numB = (Integer)model.getValueAt(index, 0);
					Blog b = Factory.getBlogDao().find(numB);
					
					if(!Controleur.instructerCo.getId().equals(b.getCreateur()))
					{
						JOptionPane.showMessageDialog(null, "Vous n'avez pas ce droit sur ce blog");
					}
					else
					{
						Factory.getBlogDao().delete(b);
						((DefaultTableModel)model).removeRow(index);
						
						textArea_texteBlog2.setText("");
						txtTitreBlog_1.setText("");
						JOptionPane.showMessageDialog(null, "Blog supprimé");
					}
				}
				
			}
		});
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		button_8.setBackground(new Color(51, 153, 204));
		button_8.setBounds(263, 415, 152, 36);
		panel_allBlogs.add(button_8);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(487, 59, 325, 140);
		panel_allBlogs.add(textArea);
		textArea.setForeground(new Color(0, 51, 102));
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		
		JButton btnAjouterUnBlog = new JButton("Ajouter un blog");
		btnAjouterUnBlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_ajouterBlog.setVisible(true);
				panel_allBlogs.setVisible(false);
			}
		});
		btnAjouterUnBlog.setForeground(Color.WHITE);
		btnAjouterUnBlog.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAjouterUnBlog.setBackground(new Color(51, 153, 204));
		btnAjouterUnBlog.setBounds(161, 11, 176, 31);
		panel_blogs.add(btnAjouterUnBlog);
		
		JButton btnToutLesBlogs = new JButton("Tout les blogs");
		btnToutLesBlogs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = (DefaultTableModel)table_blogs.getModel();
				model.setRowCount(0);
				
				for(Blog b : Factory.getBlogDao().getAll())
				{
					model.addRow(new Object[] {b.getNumBlog(), b.getNomBlog(), b.getDateBlog().toString()});
				}
				
				panel_ajouterBlog.setVisible(false);
				panel_allBlogs.setVisible(true);
			}
		});
		btnToutLesBlogs.setForeground(Color.WHITE);
		btnToutLesBlogs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnToutLesBlogs.setBackground(new Color(51, 153, 204));
		btnToutLesBlogs.setBounds(467, 11, 176, 31);
		panel_blogs.add(btnToutLesBlogs);
		
		JPanel panel_sondage = new JPanel();
		layeredPane_cours.add(panel_sondage, "name_158399934138600");
		
		JLabel lblFormation = new JLabel("Formation");
		lblFormation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_formation.setVisible(true);
				panel_forum.setVisible(false);
				panel_sondage.setVisible(false);
				panel_wiki.setVisible(false);
				panel_blogs.setVisible(false);
				
				
				
			}
		});
		lblFormation.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormation.setBounds(10, 6, 117, 49);
		panel_cours.add(lblFormation);
		
		JLabel lblForum = new JLabel("forum");
		lblForum.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\help_60px.png"));
		lblForum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				DefaultTableModel model = (DefaultTableModel) table_forum.getModel();
				model.setRowCount(0);
				
				for(Forum f : Factory.getForumDao().getAll())
				{
					model.addRow(new Object [] { f.getNumForum(), f.getNomForum(), f.isResolu() });
				}
			
				panel_formation.setVisible(false);
				panel_forum.setVisible(true);
				panel_sondage.setVisible(false);
				panel_wiki.setVisible(false);
				panel_blogs.setVisible(false);
			}
		});
		lblForum.setHorizontalAlignment(SwingConstants.CENTER);
		lblForum.setBounds(358, 0, 117, 69);
		panel_cours.add(lblForum);
		
		JLabel lblWiki = new JLabel("wiki");
		lblWiki.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				panel_formation.setVisible(false);
				panel_forum.setVisible(false);
				panel_sondage.setVisible(false);
				panel_wiki.setVisible(true);
				panel_blogs.setVisible(false);
			}
		});
		lblWiki.setHorizontalAlignment(SwingConstants.CENTER);
		lblWiki.setBounds(536, 6, 117, 49);
		panel_cours.add(lblWiki);
		
		JLabel lblBlogs = new JLabel("blogs");
		lblBlogs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_formation.setVisible(false);
				panel_forum.setVisible(false);
				panel_sondage.setVisible(false);
				panel_wiki.setVisible(false);
				panel_blogs.setVisible(true);
			}
		});
		lblBlogs.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlogs.setBounds(721, 6, 117, 49);
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
		
		texte_forum = new JTextField();
		texte_forum.setHorizontalAlignment(SwingConstants.CENTER);
		texte_forum.setForeground(new Color(0, 51, 102));
		texte_forum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		texte_forum.setColumns(10);
		texte_forum.setBounds(92, 75, 675, 38);
		panel_forum.add(texte_forum);
		
		
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
				"Num", "Titre", "Resolu"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_forum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_1.setViewportView(table_forum);
		
		
		JLabel add = new JLabel("");
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				if(titre_forum.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Titre Obligatoire");
				}
				else if(texte_forum.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez entrer le texte du problème");
				}
				else
				{
					Forum f = new Forum(Factory.getForumDao().getMaxNum()+1,
							titre_forum.getText(),
							texte_forum.getText(),
							false,
							Controleur.instructerCo.getId());
					
					Factory.getForumDao().insert(f, Controleur.instructerCo.getId());
					
					JOptionPane.showMessageDialog(null, "Forum ajouté avec succès");
					
					DefaultTableModel model = (DefaultTableModel) table_forum.getModel();
					
					model.addRow(new Object [] { f.getNumForum(), f.getNomForum(), f.isResolu() });
					
					titre_forum.setText("");
					texte_forum.setText("");
				}
			
			}
		});
		add.setBounds(777, 21, 41, 93);
		add.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\plus_2_math_40px.png"));
		add.setHorizontalAlignment(SwingConstants.CENTER);
		panel_forum.add(add);
		
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
													Controleur.instructerCo.getId());
					//ajouter a la base de données 
					Factory.getCommentaireDao().insert(c, numF);
					
					//ajouter le commentaire dans la zone des comms
					textArea_Commentaires.append("  "+Controleur.instructerCo.getId()+": \n");
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
		
		
		
		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(777, 73, 41, 41);
		panel_forum.add(label_8);
		
		
		
	
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(488, 124, 330, 38);
		panel_forum.add(scrollPane_3);
		
		JTextArea txtrTitreDuForum = new JTextArea();
		txtrTitreDuForum.setText("Titre du Forum");
		txtrTitreDuForum.setLineWrap(true);
		txtrTitreDuForum.setEditable(false);
		txtrTitreDuForum.setForeground(new Color(0, 51, 102));
		txtrTitreDuForum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		scrollPane_3.setViewportView(txtrTitreDuForum);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_4.setBounds(488, 167, 330, 93);
		panel_forum.add(scrollPane_4);
		
		JTextArea txtrProblmeDuForum = new JTextArea();
		txtrProblmeDuForum.setText("Probl\u00E8me du Forum");
		txtrProblmeDuForum.setLineWrap(true);
		txtrProblmeDuForum.setEditable(false);
		txtrProblmeDuForum.setForeground(new Color(0, 51, 102));
		txtrProblmeDuForum.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		scrollPane_4.setViewportView(txtrProblmeDuForum);
		
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
					txtrProblmeDuForum.setText("");
					textArea_Commentaires.setText("");
					txtrTitreDuForum.setText("");
					
					int numF = (Integer)model.getValueAt(index, 0);
					Forum f = Factory.getForumDao().find(numF);
					
					txtrTitreDuForum.setText(f.getNomForum());
					txtrProblmeDuForum.setText(f.getProblemeForum());
					
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
		btnAfficher.setBounds(199, 393, 105, 32);
		panel_forum.add(btnAfficher);
		
		JButton btnRsolu = new JButton("R\u00E9solu");
		btnRsolu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
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
					if(!f.getCreateur().equals(Controleur.instructerCo.getId()))
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
		btnRsolu.setBounds(45, 393, 105, 32);
		panel_forum.add(btnRsolu);
		
		JLabel lblCommentaires = new JLabel("Commentaires :");
		lblCommentaires.setHorizontalAlignment(SwingConstants.LEFT);
		lblCommentaires.setForeground(new Color(0, 51, 102));
		lblCommentaires.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblCommentaires.setBackground(new Color(0, 51, 102));
		lblCommentaires.setBounds(508, 259, 310, 24);
		panel_forum.add(lblCommentaires);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
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
					if(!f.getCreateur().equals(Controleur.instructerCo.getId()))
					{
						JOptionPane.showMessageDialog(null, "Ce forum ne vous appartient pas");
					}
					else
					{
						Factory.getForumDao().delete(f);
						((DefaultTableModel)table_forum.getModel()).removeRow(index);
						
						txtrTitreDuForum.setText("");
						txtrProblmeDuForum.setText("");
						textArea_Commentaires.setText("");
					}
				}
			}
		});
		btnSupprimer.setBounds(347, 402, 89, 23);
		panel_forum.add(btnSupprimer);
		
		JPanel panel_library = new JPanel();
		panel_library.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_library.setBackground(Color.WHITE);
		panel_library.setLayout(null);
		layeredPane_cours.add(panel_library, "name_155047291174800");
		
		JLabel lblSondage = new JLabel("Sondage");
		lblSondage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_formation.setVisible(false);
				panel_forum.setVisible(false);
				panel_sondage.setVisible(true);
				panel_wiki.setVisible(false);
				panel_blogs.setVisible(false);
			}
		});
		lblSondage.setHorizontalAlignment(SwingConstants.CENTER);
		lblSondage.setBounds(164, 6, 117, 49);
		panel_cours.add(lblSondage);
		
		panel_library.setVisible(true);
		 panel_formation.setVisible(false);
		panel_forum.setVisible(false);
		panel_blogs.setVisible(false);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\YACINE\\eclipse-workspace\\U-Learn\\Icons\\library_120px.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(531, 63, 209, 186);
		panel_library.add(lblNewLabel_2);
		
		JLabel label_11 = new JLabel("U");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(new Color(0, 51, 102));
		label_11.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 200));
		label_11.setBackground(new Color(0, 153, 0));
		label_11.setBounds(0, 73, 253, 176);
		panel_library.add(label_11);
		
		JLabel label_13 = new JLabel("Learn");
		label_13.setForeground(new Color(0, 51, 102));
		label_13.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 70));
		label_13.setBackground(new Color(0, 153, 0));
		label_13.setBounds(197, 89, 253, 108);
		panel_library.add(label_13);
		
		JLabel lblLibrary = new JLabel("Library");
		lblLibrary.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrary.setForeground(new Color(0, 51, 102));
		lblLibrary.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 170));
		lblLibrary.setBackground(new Color(0, 153, 0));
		lblLibrary.setBounds(0, 260, 828, 217);
		panel_library.add(lblLibrary);
		
		
		
	
		
		
		
		JPanel panel_parametres = new JPanel();
		panel_parametres.setBackground(new Color(51, 51, 0));
		layeredPane.add(panel_parametres, "name_530194131636700");
		panel_principal.setVisible(true);
		
		JLabel lblSs = new JLabel("");
		lblSs.setToolTipText("Menu");
		lblSs.setBounds(10, 23, 186, 81);
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
			
		});
		contentPane.add(lblSs);
		lblSs.setHorizontalAlignment(SwingConstants.CENTER);
		lblSs.setIcon(new ImageIcon("C:\\Users\\YACINE\\eclipse-workspace\\U-Learn\\Icons\\sorting_options_80px.png"));
		
	
		
	
		
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
		btn_chat.setToolTipText("chat");
		btn_chat.setBounds(10, 206, 186, 75);
		contentPane.add(btn_chat);
		btn_chat.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\chat_40px.png"));
		btn_chat.setHorizontalAlignment(SwingConstants.CENTER);
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
		
		JLabel btn_cours = new JLabel("");
		btn_cours.setToolTipText("cours");
		btn_cours.setBounds(10, 289, 186, 75);
		contentPane.add(btn_cours);
		btn_cours.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\library_40px.png"));
		btn_cours.setHorizontalAlignment(SwingConstants.CENTER);
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
		
		JLabel btn_setting = new JLabel("");
		btn_setting.setToolTipText("parametres");
		btn_setting.setBounds(10, 375, 186, 75);
		contentPane.add(btn_setting);
		btn_setting.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\settings_40px.png"));
		btn_setting.setHorizontalAlignment(SwingConstants.CENTER);
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
		
		JLabel btn_up = new JLabel("");
		btn_up.setBounds(10, 475, 186, 94);
		contentPane.add(btn_up);
		btn_up.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				panel_ul.setVisible(true);
			}
		});
		btn_up.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\up_3_80px.png"));
		btn_up.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
