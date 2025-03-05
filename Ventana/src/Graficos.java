import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Graficos extends JFrame{
	
	public Graficos () {
		
		setTitle("Ventana");

		login ();
	}
	
private void login () {
		
		JPanel panelLogin = new JPanel ();
		setSize(1000, 750);
		setResizable(false);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		
		this.getContentPane().add(panelLogin);
		
		setVisible(true);
	}
	
public void paint (Graphics g) {
	
	super.paint(g);
	Graphics2D g2 = (Graphics2D) g;
	
	g2.clearRect(100, 100, 50, 50);
	g2.drawRect(80, 80, 400, 200);
	g2.fillRect(200, 200, 200, 400);
	g2.setColor(Color.blue);
	g2.fillRoundRect(400, 80, 200, 200, 30, 30);
	g2.setColor(Color.green);
	g2.setStroke(new BasicStroke(10));
	g2.drawOval(400, 400, 90, 90);
	g2.fillOval(400, 450, 75, 75);
	g2.drawArc(600, 200, 200, 200, 1, -180);
	g2.drawArc(600, 200, 200, 200, 1, 180);
	g2.setFont(new Font("Century Gothic",Font.PLAIN,30));
	g2.setColor(Color.pink);
	g2.drawString("hola :3", 350, 200);
	
	BufferedImage image;
	try {
		
		image = ImageIO.read(new File("abejas.png"));
		
		g2.drawImage(image, 
				800,
				250,
				180,
				180, Color.gray, null);
	}catch (IOException e) {
		
		e.printStackTrace();
	}
	
	int[] xs = {100, 100, 400};
	int[] ys = {100, 100, 400};
	
	g2.drawPolygon(xs, ys, 3);

	
}
	
	public static void main(String[] args) {
		
		new Graficos();
		
	}

}
