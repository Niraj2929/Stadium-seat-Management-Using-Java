import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class Tenth_window extends JFrame {

	private JPanel contentPane;
	private JTextField text_1;
	private JTextField text_2;
	private JTextField text_3;
	private JTextField text_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tenth_window frame = new Tenth_window();
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
	public Tenth_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bookiing ID");
		lblNewLabel.setBounds(21, 36, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(21, 73, 69, 14);
		contentPane.add(lblName);
		
		JLabel lblGame = new JLabel("Game");
		lblGame.setBounds(21, 109, 69, 14);
		contentPane.add(lblGame);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(21, 145, 69, 14);
		contentPane.add(lblStatus);
		
		text_1 = new JTextField();
		text_1.setBounds(102, 33, 100, 20);
		contentPane.add(text_1);
		text_1.setColumns(10);
		
		text_2 = new JTextField();
		text_2.setColumns(10);
		text_2.setBounds(100, 70, 100, 20);
		contentPane.add(text_2);
		
		text_3 = new JTextField();
		text_3.setColumns(10);
		text_3.setBounds(100, 109, 160, 20);
		contentPane.add(text_3);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(313, 210, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Check");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id1=text_1.getText();
				String sta="pending";
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost/mydb5","root","root");
					PreparedStatement ps=con.prepareStatement("select * from book_ticket where book_id=?");
					ps.setString(1, id1);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						text_2.setText(rs.getString(2));
						text_3.setText(rs.getString(3));
						text_4.setText(rs.getString(8));
					}
					String a,b;
					a="pending";
					b="completed";
					
					
					if(a.equals(text_4.getText()))
					{
						text_4.setForeground(new Color(255, 0, 0));
					}
					else if(b.equals(text_4.getText()))
					{
						text_4.setForeground(new Color(0, 128,0));
					}
					con.close();
					
					
				}
				catch(Exception ae)
				{
					ae.printStackTrace();
				}
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(313, 69, 89, 23);
		contentPane.add(btnNewButton_1);
		
		text_4 = new JTextField();
		
		text_4.setBounds(100, 142, 102, 20);
		contentPane.add(text_4);
		text_4.setColumns(10);
	}
}
