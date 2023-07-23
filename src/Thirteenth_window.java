import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Thirteenth_window extends JFrame {

	private JPanel contentPane;
	private JTextField text_1;
	private JTextField text_2;
	private JTextField text_3;
	private JTextField text_4;
	private JTextField text_5;
	private JTextField text_6;
	private JTextField text_7;
	private JTextField text_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thirteenth_window frame = new Thirteenth_window();
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
	public Thirteenth_window() {
		setTitle("STADIUM SEAT BOOKING SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookingId = new JLabel("Booking ID");
		lblBookingId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBookingId.setBounds(34, 40, 100, 22);
		contentPane.add(lblBookingId);
		
		JLabel lblGame = new JLabel("Game");
		lblGame.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGame.setBounds(34, 119, 100, 22);
		contentPane.add(lblGame);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(34, 81, 100, 22);
		contentPane.add(lblName);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStatus.setBounds(34, 152, 100, 22);
		contentPane.add(lblStatus);
		
		text_1 = new JTextField();
		text_1.setBounds(144, 42, 100, 20);
		contentPane.add(text_1);
		text_1.setColumns(10);
		
		text_2 = new JTextField();
		text_2.setColumns(10);
		text_2.setBounds(144, 83, 100, 20);
		contentPane.add(text_2);
		
		text_3 = new JTextField();
		text_3.setColumns(10);
		text_3.setBounds(144, 121, 159, 20);
		contentPane.add(text_3);
		
		text_4 = new JTextField();
		text_4.setColumns(10);
		text_4.setBounds(144, 154, 110, 20);
		contentPane.add(text_4);
		
		JLabel Price = new JLabel("Price");
		Price.setFont(new Font("Tahoma", Font.BOLD, 13));
		Price.setBounds(34, 195, 100, 22);
		contentPane.add(Price);
		
		text_5 = new JTextField();
		text_5.setBounds(144, 197, 86, 20);
		contentPane.add(text_5);
		text_5.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBounds(34, 239, 100, 22);
		contentPane.add(lblEmail);
		
		text_6 = new JTextField();
		text_6.setColumns(10);
		text_6.setBounds(144, 241, 159, 20);
		contentPane.add(text_6);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMobile.setBounds(34, 290, 100, 22);
		contentPane.add(lblMobile);
		
		text_7 = new JTextField();
		text_7.setColumns(10);
		text_7.setBounds(144, 292, 159, 20);
		contentPane.add(text_7);
		
		JButton button_2 = new JButton("Update");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String stat;
				stat="completed";
				String stat_1="pending";
				String id;
				id=text_1.getText();
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost/mydb5","root","root");
					PreparedStatement ps=con.prepareStatement("update book_ticket set status= ? where book_id=?");
					ps.setString(1, stat);
					ps.setString(2, id);
					int x=ps.executeUpdate();
					
					if(stat.equals(text_4.getText()))
					{
						text_4.setForeground(new Color(255, 0, 0));
						if(x==0)
						{
							JOptionPane.showMessageDialog(button_2,"Details are not updated.");
						}
						else
						{
							JOptionPane.showMessageDialog(button_2,"Details Updated Successfully.");
						}
					}
					else if(stat_1.equals(text_4.getText()))
					{
						text_4.setForeground(new Color(0, 128,0));
					}
						
					
					
				}
				catch(Exception ae)
				{
					ae.printStackTrace();
				}
				
				
			}
		});
		button_2.setBounds(373, 385, 89, 23);
		contentPane.add(button_2);
		
		JLabel lblTotalSeat = new JLabel("Total Seat");
		lblTotalSeat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotalSeat.setBounds(34, 339, 100, 22);
		contentPane.add(lblTotalSeat);
		
		text_8 = new JTextField();
		text_8.setColumns(10);
		text_8.setBounds(144, 336, 47, 20);
		contentPane.add(text_8);
		
		JButton button_1 = new JButton("Back");
		button_1.setBounds(24, 385, 89, 23);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("Check");
		button_3.addActionListener(new ActionListener() {
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
						text_5.setText(rs.getString(6));
						text_6.setText(rs.getString(9));
						text_7.setText(rs.getString(11));
						text_8.setText(rs.getString(10));
						
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
		button_3.setBounds(373, 26, 89, 23);
		contentPane.add(button_3);
	}

}
