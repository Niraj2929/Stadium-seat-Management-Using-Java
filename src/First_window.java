import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class First_window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_window frame = new First_window();
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
	public First_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setTitle("STADIUM SEAT BOOKING SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Second_window frame_1=new Second_window();
				frame_1.setVisible(true);
				dispose();
				
			}
		});
		btnAdminLogin.setBounds(33, 21, 125, 23);
		contentPane.add(btnAdminLogin);
		
		JButton btnUserLogin = new JButton("User Login");
		btnUserLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Third_window frame_1=new Third_window();
				frame_1.setVisible(true);
				dispose();
			}
		});
		btnUserLogin.setBounds(197, 21, 125, 23);
		contentPane.add(btnUserLogin);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(10, 67, 89, 23);
		contentPane.add(btnNewButton);
	}

}
