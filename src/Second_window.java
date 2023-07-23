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
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class Second_window extends JFrame {

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
					Second_window frame = new Second_window();
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
	public Second_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setTitle("ADMIN LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 244);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("TextPane.border"));
		panel.setBackground(new Color(128, 128, 192));
		panel.setBounds(10, 11, 414, 32);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("CHINNASWAMY STADIUM");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 16));
		lblNewLabel_1.setBounds(27, 82, 100, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Serif", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(27, 118, 100, 22);
		contentPane.add(lblNewLabel_1_1);
		
		text_1 = new JTextField();
		text_1.setBounds(150, 85, 108, 20);
		contentPane.add(text_1);
		text_1.setColumns(10);
		
		text_2 = new JTextField();
		text_2.setColumns(10);
		text_2.setBounds(150, 121, 108, 20);
		contentPane.add(text_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text_1.setText("");
				text_2.setText("");
			}
		});
		btnClear.setBounds(27, 171, 89, 23);
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
					PreparedStatement ps=con.prepareStatement("select * from login_1 where UserName=? and Pass=?");
					ps.setString(1, user);
					ps.setString(2, pass);
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
						x++;
					}
					if(x==1)
					{
						JOptionPane.showMessageDialog(btnLogin,"Login Successfully Done");
						Fifth_window frame_1=new Fifth_window();
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
					con.close();
					
					
				}
				catch(Exception ae)
				{
					ae.printStackTrace();
				}
			}
		});
		btnLogin.setBounds(150, 171, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(304, 171, 89, 23);
		contentPane.add(btnExit);
		
		JButton btnNewButton = new JButton("<< Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First_window frame_1=new First_window();
				frame_1.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(304, 103, 89, 23);
		contentPane.add(btnNewButton);
	}

}
