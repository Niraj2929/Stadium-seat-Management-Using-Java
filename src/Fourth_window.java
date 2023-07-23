import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Fourth_window extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton football;
	private JButton kabbadi;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fourth_window frame = new Fourth_window();
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
	public Fourth_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setTitle("GAME CATEGORY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("New label");
		label.setIcon(new ImageIcon(getClass().getResource("/images/cricket.jpg")));
		label.setBounds(10, 11, 337, 167);
		label.setVerticalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("CRICKET");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(390, 74, 132, 37);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\NIRAJ\\Downloads\\football.jpg"));
		lblNewLabel_1.setBounds(10, 195, 423, 179);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("FOOTBALL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setBounds(472, 267, 113, 30);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\NIRAJ\\Downloads\\9b353673784677.5c14e6e79e5ee.png"));
		lblNewLabel_3.setBounds(10, 385, 601, 286);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("KABBADI");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(634, 535, 86, 24);
		contentPane.add(lblNewLabel_4);
		
		football = new JButton("View Details");
		football.setBounds(472, 308, 113, 23);
		contentPane.add(football);
		
		kabbadi = new JButton("View Details");
		kabbadi.setBounds(634, 570, 113, 23);
		contentPane.add(kabbadi);
		
		btnNewButton = new JButton("View Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sixth_window frame=new Sixth_window();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(390, 119, 107, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Third_window frame=new Third_window();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(595, 11, 89, 23);
		contentPane.add(btnNewButton_1);
		
	}
}
