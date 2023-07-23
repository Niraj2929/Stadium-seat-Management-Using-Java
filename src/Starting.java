import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.Toolkit;
import java.awt.Font;

public class Starting extends JFrame {

	private JPanel contentPane;
	private static JTextField text_22;
	private static JProgressBar progress;
	private static JTextField text_21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		int x;
		Starting frame = new Starting();
		frame.setVisible(true);
		try {
			for( x=0;x<=100;x++)
			{
				text_21.setText(Integer.toString(x)+"%");
				Starting.progress.setValue(x);
				Thread.sleep(100);
			}
		}
		catch(Exception ae)
		{
			ae.printStackTrace();
		}
		First_window frame1=new First_window();
		frame1.setVisible(true);
		frame.dispose();
					
					
				
	}
	public Starting() {
		setTitle("STADIUM SEAT BOOKING SYSTEM");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\NIRAJ\\Downloads\\WhatsApp Image 2022-10-30 at 9.05.39 PM.jpeg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Loading");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/images/seat.jpg")));
		lblNewLabel.setBounds(0, 0, 598, 399);
		contentPane.add(lblNewLabel);
		
		text_22 = new JTextField();
		text_22.setForeground(new Color(128, 0, 0));
		text_22.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 14));
		text_22.setBackground(new Color(154, 205, 50));
		text_22.setText("LOADING....");
		text_22.setBounds(0, 400, 506, 20);
		contentPane.add(text_22);
		text_22.setColumns(10);
		
		progress = new JProgressBar();
		progress.setBounds(0, 422, 597, 25);
        progress.setBackground(Color.WHITE);
        progress.setForeground(new Color(0, 0, 255));
        progress.setValue(0);
		contentPane.add(progress);
		
		
		text_21 = new JTextField();
		text_21.setHorizontalAlignment(SwingConstants.CENTER);
		text_21.setFont(new Font("Tahoma", Font.BOLD, 14));
		text_21.setBackground(new Color(0, 0, 0));
		text_21.setText("0%");
		text_21.setForeground(new Color(255, 0, 0));
		text_21.setBounds(505, 401, 93, 20);
		contentPane.add(text_21);
		text_21.setColumns(10);
		
	}
}
