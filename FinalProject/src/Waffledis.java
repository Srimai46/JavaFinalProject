import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextField;

public class Waffledis extends JFrame {

	private JPanel contentPane;
	private JTextField textCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Waffledis frame = new Waffledis();
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
	public Waffledis() {
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
		
		textCode = new JTextField();
		textCode.setBounds(204, 239, 480, 34);
		contentPane.add(textCode);
		textCode.setColumns(10);
		
		JLabel lblOrder = new JLabel("Promotion Code");
		lblOrder.setVerticalAlignment(SwingConstants.BOTTOM);
		lblOrder.setForeground(new Color(255, 132, 72));
		lblOrder.setFont(new Font("Yu Mincho", Font.BOLD, 60));
		lblOrder.setBounds(217, 32, 530, 137);
		contentPane.add(lblOrder);
		
		JLabel lblNewLabel_2_1 = new JLabel("***You can redeem code only 1 time per day.");
		lblNewLabel_2_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Yu Mincho", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(206, 256, 459, 90);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblEnterPromotionCode = new JLabel("Redeem Promotion Code");
		lblEnterPromotionCode.setVerticalAlignment(SwingConstants.BOTTOM);
		lblEnterPromotionCode.setForeground(new Color(255, 132, 72));
		lblEnterPromotionCode.setFont(new Font("Yu Mincho", Font.BOLD, 24));
		lblEnterPromotionCode.setBounds(204, 206, 530, 40);
		contentPane.add(lblEnterPromotionCode);
		
		JButton btnCode_Back = new JButton("Back");
		btnCode_Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCode_Back.setForeground(new Color(255, 132, 72));
		btnCode_Back.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnCode_Back.setBackground(Color.WHITE);
		btnCode_Back.setBounds(648, 574, 194, 52);
		contentPane.add(btnCode_Back);
		
		JButton btnCheckBill = new JButton("Check bill");
		btnCheckBill.setFont(new Font("Yu Mincho", Font.BOLD, 28));
		btnCheckBill.setForeground(new Color(255, 132, 72));
		btnCheckBill.setBackground(new Color(255, 255, 255));
		btnCheckBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnCheckBill.setBounds(418, 574, 194, 52);
		contentPane.add(btnCheckBill);
		
		textCode = new JTextField();
		textCode.setBounds(204, 239, 480, 34);
		contentPane.add(textCode);
		textCode.setColumns(10);
	}
}