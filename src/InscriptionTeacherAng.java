import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InscriptionTeacherAng extends JFrame {

	private JPanel contentPane;
	private JTextField textField_firstName;
	private JTextField textField_lastName;
	private JTextField textField_universite;
	private JTextField textField_domain;
	private JTextField textField_grade;
	private JTextField textField_email;
	private JTextField textField_confEmail;
	private JPasswordField passwordField_mdp;
	private JPasswordField passwordField_confMdp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InscriptionTeacherAng frame = new InscriptionTeacherAng();
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
	public InscriptionTeacherAng() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 830, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(10, 11, 804, 68);
		contentPane.add(panel);
		
		JLabel lblBienvenueUlearn = new JLabel("Welcome to U-Learn");
		lblBienvenueUlearn.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenueUlearn.setForeground(Color.WHITE);
		lblBienvenueUlearn.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblBienvenueUlearn.setBounds(0, 11, 794, 47);
		panel.add(lblBienvenueUlearn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 91, 355, 117);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNom = new JLabel("First name :");
		lblNom.setBounds(10, 11, 105, 30);
		panel_1.add(lblNom);
		lblNom.setForeground(new Color(0, 51, 102));
		lblNom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNom.setBackground(new Color(0, 51, 102));
		
		JLabel lblPrenom = new JLabel("Last name :");
		lblPrenom.setBounds(10, 41, 105, 30);
		panel_1.add(lblPrenom);
		lblPrenom.setForeground(new Color(0, 51, 102));
		lblPrenom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblPrenom.setBackground(new Color(0, 51, 102));
		
		JLabel lblDateDeNaissance = new JLabel("Date of birth :");
		lblDateDeNaissance.setBounds(10, 78, 131, 28);
		panel_1.add(lblDateDeNaissance);
		lblDateDeNaissance.setForeground(new Color(0, 51, 102));
		lblDateDeNaissance.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblDateDeNaissance.setBackground(new Color(0, 51, 102));
		
		textField_firstName = new JTextField();
		textField_firstName.setHorizontalAlignment(SwingConstants.CENTER);
		textField_firstName.setForeground(new Color(0, 51, 102));
		textField_firstName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_firstName.setColumns(10);
		textField_firstName.setBounds(120, 13, 225, 28);
		panel_1.add(textField_firstName);
		
		textField_lastName = new JTextField();
		textField_lastName.setHorizontalAlignment(SwingConstants.CENTER);
		textField_lastName.setForeground(new Color(0, 51, 102));
		textField_lastName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_lastName.setColumns(10);
		textField_lastName.setBounds(120, 43, 225, 28);
		panel_1.add(textField_lastName);
		
		
	
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 221, 662, 151);
		contentPane.add(panel_2);
		
		JLabel lblAdresseEmail_1 = new JLabel("Email adresse :");
		lblAdresseEmail_1.setForeground(new Color(0, 51, 102));
		lblAdresseEmail_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblAdresseEmail_1.setBackground(new Color(0, 51, 102));
		lblAdresseEmail_1.setBounds(10, 11, 150, 30);
		panel_2.add(lblAdresseEmail_1);
		
		JLabel lblMotDePasse = new JLabel("Email adresse confirmation :");
		lblMotDePasse.setForeground(new Color(0, 51, 102));
		lblMotDePasse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblMotDePasse.setBackground(new Color(0, 51, 102));
		lblMotDePasse.setBounds(10, 44, 260, 30);
		panel_2.add(lblMotDePasse);
		
		JLabel lblConfirmezMotDe = new JLabel("Password :");
		lblConfirmezMotDe.setForeground(new Color(0, 51, 102));
		lblConfirmezMotDe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblConfirmezMotDe.setBackground(new Color(0, 51, 102));
		lblConfirmezMotDe.setBounds(10, 76, 140, 30);
		panel_2.add(lblConfirmezMotDe);
		
		JLabel lblConfirmezMotDe_1 = new JLabel("Password confirmation :");
		lblConfirmezMotDe_1.setForeground(new Color(0, 51, 102));
		lblConfirmezMotDe_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblConfirmezMotDe_1.setBackground(new Color(0, 51, 102));
		lblConfirmezMotDe_1.setBounds(10, 108, 234, 30);
		panel_2.add(lblConfirmezMotDe_1);
		
		textField_email = new JTextField();
		textField_email.setHorizontalAlignment(SwingConstants.CENTER);
		textField_email.setForeground(new Color(0, 51, 102));
		textField_email.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_email.setColumns(10);
		textField_email.setBounds(273, 13, 379, 28);
		panel_2.add(textField_email);
		
		textField_confEmail = new JTextField();
		textField_confEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textField_confEmail.setForeground(new Color(0, 51, 102));
		textField_confEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_confEmail.setColumns(10);
		textField_confEmail.setBounds(273, 46, 379, 28);
		panel_2.add(textField_confEmail);
		
		passwordField_mdp = new JPasswordField();
		passwordField_mdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_mdp.setForeground(new Color(0, 51, 102));
		passwordField_mdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		passwordField_mdp.setEchoChar('*');
		passwordField_mdp.setBounds(273, 78, 379, 28);
		panel_2.add(passwordField_mdp);
		
		passwordField_confMdp = new JPasswordField();
		passwordField_confMdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_confMdp.setForeground(new Color(0, 51, 102));
		passwordField_confMdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		passwordField_confMdp.setEchoChar('*');
		passwordField_confMdp.setBounds(273, 110, 379, 28);
		panel_2.add(passwordField_confMdp);
		
	
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(375, 90, 439, 117);
		contentPane.add(panel_3);
		
		JLabel lblUniversit = new JLabel("University :");
		lblUniversit.setForeground(new Color(0, 51, 102));
		lblUniversit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblUniversit.setBackground(new Color(0, 51, 102));
		lblUniversit.setBounds(10, 11, 107, 30);
		panel_3.add(lblUniversit);
		
		JLabel lblNiveau = new JLabel("Grade :");
		lblNiveau.setForeground(new Color(0, 51, 102));
		lblNiveau.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNiveau.setBackground(new Color(0, 51, 102));
		lblNiveau.setBounds(10, 76, 91, 30);
		panel_3.add(lblNiveau);
		
		JLabel lblSpecialit = new JLabel("Domain :");
		lblSpecialit.setForeground(new Color(0, 51, 102));
		lblSpecialit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblSpecialit.setBackground(new Color(0, 51, 102));
		lblSpecialit.setBounds(10, 41, 107, 30);
		panel_3.add(lblSpecialit);
		
		textField_universite = new JTextField();
		textField_universite.setHorizontalAlignment(SwingConstants.CENTER);
		textField_universite.setForeground(new Color(0, 51, 102));
		textField_universite.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_universite.setColumns(10);
		textField_universite.setBounds(127, 13, 302, 28);
		panel_3.add(textField_universite);
		
		textField_domain = new JTextField();
		textField_domain.setHorizontalAlignment(SwingConstants.CENTER);
		textField_domain.setForeground(new Color(0, 51, 102));
		textField_domain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_domain.setColumns(10);
		textField_domain.setBounds(127, 43, 302, 28);
		panel_3.add(textField_domain);
		
		textField_grade = new JTextField();
		textField_grade.setHorizontalAlignment(SwingConstants.CENTER);
		textField_grade.setForeground(new Color(0, 51, 102));
		textField_grade.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_grade.setColumns(10);
		textField_grade.setBounds(127, 78, 302, 28);
		panel_3.add(textField_grade);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(682, 236, 132, 117);
		contentPane.add(panel_4);
		
		JButton btnSinscrire = new JButton("Sign in");
		btnSinscrire.setForeground(Color.WHITE);
		btnSinscrire.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnSinscrire.setBackground(new Color(0, 51, 102));
		btnSinscrire.setBounds(256, 383, 291, 38);
		contentPane.add(btnSinscrire);
		
		JButton btnX = new JButton("Back");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				LoginTeacherFr p = new LoginTeacherFr();
				p.setVisible(true);
			}
		});
		btnX.setForeground(Color.WHITE);
		btnX.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnX.setBackground(Color.RED);
		btnX.setBounds(706, 383, 87, 38);
		contentPane.add(btnX);
	}

}
