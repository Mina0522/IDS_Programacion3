import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ReplicaMarioBros extends JFrame {

	public ReplicaMarioBros () {
		
		setTitle("Mario Bros");
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
		String ladrillo = "#A6330A";
		String contorno = "#731702";
		String sueloo = "#BF6415";
		
		String rosa = "#F2BBD5";
		String azul = "#8FCBD9";
		String verde = "#6BFF5A";
		String verdet1 = "#1D5902";
		String verdet2 = "#2E8C03";
	
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
	// == Cielo == 
		
		g2.setColor(Color.decode(blue));
		g2.fillRect(0, 0, 700, 650);
		
	// == Suelo ==
		
		g2.setColor(Color.decode(ladrillo));
		g2.fillRect(0, 590, getWidth(), 70);
		
		g2.setColor(Color.decode(contorno));
		g2.fillRect(0, 605, getWidth(), 5);
		g2.fillRect(0, 625, getWidth(), 5);
		
		g2.fillRect(8, 590, 5, 80);
	    g2.fillRect(50, 590, 5, 80);
	    g2.fillRect(90, 590, 5, 80);
	    g2.fillRect(130, 590, 5, 80);
	    g2.fillRect(170, 590, 5, 80);
	    g2.fillRect(210, 590, 5, 80);
	    g2.fillRect(250, 590, 5, 80);
	    g2.fillRect(290, 590, 5, 80);
	    g2.fillRect(330, 590, 5, 80);
	    g2.fillRect(370, 590, 5, 80);
	    g2.fillRect(410, 590, 5, 80);
	    g2.fillRect(450, 590, 5, 80);
	    g2.fillRect(490, 590, 5, 80);
	    g2.fillRect(530, 590, 5, 80);
	    g2.fillRect(570, 590, 5, 80);
	    g2.fillRect(610, 590, 5, 80);
	    g2.fillRect(650, 590, 5, 80);
	    g2.fillRect(690, 590, 5, 80);
	    g2.fillRect(730, 590, 5, 80);
	    
		g2.setColor(Color.decode(sueloo));
		g2.fillRect(0, 580, getWidth(), 10);
		
		// == Bloques y sombras ==
		
		g2.setColor(Color.black); // Bloque azul
		g2.fillRect(120, 380, 180, 200);
		g2.setColor(Color.decode(azul));
		g2.fillRect(120, 370, 170, 210);
		g2.setColor(Color.black);
		g2.drawRect(120, 370, 170, 210);
		
		g2.setColor(Color.gray);
		g2.fillOval(125, 375, 10, 10);
		g2.fillOval(275, 375, 10, 10);
		g2.fillOval(275, 565, 10, 10);
		
		g2.setColor(Color.black); // Bloque rosa
		g2.fillRect(70, 450, 110, 130);
		g2.setColor(Color.decode(rosa));
		g2.fillRect(70, 440, 100, 140);
		g2.setColor(Color.black);
		g2.drawRect(70, 440, 100, 140);

		g2.setColor(Color.gray);
		g2.fillOval(75, 445, 10, 10);
		g2.fillOval(155, 445, 10, 10);
		g2.fillOval(75, 565, 10, 10);
		g2.fillOval(155, 565, 10, 10);
		
		g2.setColor(Color.decode(verde)); // Bloque verde
		g2.fillRect(600, 440, 190, 140);
		g2.setColor(Color.black);
		g2.drawRect(600, 440, 190, 140);
		
		g2.setColor(Color.gray);
		g2.fillOval(605, 445, 10, 10);
		g2.fillOval(605, 565, 10, 10);
		
		// == Tuberia == 
		
		g2.setColor(Color.decode(verdet1));
		g2.fillRect(440, 470, 90, 110);
		g2.setColor(Color.black);
		g2.drawRect(440, 470, 90, 110);
		
		g2.setColor(Color.decode(verdet1));
		g2.fillRect(435, 440, 100, 40);
	
		g2.setColor(Color.decode(verde));
		g2.fillRect(450, 480, 1, 100);
		g2.fillRect(460, 480, 3, 100);
		g2.fillRect(470, 480, 2, 100);
		g2.fillRect(480, 480, 4, 100);
		g2.fillRect(487, 480, 2, 100);
		g2.fillRect(495, 480, 5, 100);
		
		g2.setColor(Color.black);
		g2.fillRect(505, 480, 1, 100);
		g2.fillRect(510, 480, 3, 100);
		g2.fillRect(515, 480, 2, 100);
		g2.fillRect(525, 480, 5, 100);

		g2.setColor(Color.decode(verde));
		g2.fillRect(450, 440, 1, 40);
		g2.fillRect(460, 440, 3, 40);
		g2.fillRect(470, 440, 2, 40);
		g2.fillRect(480, 440, 4, 40);
		g2.fillRect(487, 440, 2, 40);
		g2.fillRect(495, 440, 5, 40);
		
		g2.setColor(Color.black);
		g2.fillRect(505, 440, 1, 40);
		g2.fillRect(510, 440, 3, 40);
		g2.fillRect(515, 440, 2, 40);
		g2.fillRect(525, 440, 5, 40);
		
		g2.setColor(Color.black);
		g2.drawRect(435, 440, 100, 40);
		
		// == Mas bloques == 
		
		g2.setColor(Color.decode(sueloo)); // Bloques pequeños 
		g2.fillRect(600, 240, 50, 50);
		g2.setColor(Color.black);
		g2.drawRect(600, 240, 50, 50);
		
		g2.setColor(Color.decode(contorno));
		g2.fillOval(605, 245, 8, 8);
		g2.fillOval(635, 245, 8, 8);
		g2.fillOval(635, 275, 8, 8);
		g2.fillOval(605, 275, 8, 8);
		
		g2.setColor(Color.decode(sueloo)); // Bloques pequeños 
		g2.fillRect(200, 140, 50, 50);
		g2.setColor(Color.black);
		g2.drawRect(200, 140, 50, 50);
		
		g2.setColor(Color.decode(contorno));
		g2.fillOval(205, 145, 8, 8);
		g2.fillOval(235, 145, 8, 8);
		g2.fillOval(235, 175, 8, 8);
		g2.fillOval(205, 175, 8, 8);
		
		g2.setColor(Color.decode(sueloo)); //
		g2.fillRect(250, 140, 50, 50);
		g2.setColor(Color.black);
		g2.drawRect(250, 140, 50, 50);
		
		g2.setColor(Color.decode(contorno));
		g2.fillOval(255, 145, 8, 8);
		g2.fillOval(285, 145, 8, 8);
		g2.fillOval(255, 175, 8, 8);
		g2.fillOval(285, 175, 8, 8);
		
		g2.setColor(Color.decode(sueloo)); //
		g2.fillRect(70, 290, 50, 50);
		g2.setColor(Color.black);
		g2.drawRect(70, 290, 50, 50);
		
		g2.setColor(Color.decode(contorno));
		g2.fillOval(75, 295, 8, 8);
		g2.fillOval(105, 295, 8, 8);
		g2.fillOval(105, 325, 8, 8);
		g2.fillOval(75, 325, 8, 8);
		
		// == Flor == 

		BufferedImage image;
		try {
			
			image = ImageIO.read(new File("pirana.png"));
			
			g2.drawImage(image, 
					425,
					310,
					130,
					130, Color.decode(blue), null);
		}catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {

		new ReplicaMarioBros();
		
	}

}
