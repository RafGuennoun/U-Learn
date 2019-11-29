import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
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

import code.classes.Commentaire;
import code.classes.Forum;
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
	private JTextField diff_formation;
	private JTable table_coursDeFormation;
	private JTextField titre_cours;
	private JTextField desc_cours;
	private JTextField prof_cours;
	private JTable table_formations;
	private JTable table_deatilsFormation;
	private JTable table_mesFormations;
	private JTable table_coursForm;
	private JTextField textField_titreWiki;
	private JTextField textField_titrWiki2;
	private JTable table_allWikis;

	private String cheminImageWiki;
	private int parcoureur = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcceuilTeacher frame = new AcceuilTeacher();
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
		
		diff_formation = new JTextField();
		diff_formation.setHorizontalAlignment(SwingConstants.CENTER);
		diff_formation.setForeground(new Color(0, 51, 102));
		diff_formation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		diff_formation.setColumns(10);
		diff_formation.setBounds(695, 92, 123, 28);
		panel_ajoutFormation.add(diff_formation);
		
		JLabel lblDifficult = new JLabel("Difficult\u00E9 :");
		lblDifficult.setHorizontalAlignment(SwingConstants.LEFT);
		lblDifficult.setForeground(new Color(0, 51, 102));
		lblDifficult.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblDifficult.setBackground(new Color(0, 51, 102));
		lblDifficult.setBounds(617, 94, 75, 22);
		panel_ajoutFormation.add(lblDifficult);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(357, 144, 461, 228);
		panel_ajoutFormation.add(scrollPane);
		
		table_coursDeFormation = new JTable();
		table_coursDeFormation.setBackground(Color.WHITE);
		table_coursDeFormation.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Titre", "Description", "Professeur"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class
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
		table_coursDeFormation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		scrollPane.setViewportView(table_coursDeFormation);
		
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
		desc_cours.setBounds(127, 186, 220, 62);
		panel_ajoutFormation.add(desc_cours);
		
		JLabel lblProfesseurMr = new JLabel("Professeur : ");
		lblProfesseurMr.setHorizontalAlignment(SwingConstants.LEFT);
		lblProfesseurMr.setForeground(new Color(0, 51, 102));
		lblProfesseurMr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblProfesseurMr.setBackground(new Color(0, 51, 102));
		lblProfesseurMr.setBounds(10, 259, 97, 31);
		panel_ajoutFormation.add(lblProfesseurMr);
		
		prof_cours = new JTextField();
		prof_cours.setHorizontalAlignment(SwingConstants.CENTER);
		prof_cours.setForeground(new Color(0, 51, 102));
		prof_cours.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		prof_cours.setColumns(10);
		prof_cours.setBounds(127, 259, 220, 31);
		panel_ajoutFormation.add(prof_cours);
		
		JButton btnAjouterLeCours = new JButton("Ajouter le cours");
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
						String path = selectedfile.getAbsolutePath();
						//System.out.println(path);
						//System.out.println(selectedfile.getName());
						Desktop.getDesktop().open(new java.io.File(path));
						
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
		
		JButton btnAjouterLaFormation = new JButton("Ajouter nouvelle formation");
		btnAjouterLaFormation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAjouterLaFormation.setForeground(Color.WHITE);
		btnAjouterLaFormation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnAjouterLaFormation.setBackground(new Color(51, 153, 204));
		btnAjouterLaFormation.setBounds(587, 400, 231, 41);
		panel_ajoutFormation.add(btnAjouterLaFormation);
		
		JLabel lblNiv = new JLabel("Niv :");
		lblNiv.setHorizontalAlignment(SwingConstants.LEFT);
		lblNiv.setForeground(new Color(0, 51, 102));
		lblNiv.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNiv.setBackground(new Color(0, 51, 102));
		lblNiv.setBounds(617, 60, 39, 22);
		panel_ajoutFormation.add(lblNiv);
		
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
		
		JButton btnAjouterAUne = new JButton("Ajouter a une formation");
		btnAjouterAUne.setForeground(Color.WHITE);
		btnAjouterAUne.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnAjouterAUne.setBackground(new Color(51, 153, 204));
		btnAjouterAUne.setBounds(357, 400, 220, 41);
		panel_ajoutFormation.add(btnAjouterAUne);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_7.setBounds(10, 383, 337, 70);
		panel_ajoutFormation.add(scrollPane_7);
		
		JTextArea txtrRemarqueDfqfdfsd = new JTextArea();
		txtrRemarqueDfqfdfsd.setText("Remarque : \r\nPour ajouter un cours a une formation deja existante il\r\nfaut juste ecrire le nom de la formation et remplir les\r\ncrit\u00E9res du cours et importer le cours puis cliquer\r\nsur \"Ajouter a une formation \" .\r\nSi c'est pour cr\u00E9er une nouvelle formation , il faut\r\nremplir tout les champs puis cliquer sur \r\n\"Ajouter nouvelle formation\" .");
		txtrRemarqueDfqfdfsd.setLineWrap(true);
		txtrRemarqueDfqfdfsd.setBackground(new  Color(51,135,204));
		txtrRemarqueDfqfdfsd.setForeground(Color.WHITE);
		txtrRemarqueDfqfdfsd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		scrollPane_7.setViewportView(txtrRemarqueDfqfdfsd);
		
		
		
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
				"N\u00B0 cours", "Cours de la formation"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_coursForm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_9.setViewportView(table_coursForm);
		
		JButton btnSupprimerFormation = new JButton("Supprimer formation");
		btnSupprimerFormation.setForeground(Color.WHITE);
		btnSupprimerFormation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnSupprimerFormation.setBackground(new Color(51, 153, 204));
		btnSupprimerFormation.setBounds(555, 415, 220, 41);
		panel_mesFormations.add(btnSupprimerFormation);
		
		JButton btnSupprimerCours = new JButton("Supprimer cours");
		btnSupprimerCours.setForeground(Color.WHITE);
		btnSupprimerCours.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnSupprimerCours.setBackground(new Color(51, 153, 204));
		btnSupprimerCours.setBounds(555, 363, 220, 41);
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
		
		JPanel panel_quiz_tests = new JPanel();
		panel_quiz_tests.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		layeredPane_2.add(panel_quiz_tests, "name_223824716719900");
		panel_quiz_tests.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 223, 299);
		panel_quiz_tests.add(scrollPane_2);
		
		table_formations = new JTable();
		scrollPane_2.setViewportView(table_formations);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(243, 11, 575, 299);
		panel_quiz_tests.add(scrollPane_6);
		
		table_deatilsFormation = new JTable();
		scrollPane_6.setViewportView(table_deatilsFormation);
		
		
		JButton btnAjouterFormation = new JButton("Ajouter formation ");
		btnAjouterFormation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_ajoutFormation.setVisible(true);
				panel_mesFormations.setVisible(false);
				panel_quiz_tests.setVisible(false);
				
			}
		});
		btnAjouterFormation.setForeground(Color.WHITE);
		btnAjouterFormation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAjouterFormation.setBackground(new Color(51, 153, 204));
		btnAjouterFormation.setBounds(10, 11, 226, 32);
		panel_formation.add(btnAjouterFormation);
		
		JButton btnMesFormation = new JButton("Mes formations ");
		btnMesFormation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_ajoutFormation.setVisible(false);
				panel_mesFormations.setVisible(true);
				panel_quiz_tests.setVisible(false);
			}
		});
		btnMesFormation.setForeground(Color.WHITE);
		btnMesFormation.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnMesFormation.setBackground(new Color(51, 153, 204));
		btnMesFormation.setBounds(301, 11, 226, 32);
		panel_formation.add(btnMesFormation);
		
		JButton btnTestsQuiz = new JButton("Tests / Quiz ");
		btnTestsQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_ajoutFormation.setVisible(false);
				panel_mesFormations.setVisible(false);
				panel_quiz_tests.setVisible(true);
			}
		});
		btnTestsQuiz.setForeground(Color.WHITE);
		btnTestsQuiz.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnTestsQuiz.setBackground(new Color(51, 153, 204));
		btnTestsQuiz.setBounds(592, 11, 226, 32);
		panel_formation.add(btnTestsQuiz);
		
	
		
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
		
		JLabel lblTitreWiki = new JLabel("Titre Wiki");
		lblTitreWiki.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitreWiki.setForeground(new Color(0, 51, 102));
		lblTitreWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblTitreWiki.setBackground(new Color(0, 51, 102));
		lblTitreWiki.setBounds(10, 11, 327, 29);
		panel_ajouterWiki.add(lblTitreWiki);
		
		textField_titreWiki = new JTextField();
		textField_titreWiki.setHorizontalAlignment(SwingConstants.CENTER);
		textField_titreWiki.setForeground(new Color(0, 51, 102));
		textField_titreWiki.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textField_titreWiki.setColumns(10);
		textField_titreWiki.setBounds(10, 51, 327, 36);
		panel_ajouterWiki.add(textField_titreWiki);
		
		JLabel lblTexteWiki = new JLabel("Texte Wiki");
		lblTexteWiki.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexteWiki.setForeground(new Color(0, 51, 102));
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
				
				if(textField_titreWiki.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Veuillez entrer un titre");
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
									  textField_titreWiki.getText(),
									  "domaine",
									  textArea_textWiki.getText(),
									  Controleur.instructerCo.getId());
					
					//passer la liste des images
					w.setImages(Controleur.listeImageWiki);
					
					//inserer dans la base de données
					Factory.getWikiDao().insert(w, Controleur.instructerCo.getId());
					
					//vider la liste statique des images
					Controleur.listeImageWiki = new ArrayList<String>();
					
					textArea_textWiki.setText("");
					textField_titreWiki.setText("");
					
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
		AjouterImageWiki.setBounds(530, 381, 89, 23);
		panel_ajouterWiki.add(AjouterImageWiki);
		
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
		photoW.setBounds(487, 209, 327, 105);
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
		button_2.setBounds(571, 335, 71, 31);
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
		button_3.setBounds(661, 335, 71, 31);
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
		btnAfficher_2.setBounds(52, 398, 152, 36);
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
		btnSupprimer_wiki.setBounds(290, 402, 89, 23);
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
		layeredPane_cours.add(panel_blogs, "name_99719566024600");
		
		JLabel lblFormation = new JLabel("Formation");
		lblFormation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_formation.setVisible(true);
				panel_forum.setVisible(false);
				
			}
		});
		lblFormation.setHorizontalAlignment(SwingConstants.CENTER);
		lblFormation.setBounds(10, 6, 117, 49);
		panel_cours.add(lblFormation);
		
		JLabel lblForum = new JLabel("");
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
			
				panel_forum.setVisible(true);
				panel_formation.setVisible(false);
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
				
				panel_wiki.setVisible(true);
				panel_forum.setVisible(false);
				panel_formation.setVisible(false);
				panel_blogs.setVisible(false);
			}
		});
		lblWiki.setHorizontalAlignment(SwingConstants.CENTER);
		lblWiki.setBounds(536, 6, 117, 49);
		panel_cours.add(lblWiki);
		
		JLabel lblBlogs = new JLabel("blogs");
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
		
		JLabel lblSondage = new JLabel("Sondage");
		lblSondage.setHorizontalAlignment(SwingConstants.CENTER);
		lblSondage.setBounds(164, 6, 117, 49);
		panel_cours.add(lblSondage);
		
		
		
		
		
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
		lblSs.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Icons\\sorting_options_80px.png"));
		
	
		
	
		
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
