import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;

import javax.swing.*;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.components.JSpinField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.util.*;
import java.awt.Toolkit;

public class Seventh_window extends JFrame {

	private JPanel contentPane;
	public JTextField text_1;
	public JTextField text_2;
	public JTextField text_7;
	public JTextField text_8;
	public JTextField text_9;
	public JTextField text_10;
	public JTextField text_11;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public JTextField text_12;
	public String name, book_date, email, phone, date, time, mobile, match, fair;
	java.util.Date match_date;
	public String id, seat, seat_type, md;
	public String str;
	public int number, price, number_1;
	public final JList list = new JList();
	public final JDateChooser text_3 = new JDateChooser();
	public static JLabel text_99;
	public int a;
	private JTextField text_100;
	public int value;
	public static String total, total_2;
	public static int total_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seventh_window frame = new Seventh_window();
					frame.setVisible(true);

				}catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Seventh_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setTitle("BOOK TICKET");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 694);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setForeground(new Color(255, 69, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel.setBounds(29, 39, 96, 18);
		contentPane.add(lblNewLabel);
		
		text_1 = new JTextField();
		name=text_1.getText();
		text_1.setBounds(158, 40, 112, 20);
		contentPane.add(text_1);
		text_1.setColumns(10);
		
		JLabel lblGame = new JLabel("Game");
		lblGame.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblGame.setBounds(29, 83, 96, 18);
		contentPane.add(lblGame);
		
		JLabel lblBookingDate = new JLabel("Match Date");
		lblBookingDate.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblBookingDate.setBounds(29, 133, 96, 18);
		contentPane.add(lblBookingDate);
		
		JLabel lblNewLabel_1 = new JLabel("SeatType");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(29, 194, 96, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("No. Of Seats");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2.setBounds(29, 275, 96, 18);
		contentPane.add(lblNewLabel_2);
		
		text_2 = new JTextField();
		text_2.setColumns(10);
		text_2.setBounds(318, 84, 229, 20);
		contentPane.add(text_2);
		
		
		text_3.setDateFormatString("yyyy-MM-dd");
		text_3.setBounds(159, 133, 152, 20);
		contentPane.add(text_3);
		
		DefaultListModel listModel = new DefaultListModel();
		for(int i=1;i<=10;i++)
		{
			listModel.addElement(i);
		}
		
		JRadioButton text_4 = new JRadioButton("Local Seat");
		buttonGroup.add(text_4);
		text_4.setBounds(158, 194, 109, 23);
		contentPane.add(text_4);
		
		JRadioButton text_5 = new JRadioButton("VIP Seat");
		buttonGroup.add(text_5);
		text_5.setBounds(158, 232, 109, 23);
		contentPane.add(text_5);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email");
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(29, 327, 96, 18);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Phone");
		lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(29, 371, 96, 18);
		contentPane.add(lblNewLabel_2_2);
		
		text_7 = new JTextField();
		text_7.setColumns(10);
		text_7.setBounds(156, 328, 188, 20);
		contentPane.add(text_7);
		
		text_8 = new JTextField();
		text_8.setText("0");
		text_8.setColumns(10);
		text_8.setBounds(156, 372, 112, 20);
		contentPane.add(text_8);
		
		JButton button_3 = new JButton("OTP");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int otp[]=new int[6];
				int a, b;
				
				for(int i=0;i<6;i++)
				{
					otp[i]=new Random().nextInt(9);
				}
			  StringBuilder builder = new StringBuilder();
			  for (int num : otp)
			  {
			   builder.append(num);
			  }
				a=Integer.parseInt(builder.toString());
				str=Integer.toString(a);
				/*b=Integer.parseInt(text_8.getText().toString());*/
				if(text_8.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(button_3,"Please Enter Mobile Number To Get Booking ID.");
				}

				/*else if(b!=10)
				{
					Integer.toString(b);
					JOptionPane.showMessageDialog(button_3,"Please Enter 10 digit number");
				}*/
				
				else
				{
					
					JOptionPane.showMessageDialog(button_3,"Your Booking ID is: "+str);
					text_9.setText(str);
					DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
					LocalDate now = LocalDate.now();  
					text_10.setText(date.format(now));
					DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");  
					LocalTime now1 = LocalTime.now();
					text_11.setText(time.format(now1));
				}
				
				
			}
		});
		button_3.setBounds(296, 371, 89, 23);
		contentPane.add(button_3);
		
		text_9 = new JTextField();
		text_9.setBounds(158, 432, 112, 20);
		contentPane.add(text_9);
		text_9.setColumns(10);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Booking ID");
		lblNewLabel_2_2_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2_2_1.setBounds(29, 432, 96, 18);
		contentPane.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Booking Date");
		lblNewLabel_2_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2_2_1_1.setBounds(29, 482, 96, 18);
		contentPane.add(lblNewLabel_2_2_1_1);
		
		text_10 = new JTextField();
		text_10.setColumns(10);
		text_10.setBounds(158, 483, 112, 20);
		contentPane.add(text_10);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Booking Time");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_2_2_1_1_1.setBounds(29, 544, 96, 18);
		contentPane.add(lblNewLabel_2_2_1_1_1);
		
		text_11 = new JTextField();
		text_11.setColumns(10);
		text_11.setBounds(156, 545, 112, 20);
		contentPane.add(text_11);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text_1.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(btnProceed, "Please fill all the UserName feild");
				}
				else if(text_2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(btnProceed, "Please fill the Game feild ");
				}
				else if(text_7.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(btnProceed, "Please fill the phone number");
				}
				else
				{
					JOptionPane.showMessageDialog(btnProceed, "Details filled successfully");
					name=text_1.getText();
					Eight_window frame=new Eight_window();
					Eight_window.text_42.setText(text_1.getText());
					frame.setVisible(true);
					email=text_7.getText();
					Eight_window.text_45.setText(text_7.getText());
					frame.setVisible(true);
					id=text_9.getText();
					Eight_window.text_41.setText(text_9.getText());
					frame.setVisible(true);
					seat=Integer.toString(number);
					Eight_window.text_44.setText((String)list.getSelectedValue());
					frame.setVisible(true);
					seat_type=text_12.getText();
					Eight_window.text_43.setText(text_12.getText());
					frame.setVisible(true);
					book_date=text_10.getText();
					Eight_window.text_50.setText(text_10.getText());
					frame.setVisible(true);
					time=text_11.getText();
					Eight_window.text_51.setText(text_11.getText());
					frame.setVisible(true);
					mobile=text_8.getText();
					Eight_window.text_47.setText(text_8.getText());
					frame.setVisible(true);
					match=text_2.getText();
					Eight_window.text_48.setText(text_2.getText());
					frame.setVisible(true);
					int value;
					value=list.getSelectedIndex();
					price=(value+1)*4500;
					fair=String.valueOf(price);
					Eight_window.text_49.setText(fair);
					frame.setVisible(true);
					DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
					md=df.format(text_3.getDate());
					Eight_window.text_46.setText(df.format(text_3.getDate()));
					frame.setVisible(true);
					try
					{
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=
						DriverManager.getConnection("jdbc:mysql://localhost/mydb5","root","root");
						PreparedStatement ps=con.prepareStatement("update total_seats set seats=? where id=?");
						total_1=Integer.parseInt(total)-(value+1);
						total_2=Integer.toString(total_1);
						ps.setInt(2, 1);
						ps.setString(1, total_2);
						int x=ps.executeUpdate();
						con.close();
						
	;				}
	
					catch(Exception ae)
					{
						ae.printStackTrace();
					}
					dispose();
				}
				
			}
		});
		btnProceed.setBounds(255, 605, 89, 23);
		contentPane.add(btnProceed);
		
		JLabel lblNewLabel_3 = new JLabel("(Please Enter 10 digit Number)");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblNewLabel_3.setBounds(395, 375, 152, 14);
		contentPane.add(lblNewLabel_3);
		
		text_12 = new JTextField();
		text_12.setFont(new Font("Tahoma", Font.ITALIC, 9));
		text_12.setText("Select Your Option");
		text_12.setColumns(10);
		text_12.setBounds(388, 212, 123, 22);
		contentPane.add(text_12);
		
		JButton btnClick = new JButton("Click");
		btnClick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(text_4.isSelected()==true)
				{
					text_12.setText("Local Seat");
				}
				
				if(text_5.isSelected()==true)
				{
					text_12.setText("VIP Seat");
				}
			}
		});
		btnClick.setBounds(273, 211, 89, 23);
		contentPane.add(btnClick);
		Vector data=new Vector();
	      data = new Vector();
	      data.addElement("1");
	      data.addElement("2");
	      data.addElement("3");
	      data.addElement("4");
	      data.addElement("5");
	      data.addElement("6");
	      data.addElement("7");
	      data.addElement("8");
	      data.addElement("9");
	      data.addElement("10");
	      
	      JScrollPane scrollPane = new JScrollPane();
	      scrollPane.setBounds(170, 275, 123, 42);
	      contentPane.add(scrollPane);
	      scrollPane.setViewportView(list);
	      list.setListData(data);
	      list.setSelectedIndex(0);
	      
	      JLabel lblNewLabel_4 = new JLabel("Available Seats");
	      lblNewLabel_4.setBounds(367, 22, 89, 14);
	      contentPane.add(lblNewLabel_4);
	     
	      JLabel text_99 = new JLabel(" ");
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost/mydb5","root","root");
				PreparedStatement ps=con.prepareStatement("select * from total_seats where id=1");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					total=rs.getString("seats");
				}
				con.close();
				a=Integer.parseInt(total);
				if(a>50)
				{
					text_99.setForeground(new Color(0, 128, 0));
					text_99.setText(total);
				}
				else if(a<50)
				{
					text_99.setForeground(new Color(255, 0, 0));
					text_99.setText(total);
					
				}
			}
			catch(Exception ae)
			{
				ae.printStackTrace();
			}
	      text_99.setBounds(475, 22, 46, 14);
	      contentPane.add(text_99);
	      
	      text_100 = new JTextField();
	      text_100.setBounds(448, 276, 86, 20);
	      contentPane.add(text_100);
	      text_100.setColumns(10);
	      
	      JButton button_100 = new JButton("Total Price");
	      button_100.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
				value=list.getSelectedIndex();
				price=(value+1)*4500;
				fair=String.valueOf(price);
				text_100.setText(fair);
	      		
	      	}
	      });
	      button_100.setBounds(316, 275, 112, 23);
	      contentPane.add(button_100);
	      
	      String game[]= { "Cricket","Football","Kabbadi"};
	      
	      JScrollPane scrollPane_1 = new JScrollPane();
	      scrollPane_1.setBounds(158, 83, 123, 39);
	      contentPane.add(scrollPane_1);
	      JList list_1 = new JList(game);
	      scrollPane_1.setViewportView(list_1);
	      list_1.setSelectedIndex(0);
	      number_1=list_1.getSelectedIndex();
		
	}
}
