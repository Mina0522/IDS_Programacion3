import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;

public class RompeCabezasNumerico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ArrayList <Integer> des = new ArrayList <Integer>();
	
	

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public RompeCabezasNumerico() {
		
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
		
		JLabel lblTiempo = new JLabel("Tiempo: 00:00:00");
		lblTiempo.setForeground(Color.WHITE);
		lblTiempo.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		lblTiempo.setBackground(new Color(64, 128, 128));
		lblTiempo.setBounds(10, 49, 224, 27);
		panel_1.add(lblTiempo);
		
//		=== BOTONES ===
		
		JButton btnReiniciar = new JButton("Reiniciar Juego");
		btnReiniciar.setForeground(new Color(255, 255, 255));
		btnReiniciar.setBackground(new Color(141, 199, 199));
		btnReiniciar.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btnReiniciar.setBounds(455, 13, 136, 27);
		panel_1.add(btnReiniciar);
		
		JButton btnPausa = new JButton("Pausa");
		btnPausa.setForeground(Color.WHITE);
		btnPausa.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btnPausa.setBackground(new Color(141, 199, 199));
		btnPausa.setBounds(455, 54, 136, 27);
		panel_1.add(btnPausa);
		
		  int delay = 1000; //milliseconds
		  ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		          
		      }
		  };
		  new Timer(delay, taskPerformer).start();
		
//		 === BOTONES DEL TABLERO ===
		  
		JButton btn1 = new JButton(des.get(1)+"");
		btn1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn1.setBounds(75, 130, 89, 80);
		panel.add(btn1);
		
		JButton btn2 = new JButton(des.get(2)+"");
		btn2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn2.setBounds(214, 130, 89, 80);
		panel.add(btn2);
		
		JButton btn3 = new JButton(des.get(3)+"");
		btn3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn3.setBounds(350, 130, 89, 80);
		panel.add(btn3);
		
		JButton btn4 = new JButton(des.get(4)+"");
		btn4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn4.setBounds(492, 130, 89, 80);
		panel.add(btn4);
		
		JButton btn5 = new JButton(des.get(5)+"");
		btn5.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn5.setBounds(75, 243, 89, 80);
		panel.add(btn5);
		
		JButton btn6 = new JButton(des.get(6)+"");
		btn6.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn6.setBounds(214, 243, 89, 80);
		panel.add(btn6);
		
		JButton btn7 = new JButton(des.get(7)+"");
		btn7.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn7.setBounds(350, 243, 89, 80);
		panel.add(btn7);
		
		JButton btn8 = new JButton(des.get(8)+"");
		btn8.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn8.setBounds(492, 243, 89, 80);
		panel.add(btn8);
		
		JButton btn9 = new JButton(des.get(9)+"");
		btn9.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn9.setBounds(75, 349, 89, 80);
		panel.add(btn9);
		
		JButton btn10 = new JButton(des.get(10)+"");
		btn10.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn10.setBounds(214, 349, 89, 80);
		panel.add(btn10);
		
		JButton btn11 = new JButton(des.get(11)+"");
		btn11.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn11.setBounds(350, 349, 89, 80);
		panel.add(btn11);
		
		JButton btn12 = new JButton(des.get(12)+"");
		btn12.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn12.setBounds(492, 349, 89, 80);
		panel.add(btn12);
		
		JButton btn13 = new JButton(des.get(13)+"");
		btn13.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn13.setBounds(75, 452, 89, 80);
		panel.add(btn13);
		
		JButton btn14 = new JButton(des.get(14)+"");
		btn14.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn14.setBounds(214, 452, 89, 80);
		panel.add(btn14);
		
		JButton btn15 = new JButton(des.get(15)+"");
		btn15.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn15.setBounds(350, 452, 89, 80);
		panel.add(btn15);
		
		JButton btn16 = new JButton(des.get(0)+"");
		btn1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn16.setBounds(492, 452, 89, 80);
		panel.add(btn16);
		
	}
	
}
