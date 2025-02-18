import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Vista_Pantalla extends JFrame{
	
	private JLabel etiqueta1,etiqueta2,etiqueta3;
	private JTextField campoTexto;
	private JPasswordField campoPass;
	private JButton boton;
	private JCheckBox caja;
	
	public JPanel lamina = new JPanel ();
	
	public Vista_Pantalla () {
		
		// Creamos y colocamos una ventana con color junto con un texto.
		String color = "#D783D2";
		
		this.setSize (400, 300);
		this.setTitle ("Ventana");
		this.setLocationRelativeTo (null);
		this.setResizable (false);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		lamina.setLayout(null);
		
		lamina.setBackground (Color.decode(color));
		this.setBackground (Color.lightGray);
		this.getContentPane().add (lamina); 
		
		this.setVisible (true);
		
		JLabel etiqueta = new JLabel();
		String color2 = "#944491";
		etiqueta.setText ("Bienvenido");
		etiqueta.setBounds (20, 10, 350, 50);
		etiqueta.setHorizontalAlignment (SwingConstants.CENTER);
		etiqueta.setForeground (Color.white);
		etiqueta.setOpaque (true);
		etiqueta.setBackground (Color.black);
		etiqueta.setFont (new Font ("arial", Font.PLAIN,30));
		etiqueta.setBackground (Color.decode (color2));
		lamina.add(etiqueta);
		
		etiqueta1 = new JLabel ("Usuario:");
		etiqueta1.setBounds(50, 80, 90, 25);
		lamina.add(etiqueta1);
		
		etiqueta2 = new JLabel ("Contraseña:");
		lamina.setLayout(null);
		etiqueta2.setBounds(50, 120, 90, 25);
		lamina.add (etiqueta2);
		
		campoTexto =  new JTextField();
		campoTexto.setBounds(150, 80, 180, 25);
		lamina.add (campoTexto);
		
		campoPass = new JPasswordField();
		campoPass.setBounds(150, 120, 180, 25);
		campoPass.setEchoChar('*');
		lamina.add (campoPass);
		
		boton = new JButton("Ingresar");
		boton.setBounds(160, 190, 120, 25);
		lamina.add (boton);
		
		caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(150, 150, 180, 25);
		String color3 = "#D783D2";
		caja.setBackground (Color.decode (color3));
		lamina.add (caja);

		this.setVisible (true);	

	} 

public static void main(String[] args) {
	
    new Vista_Pantalla();

	}
}
//{}