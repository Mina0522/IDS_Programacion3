import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;

//implements ActionListener
public class Vista_Pantalla extends JFrame {

	public Vista_Pantalla () {
		
		setTitle("Registro");
		ImageIcon icono = new ImageIcon(("icon04.png"));
		setIconImage(icono.getImage());
		login ();
	}
	
	private void login () {
		
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		setResizable(false);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		
		this.getContentPane().add(panelLogin);
		
		JLabel etq = new JLabel("Login");
		etq.setBounds(195, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);

//		JLabel etq1 = new JLabel(new ImageIcon("fondoetq1.jpg"));
//		etq1.setBounds(1, 1, 657, 360);
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(180, 130, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(150, 200, 100, 30);
		panelLogin.add(etq3);
		
//		
		JTextField text = new JTextField();
		text.setBounds(320, 130, 180, 25);
		panelLogin.add(text);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 200, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(320, 240, 180, 25);
		panelLogin.add(caja);
		
//		=== BARRA DE MENU === 
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Cuenta");
		JMenu menu2 = new JMenu("Usuarios");
		JMenu menu3 = new JMenu("Ayuda");
		
		JMenuItem item = new JMenuItem("Login");
		item.addActionListener(e -> login()); 
		JMenuItem item1 = new JMenuItem("Registro");
		item1.addActionListener(e -> registro()); 
		JMenuItem item2 = new JMenuItem("Recuperar cuenta");
		item2.addActionListener(e -> recuperarCuenta()); 
		
		JMenuItem item3 = new JMenuItem("Alta");
		item3.addActionListener(e -> alta()); 
		JMenuItem item4 = new JMenuItem("Baja");
		item4.addActionListener(e -> baja()); 
		JMenuItem item5 = new JMenuItem("Consultar");
		item5.addActionListener(e -> consultar()); 
		
		JMenuItem item6= new JMenuItem("¿Como crear un usuario?");
		item6.addActionListener(e -> crear()); 
		JMenuItem item7= new JMenuItem("¿Como acceder al sistema?");
		item7.addActionListener(e -> acceder()); 
		JMenuItem item8 = new JMenuItem("¿Olvidaste la contraseña?");
		item8.addActionListener(e -> pass()); 
		
		JMenuItem item9 = new JMenuItem("Regresar");
		item9.addActionListener(e -> login());
		
		menu.add(menu1);
		menu.add(menu2);
		menu.add(menu3);
		
		menu1.add(item);
		menu1.add(item1);
		menu1.add(item2);
		
		menu2.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		
		menu3.add(item6);
		menu3.add(item7);
		menu3.add(item8);
		menu3.add(item9);
		
		this.setJMenuBar(menu);

//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(285, 330, 120, 25);
		panelLogin.add(boton);
		boton.addActionListener(e -> crear());
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola >:I");
				
				if(text.getText().equals("Romi") || pass.getPassword().equals("aguacate")) {
					text.setBorder(BorderFactory.createLineBorder(Color.green));
					System.out.println("Bienvenido!!");
				}else {
					text.setBorder(BorderFactory.createLineBorder(Color.red));
					pass.setBorder(BorderFactory.createLineBorder(Color.red));
				}
				
			}});

		setContentPane(panelLogin);
		panelLogin.revalidate();
		panelLogin.repaint();
		panelLogin.add(boton);
