import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Waffle3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffle3 frame = new Waffle3();
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
	public Waffle3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\D4bby\\Downloads\\0d1e70fd160476a3f78496be79e0813e.png"));
		setTitle("Waffle Nanoom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(254, 251, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSmall = new JLabel("Small");
		lblSmall.setForeground(new Color(255, 132, 72));
		lblSmall.setFont(new Font("Yu Mincho", Font.BOLD, 60));
		lblSmall.setBackground(new Color(255, 132, 72));
		lblSmall.setBounds(367, 24, 330, 117);
		contentPane.add(lblSmall);
		
		JLabel lblTopping = new JLabel("Topping :");
		lblTopping.setForeground(new Color(255, 132, 72));
		lblTopping.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping.setBackground(new Color(255, 132, 72));
		lblTopping.setBounds(91, 280, 163, 54);
		contentPane.add(lblTopping);
		
		JComboBox small_Topping1 = new JComboBox();
		small_Topping1.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		small_Topping1.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		small_Topping1.setToolTipText("");
		small_Topping1.setBounds(264, 288, 330, 30);
		contentPane.add(small_Topping1);
		
		JRadioButton small_origin = new JRadioButton("Original");
		small_origin.setHorizontalAlignment(SwingConstants.CENTER);
		small_origin.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_origin.setBackground(new Color(254, 251, 205));
		small_origin.setForeground(new Color(255, 132, 72));
		small_origin.setBounds(301, 141, 149, 40);
		contentPane.add(small_origin);
		
		JRadioButton small_Choc = new JRadioButton("Chocolate");
		small_Choc.setHorizontalAlignment(SwingConstants.CENTER);
		small_Choc.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Choc.setBackground(new Color(254, 251, 205));
		small_Choc.setForeground(new Color(255, 132, 72));
		small_Choc.setBounds(548, 188, 210, 93);
		contentPane.add(small_Choc);
		
		JRadioButton small_Strawberry = new JRadioButton("Strawberry");
		small_Strawberry.setHorizontalAlignment(SwingConstants.CENTER);
		small_Strawberry.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Strawberry.setBackground(new Color(254, 251, 205));
		small_Strawberry.setForeground(new Color(255, 132, 72));
		small_Strawberry.setBounds(295, 202, 202, 65);
		contentPane.add(small_Strawberry);
		
		JRadioButton small_Green = new JRadioButton("Green Tea");
		small_Green.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Green.setHorizontalAlignment(SwingConstants.CENTER);
		small_Green.setBackground(new Color(254, 251, 205));
		small_Green.setForeground(new Color(255, 132, 72));
		small_Green.setBounds(551, 133, 202, 57);
		contentPane.add(small_Green);
		
		JLabel lblFlour = new JLabel("Flour :");
		lblFlour.setForeground(new Color(255, 132, 72));
		lblFlour.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblFlour.setBackground(new Color(255, 132, 72));
		lblFlour.setBounds(137, 128, 119, 65);
		contentPane.add(lblFlour);
		
		
		
		JLabel lblTopping_2 = new JLabel("Topping :");
		lblTopping_2.setForeground(new Color(255, 132, 72));
		lblTopping_2.setFont(new Font("Yu Mincho", Font.BOLD, 32));
		lblTopping_2.setBackground(new Color(255, 132, 72));
		lblTopping_2.setBounds(91, 335, 163, 54);
		contentPane.add(lblTopping_2);
		
		JComboBox small_Topping2 = new JComboBox();
		small_Topping2.setModel(new DefaultComboBoxModel(new String[] {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"}));
		small_Topping2.setToolTipText("");
		small_Topping2.setFont(new Font("Yu Mincho", Font.BOLD, 26));
		small_Topping2.setBounds(264, 351, 330, 30);
		contentPane.add(small_Topping2);
		
		JLabel lblNewLabel = new JLabel("Waffle Nanoom");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setForeground(new Color(255, 132, 72));
		lblNewLabel.setFont(new Font("Yu Mincho", Font.BOLD, 18));
		lblNewLabel.setBounds(85, 586, 163, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\D4bby\\OneDrive\\เดสก์ท็อป\\photo gui\\0d1e70fd160476a3f78496be79e0813e-65x75.png"));
		lblNewLabel_1.setBounds(10, 551, 65, 75);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPer = new JLabel("10 ฿ per topping");
		lblPer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPer.setForeground(new Color(255, 132, 72));
		lblPer.setFont(new Font("Yu Mincho", Font.BOLD, 16));
		lblPer.setBackground(new Color(255, 132, 72));
		lblPer.setBounds(301, 396, 257, 54);
		contentPane.add(lblPer);
		
		JButton small_Next = new JButton("Next");
		small_Next.setVerticalAlignment(SwingConstants.BOTTOM);
		small_Next.setForeground(new Color(255, 132, 72));
		small_Next.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Next.setBackground(Color.WHITE);
		small_Next.setBounds(418, 574, 194, 52);
		contentPane.add(small_Next);
		
		JButton small_Back = new JButton("Back");
		small_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		small_Back.setVerticalAlignment(SwingConstants.BOTTOM);
		small_Back.setForeground(new Color(255, 132, 72));
		small_Back.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		small_Back.setBackground(Color.WHITE);
		small_Back.setBounds(648, 574, 194, 52);
		contentPane.add(small_Back);
		
		
	}
}
