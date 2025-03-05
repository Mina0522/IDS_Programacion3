import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;

public class CalculadoraDos {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculadora");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		JLabel label = new JLabel("Titulo");
		
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(5, 4));
		
		String c1 = "#BFBA6B";
		String c2 = "#";
		String c3 = "#";
		String rosa = "#0D1526";
		
		JButton btn01 = new JButton("CE");
		btn01.setOpaque(true);
		btn01.setForeground(Color.white);
		btn01.setBackground(Color.decode(rosa));
		
		JButton btn02 = new JButton("");
		btn02.setOpaque(true);
		btn02.setBackground(Color.decode(rosa));
		
		JButton btn03 = new JButton("");
		btn03.setOpaque(true);
		btn03.setBackground(Color.decode(rosa));
		
		JButton btn04 = new JButton("");
		btn04.setOpaque(true);
		btn04.setBackground(Color.decode(rosa));
		
		JButton btn05 = new JButton("7");
		btn05.setOpaque(true);
		btn05.setForeground(Color.white);
		btn05.setBackground(Color.decode(rosa));
		
		JButton btn06 = new JButton("8");
		btn06.setOpaque(true);
		btn06.setForeground(Color.white);
		btn06.setBackground(Color.decode(rosa));
		
		JButton btn07 = new JButton("9");
		btn07.setOpaque(true);
		btn07.setForeground(Color.white);
		btn07.setBackground(Color.decode(rosa));
		
		JButton btn08 = new JButton("/");
		btn08.setOpaque(true);
		btn08.setBackground(Color.decode(c1));
		
		JButton btn09 = new JButton("4");
		btn09.setOpaque(true);
		btn09.setForeground(Color.white);
		btn09.setBackground(Color.decode(rosa));
		
		JButton btn010 = new JButton("5");
		btn010.setOpaque(true);
		btn010.setForeground(Color.white);
		btn010.setBackground(Color.decode(rosa));
		
		JButton btn011 = new JButton("6");
		btn011.setOpaque(true);
		btn011.setForeground(Color.white);
		btn011.setBackground(Color.decode(rosa));
		
		JButton btn012 = new JButton("X");
		btn012.setOpaque(true);
		btn012.setBackground(Color.decode(c1));
		
		JButton btn013 = new JButton("1");
		btn013.setOpaque(true);
		btn013.setForeground(Color.white);
		btn013.setBackground(Color.decode(rosa));
		
		JButton btn014 = new JButton("2");
		btn014.setOpaque(true);
		btn014.setForeground(Color.white);
		btn014.setBackground(Color.decode(rosa));
		
		JButton btn015 = new JButton("3");
		btn015.setOpaque(true);
		btn015.setForeground(Color.white);
		btn015.setBackground(Color.decode(rosa));
		
		JButton btn016 = new JButton("-");
		btn016.setOpaque(true);
		btn016.setBackground(Color.decode(c1));
		
		JButton btn017 = new JButton("0");
		btn017.setOpaque(true);
		btn017.setForeground(Color.white);
		btn017.setBackground(Color.decode(rosa));
		
		JButton btn018 = new JButton(".");
		btn018.setOpaque(true);
		btn018.setBackground(Color.decode(c1));
		
		JButton btn019 = new JButton("=");
		btn019.setOpaque(true);
		btn019.setBackground(Color.decode(c1));
		
		JButton btn020 = new JButton("+");
		btn020.setOpaque(true);
		btn020.setBackground(Color.decode(c1));

		gridPanel.add(btn01);
		gridPanel.add(btn02);
		gridPanel.add(btn03);
		gridPanel.add(btn04);
		gridPanel.add(btn05);
		gridPanel.add(btn06);
		gridPanel.add(btn07);
		gridPanel.add(btn08);
		gridPanel.add(btn09);
		gridPanel.add(btn010);
		gridPanel.add(btn011);
		gridPanel.add(btn012);
		gridPanel.add(btn013);
		gridPanel.add(btn014);
		gridPanel.add(btn015);
		gridPanel.add(btn016);
		gridPanel.add(btn017);
		gridPanel.add(btn018);
		gridPanel.add(btn019);
		gridPanel.add(btn020);
		
		frame.add(panel);
		panel.add(label, BorderLayout.NORTH);
		panel.add(gridPanel, BorderLayout.CENTER);
		
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setBackground(Color.decode(rosa));
		
//		String blanco = "#DAD8A7";
		String blanco = "#F2F2F2";
		label.setText("0");
		label.setBounds(0, 0, 430, 100);
		label.setForeground(Color.black);
		label.setOpaque(true);
		label.setBackground(Color.white);
		label.setFont(new Font ("arial", Font.PLAIN,30));
		label.setBackground(Color.decode (blanco));
		
		
		frame.setVisible(true);
	}
	
}