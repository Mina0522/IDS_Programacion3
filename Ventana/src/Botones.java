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
import javax.swing.JOptionPane;
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
		
		String a = "#6B9FBF";
		String b = "#D80903";
		String c = "#F2CB05";
		String d = "#D97904";
		
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		setResizable(false);
        panelLogin.setBackground(Color.decode(a));
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		
		JButton boton = new JButton("PRESIONAME!!!");
		boton.setBounds(255, 330, 150, 50);
		panelLogin.add(boton);
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Random r = new Random();
				int x = r.nextInt(600)+1;
				int y = r.nextInt(600)+1;
				
				int alto = r.nextInt(150)+1;
				int ancho = r.nextInt(170)+1;
				
				float a = r.nextFloat();
				float b = r.nextFloat();
				float c = r.nextFloat();
				float d = r.nextFloat();
				
				Color rC = new Color (a, b, c, d);
				
				JButton btn = new JButton("CLICK");
				btn.setBounds(x, y, alto, ancho);
				btn.setBackground(new Color (a,b,c,d));
				panelLogin.add(btn);
				
				btn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						
						int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar este boton?", "Eliminando botones", JOptionPane.YES_NO_OPTION);
						if (opcion == JOptionPane.YES_NO_OPTION) {
							panelLogin.remove(btn);
							panelLogin.revalidate();
							panelLogin.repaint();
						}
						
					}});	
				panelLogin.repaint();
			}});
		
		setContentPane(panelLogin);
		panelLogin.revalidate();
		panelLogin.repaint();
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Botones();

	}

}
