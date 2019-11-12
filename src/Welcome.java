import java.util.*;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AppPackage.AnimationClass;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class Welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 100, 798, 496);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFgdfgdfgdfg = new JLabel("fgdfgdfgdfg");
		lblFgdfgdfgdfg.setBounds(748, 0, -284, 251);
		contentPane.add(lblFgdfgdfgdfg);
		
		JLabel gris = new JLabel("");
		gris.setBounds(0, 43, 636, 428);
		gris.setIcon(new ImageIcon("C:\\Users\\YACINE\\Pictures\\ggg.png"));
		contentPane.add(gris);
		
		JLabel rouge = new JLabel("");
		rouge.setBounds(0, 0, 279, 428);
		rouge.setIcon(new ImageIcon("C:\\Users\\YACINE\\Pictures\\rou.png"));
		contentPane.add(rouge);
		
		JLabel orange = new JLabel("");
		orange.setIcon(new ImageIcon("C:\\Users\\YACINE\\Pictures\\oooo.png"));
		orange.setBounds(194, 0, 600, 428);
		contentPane.add(orange);
		
		JLabel ul = new JLabel("");
		ul.setIcon(new ImageIcon("C:\\Users\\YACINE\\Documents\\images.png"));
		ul.setBounds(-300, 68, 322, 226);
		contentPane.add(ul);
		
		AnimationClass anim = new AnimationClass();
		

		
		// gris a droite 
		anim.jLabelXLeft(rouge.getX(), -1000, 3, 1, rouge);
		anim.jLabelXRight(orange.getX(), 1000, 3, 1, orange);
		anim.jLabelYDown(gris.getY(), 1000, 3,1,gris);
		anim.jLabelXRight(-300, 250,2, 1, ul);
		
		setVisible(false);
		
	}
}
