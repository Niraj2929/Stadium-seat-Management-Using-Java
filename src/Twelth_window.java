import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Twelth_window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Twelth_window frame = new Twelth_window();
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
	public Twelth_window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Want to update all records?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(28, 31, 299, 31);
		contentPane.add(lblNewLabel);
		
		JButton button_1 = new JButton("Update All");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String stat;
				stat="completed";
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=
					DriverManager.getConnection("jdbc:mysql://localhost/mydb5","root","root");
					PreparedStatement ps=con.prepareStatement("update book_ticket set status= ?");
					ps.setString(1, stat);
					int x=ps.executeUpdate();
					if(x==0)
					{
						JOptionPane.showMessageDialog(button_1,"Unable To Update The Status");
					}
					else
					{
						JOptionPane.showMessageDialog(button_1,"Status Of All Users Updated Successfully");
					}
						
					
					
				}
				catch(Exception ae)
				{
					ae.printStackTrace();
				}
			}
		});
		button_1.setBounds(41, 85, 89, 23);
		contentPane.add(button_1);
		
		JLabel lblWantToUpdate = new JLabel("Want to update particular record?");
		lblWantToUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblWantToUpdate.setBounds(28, 132, 373, 31);
		contentPane.add(lblWantToUpdate);
		
		JButton button_2 = new JButton("Update");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Thirteenth_window frame_1=new Thirteenth_window();
				frame_1.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(41, 184, 89, 23);
		contentPane.add(button_2);
		
		JButton button_2_1 = new JButton("<< Back");
		button_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Eleventh_window frame_1=new Eleventh_window();
				frame_1.setVisible(true);
				dispose();
			}
		});
		button_2_1.setBounds(312, 211, 89, 23);
		contentPane.add(button_2_1);
	}
}
