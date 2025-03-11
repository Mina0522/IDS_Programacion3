import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarioBrosReplicaDos extends JFrame {

	public MarioBrosReplicaDos () {
		
		setTitle("Mario Bros");
		login ();
	}
	
	private void login () {
		
		JPanel panelLogin = new JPanel ();
		setSize(800, 700);
		setResizable(false);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		setVisible(true);
	}
	
	public void paint (Graphics g) {
		
		String blue = "#0460D9";
		String sueloVerde = "#34B326";
		String suelo = "#BF8136";
		String sombra = "#9F661F";
		String sombraVerde = "#2E8C03";
		
		String azulSombra = "#73A2BF";
		String azul = "#96C6D9";
		String AZUL = "#6B9FBF";
		String AZULsombra = "#356B8C";
		
		String morado = "#181E40";
		String moradoLUZ = "#383673";
		String moradoazulado = "#A9B9D9";
		String amarillo = "#F2B705";
	
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		// == Cielo == 
		
		g2.setColor(Color.decode(blue));
		g2.fillRect(0, 0, 800, 700);
		
		// == Bloques y sombras ==
		
		g2.setColor(Color.decode(azulSombra));
		g2.fillRoundRect(50, 280, 180, 400, 280, 180);
		g2.fillRoundRect(350, 290, 150, 500, 280, 180);
		g2.fillRoundRect(550, 180, 180, 1000, 280, 180);
		
		g2.setColor(Color.decode(azul));
		g2.fillRoundRect(40, 280, 180, 400, 280, 180);
		g2.fillRoundRect(340, 290, 150, 500, 280, 180);
		g2.fillRoundRect(530, 180, 180, 1000, 280, 180);
		
		g2.setColor(Color.decode(AZULsombra));
		g2.fillRoundRect(20, 380, 180, 280, 280, 180);
		g2.fillRoundRect(420, 370, 150, 300, 280, 180);
		g2.fillRoundRect(600, 360, 190, 500, 280, 180);
		
		g2.setColor(Color.decode(AZUL));
		g2.fillRoundRect(10, 380, 180, 280, 280, 180);
		g2.fillRoundRect(410, 370, 150, 300, 280, 180);
		g2.fillRoundRect(590, 360, 190, 500, 280, 180);
		
		// == Suelo ==
		
		g2.setColor(Color.decode(sueloVerde)); // Capa1
		g2.fillRect(0, 565, getWidth(), 25);
		g2.setColor(Color.decode(sombraVerde)); 
		g2.fillRect(0, 580, getWidth(), 5);
		
		g2.setColor(Color.decode(sombra)); // Capa2
		g2.fillRect(0, 585, getWidth(), 5);
		
		g2.setColor(Color.black); // Contornos
		g2.fillRect(0, 585, getWidth(), 1);
		g2.fillRect(0, 565, getWidth(), 3);
		
		g2.setColor(Color.decode(suelo)); // Capa
		g2.fillRect(0, 590, getWidth(), 110);
		
		// == Tuberia == 

		g2.setColor(Color.decode(morado));
		g2.fillRect(340, 465, 90, 110);
		g2.fillRect(335, 440, 100, 40);
		
		g2.setColor(Color.decode(moradoLUZ));
		g2.fillRect(330, 465, 90, 110);
		g2.setColor(Color.decode(moradoazulado));
		g2.fillRect(355, 470, 10, 105);
		g2.setColor(Color.decode(morado));
		g2.drawRect(330, 465, 90, 110);
		
		g2.setColor(Color.decode(moradoLUZ));
		g2.fillRect(325, 440, 100, 40);
		g2.setColor(Color.decode(moradoazulado));
		g2.fillRect(350, 440, 8, 40);
		g2.setColor(Color.decode(morado));
		g2.drawRect(325, 440, 100, 40);
		
		// == Bloques ==
		
		g2.setColor(Color.decode(moradoazulado)); // Bloques pequeños 
		g2.fillRect(600, 520, 50, 50);
		g2.setColor(Color.decode(morado));
		g2.drawRect(600, 520, 50, 50);
		
		g2.setColor(Color.decode(moradoazulado)); // Bloque 
		g2.fillRect(600, 470, 50, 50);
		g2.setColor(Color.decode(morado));
		g2.drawRect(600, 470, 50, 50);
		
		g2.setColor(Color.decode(moradoazulado)); // Bloque 
		g2.fillRect(600, 420, 50, 50);
		g2.setColor(Color.decode(morado));
		g2.drawRect(600, 420, 50, 50);
		
		g2.setColor(Color.decode(moradoazulado)); // Bloque
		g2.fillRect(600, 370, 50, 50);
		g2.setColor(Color.decode(morado));
		g2.drawRect(600, 370, 50, 50);
		
		g2.setColor(Color.decode(amarillo)); // Bloque
		g2.fillRect(650, 370, 50, 50);
		g2.setColor(Color.black);
		g2.drawRect(650, 370, 50, 50);
		
		g2.setColor(Color.decode(amarillo)); // Bloque
		g2.fillRect(700, 370, 50, 50);
		g2.setColor(Color.black);
		g2.drawRect(700, 370, 50, 50);
		
		g2.setColor(Color.decode(moradoazulado)); // Bloque
		g2.fillRect(750, 370, 50, 50);
		g2.setColor(Color.decode(morado));
		g2.drawRect(750, 370, 50, 50);
		
		g2.setColor(Color.black);
		g2.fillOval(675, 390, 20, 20);
		g2.fillOval(710, 390, 20, 20);
		
		g2.setColor(Color.white);
		g2.fillOval(655, 250, 20, 20);
		g2.fillOval(560, 310, 20, 20);
		g2.fillOval(570, 350, 20, 20);
		
		g2.fillOval(120, 310, 20, 20);
		g2.fillOval(180, 340, 20, 20);
		
		g2.fillOval(420, 310, 20, 20);
		g2.fillOval(440, 340, 20, 20);
		g2.fillOval(400, 380, 20, 20);
		
		g2.fillRoundRect(40, 80, 100, 40, 280, 180);
		g2.fillRoundRect(590, 80, 100, 40, 280, 180);
		g2.fillRoundRect(440, 60, 100, 40, 280, 180);
		
		g2.fillRoundRect(140, 170, 90, 40, 280, 180);
		g2.fillRoundRect(340, 200, 100, 40, 280, 180);
		
		g2.setColor(Color.decode(moradoazulado));
		g2.fillOval(80, 510, 20, 20);
		g2.fillOval(90, 410, 20, 20);
		g2.fillOval(130, 530, 20, 20);

		g2.fillOval(490, 410, 20, 20);
		g2.fillOval(430, 530, 20, 20);
		g2.fillOval(470, 510, 20, 20);
		
		g2.fillOval(730, 530, 20, 20);
		g2.fillOval(720, 440, 20, 20);
		
	}
	
	public static void main(String[] args) {

		new MarioBrosReplicaDos();
		
	}

}
