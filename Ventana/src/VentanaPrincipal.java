import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("Registro de usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 594);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 221, 221));
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(142, 198, 198));
		panel.setBounds(10, 11, 286, 256);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATOS GENERALES");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNewLabel.setBounds(41, 11, 196, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre completo:");
		lblNewLabel_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 56, 107, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_1_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 106, 124, 24);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Sexo:");
		lblNewLabel_1_2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(10, 161, 39, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nacionalidad:");
		lblNewLabel_1_3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(10, 207, 84, 14);
		panel.add(lblNewLabel_1_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 81, 212, 20);
		panel.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(10, 130, 212, 20);
		panel.add(textPane_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Femenino");
		rdbtnNewRadioButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		rdbtnNewRadioButton.setBackground(new Color(142, 198, 198));
		rdbtnNewRadioButton.setBounds(46, 177, 71, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		rdbtnMasculino.setBackground(new Color(142, 198, 198));
		rdbtnMasculino.setBounds(135, 177, 73, 23);
		panel.add(rdbtnMasculino);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"op01", "op02", "op03", "op04", "op05"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(104, 204, 118, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(142, 198, 198));
		panel_1.setBounds(297, 270, 298, 274);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(111, 81, 89, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(111, 152, 176));
		panel_2.setBounds(297, 11, 298, 256);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PERFIL DE USUARIO");
		lblNewLabel_2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(48, 11, 203, 24);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(111, 152, 176));
		panel_2_1.setBounds(10, 270, 286, 274);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("DATOS OPCIONALES");
		lblNewLabel_3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(31, 11, 217, 41);
		panel_2_1.add(lblNewLabel_3);
	}
}
