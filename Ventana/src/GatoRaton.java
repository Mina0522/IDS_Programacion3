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
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
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
		
		
		btn1 = new JButton("");
		btn1.setBounds(0, 0, 167, 149);
		panel.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn1.getText().equals("")) {
					if (turno) {
						btn1.setText("X");
					} else {
						btn1.setText("O");
					}
					turno = !turno;
					validar();
				}
			}
		});
		
		btn2 = new JButton("");
		btn2.setBounds(166, 0, 167, 149);
		panel.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn2.getText().equals("")) {
					if (turno) {
						btn2.setText("X");
					} else {
						btn2.setText("O");
					}
					turno = !turno;
					validar();
				}
			}
		});
		
		btn3 = new JButton("");
		btn3.setBounds(331, 0, 167, 149);
		panel.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn3.getText().equals("")) {
					if (turno) {
						btn3.setText("X");
					} else {
						btn3.setText("O");
					}
					turno = !turno;
					validar();
				}	
			}
		});
		
		btn4 = new JButton("");
		btn4.setBounds(0, 149, 167, 149);
		panel.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn4.getText().equals("")) {
					if (turno) {
						btn4.setText("X");
					} else {
						btn4.setText("O");
					}
					turno = !turno;
					validar();
				}
			}
		});
		
		btn5 = new JButton("");
		btn5.setBounds(0, 295, 167, 149);
		panel.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn5.getText().equals("")) {
					if (turno) {
						btn5.setText("X");
					} else {
						btn5.setText("O");
					}
					turno = !turno;
					validar();
				}
			}
		});
		
		btn6 = new JButton("");
		btn6.setBounds(166, 149, 167, 149);
		panel.add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn6.getText().equals("")) {
					if (turno) {
						btn6.setText("X");
					} else {
						btn6.setText("O");
					}
					turno = !turno;
					validar();
				}
			}
		});
		
		btn7 = new JButton("");
		btn7.setBounds(331, 149, 167, 149);
		panel.add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn7.getText().equals("")) {
					if (turno) {
						btn7.setText("X");
					} else {
						btn7.setText("O");
					}
					turno = !turno;
					validar();
				}
			}
		});
		
		btn8 = new JButton("");
		btn8.setBounds(166, 295, 167, 149);
		panel.add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn8.getText().equals("")) {
					if (turno) {
						btn8.setText("X");
					} else {
						btn8.setText("O");
					}
					turno = !turno;
					validar();
				}
			}
		});
		
		btn9 = new JButton("");
		btn9.setBounds(331, 295, 167, 149);
		panel.add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn9.getText().equals("")) {
					if (turno) {
						btn9.setText("X");
					} else {
						btn9.setText("O");
					}
					turno = !turno;
					validar();
				}
			}
		});
	}
	
	private void mostrarGanador(String ganador) {
		
	    javax.swing.JOptionPane.showMessageDialog(this, "¡GANASTE " + ganador + "!");
	    
	}
	
	private void validar() {
		
		// === Validaciones para las filas === 
		if(!btn1.getText().equals("") && btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText())) {
			mostrarGanador(btn1.getText());
			return;
		}
		if(!btn4.getText().equals("") && btn4.getText().equals(btn6.getText()) && btn6.getText().equals(btn7.getText())) {
			mostrarGanador(btn4.getText());
			return;
		}
		if(!btn5.getText().equals("") && btn5.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText())) {
			mostrarGanador(btn5.getText());
			return;
		}
		
		// === Validaciones para las columnas === 
		if (!btn1.getText().equals("")  && btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn5.getText())) {
			mostrarGanador(btn1.getText());
		}
		if (!btn2.getText().equals("")  && btn2.getText().equals(btn6.getText()) && btn6.getText().equals(btn8.getText())) {
			mostrarGanador(btn2.getText());
		}
		if (!btn3.getText().equals("")  && btn3.getText().equals(btn7.getText()) && btn7.getText().equals(btn9.getText())) {
			mostrarGanador(btn3.getText());
		}
		
		// === Validaciones para las diagonales ===
		if (!btn1.getText().equals("")  && btn1.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText())) {
			mostrarGanador(btn1.getText());
		}
		if (!btn3.getText().equals("")  && btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn5.getText())) {
			mostrarGanador(btn1.getText());
		}
	}
}
