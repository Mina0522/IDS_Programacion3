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
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;
import javax.swing.JProgressBar;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;

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
		contentPane.setBackground(new Color(74, 119, 119));
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(140, 187, 204));
		panel.setBounds(10, 11, 279, 256);
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
		rdbtnNewRadioButton.setBackground(new Color(140, 187, 204));
		rdbtnNewRadioButton.setBounds(46, 177, 71, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 11));
		rdbtnMasculino.setBackground(new Color(140, 187, 204));
		rdbtnMasculino.setBounds(135, 177, 73, 23);
		panel.add(rdbtnMasculino);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"op01", "op02", "op03", "op04", "op05"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(104, 204, 118, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(140, 187, 204));
		panel_1.setBounds(299, 278, 296, 266);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("NUEVO");
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setBounds(89, 45, 112, 36);
		panel_1.add(btnNewButton);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnGuardar.setBackground(SystemColor.controlHighlight);
		btnGuardar.setBounds(89, 109, 112, 36);
		panel_1.add(btnGuardar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnSalir.setBackground(SystemColor.controlHighlight);
		btnSalir.setBounds(89, 173, 112, 36);
		panel_1.add(btnSalir);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(140, 187, 204));
		panel_2.setBounds(299, 11, 296, 256);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PERFIL DE USUARIO");
		lblNewLabel_2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(48, 11, 203, 24);
		panel_2.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		chckbxNewCheckBox.setBackground(new Color(140, 187, 204));
		chckbxNewCheckBox.setBounds(74, 177, 151, 23);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxMostrarFechaDe.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		chckbxMostrarFechaDe.setBackground(new Color(140, 187, 204));
		chckbxMostrarFechaDe.setBounds(74, 210, 203, 23);
		panel_2.add(chckbxMostrarFechaDe);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(192, 192, 192));
		panel_3.setBounds(48, 56, 201, 112);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Imagen");
		lblNewLabel_4.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(76, 47, 45, 21);
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(140, 187, 204));
		panel_2_1.setBounds(10, 278, 279, 266);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("DATOS OPCIONALES");
		lblNewLabel_3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(31, 11, 217, 41);
		panel_2_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Descripcion");
		lblNewLabel_5.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 66, 78, 22);
		panel_2_1.add(lblNewLabel_5);
		
		JList list = new JList();
		list.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"op01", "op02", "op03", "op04", "op05", "op06", "op07"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(193, 99, 55, 131);
		panel_2_1.add(list);
		
		JLabel lblNewLabel_5_1 = new JLabel("Preferencias");
		lblNewLabel_5_1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(193, 66, 84, 22);
		panel_2_1.add(lblNewLabel_5_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 99, 132, 131);
		panel_2_1.add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(144, 99, 17, 131);
		panel_2_1.add(scrollBar);
	}
}
