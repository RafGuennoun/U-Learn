import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class AcceuilAdmin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_allAdmins;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	private JTextField textField_id;
	private JPasswordField passwordField;
	private JPasswordField passwordField_conf;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_mdp;
	private JPasswordField passwordField_cnfMdp;
	private JTable table_allUsers;
	private JTable table_inst;
	private JTable table_apprennants;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcceuilAdmin frame = new AcceuilAdmin();
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
	public AcceuilAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 40, 1080, 650);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(null);
		contentPane.setBackground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_ul = new JPanel();
		panel_ul.setBounds(10, 34, 186, 441);
		panel_ul.setBackground(new Color(255, 255, 255));
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
		layeredPane.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		layeredPane.setBounds(206, 99, 848, 501);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_Notif = new JPanel();
		panel_Notif.setBackground(Color.WHITE);
		layeredPane.add(panel_Notif, "name_575779676912100");
		panel_Notif.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 828, 432);
		panel_Notif.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00B0", "Date", "Notification"
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
		table.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JButton btnAfficher = new JButton("Afficher");
		btnAfficher.setForeground(Color.WHITE);
		btnAfficher.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAfficher.setBackground(new Color(51, 153, 204));
		btnAfficher.setBounds(315, 454, 226, 32);
		panel_Notif.add(btnAfficher);
		
		JPanel panel_Amins = new JPanel();
		panel_Amins.setBackground(Color.WHITE);
		layeredPane.add(panel_Amins, "name_575788930356400");
		panel_Amins.setLayout(null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		layeredPane_1.setBounds(0, 58, 844, 443);
		panel_Amins.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		JPanel panel_AddAdmin = new JPanel();
		panel_AddAdmin.setBackground(Color.WHITE);
		layeredPane_1.add(panel_AddAdmin, "name_576571447167500");
		panel_AddAdmin.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 43, 820, 70);
		panel_AddAdmin.add(panel);
		panel.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setBounds(37, 11, 117, 43);
		panel.add(lblNom);
		lblNom.setForeground(new Color(0, 51, 102));
		lblNom.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		
		JLabel lblPrenom = new JLabel("Prenom : ");
		lblPrenom.setBounds(426, 11, 133, 43);
		panel.add(lblPrenom);
		lblPrenom.setForeground(new Color(0, 51, 102));
		lblPrenom.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		
		textField_nom = new JTextField();
		textField_nom.setHorizontalAlignment(SwingConstants.CENTER);
		textField_nom.setBounds(151, 17, 216, 34);
		panel.add(textField_nom);
		textField_nom.setForeground(new Color(0, 51, 102));
		textField_nom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		textField_nom.setColumns(10);
		
		textField_prenom = new JTextField();
		textField_prenom.setHorizontalAlignment(SwingConstants.CENTER);
		textField_prenom.setBounds(569, 17, 216, 34);
		panel.add(textField_prenom);
		textField_prenom.setForeground(new Color(0, 51, 102));
		textField_prenom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		textField_prenom.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(123, 124, 587, 131);
		panel_AddAdmin.add(panel_1);
		
		JLabel lblId = new JLabel("ID  :");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setBounds(10, 11, 165, 43);
		panel_1.add(lblId);
		lblId.setForeground(new Color(0, 51, 102));
		lblId.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		
		textField_id = new JTextField();
		textField_id.setHorizontalAlignment(SwingConstants.CENTER);
		textField_id.setBounds(209, 17, 346, 34);
		panel_1.add(textField_id);
		textField_id.setForeground(new Color(0, 51, 102));
		textField_id.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		textField_id.setColumns(10);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotDePasse.setForeground(new Color(0, 51, 102));
		lblMotDePasse.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblMotDePasse.setBounds(10, 75, 182, 43);
		panel_1.add(lblMotDePasse);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setForeground(new Color(0, 51, 102));
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		passwordField.setEchoChar('*');
		passwordField.setBounds(209, 81, 346, 34);
		panel_1.add(passwordField);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setForeground(Color.WHITE);
		btnAjouter.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnAjouter.setBackground(new Color(51, 153, 204));
		btnAjouter.setBounds(297, 361, 255, 43);
		panel_AddAdmin.add(btnAjouter);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(123, 266, 587, 70);
		panel_AddAdmin.add(panel_2);
		
		JLabel lblConfirmation = new JLabel("Confirmation :");
		lblConfirmation.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmation.setForeground(new Color(0, 51, 102));
		lblConfirmation.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblConfirmation.setBounds(10, 11, 192, 43);
		panel_2.add(lblConfirmation);
		
		passwordField_conf = new JPasswordField();
		passwordField_conf.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_conf.setForeground(new Color(0, 51, 102));
		passwordField_conf.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		passwordField_conf.setEchoChar('*');
		passwordField_conf.setBounds(212, 17, 342, 34);
		panel_2.add(passwordField_conf);
		
		JPanel panel_DeleteAccount = new JPanel();
		panel_DeleteAccount.setBackground(Color.WHITE);
		layeredPane_1.add(panel_DeleteAccount, "name_576600482009200");
		panel_DeleteAccount.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 138, 820, 131);
		panel_DeleteAccount.add(panel_4);
		
		JLabel label_3 = new JLabel("Mot de passe :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(0, 51, 102));
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		label_3.setBounds(10, 5, 346, 43);
		panel_4.add(label_3);
		
		passwordField_mdp = new JPasswordField();
		passwordField_mdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_mdp.setForeground(new Color(0, 51, 102));
		passwordField_mdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		passwordField_mdp.setEchoChar('*');
		passwordField_mdp.setBounds(366, 11, 444, 34);
		panel_4.add(passwordField_mdp);
		
		JLabel lblConfirmerMotDe = new JLabel("Confirmer mot de passe :");
		lblConfirmerMotDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmerMotDe.setForeground(new Color(0, 51, 102));
		lblConfirmerMotDe.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		lblConfirmerMotDe.setBounds(10, 77, 346, 43);
		panel_4.add(lblConfirmerMotDe);
		
		passwordField_cnfMdp = new JPasswordField();
		passwordField_cnfMdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_cnfMdp.setForeground(new Color(0, 51, 102));
		passwordField_cnfMdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		passwordField_cnfMdp.setEchoChar('*');
		passwordField_cnfMdp.setBounds(366, 83, 444, 34);
		panel_4.add(passwordField_cnfMdp);
		
		JLabel lblSupprimerMonCompte = new JLabel("Supprimer mon compte");
		lblSupprimerMonCompte.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupprimerMonCompte.setForeground(new Color(0, 51, 102));
		lblSupprimerMonCompte.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblSupprimerMonCompte.setBounds(10, 27, 820, 43);
		panel_DeleteAccount.add(lblSupprimerMonCompte);
		
		JButton btnSupprimer_1 = new JButton("Supprimer");
		btnSupprimer_1.setForeground(Color.WHITE);
		btnSupprimer_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		btnSupprimer_1.setBackground(new Color(51, 153, 204));
		btnSupprimer_1.setBounds(308, 362, 231, 50);
		panel_DeleteAccount.add(btnSupprimer_1);
		
		JPanel panel_AllAdmins = new JPanel();
		panel_AllAdmins.setBackground(Color.WHITE);
		panel_AllAdmins.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		layeredPane_1.add(panel_AllAdmins, "name_576853400331600");
		panel_AllAdmins.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(10, 11, 820, 336);
		panel_AllAdmins.add(scrollPane_1);
		
		table_allAdmins = new JTable();
		table_allAdmins.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nom", "Prenom", "Privilege"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class
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
		table_allAdmins.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_1.setViewportView(table_allAdmins);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 358, 587, 70);
		panel_AllAdmins.add(panel_3);
		
		JLabel label_1 = new JLabel("Confirmation :");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(0, 51, 102));
		label_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
		label_1.setBounds(10, 11, 192, 43);
		panel_3.add(label_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_1.setForeground(new Color(0, 51, 102));
		passwordField_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		passwordField_1.setEchoChar('*');
		passwordField_1.setBounds(212, 17, 342, 34);
		panel_3.add(passwordField_1);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnSupprimer.setBackground(new Color(51, 153, 204));
		btnSupprimer.setBounds(627, 371, 177, 45);
		panel_AllAdmins.add(btnSupprimer);
		
		JButton btnAjouterAdmin = new JButton("Ajouter admin");
		btnAjouterAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_AddAdmin.setVisible(true);
				panel_DeleteAccount.setVisible(false);
				panel_AllAdmins.setVisible(false);
			}
		});
		btnAjouterAdmin.setForeground(Color.WHITE);
		btnAjouterAdmin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnAjouterAdmin.setBackground(new Color(51, 153, 204));
		btnAjouterAdmin.setBounds(309, 11, 231, 32);
		panel_Amins.add(btnAjouterAdmin);
		
		JButton btnSupprimerMonCompte = new JButton("Supprimer compte");
		btnSupprimerMonCompte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_AddAdmin.setVisible(false);
				panel_DeleteAccount.setVisible(true);
				panel_AllAdmins.setVisible(false);
			}
		});
		btnSupprimerMonCompte.setForeground(Color.WHITE);
		btnSupprimerMonCompte.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSupprimerMonCompte.setBackground(new Color(51, 153, 204));
		btnSupprimerMonCompte.setBounds(595, 11, 231, 32);
		panel_Amins.add(btnSupprimerMonCompte);
		
		JButton btnTousLesAdmins = new JButton("Tous les admins");
		btnTousLesAdmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_AllAdmins.setVisible(true);
				panel_AddAdmin.setVisible(false);
				panel_DeleteAccount.setVisible(false);
			}
		});
		btnTousLesAdmins.setForeground(Color.WHITE);
		btnTousLesAdmins.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnTousLesAdmins.setBackground(new Color(51, 153, 204));
		btnTousLesAdmins.setBounds(20, 11, 231, 32);
		panel_Amins.add(btnTousLesAdmins);
		
		JPanel panel_Chat = new JPanel();
		layeredPane.add(panel_Chat, "name_575799556318900");
		
		JPanel panel_Users = new JPanel();
		panel_Users.setBackground(Color.WHITE);
		layeredPane.add(panel_Users, "name_575808702809700");
		panel_Users.setLayout(null);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(0, 54, 844, 443);
		panel_Users.add(layeredPane_2);
		layeredPane_2.setLayout(new CardLayout(0, 0));
		
		JPanel panel_All_Ens_Etd = new JPanel();
		panel_All_Ens_Etd.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_All_Ens_Etd.setBackground(Color.WHITE);
		layeredPane_2.add(panel_All_Ens_Etd, "name_577066313230000");
		panel_All_Ens_Etd.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_2.setBounds(10, 11, 824, 375);
		panel_All_Ens_Etd.add(scrollPane_2);
		
		table_allUsers = new JTable();
		table_allUsers.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nom", "Prenom"
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
		table_allUsers.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		scrollPane_2.setViewportView(table_allUsers);
		
		JButton btnContacter = new JButton("Contacter");
		btnContacter.setForeground(Color.WHITE);
		btnContacter.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnContacter.setBackground(new Color(51, 153, 204));
		btnContacter.setBounds(174, 397, 185, 32);
		panel_All_Ens_Etd.add(btnContacter);
		
		JButton btnSupprimer_2 = new JButton("Supprimer");
		btnSupprimer_2.setForeground(Color.WHITE);
		btnSupprimer_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnSupprimer_2.setBackground(new Color(51, 153, 204));
		btnSupprimer_2.setBounds(496, 397, 185, 32);
		panel_All_Ens_Etd.add(btnSupprimer_2);
		
		JPanel panel_Instructeurs = new JPanel();
		panel_Instructeurs.setBackground(Color.WHITE);
		layeredPane_2.add(panel_Instructeurs, "name_577103923495600");
		panel_Instructeurs.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_3.setBounds(10, 11, 824, 375);
		panel_Instructeurs.add(scrollPane_3);
		
		table_inst = new JTable();
		table_inst.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nom", "Prenom"
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
		table_inst.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		scrollPane_3.setViewportView(table_inst);
		
		JButton button = new JButton("Contacter");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		button.setBackground(new Color(51, 153, 204));
		button.setBounds(166, 397, 185, 32);
		panel_Instructeurs.add(button);
		
		JButton button_1 = new JButton("Supprimer");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		button_1.setBackground(new Color(51, 153, 204));
		button_1.setBounds(487, 397, 185, 32);
		panel_Instructeurs.add(button_1);
		
		JPanel panel_Apprenants = new JPanel();
		panel_Apprenants.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_Apprenants.setBackground(Color.WHITE);
		layeredPane_2.add(panel_Apprenants, "name_577117650448000");
		panel_Apprenants.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_4.setBounds(10, 11, 824, 375);
		panel_Apprenants.add(scrollPane_4);
		
		table_apprennants = new JTable();
		table_apprennants.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nom", "Prenom"
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
		table_apprennants.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		scrollPane_4.setViewportView(table_apprennants);
		
		JButton button_2 = new JButton("Contacter");
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		button_2.setBackground(new Color(51, 153, 204));
		button_2.setBounds(164, 397, 185, 32);
		panel_Apprenants.add(button_2);
		
		JButton button_3 = new JButton("Supprimer");
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		button_3.setBackground(new Color(51, 153, 204));
		button_3.setBounds(488, 397, 185, 32);
		panel_Apprenants.add(button_3);
		
		JButton btnInstructeurs = new JButton("Instructeurs");
		btnInstructeurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_All_Ens_Etd.setVisible(false);
				panel_Instructeurs.setVisible(true);
				panel_Apprenants.setVisible(false);
			}
		});
		btnInstructeurs.setForeground(Color.WHITE);
		btnInstructeurs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnInstructeurs.setBackground(new Color(51, 153, 204));
		btnInstructeurs.setBounds(328, 11, 185, 32);
		panel_Users.add(btnInstructeurs);
		
		JButton btnApprenants = new JButton("Apprenants");
		btnApprenants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_All_Ens_Etd.setVisible(false);
				panel_Instructeurs.setVisible(false);
				panel_Apprenants.setVisible(true);
			}
		});
		btnApprenants.setForeground(Color.WHITE);
		btnApprenants.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnApprenants.setBackground(new Color(51, 153, 204));
		btnApprenants.setBounds(616, 11, 185, 32);
		panel_Users.add(btnApprenants);
		
		JButton btnTousLesUtilisateurs = new JButton("Tous les utilisateurs");
		btnTousLesUtilisateurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_All_Ens_Etd.setVisible(true);
				panel_Instructeurs.setVisible(false);
				panel_Apprenants.setVisible(false);
			}
		});
		btnTousLesUtilisateurs.setForeground(Color.WHITE);
		btnTousLesUtilisateurs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnTousLesUtilisateurs.setBackground(new Color(51, 153, 204));
		btnTousLesUtilisateurs.setBounds(45, 11, 185, 32);
		panel_Users.add(btnTousLesUtilisateurs);
		
		JLabel lblNotif = new JLabel("");
		lblNotif.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Nouveau dossier (2)\\appointment_reminders_80px.png"));
		lblNotif.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_Notif.setVisible(true);
				panel_Amins.setVisible(false);
				panel_Chat.setVisible(false);
				panel_Users.setVisible(false);
			}
		});
		lblNotif.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotif.setBounds(218, 11, 151, 78);
		contentPane.add(lblNotif);
		
		JLabel lblAdmin = new JLabel("");
		lblAdmin.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Nouveau dossier (2)\\administrator_80px.png"));
		lblAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_Notif.setVisible(false);
				panel_Amins.setVisible(true);
				panel_Chat.setVisible(false);
				panel_Users.setVisible(false);
			}
		});
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setBounds(462, 10, 151, 78);
		contentPane.add(lblAdmin);
		
		JLabel lblDeco = new JLabel("");
		lblDeco.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Nouveau dossier (2)\\exit_80px.png"));
		lblDeco.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeco.setBounds(28, 504, 151, 78);
		contentPane.add(lblDeco);
		
		JLabel lblChat = new JLabel("");
		lblChat.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Nouveau dossier (2)\\chat_80px.png"));
		lblChat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_Notif.setVisible(false);
				panel_Amins.setVisible(false);
				panel_Chat.setVisible(true);
				panel_Users.setVisible(false);
			}
		});
		lblChat.setHorizontalAlignment(SwingConstants.CENTER);
		lblChat.setBounds(879, 11, 151, 78);
		contentPane.add(lblChat);
		
		JLabel lblUtlisateurs = new JLabel("");
		lblUtlisateurs.setIcon(new ImageIcon("C:\\Users\\YACINE\\Desktop\\Nouveau dossier (2)\\groups_80px.png"));
		lblUtlisateurs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel_Notif.setVisible(false);
				panel_Amins.setVisible(false);
				panel_Chat.setVisible(false);
				panel_Users.setVisible(true);
			}
		});
		lblUtlisateurs.setHorizontalAlignment(SwingConstants.CENTER);
		lblUtlisateurs.setBounds(684, 10, 151, 78);
		contentPane.add(lblUtlisateurs);
	}
}
