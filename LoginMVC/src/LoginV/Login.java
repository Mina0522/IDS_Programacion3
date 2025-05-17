package LoginV;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame {
	
	public Login () {
		
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
		JPanel panelLogin = new JPanel ();
		setSize(700, 500);
		panelLogin.setBounds(20, 10, 657, 360);
		panelLogin.setLayout(null);
		this.getContentPane().add(panelLogin);
	}

}
