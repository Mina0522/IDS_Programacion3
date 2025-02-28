import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

//implements ActionListener
public class Vista_Pantalla extends JFrame {

	public Vista_Pantalla () {
		
		setSize(657, 360);
		setResizable(false);
		
		login ();
	}
	
	private void login () {
		
		JPanel panelLogin = new JPanel ();
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JLabel etq = new JLabel("Registro");
		etq.setBounds(150, 10, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("cooper black",Font.PLAIN,30));
		panelLogin.add(etq);
		
		//
		JLabel etq1 = new JLabel(new ImageIcon("fondoetq1.jpg"));
		etq1.setBounds(1, 1, 657, 360);
		
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("cooper black",Font.PLAIN,15));
		etq2.setBounds(180, 100, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("cooper black",Font.PLAIN,15));
		etq3.setBounds(150, 130, 100, 30);
		panelLogin.add(etq3);
		
		//
		JTextField text = new JTextField();
		text.setBounds(320, 100, 180, 25);
		panelLogin.add(text);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 130, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);

		JButton boton = new JButton("Ingresar");
		boton.setBounds(250, 260, 120, 25);
		panelLogin.add(boton);
		boton.addActionListener(e -> panel1());

		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(250, 200, 180, 25);
		panelLogin.add(caja);
		
		panelLogin.add(etq1);
		
		setVisible(true);
	}
	
	private void panel1 () {
 		
 		getContentPane().removeAll();
 		//
		JPanel panelLogin = new JPanel ();
		panelLogin.setBounds(1, 1, 657, 360);
		setSize(657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Ayuda");
		JMenu menu2 = new JMenu("Archivos");
		
		JMenuItem item = new JMenuItem("Atencion al cliente");
		JMenuItem item1 = new JMenuItem("Configuracion");
		JMenuItem item2 = new JMenuItem("Clientes");
		JMenuItem item3 = new JMenuItem("Reportes");
		
		menu.add(menu1);
		menu.add(menu2);
		
		menu1.add(item);
		menu1.add(item1);
		
		menu2.add(item2);
		menu2.add(item3);
		this.setJMenuBar(menu);
		
		JLabel etq = new JLabel("Crear cuenta");
		etq.setBounds(150, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("cooper black",Font.PLAIN,30));
		panelLogin.add(etq);
		JLabel etq1 = new JLabel(new ImageIcon("fondoetq1.jpg"));
		etq1.setBounds(1, 1, 657, 360);
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("cooper black",Font.PLAIN,15));
		etq2.setBounds(180, 90, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("cooper black",Font.PLAIN,15));
		etq3.setBounds(150, 110, 100, 30);
		panelLogin.add(etq3);
		
		//
		JTextField text = new JTextField();
		text.setBounds(320, 90, 180, 25);
		panelLogin.add(text);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 120, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);

		JButton boton = new JButton("Ingresar");
		boton.setBounds(250, 260, 120, 25);
		panelLogin.add(boton);
//		boton.addActionListener(e -> panel1());

		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(250, 200, 180, 25);
		panelLogin.add(caja);
		
		
		panelLogin.add(etq1);
		setVisible(true);
 		setContentPane(panelLogin); 
 		repaint();
 		revalidate();	
 	}

	public static void main(String[] args) {
		
		new Vista_Pantalla();
		
	}
}
//{}