import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class WaffleDemo extends JFrame {


 public static void main (String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
    	WaffleDemo frame = new WaffleDemo();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 public WaffleDemo() {
  setTitle("Waffle Nanoom");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 900, 700);
  JPanel contentPane = new JPanel();
  contentPane.setForeground(new Color(0, 0, 0));
  contentPane.setBackground(new Color(254, 251, 205));
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

  setContentPane(contentPane);
  contentPane.setLayout(null);

  JLabel lblNewLabel = new JLabel("Waffle Nanoom");
  lblNewLabel.setForeground(new Color(255, 132, 72));
  lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
  lblNewLabel.setFont(new Font("Yu Mincho", Font.BOLD, 60));
  lblNewLabel.setBounds(221, 41, 473, 137);
  contentPane.add(lblNewLabel);

  JButton btnNewButton = new JButton("Order");
  btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
  btnNewButton.setFont(new Font("Yu Mincho", Font.BOLD, 20));
  btnNewButton.setForeground(new Color(255, 132, 72));
  btnNewButton.setBackground(new Color(255, 255, 255));
  btnNewButton.addActionListener(new ActionListener() { 
   public void actionPerformed(ActionEvent arg0) {
	   Waffle1 order = new Waffle1();
    order.show();

    dispose();
   }
  });

  btnNewButton.setBounds(137, 531, 194, 52);
  contentPane.add(btnNewButton);

  JLabel lblNewLabel_1 = new JLabel("");
  lblNewLabel_1.setIcon(new ImageIcon(WaffleDemo.class.getResource("/resource/0d1e70fd160476a3f78496be79e0813e-300x300.png")));
  lblNewLabel_1.setBounds(285, 142, 285, 376);
  contentPane.add(lblNewLabel_1);

  JButton btnClose = new JButton("Close");

  btnClose.setVerticalAlignment(SwingConstants.BOTTOM);
  btnClose.setForeground(new Color(255, 132, 72));
  btnClose.setFont(new Font("Yu Mincho", Font.BOLD, 20));
  btnClose.setBackground(Color.WHITE);
  btnClose.setBounds(573, 531, 194, 52);
  btnClose.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    System.exit(0);
   }
  });

  contentPane.add(btnClose);
 }
}