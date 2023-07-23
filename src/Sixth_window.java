import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Sixth_window extends JFrame {

	private JPanel contentPane;
	private JTable table;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sixth_window frame = new Sixth_window();
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
	public Sixth_window() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setTitle("SCHEDULE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        String[] columns = new String[] {
                "Date", "Time(IST)", "Match", "Venue"
            };
             
            //actual data for the table in a 2d array
            Object[][] data = new Object[][] {
                {"30 October, Sunday", "12:30 PM", "Pakistan vs Netherlands", "Perth Stadium, Perth"},
                {"30 October, Sunday", "4:30 PM", "India vs South Africa", "Perth Stadium, Perth"},
                {"31 October, Sunday", "1:30 PM", "Australia vs Ireland", "The Gabba, Brisbane"},
                {"1 November, Tuesday", "9:30 AM", "Afghanistan vs Sri Lanka", "The Gabba, Brisbane"},
                {"1 November, Tuesday", "1:30 PM", "England vs New Zealand", "The Gabba, Brisbane"},
                {"2 November, Wednesday", "9:30 PM", "Zimbabwe vs Netherlands", "Adelaide Oval, Adelaide"},
                {"2 November, Wednesday", "1:30 PM", "India vs Bangladesh", "Adelaide Oval, Adelaide"},
                {"3 November, Thursday", "1:30 PM", "Pakistan vs South Africa", "Sydney Cricket Ground, Sydney"},
                {"4 November, Friday", "9:30 AM", "Australia vs Afghanistan", "Adelaide Oval, Adelaide"},
                {"5 November, Saturday", "1:30 PM", "England vs Sri Lanka", "Sydney Cricket Ground, Sydney"},
                {"6 November, Sunday", "5:30 AM	", "South Africa vs Netherlands", "	Adelaide Oval, Adelaide"},   
            };
		
         JTable table = new JTable(data, columns);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 614, 171);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fourth_window frame=new Fourth_window();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(10, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Book Ticket");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seventh_window frame=new Seventh_window();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(473, 214, 132, 23);
		contentPane.add(btnNewButton_1);
	}

}
