import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;

//implements ActionListener
public class Vista_Pantalla extends JFrame {
	
	private JLabel etiqueta1,etiqueta2;
	private JTextField campoTexto;
	private JPasswordField campoPass;
	private JButton boton;
	private JCheckBox caja;
	
	public JPanel lamina = new JPanel ();
	public Vista_Pantalla () {
		
		vistaPricipal();
		elementos();
		elementoGrupo();
		registro();
		combo();
	}
	
	private void vistaPricipal() {
		
		// Creamos y colocamos una ventana con color.
		String color = "#D783D2";
		this.setSize(1000, 530);
		this.setTitle("Ventana 2");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lamina.setLayout(null);
	
		lamina.setBackground(Color.decode(color));
		this.setBackground(Color.lightGray);
		this.getContentPane().add(lamina); 
		
		//this.setVisible(true);
		
	}
	
	private void elementos() {
		
		//Pantalla principal
		JLabel etiqueta = new JLabel();
		String color2 = "#944491";
		etiqueta.setText("Bienvenido");
		etiqueta.setBounds(20, 10, 350, 50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setForeground(Color.white);
		etiqueta.setOpaque(true);
		etiqueta.setBackground(Color.black);
		etiqueta.setFont(new Font ("arial", Font.PLAIN,30));
		etiqueta.setBackground(Color.decode (color2));
		lamina.add(etiqueta);
		
		//Elementos para login
		etiqueta1 = new JLabel("Usuario:");
		etiqueta1.setBounds(50, 80, 90, 25);
		lamina.add(etiqueta1);
		
		etiqueta2 = new JLabel("Contraseña:");
		lamina.setLayout(null);
		etiqueta2.setBounds(50, 120, 90, 25);
		lamina.add(etiqueta2);
		
		campoTexto =  new JTextField();
		campoTexto.setBounds(150, 80, 180, 25);
		lamina.add(campoTexto);
		
		campoPass = new JPasswordField();
		campoPass.setBounds(150, 120, 180, 25);
		campoPass.setEchoChar('*');
		lamina.add(campoPass);
		
		boton = new JButton("Ingresar");
		boton.setBounds(160, 190, 120, 25);
		lamina.add(boton);
		
		caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(150, 150, 180, 25);
		String color3 = "#D783D2";
		caja.setBackground (Color.decode (color3));
		lamina.add(caja);
		

	}
	
	private void registro() {
		//Pantalla de registro
		JLabel etiqueta1 = new JLabel();
		String color4 = "#944491";
		etiqueta1.setText("Registro");
		etiqueta1.setBounds(550, 10, 350, 50);
		etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta1.setForeground(Color.white);
		etiqueta1.setOpaque(true);
		etiqueta1.setBackground(Color.black);
		etiqueta1.setFont(new Font("arial", Font.PLAIN,30));
		etiqueta1.setBackground(Color.decode (color4));
		lamina.add(etiqueta1);
		
		//Elementos de registro
		etiqueta1 = new JLabel("Nombre:");
		etiqueta1.setBounds(580, 80, 90, 25);
		lamina.add(etiqueta1);
		
		campoTexto =  new JTextField();
		campoTexto.setBounds(650, 80, 180, 25);
		lamina.add(campoTexto);
		
		etiqueta1 = new JLabel("Descripcion:");
		etiqueta1.setBounds(570, 120, 90, 25);
		lamina.add(etiqueta1);
// ese no es un campo de texto asi bien como lo queremos
		campoTexto =  new JTextField();
		campoTexto.setBounds(650, 120, 250, 100);
		lamina.add(campoTexto);
		
		boton = new JButton("Ingresar");
		boton.setBounds(700, 440, 120, 25);
		lamina.add(boton);
		
		
		this.setVisible(true);
	}

 	private void elementoGrupo() {
		
		etiqueta1 = new JLabel("Color favorito:");
		etiqueta1.setBounds(560, 240, 120, 25);
		lamina.add(etiqueta1);
		
		JRadioButton botones = new JRadioButton("Verde", true);
		botones.setBounds(650, 240, 90, 25);
		String color1 = "#D783D2";
		botones.setBackground (Color.decode (color1));
		lamina.add(botones);
		
		JRadioButton botones1 = new JRadioButton("Azul", false);
		botones1.setBounds(650, 260, 90, 25);
		String color2 = "#D783D2";
		botones1.setBackground (Color.decode (color2));
		lamina.add(botones1);
		
		JRadioButton botones2 = new JRadioButton("Amarrillo", false);
		botones2.setBounds(650, 280, 90, 25);
		String color3 = "#D783D2";
		botones2.setBackground (Color.decode (color3));
		lamina.add(botones2);
		
		ButtonGroup grupoBoton = new ButtonGroup();
		grupoBoton.add(botones);
		grupoBoton.add(botones1);
		grupoBoton.add(botones2);
		
		//
		etiqueta1 = new JLabel("Acepta terminos:");
		etiqueta1.setBounds(550, 365, 120, 25);
		lamina.add(etiqueta1);
		
		JRadioButton botones3 = new JRadioButton("Si", true);
		botones3.setBounds(650, 370, 90, 25);
		String color4 = "#D783D2";
		botones3.setBackground (Color.decode (color4));
		lamina.add(botones3);
		
		JRadioButton botones4 = new JRadioButton("No", false);
		botones4.setBounds(650, 390, 90, 25);
		String color5 = "#D783D2";
		botones4.setBackground (Color.decode (color5));
		lamina.add(botones4);
		
		ButtonGroup grupoB = new ButtonGroup();
		grupoB.add(botones3);
		grupoB.add(botones4);
		
	}

	private void combo() {
		
		etiqueta1 = new JLabel("Colonia:");
		etiqueta1.setBounds(590, 320, 120, 25);
		lamina.add(etiqueta1);
	    String colonias[] = {"Pedregal","Olas altas","Miramar","Puesta del sol","Los olivos"};        
	    JComboBox col = new JComboBox(colonias);    
	    col.setBounds(650, 320, 150, 25);   
	    lamina.add(col);
 
	}
	

	public static void main(String[] args) {
		new Vista_Pantalla();
	}
}
//{}