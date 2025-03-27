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

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public paint() {
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
		btnNewButton_2.setBounds(27, 205, 99, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Borrador");
		btnNewButton_3.setBounds(27, 171, 99, 23);
		panel_1.add(btnNewButton_3);
		
		JLabel lblColores = new JLabel("Colores");
		lblColores.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
		lblColores.setBounds(10, 270, 78, 32);
		panel_1.add(lblColores);
		
		JSlider slider = new JSlider();
		slider.setBounds(10, 245, 145, 14);
		panel_1.add(slider);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(10, 303, 17, 14);
		panel_1.add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(new Color(255, 255, 255));
		panel_3_1.setBounds(37, 303, 17, 14);
		panel_1.add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBackground(new Color(128, 128, 128));
		panel_3_2.setBounds(64, 303, 17, 14);
		panel_1.add(panel_3_2);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBackground(new Color(0, 0, 128));
		panel_3_3.setBounds(92, 303, 17, 14);
		panel_1.add(panel_3_3);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBackground(new Color(255, 0, 0));
		panel_3_4.setBounds(10, 325, 17, 14);
		panel_1.add(panel_3_4);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setBackground(new Color(0, 255, 0));
		panel_3_5.setBounds(37, 325, 17, 14);
		panel_1.add(panel_3_5);
		
		JPanel panel_3_6 = new JPanel();
		panel_3_6.setBackground(new Color(255, 128, 192));
		panel_3_6.setBounds(64, 325, 17, 14);
		panel_1.add(panel_3_6);
		
		JPanel panel_3_7 = new JPanel();
		panel_3_7.setBackground(new Color(255, 128, 0));
		panel_3_7.setBounds(92, 325, 17, 14);
		panel_1.add(panel_3_7);
		
		JButton btnNewButton_4 = new JButton("Limpiar pantalla");
		btnNewButton_4.setBounds(10, 360, 145, 23);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Guardar");
		btnNewButton_4_1.setBackground(new Color(80, 160, 160));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_1.setBounds(10, 394, 145, 23);
		panel_1.add(btnNewButton_4_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(185, 21, 615, 421);
		panel.add(panel_2);
	}
}
