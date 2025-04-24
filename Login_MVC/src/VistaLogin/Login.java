package VistaLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controlador.Conexion;

public class Login extends JFrame{

	private JFrame frame;
 	private JTextField text;
 	private JPasswordField pass;
 	public Conexion functions;

	public void login() {
		
		this.functions = functions;
		
		frame = new JFrame();
 		frame.setBounds(20, 10, 660, 600);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
 		frame.setVisible(true);
 		
 		JPanel panelLogin = new JPanel ();
		setResizable(false);
		panelLogin.setBounds(20, 10, 660, 600);
		panelLogin.setLayout(null);
		frame.getContentPane().add(panelLogin);

		JLabel etq = new JLabel("Login");
		etq.setBounds(45, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);	
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(55, 130, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(30, 200, 100, 30);
		panelLogin.add(etq3);
//		
		text = new JTextField();
		text.setBounds(130, 130, 180, 25);
		panelLogin.add(text);

		pass = new JPasswordField();
		pass.setBounds(130, 200, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(130, 240, 180, 25);
		panelLogin.add(caja);

//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(150, 330, 120, 25);
		panelLogin.add(boton);
		boton.addActionListener(e -> registro());
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola >:I");
				String u = getusuario();
				String p = getpass();
				
				if(text.getText().equals(u) || pass.getPassword().equals(p)) {
					text.setBorder(BorderFactory.createLineBorder(Color.green));
					System.out.println("Bienvenido!!");
				}else {
					text.setBorder(BorderFactory.createLineBorder(Color.red));
					pass.setBorder(BorderFactory.createLineBorder(Color.red));
				}
				
			}});

		frame.add(panelLogin);
 		frame.repaint();
 		panelLogin.repaint();
	}

	public void registro() {
		
 		getContentPane().removeAll();
		
		frame = new JFrame();
 		frame.setBounds(20, 10, 660, 600);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
 		frame.setVisible(true);
 		
 		JPanel panelLogin = new JPanel ();
		setResizable(false);
		panelLogin.setBounds(20, 10, 660, 600);
		panelLogin.setLayout(null);
		frame.getContentPane().add(panelLogin);

		JLabel etq = new JLabel("Bienvenido");
		etq.setBounds(50, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);	
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(55, 120, 90, 25);
		panelLogin.add(etq2);
		
		JLabel etq3 = new JLabel("Correo:");
		panelLogin.setLayout(null);
		etq3.setForeground(Color.black);
		etq3.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq3.setBounds(55, 170, 90, 25);
		panelLogin.add(etq3);
		
		JLabel etq4 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq4.setForeground(Color.black);
		etq4.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq4.setBounds(30, 230, 100, 30);
		panelLogin.add(etq4);
//		
		JTextField text = new JTextField();
		text.setBounds(130, 120, 180, 25);
		panelLogin.add(text);
		
		JTextField text1 = new JTextField();
		text1.setBounds(130, 170, 180, 25);
		panelLogin.add(text1);

		JPasswordField pass = new JPasswordField();
		pass.setBounds(130, 230, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
		
		JCheckBox caja = new JCheckBox("Recordar contraseña.");
		caja.setBounds(130, 280, 180, 25);
		panelLogin.add(caja);

//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Ingresar");
		boton.setBounds(145, 330, 120, 25);
		panelLogin.add(boton);
		boton.addActionListener(e -> registro());
		
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola >:I");
				String u = getusuario();
				String p = getpass();
				
				if(text.getText().equals(u) || pass.getPassword().equals(p)) {
					text.setBorder(BorderFactory.createLineBorder(Color.green));
					System.out.println("Bienvenido!!");
				}else {
					text.setBorder(BorderFactory.createLineBorder(Color.red));
					pass.setBorder(BorderFactory.createLineBorder(Color.red));
				}
				
			}});

		frame.add(panelLogin);
 		frame.repaint();
 		panelLogin.repaint();		
	}

	public String getusuario() {

		return text.getText();
	}

	public String getpass() {

		return new String(pass.getPassword());
	}
	
}
