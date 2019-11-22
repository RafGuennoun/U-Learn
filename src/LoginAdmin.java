import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import code.classes.Date;
import code.classes.ExisteException;
import code.classes.Instructeur;
import code.dao.Connexion;
import code.dao.InstructeurDao;

public class LoginAdmin extends JFrame {

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
					LoginAdmin frame = new LoginAdmin();
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
	public LoginAdmin() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 830, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
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
		btnRetour.setBounds(115, 384, 160, 25);
		contentPane.add(btnRetour);
		
		JLabel lblHelloStudent = new JLabel("U-Learn");
		lblHelloStudent.setBounds(32, 11, 361, 65);
		contentPane.add(lblHelloStudent);
		lblHelloStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloStudent.setForeground(new Color(0, 51, 102));
		lblHelloStudent.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 76));
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setBounds(20, 110, 144, 38);
		contentPane.add(lblUsername);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setForeground(new Color(0, 51, 102));
		lblUsername.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblUsername.setBackground(new Color(0, 51, 102));
		
			
			JLabel lblPassword = new JLabel("Password :");
			lblPassword.setBounds(20, 175, 145, 38);
			contentPane.add(lblPassword);
			lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
			lblPassword.setForeground(new Color(0, 51, 102));
			lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
			lblPassword.setBackground(new Color(0, 51, 102));
			
	
			
			JButton btnNewButton = new JButton("Login");
			btnNewButton.setBounds(47, 239, 291, 38);
			contentPane.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
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
			
			JButton btnSignIn = new JButton("Sign in");
			btnSignIn.setBounds(47, 313, 291, 38);
			contentPane.add(btnSignIn);
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
			
			JLabel lblForgotPasswrd = new JLabel("Forgot your password  ?");
			lblForgotPasswrd.setBounds(57, 275, 291, 16);
			contentPane.add(lblForgotPasswrd);
			lblForgotPasswrd.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					lblForgotPasswrd.setForeground(Color.RED);
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					lblForgotPasswrd.setForeground((new Color(0,51,102)));
				}
			});
			lblForgotPasswrd.setHorizontalAlignment(SwingConstants.CENTER);
			lblForgotPasswrd.setForeground(new Color(0, 51, 102));
			lblForgotPasswrd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
			lblForgotPasswrd.setBackground(new Color(0, 51, 102));
			
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setForeground(new Color(0, 51, 102));
			textField.setFont(new Font("Sitka Text", Font.BOLD, 20));
			textField.setColumns(10);
			textField.setBounds(158, 110, 216, 38);
			contentPane.add(textField);
			
			passwordField = new JPasswordField();
			passwordField.setHorizontalAlignment(SwingConstants.CENTER);
			passwordField.setForeground(new Color(0, 51, 102));
			passwordField.setFont(new Font("Sitka Text", Font.BOLD, 20));
			passwordField.setEchoChar('*');
			passwordField.setBounds(158, 175, 213, 38);
			contentPane.add(passwordField);
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Users\\YACINE\\Documents\\ad1.png"));
			label.setBounds(339, 0, 475, 442);
			contentPane.add(label);
	}
}
