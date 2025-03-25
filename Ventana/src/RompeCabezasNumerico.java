import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class RompeCabezasNumerico extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		lblNewLabel.setBounds(177, 11, 291, 27);
		panel_1.add(lblNewLabel);
		
		JButton btnReiniciar = new JButton("Reiniciar Juego");
		btnReiniciar.setForeground(new Color(255, 255, 255));
		btnReiniciar.setBackground(new Color(141, 199, 199));
		btnReiniciar.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btnReiniciar.setBounds(250, 52, 136, 27);
		panel_1.add(btnReiniciar);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn1.setBounds(75, 130, 89, 80);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn2.setBounds(214, 130, 89, 80);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn3.setBounds(350, 130, 89, 80);
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn4.setBounds(492, 130, 89, 80);
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn5.setBounds(75, 243, 89, 80);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn6.setBounds(214, 243, 89, 80);
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn7.setBounds(350, 243, 89, 80);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn8.setBounds(492, 243, 89, 80);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn9.setBounds(75, 349, 89, 80);
		panel.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn10.setBounds(214, 349, 89, 80);
		panel.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn11.setBounds(350, 349, 89, 80);
		panel.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn12.setBounds(492, 349, 89, 80);
		panel.add(btn12);
		
		JButton btn13 = new JButton("13");
		btn13.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn13.setBounds(75, 452, 89, 80);
		panel.add(btn13);
		
		JButton btn14 = new JButton("14");
		btn14.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn14.setBounds(214, 452, 89, 80);
		panel.add(btn14);
		
		JButton btn15 = new JButton("15");
		btn15.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn15.setBounds(350, 452, 89, 80);
		panel.add(btn15);
		
		JButton btn16 = new JButton("");
		btn1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 12));
		btn16.setBounds(492, 452, 89, 80);
		panel.add(btn16);
	}
}
