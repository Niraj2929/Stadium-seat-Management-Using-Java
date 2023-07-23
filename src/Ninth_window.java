import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ninth_window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ninth_window frame = new Ninth_window();
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
	public Ninth_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setTitle("STADIUM SEAT BOOKING SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HAPPY JOURNEY");
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(39, 25, 321, 82);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Have A Nice Day.....");
		lblNewLabel_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1.setFont(new Font("Mistral", Font.ITALIC, 30));
		lblNewLabel_1.setBounds(188, 207, 215, 31);
		contentPane.add(lblNewLabel_1);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setBounds(26, 168, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Check Status");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tenth_window frame_1=new Tenth_window();
				frame_1.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(26, 215, 114, 23);
		contentPane.add(button_2);
	}
}
