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
		setSize(700, 650);
		setResizable(false);
		panelLogin.setLayout(null);
		
		this.getContentPane().add(panelLogin);
		
		setVisible(true);
	}
	
public void paint (Graphics g) {
	
	String blue = "#4E98D9";
	String brown = "#765536";
	String green = "#5F8C1C";
	String green2 = "#455922";
	
	String verdelimon = "#D2D904";
	String amarillopollo = "#EEF279";
	String RED = "#D80903";
	String gg = "#8C8954";
	
	
	super.paint(g);
	Graphics2D g2 = (Graphics2D) g;
	
	// == Cielo == 
	
	g2.setColor(Color.decode(blue));
	g2.fillRect(0, 0, 700, 650);
	
	// == Suelo ==
	
	g2.setColor(Color.decode(brown));
	g2.fillRect(0, 600, getWidth(), 50);
	
	g2.setColor(Color.decode(green));
	g2.fillRect(0, 560, getWidth(), 40);
	
	g2.setColor(Color.decode(green2));
	g2.fillRect(0, 550, getWidth(), 10);
	
	// == Casa ==
	
	g2.setColor(Color.decode(verdelimon)); // == Cuerpo de la casa
	g2.fillRect(90, 245, 270, 320);
	
    int[] xTecho = {90, 225, 360}; // Techo
    int[] yTecho = {245, 120, 245};
    g2.setColor(Color.decode(brown));
    g2.fillPolygon(xTecho, yTecho, 3);
    
	g2.setColor(Color.decode(RED)); // Puerta
    g2.fillRect(120, 415, 80, 150);
    g2.setColor(Color.WHITE);
    g2.fillOval(190, 490, 5, 5);
	
    g2.setColor(Color.decode(amarillopollo)); // Ventana
    g2.fillRect(220, 320, 120, 120);
    g2.setColor(Color.decode(RED));
    g2.drawRect(220, 320, 120, 120);
    g2.drawLine(280, 320, 280, 440);
    g2.drawLine(220, 380, 340, 380);
    
    // === EXTRA
    
    g2.setColor(Color.yellow);
    g2.fillOval(400, 520, 50, 30);
    g2.fillOval(440, 510, 20, 20); 
    g2.setColor(Color.ORANGE);
    g2.fillPolygon(new int[]{460, 470, 460}, new int[]{515, 520, 525}, 3);
    g2.setColor(Color.BLACK);
    g2.fillOval(455, 515, 5, 5);

    g2.setColor(Color.white);
    g2.fillOval(400, 70, 50, 50);
    g2.fillOval(430, 70, 50, 50);
    
    g2.fillOval(510, 70, 50, 50);
    g2.fillOval(530, 60, 60, 60);
    g2.fillOval(560, 70, 50, 50);
    
    g2.fillOval(20, 60, 60, 60);
    g2.fillOval(60, 50, 70, 70);
    g2.fillOval(100, 60, 60, 60);
    
    
	/*g2.clearRect(100, 100, 50, 50);
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
	
	g2.drawPolygon(xs, ys, 3);*/

	
}
	
	public static void main(String[] args) {
		
		new Graficos();
		
	}

}
