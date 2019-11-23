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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import code.classes.Apprenant;
import code.classes.Blog;
import code.classes.Date;
import code.classes.ExisteException;
import code.classes.MdpException;
import code.dao.BlogDao;
import code.dao.Connexion;
import code.dao.Factory;

public class LoginStudent extends JFrame {

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
					LoginStudent frame = new LoginStudent();
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
	public LoginStudent() {
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
		panelStudent.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panelStudent.setBackground(Color.WHITE);
		panelStudent.setBounds(0, 0, 464, 370);
		layeredPane.add(panelStudent);
		panelStudent.setLayout(null);
		
		JLabel lblHelloStudent = new JLabel("Hello Student ");
		lblHelloStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloStudent.setForeground(new Color(0, 51, 102));
		lblHelloStudent.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblHelloStudent.setBounds(10, 11, 444, 65);
		panelStudent.add(lblHelloStudent);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setForeground(new Color(0, 51, 102));
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblUsername.setBackground(new Color(0, 51, 102));
		lblUsername.setBounds(10, 109, 144, 38);
		panelStudent.add(lblUsername);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		textField.setForeground(new Color(0, 51, 102));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(149, 109, 272, 38);
		panelStudent.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setForeground(new Color(0, 51, 102));
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblPassword.setBackground(new Color(0, 51, 102));
		lblPassword.setBounds(10, 158, 144, 38);
		panelStudent.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setForeground(new Color(0, 51, 102));
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		passwordField.setBounds(149, 158, 272, 38);
		panelStudent.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				try
				{
					if(textField.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "Username required");
					}
					else if(passwordField.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "Password required");
					}
					else
					{
						Controleur.apprenantCo = Factory.getApprenantDao().find(textField.getText(), passwordField.getText());
					}
				}
				catch(MdpException | ExisteException x)
				{
					JOptionPane.showMessageDialog(null, x.getMessage());
				}
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
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnNewButton.setBounds(93, 219, 291, 38);
		panelStudent.add(btnNewButton);
		
		JLabel lblForgotPasswrd = new JLabel("Forgot my password ?");
		lblForgotPasswrd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblForgotPasswrd.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblForgotPasswrd.setForeground(new Color(0, 51, 102));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "A bah fallait pas l'oublier");
			}
		});
		lblForgotPasswrd.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPasswrd.setForeground(new Color(0, 51, 102));
		lblForgotPasswrd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblForgotPasswrd.setBackground(new Color(0, 51, 102));
		lblForgotPasswrd.setBounds(93, 259, 291, 16);
		panelStudent.add(lblForgotPasswrd);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InscriptionStudentAng p = new InscriptionStudentAng();
				p.setVisible(true);
				setVisible(false);
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
		btnSignIn.setBounds(93, 299, 291, 38);
		panelStudent.add(btnSignIn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(10, 25, 330, 141);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel welcome = new JLabel("Welcome to ");
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
		
		JLabel lblLearn = new JLabel("- Learn with us -");
		lblLearn.setBounds(10, 11, 310, 29);
		panel_1.add(lblLearn);
		lblLearn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLearn.setForeground(Color.WHITE);
		lblLearn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		
		JLabel lblShareYour = new JLabel("- Share your opinions  -");
		lblShareYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblShareYour.setForeground(Color.WHITE);
		lblShareYour.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		lblShareYour.setBounds(10, 92, 310, 29);
		panel_1.add(lblShareYour);
		
		JLabel lblMakeYour = new JLabel("- Make your own blogs -");
		lblMakeYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblMakeYour.setForeground(Color.WHITE);
		lblMakeYour.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
		lblMakeYour.setBounds(10, 51, 310, 29);
		panel_1.add(lblMakeYour);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 177, 330, 75);
		contentPane.add(panel_2);
		
		JLabel lblUniversityLearningApplication = new JLabel("University learning \r\napplication");
		lblUniversityLearningApplication.setBackground(new Color(0, 153, 0));
		lblUniversityLearningApplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblUniversityLearningApplication.setForeground(new Color(0, 51, 102));
		lblUniversityLearningApplication.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblUniversityLearningApplication.setBounds(0, 11, 330, 38);
		panel_2.add(lblUniversityLearningApplication);
		
		JLabel lblPourEtudiantsEt = new JLabel("for students and teachers");
		lblPourEtudiantsEt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPourEtudiantsEt.setForeground(new Color(0, 51, 102));
		lblPourEtudiantsEt.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblPourEtudiantsEt.setBounds(0, 37, 330, 27);
		panel_2.add(lblPourEtudiantsEt);
		
		JButton button = new JButton("Back");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(Color.RED);
				button.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button.setForeground(Color.WHITE);
				button.setBackground(new Color(0, 51, 102));
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				WelcomeHome p = new WelcomeHome();
				p.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		button.setBackground(new Color(0, 51, 102));
		button.setBounds(350, 400, 160, 31);
		contentPane.add(button);
	}
}