//		panelLogin.add(etq1);
		setVisible(true);
	}
	
	private void crear () {
 		
 		getContentPane().removeAll();
 		//
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Ayuda");
		JMenu menu2 = new JMenu("Archivos");
		
		JMenuItem item = new JMenuItem("Atencion al cliente");
		JMenuItem item1 = new JMenuItem("Configuracion");
		JMenuItem item2 = new JMenuItem("Clientes");
		JMenuItem item3 = new JMenuItem("Regresar");
		item3.addActionListener(e -> login());
		
		menu.add(menu1);
		menu.add(menu2);
		
		menu1.add(item);
		menu1.add(item1);
		
		menu2.add(item2);
		menu2.add(item3);
		this.setJMenuBar(menu);
		
		JLabel etq = new JLabel("Crear cuenta");
		etq.setBounds(195, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);
		
//		JLabel etq1 = new JLabel(new ImageIcon("fondoetq1.jpg"));
//		etq1.setBounds(1, 1, 657, 360);
		
		JLabel etq2 = new JLabel("Nombre de usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(100, 90, 150, 25);
		panelLogin.add(etq2);
		
		JLabel etq21 = new JLabel("Correo:");
		panelLogin.setLayout(null);
		etq21.setForeground(Color.black);
		etq21.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq21.setBounds(180, 120, 90, 25);
		panelLogin.add(etq21);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(150, 150, 100, 30);
		panelLogin.add(etq3);
		
		//
		JTextField text = new JTextField();
		text.setBounds(320, 90, 180, 25);
		panelLogin.add(text);
		
		JTextField text1 = new JTextField();
		text1.setBounds(320, 120, 180, 25);
		panelLogin.add(text1);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 150, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(250, 200, 180, 25);
		panelLogin.add(caja);

		JButton boton = new JButton("Ingresar");
		boton.setBounds(250, 260, 120, 25);
		panelLogin.add(boton);
//		boton.addActionListener(e -> panel1());
		
//		JButton botonSalir = new JButton("Regresar");
//		botonSalir.setBounds(50, 260, 120, 25);
//		panelLogin.add(botonSalir);
//		botonSalir.addActionListener(e -> login());

	
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola >:I");
				
				if(text.getText().equals("Romi") || pass.getPassword().equals("aguacate")) {
					text.setBorder(BorderFactory.createLineBorder(Color.green));
					pass.setBorder(BorderFactory.createLineBorder(Color.green));
					System.out.println("Bienvenido!!");
				}else {
					text.setBorder(BorderFactory.createLineBorder(Color.red));
					pass.setBorder(BorderFactory.createLineBorder(Color.red));
				}
			}});
		
