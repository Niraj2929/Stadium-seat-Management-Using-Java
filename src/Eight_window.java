import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import java.awt.print.*;
import javax.swing.JTextArea;
import java.awt.Toolkit;


public class Eight_window extends JFrame {

	private JPanel contentPane;
	public static JTextField text_41;
	public static JTextField text_42;
	public static JTextField text_43;
	public static JTextField text_44;
	public static JTextField text_45;
	public static JTextField text_46;
	public static JTextField text_47;
	public static JTextField text_48;
	public static JTextField text_49;
	public static JTextField text_50;
	public static JTextField text_51;
	public JTextArea ticket = new JTextArea();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eight_window frame = new Eight_window();
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
	public Eight_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setTitle("VERIFY DETAILS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 676);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Booking ID");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel.setBounds(36, 78, 86, 20);
		contentPane.add(lblNewLabel);
		
		JLabel text = new JLabel("UserName");
		text.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text.setBounds(36, 123, 86, 20);
		contentPane.add(text);
		
		JLabel text_53_1 = new JLabel("Seat Type");
		text_53_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text_53_1.setBounds(36, 169, 86, 20);
		contentPane.add(text_53_1);
		
		JLabel text_53_1_1 = new JLabel("No. Of Seats");
		text_53_1_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text_53_1_1.setBounds(36, 216, 106, 20);
		contentPane.add(text_53_1_1);
		
		JLabel text_53_1_2 = new JLabel("Email");
		text_53_1_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text_53_1_2.setBounds(36, 265, 86, 20);
		contentPane.add(text_53_1_2);
		
		JLabel text_53_2 = new JLabel("Match Date");
		text_53_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text_53_2.setBounds(36, 313, 86, 20);
		contentPane.add(text_53_2);
		
		JLabel text_53 = new JLabel("Phone");
		text_53.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text_53.setBounds(36, 360, 86, 20);
		contentPane.add(text_53);
		
		JLabel text_53_3 = new JLabel("Game");
		text_53_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text_53_3.setBounds(36, 405, 106, 20);
		contentPane.add(text_53_3);
		
		JLabel text_53_4 = new JLabel("Booking Date");
		text_53_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text_53_4.setBounds(36, 503, 106, 20);
		contentPane.add(text_53_4);
		
		JLabel text_53_5 = new JLabel("Price");
		text_53_5.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text_53_5.setBounds(36, 454, 86, 20);
		contentPane.add(text_53_5);
		
		JLabel text_53_3_1 = new JLabel("Booking Time");
		text_53_3_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		text_53_3_1.setBounds(36, 546, 106, 20);
		contentPane.add(text_53_3_1);
		
		JButton button_7 = new JButton("Book");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id=text_41.getText();
				String name=text_42.getText();
				String type=text_43.getText();
				String number=text_44.getText();
				String emli=text_45.getText();
				String date_match=text_46.getText();
				String phone=text_47.getText();
				String game=text_48.getText();
				String price=text_49.getText();
				String date=text_50.getText();
				String time=text_51.getText();
				String status="pending";
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost/mydb5","root","root");
					PreparedStatement ps=con.prepareStatement("insert into book_ticket(book_id,user_name,game,book_date,match_date,price,time,status,email,mobile,total) values(?,?,?,?,?,?,?,?,?,?,?)");
					ps.setString(1, id);
					ps.setString(2, name);
					ps.setString(3, game);
					ps.setString(4, date);
					ps.setString(5, date_match);
					ps.setString(6, price);
					ps.setString(7, time);
					ps.setString(8, status);
					ps.setString(9, emli);
					ps.setString(10, phone);
					ps.setString(11, number);
					int x=ps.executeUpdate();
					if(x==0)
					{
						JOptionPane.showMessageDialog(button_7, "Unable to 	Book ticket");
					}
					else
					{
						JOptionPane.showMessageDialog(button_7, "Ticket Booket Successfully");
					}
;				}
				catch(Exception ae)
				{
					ae.printStackTrace();
				}
			Ninth_window frame=new Ninth_window();
			frame.setVisible(true);
			dispose();
			}
		});
		button_7.setBounds(447, 603, 89, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("Back");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Seventh_window frame=new Seventh_window();
			frame.setVisible(true);
			dispose();
			}
		});
		button_8.setBounds(36, 603, 89, 23);
		contentPane.add(button_8);
		
		text_41 = new JTextField();
		Seventh_window data2=new Seventh_window();
		text_41.setText(data2.id);
		text_41.setBounds(200, 81, 106, 20);
		contentPane.add(text_41);
		text_41.setColumns(10);
		
		text_42 = new JTextField();
		Seventh_window data=new Seventh_window();
		text_42.setText(data.name);
		text_42.setColumns(10);
		text_42.setBounds(200, 123, 120, 20);
		contentPane.add(text_42);
		
		text_43 = new JTextField();
		Seventh_window data5=new Seventh_window();
		text_43.setText(data5.seat_type);
		text_43.setColumns(10);
		text_43.setBounds(200, 172, 106, 20);
		contentPane.add(text_43);
		
		text_44 = new JTextField();
		Seventh_window data4=new Seventh_window();
		text_44.setText(data4.seat);
		text_44.setColumns(10);
		text_44.setBounds(200, 219, 106, 20);
		contentPane.add(text_44);
		
		text_45 = new JTextField();
		Seventh_window data1=new Seventh_window();
		text_45.setText(data1.email);
		text_45.setColumns(10);
		text_45.setBounds(200, 268, 184, 20);
		contentPane.add(text_45);
		
		text_46 = new JTextField();
		Seventh_window data8=new Seventh_window();
		text_46.setText(data8.md);
		text_46.setColumns(10);
		text_46.setBounds(200, 316, 120, 20);
		contentPane.add(text_46);
		
		text_47 = new JTextField();
		Seventh_window data9=new Seventh_window();
		text_47.setText(data9.mobile);
		text_47.setColumns(10);
		text_47.setBounds(200, 363, 106, 20);
		contentPane.add(text_47);
		
		text_48 = new JTextField();
		Seventh_window data10=new Seventh_window();
		text_48.setText(data10.match);
		text_48.setColumns(10);
		text_48.setBounds(200, 408, 184, 20);
		contentPane.add(text_48);
		
		text_49 = new JTextField();
		Seventh_window data11=new Seventh_window();
		text_49.setText(data11.fair);
		text_49.setColumns(10);
		text_49.setBounds(200, 457, 75, 20);
		contentPane.add(text_49);
		
		text_50 = new JTextField();
		Seventh_window data6=new Seventh_window();
		text_50.setText(data6.book_date);
		text_50.setColumns(10);
		text_50.setBounds(200, 506, 106, 20);
		contentPane.add(text_50);
		
		text_51 = new JTextField();
		Seventh_window data7=new Seventh_window();
		text_51.setText(data7.time);
		text_51.setColumns(10);
		text_51.setBounds(200, 549, 106, 20);
		contentPane.add(text_51);
		
		JButton receipt = new JButton("Reciept");
		receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				    if (! ticket.print()) {
				        System.err.println("User cancelled printing");
				    }
				} catch (java.awt.print.PrinterException e1) {
				    System.err.format("Cannot print %s%n", e1.getMessage());
				}

			}
		});
		receipt.setBounds(447, 520, 89, 23);
		contentPane.add(receipt);
		
		
		ticket.setBounds(547, 140, 433, 486);
		contentPane.add(ticket);
		ticket.setText("~~~~Your Ticket~~~");
	}
}
