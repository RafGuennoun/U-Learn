import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;

import code.classes.*;

public class LoginStudentFr extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginStudentFr frame = new LoginStudentFr();
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
	public LoginStudentFr() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 830, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(350, 25, 464, 370);
		contentPane.add(layeredPane);
		
		JPanel panelStudent = new JPanel();
		panelStudent.setBackground(new Color(0, 51, 102));
		panelStudent.setBounds(0, 0, 464, 370);
		layeredPane.add(panelStudent);
		panelStudent.setLayout(null);
		
		JLabel lblHelloStudent = new JLabel("Bonjour");
		lblHelloStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloStudent.setForeground(Color.WHITE);
		lblHelloStudent.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblHelloStudent.setBounds(10, 11, 423, 65);
		panelStudent.add(lblHelloStudent);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblUsername.setBackground(new Color(0, 51, 102));
		lblUsername.setBounds(10, 109, 144, 38);
		panelStudent.add(lblUsername);
	
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblPassword.setBackground(new Color(0, 51, 102));
		lblPassword.setBounds(10, 158, 144, 38);
		panelStudent.add(lblPassword);
		
	
		
		JButton btnNewButton = new JButton("Se connecter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AcceuilStudent p = new  AcceuilStudent();
				//p.setVisible(true);
				
				
				
				
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setBackground(new Color(0, 51, 102));
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton .setBackground(new Color(51, 153, 255));
				btnNewButton.setForeground(Color.WHITE);
			}
		});
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setForeground(Color.white);
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnNewButton.setBounds(101, 218, 291, 38);
		panelStudent.add(btnNewButton);
		
		JLabel lblForgotPasswrd = new JLabel("Mot de passe oubli\u00E9  ?");
		lblForgotPasswrd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblForgotPasswrd.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblForgotPasswrd.setForeground(Color.WHITE);
			}
		});
		lblForgotPasswrd.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPasswrd.setForeground(Color.WHITE);
		lblForgotPasswrd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblForgotPasswrd.setBackground(new Color(0, 51, 102));
		lblForgotPasswrd.setBounds(101, 258, 291, 16);
		panelStudent.add(lblForgotPasswrd);
		
		JButton btnSignIn = new JButton("S'inscrire");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnSignIn.setBackground(new Color(0, 51, 102));
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnSignIn.setBackground(new Color(51, 153, 255));
			}
		});
		btnSignIn.setForeground(Color.WHITE);
		btnSignIn.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnSignIn.setBackground(new Color(0, 51, 102));
		btnSignIn.setBounds(101, 296, 291, 38);
		panelStudent.add(btnSignIn);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(0, 51, 102));
		textField.setFont(new Font("Sitka Text", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(148, 109, 272, 38);
		panelStudent.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setForeground(new Color(0, 51, 102));
		passwordField.setFont(new Font("Sitka Text", Font.BOLD, 20));
		passwordField.setEchoChar('*');
		passwordField.setBounds(148, 158, 272, 38);
		panelStudent.add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(10, 25, 330, 141);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel welcome = new JLabel("Bienvenue \u00E0");
		welcome.setBounds(0, 11, 330, 65);
		panel.add(welcome);
		welcome.setForeground(new Color(255, 255, 255));
		welcome.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		welcome.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblUlearn = new JLabel("U-Learn");
		lblUlearn.setBounds(0, 65, 330, 65);
		panel.add(lblUlearn);
		lblUlearn.setHorizontalAlignment(SwingConstants.CENTER);
		lblUlearn.setForeground(Color.WHITE);
		lblUlearn.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 102));
		panel_1.setBounds(10, 263, 330, 132);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLearn = new JLabel("- Apprenez avec nous -");
		lblLearn.setBounds(10, 11, 310, 29);
		panel_1.add(lblLearn);
		lblLearn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLearn.setForeground(Color.WHITE);
		lblLearn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		
		JLabel lblShareYour = new JLabel("- Partagez vos oppinionts  -");
		lblShareYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblShareYour.setForeground(Color.WHITE);
		lblShareYour.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		lblShareYour.setBounds(10, 92, 310, 29);
		panel_1.add(lblShareYour);
		
		JLabel lblMakeYour = new JLabel("- Cr\u00E9ez vos blogs -");
		lblMakeYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblMakeYour.setForeground(Color.WHITE);
		lblMakeYour.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		lblMakeYour.setBounds(10, 51, 310, 29);
		panel_1.add(lblMakeYour);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 177, 330, 75);
		contentPane.add(panel_2);
		
		JLabel lblUniversityLearningApplication = new JLabel("Application d'apprentissage\r\n");
		lblUniversityLearningApplication.setBackground(new Color(0, 153, 0));
		lblUniversityLearningApplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblUniversityLearningApplication.setForeground(new Color(0, 51, 102));
		lblUniversityLearningApplication.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblUniversityLearningApplication.setBounds(0, 0, 330, 38);
		panel_2.add(lblUniversityLearningApplication);
		
		JLabel lblPourEtudiantsEt = new JLabel("pour etudiants et enseignants");
		lblPourEtudiantsEt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPourEtudiantsEt.setForeground(new Color(0, 51, 102));
		lblPourEtudiantsEt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblPourEtudiantsEt.setBounds(0, 37, 330, 27);
		panel_2.add(lblPourEtudiantsEt);
		
		JButton btnRetour = new JButton("Retour");
		btnRetour.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnRetour.setBackground(Color.RED);
				btnRetour.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnRetour.setForeground(Color.WHITE);
				btnRetour.setBackground(new Color(0, 51, 102));
			}
		});
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				WelcomeHome p = new WelcomeHome();
				p.setVisible(true);
			}
		});
		btnRetour.setForeground(Color.WHITE);
		btnRetour.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		btnRetour.setBackground(new Color(0, 51, 102));
		btnRetour.setBounds(350, 400, 160, 31);
		contentPane.add(btnRetour);
	}

}
