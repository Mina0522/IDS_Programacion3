import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;

public class RompeCabezasNumerico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnReiniciar, btnPausa, btn1, btn2, btn3, btn4, btn5,btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
	
	private int tiempo = 0;
	private Timer time;
	private boolean isRunning = false;
	private JLabel lblTiempo;
	ArrayList <Integer> des = new ArrayList <Integer>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RompeCabezasNumerico frame = new RompeCabezasNumerico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RompeCabezasNumerico() {
		
		cronometro();
		
		des.add(1);
		des.add(2);
		des.add(3);
		des.add(4);
		des.add(5);
		des.add(6);
		des.add(7);
		des.add(8);
		des.add(9);
		des.add(10);
		des.add(11);
		des.add(12);
		des.add(13);
		des.add(14);
		des.add(15);
		des.add(0);
		
		Collections.shuffle(des);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		panel.setBounds(0, 0, 659, 559);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(64, 128, 128));
		panel_1.setBounds(10, 11, 638, 90);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rompe cabezas numerico O.o\r\n");
		lblNewLabel.setBackground(new Color(64, 128, 128));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 291, 27);
		panel_1.add(lblNewLabel);
		
		lblTiempo = new JLabel("Tiempo:");
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		lblTiempo.setBackground(new Color(64, 128, 128));
		lblTiempo.setBounds(10, 49, 224, 27);
		panel_1.add(lblTiempo);
		
//		=== BOTONES ===
		
		btnReiniciar = new JButton("Reiniciar Juego");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		btnReiniciar.setForeground(new Color(255, 255, 255));
		btnReiniciar.setBackground(new Color(141, 199, 199));
		btnReiniciar.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btnReiniciar.setBounds(455, 13, 136, 27);
		panel_1.add(btnReiniciar);
		
		btnPausa = new JButton("Pausa");
		btnPausa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isRunning) {
					time.stop();
					isRunning = false;
					btnPausa.setText("Pausa");
				}
			}
		});
		btnPausa.setForeground(Color.WHITE);
		btnPausa.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btnPausa.setBackground(new Color(141, 199, 199));
		btnPausa.setBounds(455, 54, 136, 27);
		panel_1.add(btnPausa);

		
