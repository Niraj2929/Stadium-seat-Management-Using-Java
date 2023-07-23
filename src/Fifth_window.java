import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Fifth_window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fifth_window frame = new Fifth_window();
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
	public Fifth_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setTitle("STADIUM SEAT BOOKING SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\NIRAJ\\Downloads\\360_F_308337583_CahQnaQMDdhkNnAY7Q0k7dhZZFCEmj7p.jpg"));
		lblNewLabel.setBounds(10, 11, 345, 340);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("User Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eleventh_window frame_1=new Eleventh_window();
				frame_1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(382, 31, 89, 23);
		contentPane.add(btnNewButton);
	}
}
