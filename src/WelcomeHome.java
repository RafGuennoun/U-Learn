import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AppPackage.AnimationClass;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Window.Type;

public class WelcomeHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeHome frame = new WelcomeHome();
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
	
	public WelcomeHome() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 830, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox choixLangue = new JComboBox();
		choixLangue.setBackground(Color.WHITE);
		choixLangue.setToolTipText("");
		choixLangue.addItem("fr");
		choixLangue.addItem("ang");
		choixLangue.setSelectedItem("ang");
		choixLangue.setBounds(612, 11, 101, 21);
		choixLangue.setVisible(false);
		contentPane.add(choixLangue);
		
		JLabel ul = new JLabel("");
		ul.setHorizontalAlignment(SwingConstants.CENTER);
		ul.setIcon(new ImageIcon("C:\\Users\\YACINE\\Documents\\LRM_EXPORT_111813770704333_20191028_233746188.jpeg"));
		ul.setBounds(-300, 0, 804, 183);
		contentPane.add(ul);
		
		AnimationClass anim = new AnimationClass();
		anim.jLabelXRight(-300, 10,2, 1, ul);
		
		JLabel lblWelcomeToUlearn = new JLabel("Welcome to U-Learn");
		lblWelcomeToUlearn.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToUlearn.setForeground(new Color(0, 51, 102));
		lblWelcomeToUlearn.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblWelcomeToUlearn.setBounds(10, 182, 804, 65);
		contentPane.add(lblWelcomeToUlearn);
		
		
		
		JLabel lblAreYou = new JLabel("Are you  ?");
		lblAreYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreYou.setForeground(new Color(0, 51, 102));
		lblAreYou.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblAreYou.setBounds(10, 246, 804, 65);
		contentPane.add(lblAreYou);
		
		JLabel lblAStudent = new JLabel("* A student *");
		lblAStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblAStudent.setForeground(new Color(51, 153, 255));
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblAStudent.setForeground(new Color(0, 51, 102));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
					if(choixLangue.getSelectedItem().equals("ang"))
					{
						LoginStudent ls = new LoginStudent();
						ls.setVisible(true);
						setVisible(false);
					}
				
					if(choixLangue.getSelectedItem().equals("fr"))
					{
						LoginStudentFr lsFr = new LoginStudentFr();
						lsFr.setVisible(true);
						setVisible(false);
					}
				
			}
		});
		lblAStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblAStudent.setForeground(new Color(0, 51, 102));
		lblAStudent.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblAStudent.setBounds(10, 327, 254, 65);
		contentPane.add(lblAStudent);
		
		JLabel lblATeacher = new JLabel("* A teacher *");
		lblATeacher.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblATeacher.setForeground(new Color(51, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblATeacher.setForeground(new Color(0, 51, 102));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				if(choixLangue.getSelectedItem().equals("ang"))
				{
					LoginTeacher ls = new LoginTeacher();
					ls.setVisible(true);
					setVisible(false);
				}
			
				if(choixLangue.getSelectedItem().equals("fr"))
				{
					LoginTeacherFr lsFr = new LoginTeacherFr();
					lsFr.setVisible(true);
					setVisible(false);
				}
			
			}
		});
		lblATeacher.setHorizontalAlignment(SwingConstants.CENTER);
		lblATeacher.setForeground(new Color(0, 51, 102));
		lblATeacher.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblATeacher.setBounds(274, 327, 289, 65);
		contentPane.add(lblATeacher);
		
		JLabel lblAnAdmin = new JLabel("* An admin *");
		lblAnAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblAnAdmin.setForeground(new Color(51, 153, 255));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblAnAdmin.setForeground(new Color(0, 51, 102));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				LoginAdmin l = new LoginAdmin();
				l.setVisible(true);
				setVisible(false);
			}
		});
		lblAnAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnAdmin.setForeground(new Color(0, 51, 102));
		lblAnAdmin.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblAnAdmin.setBounds(560, 327, 254, 65);
		contentPane.add(lblAnAdmin);
		
		JLabel lblFr = new JLabel("Fr");
		lblFr.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblFr.setForeground(new Color(51, 153, 255));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				choixLangue.setSelectedItem("fr");
				
				
				/***************************/
				lblWelcomeToUlearn.setText("Bienvenue à U-Learn ");
				lblAreYou.setText(" Vous etes ? ");
				lblAStudent.setText("* Un etudiant *");
				lblATeacher.setText("* Un enseignant *");
				lblAnAdmin.setText("* Un admin *");
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblFr.setForeground(new Color(0, 51, 102));
				
			}
		});
		lblFr.setHorizontalAlignment(SwingConstants.CENTER);
		lblFr.setForeground(new Color(0, 51, 102));
		lblFr.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblFr.setBounds(786, 11, 28, 21);
		contentPane.add(lblFr);
		
		JLabel lblAng = new JLabel("Ang");
		lblAng.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblAng.setForeground(new Color(51, 153, 255));
			}
	
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblAng.setForeground(new Color(0, 51, 102));
			}
	
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				choixLangue.setSelectedItem("ang");
				
				lblWelcomeToUlearn.setText(" Welcome to U-Learn ");
				lblAreYou.setText("Are you  ?");
				lblAStudent.setText("* A student *");
				lblATeacher.setText("* A teacher *");
				lblAnAdmin.setText("* An admin *");
				
			}
		});
		lblAng.setHorizontalAlignment(SwingConstants.CENTER);
		lblAng.setForeground(new Color(0, 51, 102));
		lblAng.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		lblAng.setBounds(748, 11, 28, 21);
		contentPane.add(lblAng);
		
		JLabel label = new JLabel("/");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(0, 51, 102));
		label.setFont(new Font("Sitka Text", Font.BOLD, 10));
		label.setBounds(774, 11, 17, 21);
		contentPane.add(label);
	
	}
}
