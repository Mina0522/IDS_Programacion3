import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GatoRaton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean turno = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GatoRaton frame = new GatoRaton();
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
	public GatoRaton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 498, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(0, 0, 167, 149);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.getText().equals("")) {
					if (turno) {
						btnNewButton.setText("X");
					} else {
						btnNewButton.setText("O");
					}
					turno = !turno;
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(166, 0, 167, 149);
		panel.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_1.getText().equals("")) {
					if (turno) {
						btnNewButton_1.setText("X");
					} else {
						btnNewButton_1.setText("O");
					}
					turno = !turno;
				}
			}
		});
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(331, 0, 167, 149);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_2.getText().equals("")) {
					if (turno) {
						btnNewButton_2.setText("X");
					} else {
						btnNewButton_2.setText("O");
					}
					turno = !turno;
				}	
			}
		});
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(0, 149, 167, 149);
		panel.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_3.getText().equals("")) {
					if (turno) {
						btnNewButton_3.setText("X");
					} else {
						btnNewButton_3.setText("O");
					}
					turno = !turno;
				}
			}
		});
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(0, 295, 167, 149);
		panel.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnNewButton_4.getText().equals("")) {
					if (turno) {
						btnNewButton_4.setText("X");
					} else {
						btnNewButton_4.setText("O");
					}
					turno = !turno;
				}
			}
		});
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBounds(166, 149, 167, 149);
		panel.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_5.getText().equals("")) {
					if (turno) {
						btnNewButton_5.setText("X");
					} else {
						btnNewButton_5.setText("O");
					}
					turno = !turno;
				}
			}
		});
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBounds(331, 149, 167, 149);
		panel.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_6.getText().equals("")) {
					if (turno) {
						btnNewButton_6.setText("X");
					} else {
						btnNewButton_6.setText("O");
					}
					turno = !turno;
				}
			}
		});
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBounds(166, 295, 167, 149);
		panel.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_7.getText().equals("")) {
					if (turno) {
						btnNewButton_7.setText("X");
					} else {
						btnNewButton_7.setText("O");
					}
					turno = !turno;
				}
			}
		});
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBounds(331, 295, 167, 149);
		panel.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton_8.getText().equals("")) {
					if (turno) {
						btnNewButton_8.setText("X");
					} else {
						btnNewButton_8.setText("O");
					}
					turno = !turno;
				}
			}
		});
	}
	
	private void validar() {

	}

	private void mostrarGanador(String ganador) {
	    javax.swing.JOptionPane.showMessageDialog(this, "¡Ganador: " + ganador + "!");
		}
	}
