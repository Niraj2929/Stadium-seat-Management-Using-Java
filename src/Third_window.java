import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
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
import java.awt.Toolkit;

public class Third_window extends JFrame {

	private JPanel contentPane;
	private JTextField text_1;
	private JTextField text_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Third_window frame = new Third_window();
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
	public Third_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setTitle("USER LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 268);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 192));
		panel.setBounds(10, 11, 402, 30);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("CHINNASWAMY STADIUM");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 16));
		lblNewLabel_1.setBounds(32, 86, 95, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Serif", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(32, 123, 95, 19);
		contentPane.add(lblNewLabel_1_1);
		
		text_1 = new JTextField();
		text_1.setBounds(137, 87, 127, 20);
		contentPane.add(text_1);
		text_1.setColumns(10);
		
		text_2 = new JTextField();
		text_2.setColumns(10);
		text_2.setBounds(137, 124, 127, 20);
		contentPane.add(text_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text_1.setText("");
				text_2.setText("");
			}
		});
		btnClear.setBounds(32, 181, 89, 23);
		contentPane.add(btnClear);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=text_1.getText();
				String pass=text_2.getText();
				int x=0;
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost/mydb5","root","root");
					PreparedStatement ps=con.prepareStatement("select * from login_2 where UserName=? and Pass=?");	
					ps.setString(1, user);
					ps.setString(2, pass);
					ResultSet rs =ps.executeQuery();
					while(rs.next())
					{
						x++;
					}
					if(x==1)
					{
						JOptionPane.showMessageDialog(btnLogin,"Login Successfully Done");
						Fourth_window frame_1=new Fourth_window();
						frame_1.setVisible(true);
						dispose();
					}
					else if(x>1)
					{
						JOptionPane.showMessageDialog(btnLogin,"Duplicate UserName and Password");
					}
					else
					{
						JOptionPane.showMessageDialog(btnLogin,"Wrong UserName Or Password.");
					}
					
					
					}
				catch(Exception ae)
				{
					ae.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(150, 181, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(307, 181, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=text_1.getText();
				String pass=text_2.getText();
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost/mydb5","root","root");
					PreparedStatement ps=con.prepareStatement("insert into login_2(UserName, Pass) values(?,?)");
					ps.setString(1, user);
					ps.setString(2, pass);
					int x=ps.executeUpdate();
					if(x==0)
					{
						JOptionPane.showMessageDialog(btnRegister, "Unable to Register");
					}
					else
					{
						JOptionPane.showMessageDialog(btnRegister, "Register Successfully Done");
					}
					con.close();
;				}
				catch(Exception ae)
				{
					ae.printStackTrace();
				}
			}
		});
		btnRegister.setBounds(307, 123, 89, 23);
		contentPane.add(btnRegister);
		
		JButton btnNewButton = new JButton("<< Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First_window frame_1=new First_window();
				frame_1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(307, 86, 89, 23);
		contentPane.add(btnNewButton);
	}

}
