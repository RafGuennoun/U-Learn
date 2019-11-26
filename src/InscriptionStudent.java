import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import code.classes.*;
import code.dao.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
<<<<<<< HEAD
import java.util.Calendar;
=======
import java.sql.SQLException;
>>>>>>> a2e1f63fadc38cd1cacb9e248e68fdda8f291a7a

public class InscriptionStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	private JTextField textField_adr;
	private JTextField textField_confAdr;
	private JPasswordField passwordField_mdp;
	private JPasswordField passwordField_confMdp;
	private JTextField textField_idf;
	private JTextField textField_specilite;
	
	private String chemin = "D:\\Mes Projets\\ULearn\\Source\\U-Learn\\Icons\\user_120px.png";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InscriptionStudent frame = new InscriptionStudent();
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
		public InscriptionStudent() {
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
		
		JLabel lblBienvenueUlearn = new JLabel("Bienvenue \u00E0 U-Learn");
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
		
	
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setBounds(10, 11, 63, 30);
		panel_1.add(lblNom);
		lblNom.setForeground(new Color(0, 51, 102));
		lblNom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNom.setBackground(new Color(0, 51, 102));
		
		JLabel lblPrenom = new JLabel("Prenom :");
		lblPrenom.setBounds(10, 41, 91, 30);
		panel_1.add(lblPrenom);
		lblPrenom.setForeground(new Color(0, 51, 102));
		lblPrenom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblPrenom.setBackground(new Color(0, 51, 102));
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance :");
		lblDateDeNaissance.setBounds(10, 78, 175, 28);
		panel_1.add(lblDateDeNaissance);
		lblDateDeNaissance.setForeground(new Color(0, 51, 102));
		lblDateDeNaissance.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblDateDeNaissance.setBackground(new Color(0, 51, 102));
		
		textField_nom = new JTextField();
		textField_nom.setHorizontalAlignment(SwingConstants.CENTER);
		textField_nom.setForeground(new Color(0, 51, 102));
		textField_nom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_nom.setBounds(102, 13, 243, 28);
		panel_1.add(textField_nom);
		textField_nom.setColumns(10);
		
		textField_prenom = new JTextField();
		textField_prenom.setHorizontalAlignment(SwingConstants.CENTER);
		textField_prenom.setForeground(new Color(0, 51, 102));
		textField_prenom.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_prenom.setColumns(10);
		textField_prenom.setBounds(102, 43, 243, 28);
		panel_1.add(textField_prenom);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 221, 662, 151);
		contentPane.add(panel_2);
		
		JLabel lblAdresseEmail_1 = new JLabel("Adresse email :");
		lblAdresseEmail_1.setForeground(new Color(0, 51, 102));
		lblAdresseEmail_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblAdresseEmail_1.setBackground(new Color(0, 51, 102));
		lblAdresseEmail_1.setBounds(10, 11, 150, 30);
		panel_2.add(lblAdresseEmail_1);
		
		JLabel lblConfirmezMotDe = new JLabel("Mot de passe :");
		lblConfirmezMotDe.setForeground(new Color(0, 51, 102));
		lblConfirmezMotDe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblConfirmezMotDe.setBackground(new Color(0, 51, 102));
		lblConfirmezMotDe.setBounds(10, 44, 140, 30);
		panel_2.add(lblConfirmezMotDe);
		
		JLabel lblConfirmezMotDe_1 = new JLabel("Confirmez mot de passe :");
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
		textField_adr.setBounds(249, 13, 403, 28);
		panel_2.add(textField_adr);
		
		passwordField_mdp = new JPasswordField();
		passwordField_mdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_mdp.setEchoChar('*');
		passwordField_mdp.setForeground(new Color(0, 51, 102));
		passwordField_mdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		passwordField_mdp.setBounds(249, 46, 403, 28);
		panel_2.add(passwordField_mdp);
		
		passwordField_confMdp = new JPasswordField();
		passwordField_confMdp.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField_confMdp.setForeground(new Color(0, 51, 102));
		passwordField_confMdp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		passwordField_confMdp.setEchoChar('*');
		passwordField_confMdp.setBounds(249, 110, 403, 28);
		panel_2.add(passwordField_confMdp);
		
		JLabel lblMotDePasse = new JLabel("Confirmez adresse email :");
		lblMotDePasse.setBounds(10, 76, 241, 30);
		panel_2.add(lblMotDePasse);
		lblMotDePasse.setForeground(new Color(0, 51, 102));
		lblMotDePasse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblMotDePasse.setBackground(new Color(0, 51, 102));
		
		textField_confAdr = new JTextField();
		textField_confAdr.setBounds(249, 78, 403, 28);
		panel_2.add(textField_confAdr);
		textField_confAdr.setHorizontalAlignment(SwingConstants.CENTER);
		textField_confAdr.setForeground(new Color(0, 51, 102));
		textField_confAdr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_confAdr.setColumns(10);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(682, 221, 132, 117);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel Parcourir = new JLabel("");
		Parcourir.setHorizontalAlignment(SwingConstants.CENTER);
		Parcourir.setIcon(new ImageIcon("C:\\Users\\YACINE\\eclipse-workspace\\U-Learn\\Icons\\user_40px.png"));
		Parcourir.setBounds(0, 0, 132, 117);
		panel_4.add(Parcourir);
		
		JButton button_parcourir = new JButton("ADD");
		button_parcourir.setForeground(Color.WHITE);
		button_parcourir.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
		button_parcourir.setBackground(new Color(0, 51, 102));
		button_parcourir.setBounds(682, 349, 132, 25);
		contentPane.add(button_parcourir);
		
	//	button_parcourir.setIcon(new ImageIcon(InscriptionStudent.class.getResource("/img/photo-camera.png")));
		
		button_parcourir.addActionListener(new ActionListener() {
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
	
		
		
	//	button_parcourir.setIcon(new ImageIcon(Acceuil.class.getResource("/img/photo-camera.png")));
		button_parcourir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
		/*
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
					java.awt.Image NewImage = img.getScaledInstance(Parcourir.getWidth(), Parcourir.getHeight(), java.awt.Image.SCALE_SMOOTH); 
					ImageIcon finalImage = new ImageIcon(NewImage);
					Parcourir.setIcon(finalImage);

				//	s=path;
				}
				else
				{
					if( result == JFileChooser.CANCEL_OPTION)
					{
						JOptionPane.showMessageDialog(null, "Vous avez rien choisi");
					}
				}
				*/
			}
		});
	
		
		
		JButton btnX = new JButton("Retour");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				
				LoginStudentFr p = new LoginStudentFr();
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
		panel_3.setBounds(375, 90, 439, 46);
		contentPane.add(panel_3);
		
		JLabel label = new JLabel("Level :");
		label.setForeground(new Color(0, 51, 102));
		label.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		label.setBackground(new Color(0, 51, 102));
		label.setBounds(10, 39, 91, 30);
		panel_3.add(label);
		
		JLabel lblIdentifiant = new JLabel("Identifiant :");
		lblIdentifiant.setForeground(new Color(0, 51, 102));
		lblIdentifiant.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblIdentifiant.setBackground(new Color(0, 51, 102));
		lblIdentifiant.setBounds(10, 9, 107, 30);
		panel_3.add(lblIdentifiant);
		
		textField_idf = new JTextField();
		textField_idf.setHorizontalAlignment(SwingConstants.CENTER);
		textField_idf.setForeground(new Color(0, 51, 102));
		textField_idf.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_idf.setColumns(10);
		textField_idf.setBounds(127, 11, 302, 28);
		panel_3.add(textField_idf);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 51, 102), 2, true));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(375, 140, 439, 68);
		contentPane.add(panel_5);
		
		JLabel lblNiveau = new JLabel("Niveau :");
		lblNiveau.setForeground(new Color(0, 51, 102));
		lblNiveau.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNiveau.setBackground(new Color(0, 51, 102));
		lblNiveau.setBounds(10, 32, 91, 30);
		panel_5.add(lblNiveau);
		
		JLabel lblSpecialit = new JLabel("Specialit\u00E9 :");
		lblSpecialit.setForeground(new Color(0, 51, 102));
		lblSpecialit.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblSpecialit.setBackground(new Color(0, 51, 102));
		lblSpecialit.setBounds(10, 1, 107, 30);
		panel_5.add(lblSpecialit);
		
		JComboBox comboBox_niveau = new JComboBox();
		comboBox_niveau.setForeground(new Color(0, 51, 102));
		comboBox_niveau.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		comboBox_niveau.setBorder(null);
		comboBox_niveau.setBackground(Color.WHITE);
		comboBox_niveau.setBounds(127, 35, 302, 28);
		comboBox_niveau.addItem("L1");
		comboBox_niveau.addItem("L2");
		comboBox_niveau.addItem("L3");
		comboBox_niveau.addItem("M1");
		comboBox_niveau.addItem("M2");
		panel_5.add(comboBox_niveau);
		
		textField_specilite = new JTextField();
		textField_specilite.setHorizontalAlignment(SwingConstants.CENTER);
		textField_specilite.setForeground(new Color(0, 51, 102));
		textField_specilite.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		textField_specilite.setColumns(10);
		textField_specilite.setBounds(127, 3, 302, 28);
		panel_5.add(textField_specilite);
		
		JButton btnSinscrire = new JButton("S'inscrire");
		btnSinscrire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField_idf.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "champ Identifiant obligatoir");
				}
				else if(textField_adr.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "champ adresse mail obligatoir");
				}
				else if(passwordField_mdp.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "champ mot de passe obligatoir");
				}
				else if(textField_nom.getText().equals("") || textField_prenom.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "champs nom et prenom obligatoirs");
				}
				else if(!passwordField_mdp.getText().equals(passwordField_confMdp.getText()))
				{
					JOptionPane.showMessageDialog(null, "Erreur dans la confirmation mot de passe");
				}
				else if(!textField_adr.getText().equals(textField_confAdr.getText()))
				{
					JOptionPane.showMessageDialog(null, "Erreur dans la confirmation adresse mail");
				}
				else
				{
					Date date = new Date(2001, 10, 1);
					Apprenant a = new Apprenant(textField_idf.getText(),
												textField_nom.getText(),
												textField_prenom.getText(),
												textField_adr.getText(),
												date,
												comboBox_niveau.getSelectedIndex()+1,
												chemin);
					try
					{
						Factory.getApprenantDao().insert(a, passwordField_mdp.getText());
						JOptionPane.showMessageDialog(null, "Inscrit avec succès !");
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
		btnSinscrire.setBounds(228, 383, 291, 38);
		contentPane.add(btnSinscrire);
		
	}
}