//		 === BOTONES DEL TABLERO ===
		  
		btn1 = new JButton(des.get(1)+"");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn1);
			}
		});
		btn1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn1.setBounds(75, 130, 89, 80);
		panel.add(btn1);
		
		btn2 = new JButton(des.get(2)+"");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn2);
			}
		});
		btn2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn2.setBounds(214, 130, 89, 80);
		panel.add(btn2);
		
		btn3 = new JButton(des.get(3)+"");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn3);
			}
		});
		btn3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn3.setBounds(350, 130, 89, 80);
		panel.add(btn3);
		
		btn4 = new JButton(des.get(4)+"");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn4);
			}
		});
		btn4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn4.setBounds(492, 130, 89, 80);
		panel.add(btn4);
		
		btn5 = new JButton(des.get(5)+"");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn5);
			}
		});
		btn5.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn5.setBounds(75, 243, 89, 80);
		panel.add(btn5);
		
		btn6 = new JButton(des.get(6)+"");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn6);
			}
		});
		btn6.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn6.setBounds(214, 243, 89, 80);
		panel.add(btn6);
		
		btn7 = new JButton(des.get(7)+"");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn7);
			}
		});
		btn7.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn7.setBounds(350, 243, 89, 80);
		panel.add(btn7);
		
		btn8 = new JButton(des.get(8)+"");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn8);
			}
		});
		btn8.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn8.setBounds(492, 243, 89, 80);
		panel.add(btn8);
		
		btn9 = new JButton(des.get(9)+"");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn9);
			}
		});
		btn9.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn9.setBounds(75, 349, 89, 80);
		panel.add(btn9);
		
		btn10 = new JButton(des.get(10)+"");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn10);
			}
		});
		btn10.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn10.setBounds(214, 349, 89, 80);
		panel.add(btn10);
		
		btn11 = new JButton(des.get(11)+"");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn11);
			}
		});
		btn11.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn11.setBounds(350, 349, 89, 80);
		panel.add(btn11);
		
		btn12 = new JButton(des.get(12)+"");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn12);
			}
		});
		btn12.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn12.setBounds(492, 349, 89, 80);
		panel.add(btn12);
		
		btn13 = new JButton(des.get(13)+"");
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn13);
			}
		});
		btn13.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn13.setBounds(75, 452, 89, 80);
		panel.add(btn13);
		
		btn14 = new JButton(des.get(14)+"");
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn14);
			}
		});
		btn14.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn14.setBounds(214, 452, 89, 80);
		panel.add(btn14);
		
		btn15 = new JButton(des.get(15)+"");
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn15);
			}
		});
		btn15.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn15.setBounds(350, 452, 89, 80);
		panel.add(btn15);
		
		btn16 = new JButton(des.get(0)+"");
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				intercambio(btn16);
			}
		});
		btn1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn16.setBounds(492, 452, 89, 80);
		panel.add(btn16);
		
	}

	private void intercambio(JButton btn) {
	    int boton = -1;
	    int vacio = -1;

	    for (int i = 0; i < des.size(); i++) {
	        if (des.get(i) == 0) {
	            vacio = i;
	        }
	        if (btn.getText().equals(String.valueOf(des.get(i)))) {
	            boton = i;
	        }
	    }

	    if (boton != -1 && vacio != -1) {
	        if ((boton - 1 == vacio && boton % 4 != 0) ||
	            (boton + 1 == vacio && vacio % 4 != 0) ||
	            (boton - 4 == vacio) ||
	            (boton + 4 == vacio)) {

	            int inter = des.get(boton);
	            des.set(boton, des.get(vacio));
	            des.set(vacio, inter);

	            actualizarBotones();

	            if (ganador() == 1) {
	            	if (isRunning) {
		                time.stop();
		        		isRunning = false;
	            	}
	                JOptionPane.showMessageDialog(null, "¡Ganaste!");
	                reiniciar();
	            }
	        }
	    }
	}

	private void actualizarBotones() {

	    btn1.setText(des.get(0) == 0 ? "" : String.valueOf(des.get(0)));
	    btn2.setText(des.get(1) == 0 ? "" : String.valueOf(des.get(1)));
	    btn3.setText(des.get(2) == 0 ? "" : String.valueOf(des.get(2)));
	    btn4.setText(des.get(3) == 0 ? "" : String.valueOf(des.get(3)));
	    btn5.setText(des.get(4) == 0 ? "" : String.valueOf(des.get(4)));
	    btn6.setText(des.get(5) == 0 ? "" : String.valueOf(des.get(5)));
	    btn7.setText(des.get(6) == 0 ? "" : String.valueOf(des.get(6)));
	    btn8.setText(des.get(7) == 0 ? "" : String.valueOf(des.get(7)));
	    btn9.setText(des.get(8) == 0 ? "" : String.valueOf(des.get(8)));
	    btn10.setText(des.get(9) == 0 ? "" : String.valueOf(des.get(9)));
	    btn11.setText(des.get(10) == 0 ? "" : String.valueOf(des.get(10)));
	    btn12.setText(des.get(11) == 0 ? "" : String.valueOf(des.get(11)));
	    btn13.setText(des.get(12) == 0 ? "" : String.valueOf(des.get(12)));
	    btn14.setText(des.get(13) == 0 ? "" : String.valueOf(des.get(13)));
	    btn15.setText(des.get(14) == 0 ? "" : String.valueOf(des.get(14)));
	    btn16.setText(des.get(15) == 0 ? "" : String.valueOf(des.get(15)));
	}

	private int ganador() {
	 
	    for (int i = 0; i < des.size() - 1; i++) {
	        if (des.get(i) != i + 1) {
	            return 0; 
	        }
	    }
	  return des.get(des.size() - 1) == 0 ? 1 : 0;
	}

	private void reiniciar() {
		
		des.clear();

		des.add(1);
		des.add(2);
		des.add(3);
		des.add(4);
		des.add(5);
		des.add(6);
		des.add(7);
		des.add(8);
		des.add(9);
		des.add(10);
		des.add(11);
		des.add(12);
		des.add(13);
		des.add(14);
		des.add(15);
		des.add(0);

		Collections.shuffle(des);
		
		btn1.setText(des.get(1) + "");
		btn2.setText(des.get(2) + "");
		btn3.setText(des.get(3) + "");
		btn4.setText(des.get(4) + "");
		btn5.setText(des.get(5) + "");
		btn6.setText(des.get(6) + "");
		btn7.setText(des.get(7) + "");
		btn8.setText(des.get(8) + "");
		btn9.setText(des.get(9) + "");
		btn10.setText(des.get(10) + "");
		btn11.setText(des.get(11) + "");
		btn12.setText(des.get(12) + "");
		btn13.setText(des.get(13) + "");
		btn14.setText(des.get(14) + "");
		btn15.setText(des.get(15) + "");
		btn16.setText(des.get(0) + "");
		
		tiempo = 0;
		cronometro();
		
	}
	
	private void cronometro() {
		
		time = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tiempo ++;
				
				int hora = tiempo / 3600;
				int min = (tiempo % 3600) / 60;
				int seg = tiempo % 60;
				
				String tf = String.format("%02d:%02d:%02d", hora, min, seg);
				lblTiempo.setText("Tiempo: " + tf);
				
			}
		}); 
		
		time.start();
		isRunning = true;
		
	}
}
