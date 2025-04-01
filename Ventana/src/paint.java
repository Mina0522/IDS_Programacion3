import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;

public class paint extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public logicaPaint logicaP;
	public Color colors = Color.BLACK;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paint frame = new paint();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public paint() {
		logicaP = new logicaPaint();
		design();
	}
	private void design() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(109, 182, 182));
		panel.setBounds(0, 0, 810, 466);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(223, 223, 223));
		panel_1.setBounds(10, 11, 165, 444);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Figuras");
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 78, 32);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Rectangulo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(27, 40, 99, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Circulo");
		btnNewButton_1.setBounds(27, 74, 99, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Triangulo");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(27, 108, 99, 23);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblOpciones = new JLabel("Opciones");
		lblOpciones.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
		lblOpciones.setBounds(10, 142, 99, 32);
		panel_1.add(lblOpciones);
		
		JButton btnNewButton_2 = new JButton("Lapiz");
		btnNewButton_2.setBounds(27, 185, 99, 23);
		panel_1.add(btnNewButton_2);
		
		JLabel lblColores = new JLabel("Colores");
		lblColores.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
		lblColores.setBounds(10, 270, 78, 32);
		panel_1.add(lblColores);
		
		JSlider slider = new JSlider(1, 10, 3);
		slider.setBounds(10, 369, 145, 14);
		panel_1.add(slider);
		slider.addChangeListener(e -> {
			logicaP.setGrosorPincel(slider.getValue());
			logicaP.getPaintPanel().repaint();
		});
		
		JButton btnNewButton_4 = new JButton("Limpiar");
		btnNewButton_4.setBounds(27, 236, 99, 23);
		btnNewButton_4.addActionListener(e ->logicaP.limpiarD());
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Guardar");
		btnNewButton_4_1.setBackground(new Color(80, 160, 160));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_1.setBounds(10, 394, 145, 23);
		panel_1.add(btnNewButton_4_1);
		
		JButton rojo = new JButton("");
		rojo.setBackground(new Color(255, 0, 0));
		rojo.setBounds(10, 297, 26, 23);
		rojo.addActionListener(e -> {
			if (!colors.equals(Color.RED))
				colors = Color.RED;
				logicaP.setColorP(colors);
		});
		panel_1.add(rojo);
		
		JButton verde = new JButton("");
		verde.setBackground(new Color(128, 255, 0));
		verde.setBounds(46, 297, 26, 23);
		verde.addActionListener(e -> {
			if (!colors.equals(Color.GREEN))
				colors = Color.GREEN;
				logicaP.setColorP(colors);
		});
		
		panel_1.add(verde);
		
		JButton azul = new JButton("");
		azul.setBackground(new Color(0, 0, 255));
		azul.setBounds(82, 297, 26, 23);
		azul.addActionListener(e -> {
			if (!colors.equals(Color.BLUE))
				colors = Color.BLUE;
				logicaP.setColorP(colors);
		});
		panel_1.add(azul);
		
		JButton rosa = new JButton("");
		rosa.setBackground(new Color(255, 0, 128));
		rosa.setBounds(118, 297, 26, 23);
		rosa.addActionListener(e -> {
			if (!colors.equals(Color.PINK))
				colors = Color.PINK;
				logicaP.setColorP(colors);
		});
		panel_1.add(rosa);
		
		JButton negro = new JButton("");
		negro.setBackground(new Color(0, 0, 0));
		negro.setBounds(10, 331, 26, 23);
		negro.addActionListener(e -> {
			if (!colors.equals(Color.BLACK))
				colors = Color.BLACK;
				logicaP.setColorP(colors);
		});
		panel_1.add(negro);
		
		JButton blanco = new JButton("");
		blanco.setBackground(new Color(255, 255, 255));
		blanco.setBounds(46, 331, 26, 23);
		blanco.addActionListener(e -> {
			if (!colors.equals(Color.WHITE))
				colors = Color.WHITE;
				logicaP.setColorP(colors);
		});
		panel_1.add(blanco);
		
		JButton mora = new JButton("");
		mora.setBackground(new Color(128, 0, 128));
		mora.setBounds(82, 331, 26, 23);
		mora.addActionListener(e -> {
			if (!colors.equals(Color.MAGENTA))
				colors = Color.MAGENTA;
				logicaP.setColorP(colors);
		});
		panel_1.add(mora);
		
		JButton gris = new JButton("");
		gris.setBackground(new Color(128, 128, 128));
		gris.setBounds(118, 331, 26, 23);
		gris.addActionListener(e -> {
			if (!colors.equals(Color.GRAY))
				colors = Color.GRAY;
				logicaP.setColorP(colors);
		});
		panel_1.add(gris);
		
		JPanel panel_2 = logicaP.getPaintPanel();
		panel_2.setBounds(185, 21, 615, 421);
		panel.add(panel_2);
	}
}
