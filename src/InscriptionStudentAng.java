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

import code.classes.Apprenant;
import code.classes.Date;
import code.classes.ExisteException;
import code.dao.Factory;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InscriptionStudentAng extends JFrame {

	private JPanel contentPane;
	private JTextField textField_familyName;
	private JTextField textField_name;
	private JTextField textField_adr;
	private JTextField textField_idf;
	private JTextField textField_specialite;
	private JTextField textField_confAdr;
	private JPasswordField passwordField_mdp;
	private JPasswordField passwordField_confMdp;
	
	private String chemin = "D:\\Mes Projets\\ULearn\\Source\\U-Learn\\Icons\\user_120px.png";
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
					InscriptionStudentAng frame = new InscriptionStudentAng();
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
	public InscriptionStudentAng() {
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
		
		
		
		textField_familyName = new JTextField();
		textField_familyName.setHorizontalAlignment(SwingConstants.CENTER);
		textField_familyName.setForeground(new Color(0, 51, 102));
		textField_familyName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_familyName.setColumns(10);
		textField_familyName.setBounds(120, 13, 225, 28);
		panel_1.add(textField_familyName);
		
		textField_name = new JTextField();
		textField_name.setHorizontalAlignment(SwingConstants.CENTER);
		textField_name.setForeground(new Color(0, 51, 102));
		textField_name.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_name.setColumns(10);
		textField_name.setBounds(120, 43, 225, 28);
		panel_1.add(textField_name);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth :");
		lblDateOfBirth.setHorizontalAlignment(SwingConstants.CENTER);
		lblDateOfBirth.setForeground(new Color(0, 51, 102));
		lblDateOfBirth.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblDateOfBirth.setBackground(new Color(0, 51, 102));
		lblDateOfBirth.setBounds(10, 82, 166, 28);
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
		textField_yyyy.setBounds(282, 82, 63, 28);
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
		textField_mm.setBounds(229, 82, 49, 28);
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
		textField_dd.setBounds(176, 82, 49, 28);
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
		
		textField_adr = new JTextField();
		textField_adr.setHorizontalAlignment(SwingConstants.CENTER);
		textField_adr.setForeground(new Color(0, 51, 102));
		textField_adr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_adr.setColumns(10);
		textField_adr.setBounds(273, 13, 379, 28);
		panel_2.add(textField_adr);
		
		textField_confAdr = new JTextField();
		textField_confAdr.setHorizontalAlignment(SwingConstants.CENTER);
		textField_confAdr.setForeground(new Color(0, 51, 102));
		textField_confAdr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_confAdr.setColumns(10);
		textField_confAdr.setBounds(273, 46, 379, 28);
		panel_2.add(textField_confAdr);
		
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
		panel_3.setBounds(375, 140, 439, 68);
		contentPane.add(panel_3);
		
		JLabel lblNiveau = new JLabel("Level :");
		lblNiveau.setForeground(new Color(0, 51, 102));
		lblNiveau.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNiveau.setBackground(new Color(0, 51, 102));
		lblNiveau.setBounds(10, 32, 91, 30);
		panel_3.add(lblNiveau);
		
		JLabel lblSpecialit = new JLabel("Speciality :");
		lblSpecialit.setForeground(new Color(0, 51, 102));
		lblSpecialit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblSpecialit.setBackground(new Color(0, 51, 102));
		lblSpecialit.setBounds(10, 1, 107, 30);
		panel_3.add(lblSpecialit);
		
		
		JComboBox comboBox_niveau = new JComboBox();
		comboBox_niveau.setBorder(null);
		comboBox_niveau.setBackground(new Color(255, 255, 255));
		comboBox_niveau.setForeground(new Color(0, 51, 102));
		comboBox_niveau.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		comboBox_niveau.setBounds(127, 35, 302, 28);
		panel_3.add(comboBox_niveau);
		comboBox_niveau.addItem("L1");
		comboBox_niveau.addItem("L2");
		comboBox_niveau.addItem("L3");
		comboBox_niveau.addItem("M1");
		comboBox_niveau.addItem("M2");
		comboBox_niveau.setSelectedItem(null);
		
		textField_specialite = new JTextField();
		textField_specialite.setHorizontalAlignment(SwingConstants.CENTER);
		textField_specialite.setForeground(new Color(0, 51, 102));
		textField_specialite.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_specialite.setColumns(10);
		textField_specialite.setBounds(127, 3, 302, 28);
		panel_3.add(textField_specialite);
		
		
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
				LoginStudent p = new LoginStudent();
				p.setVisible(true);
			}
		});
		
		btnX.setForeground(Color.WHITE);
		btnX.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		btnX.setBackground(Color.RED);
		btnX.setBounds(706, 383, 87, 38);
		contentPane.add(btnX);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(375, 91, 439, 46);
		contentPane.add(panel_5);
		
		JLabel label = new JLabel("Level :");
		label.setForeground(new Color(0, 51, 102));
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label.setBackground(new Color(0, 51, 102));
		label.setBounds(10, 39, 91, 30);
		panel_5.add(label);
		
		JLabel lblUniversit = new JLabel("Username :");
		lblUniversit.setBounds(10, 9, 107, 30);
		panel_5.add(lblUniversit);
		lblUniversit.setForeground(new Color(0, 51, 102));
		lblUniversit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblUniversit.setBackground(new Color(0, 51, 102));
		
		textField_idf = new JTextField();
		textField_idf.setBounds(127, 11, 302, 28);
		panel_5.add(textField_idf);
		textField_idf.setHorizontalAlignment(SwingConstants.CENTER);
		textField_idf.setForeground(new Color(0, 51, 102));
		textField_idf.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_idf.setColumns(10);
		
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
						JOptionPane.showMessageDialog(null, "No file choosed");
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
			public void actionPerformed(ActionEvent arg0) {
				{
					
					if(textField_idf.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "Username required");
					}
					else if(textField_adr.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "Email required");
					}
					else if(passwordField_mdp.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "Password required");
					}
					else if(textField_familyName.getText().equals("") || textField_name.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "First and Last names are necessary");
					}
					else if(!passwordField_mdp.getText().equals(passwordField_confMdp.getText()))
					{
						JOptionPane.showMessageDialog(null, "Error in password confirmation");
					}
					else if(!textField_adr.getText().equals(textField_confAdr.getText()))
					{
						JOptionPane.showMessageDialog(null, "Error in email confirmation");
					}
					else
					{
						Date date = new Date(2001, 10, 1);
						Apprenant a = new Apprenant(textField_idf.getText(),
													textField_familyName.getText(),
													textField_name.getText(),
													textField_adr.getText(),
													date,
													comboBox_niveau.getSelectedIndex()+1,
													chemin);
						try
						{
							Factory.getApprenantDao().insert(a, passwordField_mdp.getText());
							JOptionPane.showMessageDialog(null, "Signed in successfuly !");
							LoginStudent p = new LoginStudent();
							p.setVisible(true);
							setVisible(false);

						}
						catch(ExisteException x)
						{
							JOptionPane.showMessageDialog(null,"Username exists already");
						}
						
					}
					
				}
			}
		}
				);
		btnSinscrire.setForeground(Color.WHITE);
		btnSinscrire.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		btnSinscrire.setBackground(new Color(0, 51, 102));
		btnSinscrire.setBounds(256, 383, 291, 38);
		contentPane.add(btnSinscrire);
	}
}
