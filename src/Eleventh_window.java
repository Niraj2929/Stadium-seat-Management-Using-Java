import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JScrollPane;
import java.awt.Toolkit;

public class Eleventh_window extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JButton button_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleventh_window frame = new Eleventh_window();
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
	public Eleventh_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 686, 202);
		contentPane.add(scrollPane_1);
		
		scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		
		JButton btnNewButton = new JButton("Display");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost/mydb5","root","root");
					Statement ps=con.createStatement();
					String query="select * from book_ticket";
					ResultSet rs=ps.executeQuery(query);
					java.sql.ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel) table_1.getModel();
					
					int cols=rsmd.getColumnCount();
					String[] column=new String[cols];
					for(int i=0;i<cols;i++)
					{
						column[i]=rsmd.getColumnName(i+1);
					}
					model.setColumnIdentifiers(column);
					String Id, name, game, date, match, price, time, status, email, number, mobile;
					while(rs.next())
					{
						Id=rs.getString(1);
						name=rs.getString(2);
						game=rs.getString(3);
						date=rs.getString(4);
						match=rs.getString(5);
						price=rs.getString(6);
						time=rs.getString(7);
						status=rs.getString(8);
						email=rs.getString(9);
						number=rs.getString(10);
						mobile=rs.getString(11);
						String[] row= {Id, name,game, date, match, price, time, status, email, number, mobile};
						model.addRow(row);
					}
					ps.close();
					con.close();
					
					
					
					
					
					
				}
				catch(Exception ae)
				{
					ae.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(182, 224, 89, 23);
		contentPane.add(btnNewButton);
		
		button_3 = new JButton("Update Status");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Twelth_window frame_1=new Twelth_window();
				frame_1.setVisible(true);
				dispose();
				
				
				
			}
		});
		button_3.setBounds(182, 272, 106, 23);
		contentPane.add(button_3);
		
		btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				model.setRowCount(0);
			}
		});
		btnNewButton_2.setBounds(44, 249, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_3.setBounds(23, 330, 89, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Print");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    if (! table_1.print()) {
				        System.err.println("User cancelled printing");
				    }
				} catch (java.awt.print.PrinterException e1) {
				    System.err.format("Cannot print %s%n", e1.getMessage());
				}
			}
		});
		btnNewButton_4.setBounds(594, 330, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
