import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class GatoRaton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean turno = true;
	private int puntoX = 0, puntoY = 0;

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
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	JLabel cont, contGato, contRaton;
	private JPanel panel_1;
	public GatoRaton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 621);
		setTitle("Tic Tac Toe");
		ImageIcon icono = new ImageIcon(("juegoDeMesa.png"));
		setIconImage(icono.getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 174, 215));
		panel.setBounds(0, 0, 505, 580);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ImageIcon imgGatob = (new ImageIcon("C:\\Users\\gennd\\git\\IDS_Programacion3\\Ventana\\src\\gato03.png"));
		ImageIcon imgRaton = (new ImageIcon("C:\\Users\\gennd\\git\\IDS_Programacion3\\Ventana\\src\\raton01.png"));
		
		btn1 = new JButton("");
		btn1.setBounds(10, 132, 157, 140);
		panel.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn1.getText().equals("")) {
					if (turno) {
						btn1.setText("X");
						btn1.setIcon(imgGatob);
						btn1.setEnabled(true);
					} else {
						btn1.setText("O");
						btn1.setIcon(imgRaton);
						btn1.setEnabled(true);
					}
					turno = !turno;
					validar();
					return;
				}
			}
		});
		
		btn2 = new JButton("");
		btn2.setBackground(new Color(240, 240, 240));
		btn2.setBounds(177, 132, 157, 140);
		panel.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn2.getText().equals("")) {
					if (turno) {
						btn2.setText("X");
						btn2.setIcon(imgGatob);
						btn2.setEnabled(true);
					} else {
						btn2.setText("O");
						btn2.setIcon(imgRaton);
						btn2.setEnabled(true);
					}
					turno = !turno;
					validar();
					return;
				}
			}
		});
		
		btn3 = new JButton("");
		btn3.setBounds(339, 132, 157, 140);
		panel.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn3.getText().equals("")) {
					if (turno) {
						btn3.setText("X");
						btn3.setIcon(imgGatob);
						btn3.setEnabled(true);
					} else {
						btn3.setText("O");
						btn3.setIcon(imgRaton);
						btn3.setEnabled(true);
					}
					turno = !turno;
					validar();
					return;
				}	
			}
		});
		
		btn4 = new JButton("");
		btn4.setBounds(10, 277, 157, 140);
		panel.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn4.getText().equals("")) {
					if (turno) {
						btn4.setText("X");
						btn4.setIcon(imgGatob);
						btn4.setEnabled(true);
					} else {
						btn4.setText("O");
						btn4.setIcon(imgRaton);
						btn4.setEnabled(true);
					}
					turno = !turno;
					validar();
					return;
				}
			}
		});
		//
		btn5 = new JButton("");
		btn5.setBounds(177, 277, 157, 140);
		panel.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btn5.getText().equals("")) {
					if (turno) {
						btn5.setText("X");
						btn5.setIcon(imgGatob);
						btn5.setEnabled(true);
					} else {
						btn5.setText("O");
						btn5.setIcon(imgRaton);
						btn5.setEnabled(true);
					}
					turno = !turno;
					validar();
					return;
				}
			}
		});
		
		btn6 = new JButton("");
		btn6.setBounds(339, 277, 157, 140);
		panel.add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn6.getText().equals("")) {
					if (turno) {
						btn6.setText("X");
						btn6.setIcon(imgGatob);
						btn6.setEnabled(true);
					} else {
						btn6.setText("O");
						btn6.setIcon(imgRaton);
						btn6.setEnabled(true);
					}
					turno = !turno;
					validar();
					return;
				}
			}
		});
		
		btn7 = new JButton("");
		btn7.setBounds(10, 425, 157, 140);
		panel.add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn7.getText().equals("")) {
					if (turno) {
						btn7.setText("X");
						btn7.setIcon(imgGatob);
						btn7.setEnabled(true);
					} else {
						btn7.setText("O");
						btn7.setIcon(imgRaton);
						btn7.setEnabled(true);
					}
					turno = !turno;
					validar();
					return;
				}
			}
		});
		
		btn8 = new JButton("");
		btn8.setBounds(174, 425, 157, 140);
		panel.add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn8.getText().equals("")) {
					if (turno) {
						btn8.setText("X");
						btn8.setIcon(imgGatob);
						btn8.setEnabled(true);
					} else {
						btn8.setText("O");
						btn8.setIcon(imgRaton);
						btn8.setEnabled(true);
					}
					turno = !turno;
					validar();
					return;
				}
			}
		});
		
		btn9 = new JButton("");
		btn9.setBounds(340, 425, 157, 140);
		panel.add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btn9.getText().equals("")) {
					if (turno) {
						btn9.setText("X");
						btn9.setIcon(imgGatob);
						btn9.setEnabled(true);
					} else {
						btn9.setText("O");
						btn9.setIcon(imgRaton);
						btn9.setEnabled(true);
					}
					turno = !turno;
					validar();
					return;
				}
			}
		});

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 253, 138));
		panel_1.setBounds(20, 10, 458, 58);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		cont = new JLabel("CONTADOR DE PUNTOS");
		cont.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 15));
		cont.setBounds(138, 11, 178, 14);
		panel_1.add(cont);
		
		contGato = new JLabel("Gato : 0");
		contGato.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		contGato.setBounds(30, 33, 66, 15);
		panel_1.add(contGato);
		
		contRaton = new JLabel("Raton: 0");
		contRaton.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		contRaton.setBounds(354, 27, 66, 26);
		panel_1.add(contRaton);
		
		JButton btnReiniciar = new JButton("Reiniciar juego");
		btnReiniciar.setBounds(344, 80, 134, 23);
		panel.add(btnReiniciar);
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas seguir jugando?", "Tic Tac Toe", JOptionPane.YES_NO_OPTION);
				if (opcion == JOptionPane.YES_NO_OPTION) {
					reiniciar();
					panel.repaint();
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
			puntos(btn1.getText());
			return;
		}
		if(!btn4.getText().equals("") && btn4.getText().equals(btn6.getText()) && btn6.getText().equals(btn7.getText())) {
			mostrarGanador(btn4.getText());
			puntos(btn4.getText());
			return;
		}
		if(!btn5.getText().equals("") && btn5.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText())) {
			mostrarGanador(btn5.getText());
			puntos(btn5.getText());
			return;
		}
		
		// === Validaciones para las columnas === 
	    if (!btn1.getText().equals("") && btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText())) {
	        mostrarGanador(btn1.getText());
	        puntos(btn1.getText());
	        return;
	    }
	    if (!btn2.getText().equals("") && btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText())) {
	        mostrarGanador(btn2.getText());
	        puntos(btn2.getText());
	        return;
	    }
	    if (!btn3.getText().equals("") && btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText())) {
	        mostrarGanador(btn3.getText());
	        puntos(btn3.getText());
	        return;
	    }
	    
		// === Validaciones para las diagonales ===
	    if (!btn1.getText().equals("") && btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText())) {
	        mostrarGanador(btn1.getText());
	        puntos(btn1.getText());
	        return;
	    }
	    if (!btn3.getText().equals("") && btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText())) {
	        mostrarGanador(btn3.getText());
	        puntos(btn3.getText());
	        return;
	    }
		
		// === Validaciones para empate ===
		if(!btn1.getText().equals("")  && !btn2.getText().equals("")  && !btn3.getText().equals("")  &&
			!btn4.getText().equals("")  && !btn5.getText().equals("")  && !btn6.getText().equals("")  &&
			!btn7.getText().equals("")  && !btn8.getText().equals("")  && !btn9.getText().equals("")) {
			javax.swing.JOptionPane.showMessageDialog(null, "Es un empate!!");
			
		}
		
	}
	
	private void reiniciar() {
		
		btn1.setText("");
		btn2.setText("");
		btn3.setText("");
		btn4.setText("");
		btn5.setText("");
		btn6.setText("");
		btn7.setText("");
		btn8.setText("");
		btn9.setText("");

		btn1.setIcon(null);
		btn2.setIcon(null);
		btn3.setIcon(null);
		btn4.setIcon(null);
		btn5.setIcon(null);
		btn6.setIcon(null);
		btn7.setIcon(null);
		btn8.setIcon(null);
		btn9.setIcon(null);
		
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		
		turno = true;
 		repaint();
 		revalidate();
	}
	
	private void puntos (String ganador) {
		
		if(ganador.equals("X")) {
			puntoX ++; 
		}else if(ganador.equals("O")) {
			puntoY ++;
		}
		contGato.setText("X: " + puntoX);
		contRaton.setText("O: " + puntoY);
	}
}
