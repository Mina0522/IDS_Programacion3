package VistaLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Controlador.Conexion;

public class Login extends JFrame{

	public JFrame frame;
	public JTextField text, textapellido, textEm, textCargo, textUser, textCorreo;
 	public JPasswordField pass, passc;
 	public JComboBox combo;
 	public JButton botonRegistrar;
 	public JMenuBar menu;
	JMenu menu1;
	JMenu menu2;
 	public Conexion functions;
 	
 	public void login(Conexion functions) {
 		
 		this.functions = functions;
 		
 		frame = new JFrame();
 		frame.setBounds(20, 10, 660, 600);
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setVisible(true);
 		frame.setResizable(false);
 		
 		JPanel panelLogin = new JPanel ();
		setResizable(false);
		panelLogin.setBounds(20, 10, 660, 600);
		panelLogin.setLayout(null);
		frame.getContentPane().add(panelLogin);

		JLabel etq = new JLabel("Login");
		etq.setBounds(150, 5, 300, 80);
		etq.setHorizontalAlignment(SwingConstants.CENTER);
		etq.setForeground(Color.black);
		etq.setFont(new Font("Century Gothic",Font.PLAIN,30));
		panelLogin.add(etq);	
		
		JLabel etq2 = new JLabel("Usuario:");
		panelLogin.setLayout(null);
		etq2.setForeground(Color.black);
		etq2.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq2.setBounds(190, 120, 90, 25);
		panelLogin.add(etq2);
		
		text = new JTextField();
		text.setBounds(290, 120, 180, 25);
		panelLogin.add(text);

		JLabel etq4 = new JLabel("Contraseña:");
		panelLogin.setLayout(null);
		etq4.setForeground(Color.black);
		etq4.setFont(new Font("Century Gothic",Font.PLAIN,15));
		etq4.setBounds(170, 170, 100, 30);
		panelLogin.add(etq4);
		
		pass = new JPasswordField();
		pass.setBounds(290, 170, 180, 25);
		pass.setEchoChar('*');
		panelLogin.add(pass);

//		=== BOTON Y SU FUNCION ===
		
		JButton boton = new JButton("Ingresar");
		boton.setBounds(250, 230, 120, 25);
		panelLogin.add(boton);
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola >:I");
				
				LogicaUsuario.Usuario user = new LogicaUsuario.Usuario();
				
				String u = getusuario();	
				String p = getpass();
				
				if(user.logicaU(u, p)) {
					text.setBorder(BorderFactory.createLineBorder(Color.green));
					pass.setBorder(BorderFactory.createLineBorder(Color.green));
					System.out.println("Bienvenido!!");
					
					frame.dispose();
					homeview();
				}else {
					text.setBorder(BorderFactory.createLineBorder(Color.red));
					pass.setBorder(BorderFactory.createLineBorder(Color.red));
					System.out.println("Datos incorrectos.");
				}
			}});

		JButton botonCuenta = new JButton("¿No tienes cuenta?");
		botonCuenta.setBounds(220, 290, 180, 25);
		panelLogin.add(botonCuenta);
		botonCuenta.addActionListener (e -> registro());

 		frame.repaint();
 		panelLogin.repaint();		
	}

	public void registro() {
		
		frame.getContentPane().removeAll();
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
		botonRegistrar = new JButton("Añadir");
		botonRegistrar.setBounds(250, 490, 120, 25);
		panelLogin.add(botonRegistrar);
		botonRegistrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == botonRegistrar) {
					
					String nombre = text.getText();
					String apellido = textapellido.getText();
					String empresa = textEm.getText(); 
					String area = combo.getSelectedItem().toString();
					String cargo = textCargo.getText(); 
					String user = textUser.getText();
					String correo = textCorreo.getText(); 
					String contrasenia = new String(pass.getPassword()); 
					String confirmar_contrasenia = new String(passc.getPassword());
					
					LogicaUsuario.Usuario log = new LogicaUsuario.Usuario();
					
					if (!contrasenia.equals(confirmar_contrasenia)) {
						JOptionPane.showMessageDialog(null, "Contraseña invalida");
						return;
					}
					
					boolean guardado_correctamente = log.nuevacuenta(
							nombre, apellido, empresa,
							area, cargo, user, correo,
							contrasenia,confirmar_contrasenia, confirmar_contrasenia
							);
					if(guardado_correctamente) {
						JOptionPane.showMessageDialog(null, "Registro exitoso!");
						homeview();
					} else {
						JOptionPane.showMessageDialog(null, "Oh... Algo no salio bien!!!");
					}
				}
			
			}});

		frame.revalidate();
		frame.repaint();
 		panelLogin.repaint();
	}
	
	public void homeview() {
	    frame.getContentPane().removeAll();
	    frame.setBounds(20, 10, 660, 600);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    frame.setResizable(false);

	    JPanel panel = new JPanel(new BorderLayout());
	    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    frame.getContentPane().add(panel);

	    JPanel widget = new JPanel(new GridLayout(1, 4, 10, 10));
	    widget.add(crearWidget("Widget 1", Color.LIGHT_GRAY));
	    widget.add(crearWidget("Widget 2", Color.PINK));
	    widget.add(crearWidget("Widget 3", Color.LIGHT_GRAY));
	    widget.add(crearWidget("Widget 4", Color.PINK));

	    panel.add(widget, BorderLayout.NORTH);

	    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 20));
	    JButton btnUsuarios = new JButton("Usuarios");
	    JButton btnRegistros = new JButton("Registros");
	    JButton btnConfiguracion = new JButton("Configuración");

	    btnUsuarios.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Usuarios"));
	    btnRegistros.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Registros"));
	    btnConfiguracion.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Configuracion"));

	    buttonPanel.add(btnUsuarios);
	    buttonPanel.add(btnRegistros);
	    buttonPanel.add(btnConfiguracion);
	    panel.add(buttonPanel, BorderLayout.SOUTH);

	    menu = new JMenuBar();
	    menu1 = new JMenu("Ayuda");
	    menu2 = new JMenu("Archivos");

	    JMenuItem item = new JMenuItem("Atencion al cliente");
	    JMenuItem item1 = new JMenuItem("Configuracion");
	    JMenuItem item2 = new JMenuItem("Clientes");
	    JMenuItem item3 = new JMenuItem("Regresar");
	    item3.addActionListener(e -> login(functions));

	    menu1.add(item);
	    menu1.add(item1);
	    menu2.add(item2);
	    menu2.add(item3);

	    menu.add(menu1);
	    menu.add(menu2);
	    frame.setJMenuBar(menu);

	    frame.revalidate();
	    frame.repaint();
	}


	public String getusuario() {

		return text.getText();
	}

	public String getpass() {
		
		return new String(pass.getPassword());
	}

    public JPanel crearWidget(String texto, Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        JLabel label = new JLabel(texto);
        panel.add(label);
        return panel;
    }
}
