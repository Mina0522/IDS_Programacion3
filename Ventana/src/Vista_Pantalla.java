import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Vista_Pantalla extends JFrame{
	
	//private static final long serialVersionUID = 1L;
	
	public JPanel lamina = new JPanel();
	
	public Vista_Pantalla () {
		
		String color = "#D783D2";
		
		this.setSize(500,500);
		this.setTitle("Ventana");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lamina.setBackground(Color.decode(color));
		this.setBackground(Color.lightGray);
		this.getContentPane().add(lamina); 
		this.setVisible(true);
		
		JLabel etiqueta = new JLabel();
		String color2 = "#944491";
		etiqueta.setText("Bienvenido");
		etiqueta.setBounds(50,50,50,50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setForeground(Color.white);
		etiqueta.setOpaque(true);
		etiqueta.setBackground(Color.black);
		etiqueta.setFont(new Font("arial", Font.PLAIN,50));
		etiqueta.setBackground(Color.decode(color2));
		
		lamina.add(etiqueta);
		this.setVisible(true);
	}

public static void main(String[] args) {
	
    new Vista_Pantalla();
    
	}
}




//{}