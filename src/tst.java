import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
public class tst extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tst frame = new tst();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 */
	public tst() throws InterruptedException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("pdf");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Desktop.getDesktop().open(new java.io.File("H:\\cs/linux.pdf"));
				}
				catch ( Exception e)
				{
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(59, 37, 161, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblPdpdpdpd = new JLabel("Text");
		lblPdpdpdpd.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPdpdpdpd.addMouseListener(new MouseAdapter() {
			@Override
			
			
			
			public void mouseClicked(MouseEvent arg0) {
				
				
				try
				{
					Desktop.getDesktop().open(new java.io.File("File/text.txt"));
				}
				catch ( Exception e)
				{
					e.printStackTrace();
				}
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblPdpdpdpd.setForeground(Color.red);
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblPdpdpdpd.setForeground(Color.BLACK);
			}
		});
		lblPdpdpdpd.setBounds(457, 83, 62, 26);
		contentPane.add(lblPdpdpdpd);
		

	}
}