//		panelLogin.add(etq1);
		setVisible(true);
 		setContentPane(panelLogin); 
 		repaint();
 		revalidate();
 	}
			
	private void registro () {
		
 		getContentPane().removeAll();
 		//
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Ayuda");
		JMenu menu2 = new JMenu("Archivos");
		
		JMenuItem item = new JMenuItem("Atencion al cliente");
		JMenuItem item1 = new JMenuItem("Configuracion");
		JMenuItem item2 = new JMenuItem("Clientes");
		JMenuItem item3 = new JMenuItem("Regresar");
		item3.addActionListener(e -> login());
		
		menu.add(menu1);
		menu.add(menu2);
		
		menu1.add(item);
		menu1.add(item1);
		
		menu2.add(item2);
		menu2.add(item3);
		this.setJMenuBar(menu);
		
		JLabel etq = new JLabel("Registro menu");
		etq.setBounds(150, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(180, 130, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(150, 200, 100, 30);
		panelLogin.add(etq3);
		
//		
		JTextField text = new JTextField();
		text.setBounds(320, 130, 180, 25);
		panelLogin.add(text);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 200, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(320, 240, 180, 25);
		panelLogin.add(caja);
		
//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(285, 330, 120, 25);
		panelLogin.add(boton);
		
		setVisible(true);
 		setContentPane(panelLogin); 
 		repaint();
 		revalidate();
	}
	
	private void recuperarCuenta () {
		
 		getContentPane().removeAll();
 		//
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Ayuda");
		JMenu menu2 = new JMenu("Archivos");
		
		JMenuItem item = new JMenuItem("Atencion al cliente");
		JMenuItem item1 = new JMenuItem("Configuracion");
		JMenuItem item2 = new JMenuItem("Clientes");
		JMenuItem item3 = new JMenuItem("Regresar");
		item3.addActionListener(e -> login());
		
		menu.add(menu1);
		menu.add(menu2);
		
		menu1.add(item);
		menu1.add(item1);
		
		menu2.add(item2);
		menu2.add(item3);
		this.setJMenuBar(menu);
		
		JLabel etq = new JLabel("Recuperar Cuenta");
		etq.setBounds(150, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);
		
//		//
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(180, 130, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(150, 200, 100, 30);
		panelLogin.add(etq3);
		
		JLabel etq21 = new JLabel("Correo:");
		panelLogin.setLayout(null);
		etq21.setForeground(Color.black);
		etq21.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq21.setBounds(180, 163, 90, 25);
		panelLogin.add(etq21);
		
//		
		JTextField text = new JTextField();
		text.setBounds(320, 130, 180, 25);
		panelLogin.add(text);
		
		JTextField text1 = new JTextField();
		text1.setBounds(320, 163, 180, 25);
		panelLogin.add(text1);


		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 200, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(320, 240, 180, 25);
		panelLogin.add(caja);
		
//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(285, 330, 120, 25);
		panelLogin.add(boton);
	
		
		setVisible(true);
 		setContentPane(panelLogin); 
 		repaint();
 		revalidate();
	}
	
	private void alta () {
		
 		getContentPane().removeAll();
 		//
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Ayuda");
		JMenu menu2 = new JMenu("Archivos");
		
		JMenuItem item = new JMenuItem("Atencion al cliente");
		JMenuItem item1 = new JMenuItem("Configuracion");
		JMenuItem item2 = new JMenuItem("Clientes");
		JMenuItem item3 = new JMenuItem("Regresar");
		item3.addActionListener(e -> login());
		
		menu.add(menu1);
		menu.add(menu2);
		
		menu1.add(item);
		menu1.add(item1);
		
		menu2.add(item2);
		menu2.add(item3);
		this.setJMenuBar(menu);
		
		JLabel etq = new JLabel("Alta de datos");
		etq.setBounds(150, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(180, 130, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(150, 200, 100, 30);
		panelLogin.add(etq3);
		
		JLabel etq21 = new JLabel("Correo:");
		panelLogin.setLayout(null);
		etq21.setForeground(Color.black);
		etq21.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq21.setBounds(180, 163, 90, 25);
		panelLogin.add(etq21);
		
//		
		JTextField text = new JTextField();
		text.setBounds(320, 130, 180, 25);
		panelLogin.add(text);
		
		JTextField text1 = new JTextField();
		text1.setBounds(320, 163, 180, 25);
		panelLogin.add(text1);


		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 200, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(320, 240, 180, 25);
		panelLogin.add(caja);
		
//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(285, 330, 120, 25);
		panelLogin.add(boton);
	
		
		setVisible(true);
 		setContentPane(panelLogin); 
 		repaint();
 		revalidate();
	}
	
	private void baja () {
		
 		getContentPane().removeAll();
 		//
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Ayuda");
		JMenu menu2 = new JMenu("Archivos");
		
		JMenuItem item = new JMenuItem("Atencion al cliente");
		JMenuItem item1 = new JMenuItem("Configuracion");
		JMenuItem item2 = new JMenuItem("Clientes");
		JMenuItem item3 = new JMenuItem("Regresar");
		item3.addActionListener(e -> login());
		
		menu.add(menu1);
		menu.add(menu2);
		
		menu1.add(item);
		menu1.add(item1);
		
		menu2.add(item2);
		menu2.add(item3);
		this.setJMenuBar(menu);
		
		JLabel etq = new JLabel("Baja de datos");
		etq.setBounds(150, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(180, 130, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(150, 200, 100, 30);
		panelLogin.add(etq3);
		
		JLabel etq21 = new JLabel("Correo:");
		panelLogin.setLayout(null);
		etq21.setForeground(Color.black);
		etq21.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq21.setBounds(180, 163, 90, 25);
		panelLogin.add(etq21);
		
//		
		JTextField text = new JTextField();
		text.setBounds(320, 130, 180, 25);
		panelLogin.add(text);
		
		JTextField text1 = new JTextField();
		text1.setBounds(320, 163, 180, 25);
		panelLogin.add(text1);


		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 200, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(320, 240, 180, 25);
		panelLogin.add(caja);
		
//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(285, 330, 120, 25);
		panelLogin.add(boton);
	
		
		setVisible(true);
 		setContentPane(panelLogin); 
 		repaint();
 		revalidate();
	}
	
	private void consultar () {
		
 		getContentPane().removeAll();
 		//
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Ayuda");
		JMenu menu2 = new JMenu("Archivos");
		
		JMenuItem item = new JMenuItem("Atencion al cliente");
		JMenuItem item1 = new JMenuItem("Configuracion");
		JMenuItem item2 = new JMenuItem("Clientes");
		JMenuItem item3 = new JMenuItem("Regresar");
		item3.addActionListener(e -> login());
		
		menu.add(menu1);
		menu.add(menu2);
		
		menu1.add(item);
		menu1.add(item1);
		
		menu2.add(item2);
		menu2.add(item3);
		this.setJMenuBar(menu);
		
		JLabel etq = new JLabel("Consulta de datos");
		etq.setBounds(150, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(180, 130, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(150, 200, 100, 30);
		panelLogin.add(etq3);
		
		JLabel etq21 = new JLabel("Correo:");
		panelLogin.setLayout(null);
		etq21.setForeground(Color.black);
		etq21.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq21.setBounds(180, 163, 90, 25);
		panelLogin.add(etq21);
		
//		
		JTextField text = new JTextField();
		text.setBounds(320, 130, 180, 25);
		panelLogin.add(text);
		
		JTextField text1 = new JTextField();
		text1.setBounds(320, 163, 180, 25);
		panelLogin.add(text1);


		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 200, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(320, 240, 180, 25);
		panelLogin.add(caja);
		
//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(285, 330, 120, 25);
		panelLogin.add(boton);
	
		
		setVisible(true);
 		setContentPane(panelLogin); 
 		repaint();
 		revalidate();
	}

	private void acceder () {
		
 		getContentPane().removeAll();
 		//
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Ayuda");
		JMenu menu2 = new JMenu("Archivos");
		
		JMenuItem item = new JMenuItem("Atencion al cliente");
		JMenuItem item1 = new JMenuItem("Configuracion");
		JMenuItem item2 = new JMenuItem("Clientes");
		JMenuItem item3 = new JMenuItem("Regresar");
		item3.addActionListener(e -> login());
		
		menu.add(menu1);
		menu.add(menu2);
		
		menu1.add(item);
		menu1.add(item1);
		
		menu2.add(item2);
		menu2.add(item3);
		this.setJMenuBar(menu);
		
		JLabel etq = new JLabel("Acceder a mi cuenta");
		etq.setBounds(150, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(180, 130, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(150, 200, 100, 30);
		panelLogin.add(etq3);
		
		JLabel etq21 = new JLabel("Correo:");
		panelLogin.setLayout(null);
		etq21.setForeground(Color.black);
		etq21.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq21.setBounds(180, 163, 90, 25);
		panelLogin.add(etq21);
		
//		
		JTextField text = new JTextField();
		text.setBounds(320, 130, 180, 25);
		panelLogin.add(text);
		
		JTextField text1 = new JTextField();
		text1.setBounds(320, 163, 180, 25);
		panelLogin.add(text1);


		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 200, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(320, 240, 180, 25);
		panelLogin.add(caja);
		
//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(285, 330, 120, 25);
		panelLogin.add(boton);
	
		
		setVisible(true);
 		setContentPane(panelLogin); 
 		repaint();
 		revalidate();
	}
	
	private void pass () {
		
 		getContentPane().removeAll();
 		//
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
		
		JMenuBar menu = new JMenuBar();
		
		JMenu menu1 = new JMenu("Ayuda");
		JMenu menu2 = new JMenu("Archivos");
		
		JMenuItem item = new JMenuItem("Atencion al cliente");
		JMenuItem item1 = new JMenuItem("Configuracion");
		JMenuItem item2 = new JMenuItem("Clientes");
		JMenuItem item3 = new JMenuItem("Regresar");
		item3.addActionListener(e -> login());
		
		menu.add(menu1);
		menu.add(menu2);
		
		menu1.add(item);
		menu1.add(item1);
		
		menu2.add(item2);
		menu2.add(item3);
		this.setJMenuBar(menu);
		
		JLabel etq = new JLabel("Olvide mi contraseña");
		etq.setBounds(150, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(180, 130, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(150, 200, 100, 30);
		panelLogin.add(etq3);
		
		JLabel etq21 = new JLabel("Correo:");
		panelLogin.setLayout(null);
		etq21.setForeground(Color.black);
		etq21.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq21.setBounds(180, 163, 90, 25);
		panelLogin.add(etq21);
		
//		
		JTextField text = new JTextField();
		text.setBounds(320, 130, 180, 25);
		panelLogin.add(text);
		
		JTextField text1 = new JTextField();
		text1.setBounds(320, 163, 180, 25);
		panelLogin.add(text1);


		JPasswordField pass = new JPasswordField();
		pass.setBounds(320, 200, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(320, 240, 180, 25);
		panelLogin.add(caja);
		
//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(285, 330, 120, 25);
		panelLogin.add(boton);
	
		
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