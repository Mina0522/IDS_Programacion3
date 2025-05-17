package VistaLogin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ProductView {
	
	public JFrame frame;
	public JTextField text, textapellido, textEm, textCargo, textUser, textCorreo;
 	public JPasswordField pass, passc;
 	public JComboBox combo;
 	public JButton botonRegistrar;
 	
	public void homeview() {
	    frame.getContentPane().removeAll();
	    frame.setBounds(20, 10, 660, 600);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	    frame.setResizable(false);

	    JPanel panel = new JPanel(new BorderLayout());
	    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    frame.getContentPane().add(panel);

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

	  
	    frame.revalidate();
	    frame.repaint();
	}

}
