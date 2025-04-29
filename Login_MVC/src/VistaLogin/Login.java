package VistaLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
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
 	private JTextField text, textapellido, textEm, textCargo, textUser, textCorreo;
 	private JPasswordField pass, passc;
 	private JComboBox combo;
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

		JLabel etq = new JLabel("Registro de usuarios.");
		etq.setBounds(160, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);	
//		
		JLabel etq2 = new JLabel("Nombre:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(130, 100, 90, 25);
		panelLogin.add(etq2);
		
		text = new JTextField();
		text.setBounds(200, 100, 180, 25);
		panelLogin.add(text);
		
//		
		JLabel etqApellido = new JLabel("Apellido:");
		panelLogin.setLayout(null);
		etqApellido.setForeground(Color.black);
		etqApellido.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etqApellido.setBounds(130, 130, 90, 25);
		panelLogin.add(etqApellido);
		
		textapellido = new JTextField();
		textapellido.setBounds(200, 130, 180, 25);
		panelLogin.add(textapellido);
		
//		
		JLabel etqEm = new JLabel("Empresa:");
		panelLogin.setLayout(null);
		etqEm.setForeground(Color.black);
		etqEm.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etqEm.setBounds(130, 160, 90, 25);
		panelLogin.add(etqEm);
		
		textEm = new JTextField();
		textEm.setBounds(200, 160, 180, 25);
		panelLogin.add(textEm);
//
		
		JLabel etqPuesto = new JLabel("Ambito:");
		panelLogin.setLayout(null);
		etqPuesto.setForeground(Color.black);
		etqPuesto.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etqPuesto.setBounds(130, 190, 90, 25);
		panelLogin.add(etqPuesto);
		
		combo = new JComboBox();
		combo.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		combo.setModel(new DefaultComboBoxModel(new String[] {
				"Tecnologia", 
				"Salud", 
				"Educacion", 
				"Comercio", 
				"Otro"
				}));
		combo.setToolTipText("");
		combo.setBounds(200, 190, 118, 22);
		panelLogin.add(combo);
//		
		JLabel etqCargo = new JLabel("Cargo:");
		panelLogin.setLayout(null);
		etqCargo.setForeground(Color.black);
		etqCargo.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etqCargo.setBounds(140, 250, 90, 25);
		panelLogin.add(etqCargo);
		
		textCargo = new JTextField();
		textCargo.setBounds(200, 250, 180, 25);
		panelLogin.add(textCargo);
//
		
		JLabel etqUser = new JLabel("Nombre de usuario:");
		panelLogin.setLayout(null);
		etqUser.setForeground(Color.black);
		etqUser.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etqUser.setBounds(45, 290, 190, 25);
		panelLogin.add(etqUser);
		
		textUser = new JTextField();
		textUser.setBounds(200, 290, 180, 25);
		panelLogin.add(textUser);
//
		
		JLabel etqCorreo = new JLabel("Correo:");
		panelLogin.setLayout(null);
		etqCorreo.setForeground(Color.black);
		etqCorreo.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etqCorreo.setBounds(130, 330, 90, 25);
		panelLogin.add(etqCorreo);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(200, 330, 180, 25);
		panelLogin.add(textCorreo);
//
		
		JLabel etqPass = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etqPass.setForeground(Color.black);
		etqPass.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etqPass.setBounds(100, 380, 100, 30);
		panelLogin.add(etqPass);
		
		pass = new JPasswordField();
		pass.setBounds(200, 380, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);
// Confirmacion de contraseña
		JLabel etqPassConf = new JLabel("Confirmar contraseña:");
		panelLogin.setLayout(null);
		etqPassConf.setForeground(Color.black);
		etqPassConf.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etqPassConf.setBounds(30, 430, 180, 30);
		panelLogin.add(etqPassConf);
		
		passc = new JPasswordField();
		passc.setBounds(200, 430, 180, 25);
		passc.setEchoChar('*');
		panelLogin.add(passc);
		
//		=== BOTON Y SU FUNCION ===
		JButton boton = new JButton("Añadir");
		boton.setBounds(250, 490, 120, 25);
		panelLogin.add(boton);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola >:I");
				
				LogicaUsuario.Usuario user = new LogicaUsuario.Usuario();
				
				String u = getusuario();	
				String p = getpass();
				
				String nombre = text.getText();	
				String apellido = textapellido.getText();
				String cargo = textCargo.getText();
				
				if(user.logicaU(u, p)) {
					text.setBorder(BorderFactory.createLineBorder(Color.green));
					pass.setBorder(BorderFactory.createLineBorder(Color.green));
					System.out.println("Bienvenido!!");
					
					frame.dispose();
					registro();
				}else {
					text.setBorder(BorderFactory.createLineBorder(Color.red));
					pass.setBorder(BorderFactory.createLineBorder(Color.red));
					System.out.println("Datos incorrectos.");
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
				
				if(text.getText().equals(u) && pass.getPassword().equals(p)) {
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
