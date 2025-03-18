import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class Botones extends JFrame{
	
	public Botones () {
		
		setTitle("Registro");
//		ImageIcon icono = new ImageIcon(("icon04.png"));
//		setIconImage(icono.getImage());
		boton ();
	}
	
	private void boton() {
		
		String azu = "#6B9FBF";
		
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		setResizable(false);
        panelLogin.setBackground(Color.decode(azu));
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		
		JButton boton = new JButton("PRESIONAME!!!");
		boton.setBounds(255, 330, 150, 50);
		panelLogin.add(boton);
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Random r = new Random();
				int x = r.nextInt(700)+1;
				int y = r.nextInt(700)+1;
				
				int alto = r.nextInt(150)+1;
				int ancho = r.nextInt(170)+1;
				
				JButton boton = new JButton(">:3");
				boton.setBounds(x, y, alto, ancho);
				panelLogin.add(boton);
				panelLogin.repaint();
				
			}});

		
		setContentPane(panelLogin);
		panelLogin.revalidate();
		panelLogin.repaint();
		panelLogin.add(boton);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Botones();

	}

}
