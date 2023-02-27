import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Waffletotal extends JFrame {
	
	private JPanel contentPane;
	
	
	private String[] menu = {"-", "Corn", "Crab strick", "Currant", "Foytong", "Pumpkin", "Coconut", "Taro", "Purple Sweet Potato", "Banana", "Chocolate chip", "Ham", "Cheddar Cheese", "Strawberryy Yam"};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffletotal frame = new Waffletotal();
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
	
	public Waffletotal() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\D4bby\\Downloads\\0d1e70fd160476a3f78496be79e0813e.png"));
		setTitle("Waffle Nanoom");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(254, 251, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblQueue = new JLabel("Queue : 1");
		lblQueue.setForeground(new Color(255, 132, 72));
		lblQueue.setFont(new Font("Yu Mincho", Font.BOLD, 24));
		lblQueue.setBounds(746, 10, 130, 52);
		contentPane.add(lblQueue);

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
		
				
		JLabel lblOrder = new JLabel("size---------------------------------------------------------price.");
		lblOrder.setVerticalAlignment(SwingConstants.BOTTOM);
		lblOrder.setForeground(new Color(255, 132, 72));
		lblOrder.setFont(new Font("Yu Mincho", Font.BOLD, 60));
		lblOrder.setBounds(373, 31, 194, 137);
		contentPane.add(lblOrder);
		
		JLabel lblSize = new JLabel(topping1+" "+topping2);
		//JLabel lblSize = new JLabel("1. {size}\r\n--------------------------------------------Price.");
		lblSize.setFont(new Font("Yu Mincho", Font.PLAIN, 22));
		lblSize.setBounds(73, 151, 620, 102);
		contentPane.add(lblSize);

		JLabel Total_Price = new JLabel("Total Price : {total}");
		Total_Price.setFont(new Font("Yu Mincho", Font.PLAIN, 22));
		Total_Price.setBounds(85, 474, 393, 102);
		contentPane.add(Total_Price);

		JLabel flout = new JLabel("- {flour}\r\n");
		flout.setFont(new Font("Yu Mincho", Font.PLAIN, 22));
		flout.setBounds(152, 217, 620, 102);
		contentPane.add(flout);

		JLabel topping = new JLabel("- {topping}\r\n--------------------------------Price.");
		topping.setFont(new Font("Yu Mincho", Font.PLAIN, 22));
		topping.setBounds(152, 288, 620, 102);
		contentPane.add(topping);

		JLabel discount = new JLabel("Discount : {discount}");
		discount.setFont(new Font("Yu Mincho", Font.PLAIN, 22));
		discount.setBounds(85, 423, 393, 102);
		contentPane.add(discount);

		JLabel Total = new JLabel("Total : {total}");
		Total.setFont(new Font("Yu Mincho", Font.PLAIN, 22));
		Total.setBounds(84, 373, 393, 102);
		contentPane.add(Total);
		
		JButton btnbill_Close = new JButton("Close");
		btnbill_Close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnbill_Close.setForeground(new Color(255, 132, 72));
		btnbill_Close.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnbill_Close.setBackground(Color.WHITE);
		btnbill_Close.setBounds(648, 574, 194, 52);
		btnbill_Close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnbill_Close);

	}
	
	
}