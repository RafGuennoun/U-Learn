import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import code.classes.Date;
import code.classes.ExisteException;
import code.classes.Instructeur;
import code.dao.Factory;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InscriptionTeacherAng extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Name;
	private JTextField textField_faminyName;
	private JTextField textField_email;
	private JTextField textField_confEmail;
	private JPasswordField passwordField_mdp;
	private JPasswordField passwordField_confMdp;
	private JTextField textField_domain;
	private JTextField textField_username;
	private JTextField textField_grade;
	
	private String chemin = "D:\\\\Mes Projets\\\\ULearn\\\\Source\\\\U-Learn\\\\Icons\\\\user_120px.png";
	private JTextField textField_yyyy;
	private JTextField textField_mm;
	private JTextField textField_dd;

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
		
		textField_faminyName = new JTextField();
		textField_faminyName.setHorizontalAlignment(SwingConstants.CENTER);
		textField_faminyName.setForeground(new Color(0, 51, 102));
		textField_faminyName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_faminyName.setColumns(10);
		textField_faminyName.setBounds(120, 43, 225, 28);
		panel_1.add(textField_faminyName);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(120, 13, 225, 28);
		panel_1.add(textField_Name);
		textField_Name.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Name.setForeground(new Color(0, 51, 102));
		textField_Name.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_Name.setColumns(10);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth :");
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateOfBirth.setForeground(new Color(0, 51, 102));
		lblDateOfBirth.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblDateOfBirth.setBackground(new Color(0, 51, 102));
		lblDateOfBirth.setBounds(10, 78, 166, 28);
		panel_1.add(lblDateOfBirth);
		
		textField_yyyy = new JTextField();
		textField_yyyy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_yyyy.setText("");
			}
		});
		textField_yyyy.setText("YYYY");
		textField_yyyy.setHorizontalAlignment(SwingConstants.CENTER);
		textField_yyyy.setForeground(new Color(0, 51, 102));
		textField_yyyy.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_yyyy.setColumns(10);
		textField_yyyy.setBounds(282, 78, 63, 28);
		panel_1.add(textField_yyyy);
		
		textField_mm = new JTextField();
		textField_mm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_mm.setText("");
			}
		});
		textField_mm.setText("MM");
		textField_mm.setHorizontalAlignment(SwingConstants.CENTER);
		textField_mm.setForeground(new Color(0, 51, 102));
		textField_mm.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_mm.setColumns(10);
		textField_mm.setBounds(229, 78, 49, 28);
		panel_1.add(textField_mm);
		
		textField_dd = new JTextField();
		textField_dd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_dd.setText("");
			}
		});
		textField_dd.setText("DD");
		textField_dd.setHorizontalAlignment(SwingConstants.CENTER);
		textField_dd.setForeground(new Color(0, 51, 102));
		textField_dd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_dd.setColumns(10);
		textField_dd.setBounds(176, 78, 49, 28);
		panel_1.add(textField_dd);
		
		
	
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
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(682, 221, 132, 117);
		contentPane.add(panel_4);
		
		JLabel Parcourir = new JLabel("");
		Parcourir.setHorizontalAlignment(SwingConstants.CENTER);
		Parcourir.setIcon(new ImageIcon("C:\\Users\\YACINE\\eclipse-workspace\\U-Learn\\Icons\\user_40px.png"));
		Parcourir.setBounds(0, 0, 132, 117);
		panel_4.add(Parcourir);
		
		
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
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(375, 139, 439, 68);
		contentPane.add(panel_3);
		
		JLabel lblGrade = new JLabel("Grade :");
		lblGrade.setForeground(new Color(0, 51, 102));
		lblGrade.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblGrade.setBackground(new Color(0, 51, 102));
		lblGrade.setBounds(10, 32, 91, 30);
		panel_3.add(lblGrade);
		
		JLabel Domain = new JLabel("Domain :");
		Domain.setForeground(new Color(0, 51, 102));
		Domain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		Domain.setBackground(new Color(0, 51, 102));
		Domain.setBounds(10, 1, 107, 30);
		panel_3.add(Domain);
		
		textField_domain = new JTextField();
		textField_domain.setHorizontalAlignment(SwingConstants.CENTER);
		textField_domain.setForeground(new Color(0, 51, 102));
		textField_domain.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_domain.setColumns(10);
		textField_domain.setBounds(127, 3, 302, 28);
		panel_3.add(textField_domain);
		
		textField_grade = new JTextField();
		textField_grade.setHorizontalAlignment(SwingConstants.CENTER);
		textField_grade.setForeground(new Color(0, 51, 102));
		textField_grade.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_grade.setColumns(10);
		textField_grade.setBounds(127, 34, 302, 28);
		panel_3.add(textField_grade);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(375, 90, 439, 46);
		contentPane.add(panel_5);
		
		JLabel label_2 = new JLabel("Level :");
		label_2.setForeground(new Color(0, 51, 102));
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label_2.setBackground(new Color(0, 51, 102));
		label_2.setBounds(10, 39, 91, 30);
		panel_5.add(label_2);
		
		JLabel label_3 = new JLabel("Username :");
		label_3.setForeground(new Color(0, 51, 102));
		label_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label_3.setBackground(new Color(0, 51, 102));
		label_3.setBounds(10, 9, 107, 30);
		panel_5.add(label_3);
		
		textField_username = new JTextField();
		textField_username.setHorizontalAlignment(SwingConstants.CENTER);
		textField_username.setForeground(new Color(0, 51, 102));
		textField_username.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_username.setColumns(10);
		textField_username.setBounds(127, 11, 302, 28);
		panel_5.add(textField_username);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("C:\\Users\\YACINE\\Desktop"));
				FileNameExtensionFilter filter = new FileNameExtensionFilter("IMAGE","png","jpg","gif");
				fileChooser.addChoosableFileFilter(filter);
				int result = fileChooser.showSaveDialog(null);
				if(result == JFileChooser.APPROVE_OPTION)
				{
					File selectedfile = fileChooser.getSelectedFile();
					chemin = selectedfile.getAbsolutePath();
					ImageIcon myImage = new ImageIcon(chemin);
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
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		button.setBackground(new Color(0, 51, 102));
		button.setBounds(682, 347, 132, 25);
		contentPane.add(button);
		
		JButton btnSinscrire = new JButton("Sign in");
		btnSinscrire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textField_username.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Username required");
				}
				else if(textField_email.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Email required");
				}
				else if(passwordField_mdp.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Password required");
				}
				else if(textField_faminyName.getText().equals("") || textField_Name.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "First and last name required");
				}
				else if(textField_domain.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Domaine required");
				}
				else if(!passwordField_mdp.getText().equals(passwordField_confMdp.getText()))
				{
					JOptionPane.showMessageDialog(null, "Error in password confirmation");
				}
				else if(!textField_email.getText().equals(textField_confEmail.getText()))
				{
					JOptionPane.showMessageDialog(null, "Error in emain confirmation");
				}
				else
				{
					Date date = new Date(2001, 10, 1);
					Instructeur i = new Instructeur(textField_username.getText(),
													textField_faminyName.getText(),
													textField_Name.getText(),
													textField_email.getText(),
													date,
													textField_domain.getText(),
													chemin);
					try
					{
						Factory.getInstructeurDao().insert(i, passwordField_mdp.getText());
						JOptionPane.showMessageDialog(null, "Signed in successfuly !");
					}
					catch(ExisteException x)
					{
						JOptionPane.showMessageDialog(null, x.getMessage());
					}
					
				}
				
			}
		});
		btnSinscrire.setForeground(Color.WHITE);
		btnSinscrire.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnSinscrire.setBackground(new Color(0, 51, 102));
		btnSinscrire.setBounds(256, 383, 291, 38);
		contentPane.add(btnSinscrire);
	}
}
