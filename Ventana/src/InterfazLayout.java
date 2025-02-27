import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfazLayout {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Interes Calculadora");
		frame.setSize(300, 320);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		String color1 = "#737373";
		String color2 = "#ADE84A";
		String verde2 = "#7EA836";
		String color3 = "#F27272";
		
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.decode(color1));
        panel1.setSize(300, 50);

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.decode(color2));
        panel2.setSize(300, 200);
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(Color.decode(color3));
        panel3.setSize(300, 150);
        
        // PANEL 1
		 
		JLabel titleLabel = new JLabel("Interés");
		titleLabel.setBounds(10, 10, 90, 25);
		titleLabel.setFont(new Font("cooper black", Font.PLAIN, 20));
		titleLabel.setForeground(Color.white);
		panel1.add(titleLabel);
		
		// =========================================
		// = PANEL 2
		
		// ==== CAPITAL
		
		int y = 50;
		
		JLabel capitalLabel = new JLabel("Interés");
		capitalLabel.setBounds(10, y+10, 90, 25);
		panel2.add(capitalLabel);
		
		JTextField capital = new JTextField("1500");
		capital.setBounds(90, y+10, 90, 25);
		panel2.add(capital);
		
		// ==== TIEMPO
		
		JLabel tiempoLabel = new JLabel("Tiempo");
		tiempoLabel.setBounds(10, y+40, 90, 25);
		panel2.add(tiempoLabel);

		JTextField tiempo = new JTextField("2");
		tiempo.setBounds(90, y+40, 90, 25);
		panel2.add(tiempo);
		
		// ==== TASA DE INTERES
		
		JLabel tasaLabel = new JLabel("Tasa");
		tasaLabel.setBounds(10, y+70, 90, 25);
		panel2.add(tasaLabel);

		JTextField tasa = new JTextField("0.1");
		tasa.setBounds(90, y+70, 90, 25);
		panel2.add(tasa);
		
		JButton calcularBtn = new JButton("Calcular");
		calcularBtn.setBounds(10, y+100, 90, 25);
		panel2.add(calcularBtn);
		
		JButton cancelarBtn = new JButton("Cancelar");
		cancelarBtn.setBounds(120, y+100, 90, 25);
		panel2.add(cancelarBtn);
		
		// PANEL 2
		// =========================================
		
		// =========================================
		// = PANEL 3
		
		y = 200;
		
		JLabel interesLabel = new JLabel("Interes");
		interesLabel.setBounds(10, y+10, 90, 25);
		panel3.add(interesLabel);
		
		JTextField interes = new JTextField("315.002");
		interes.setBounds(90, y+10, 90, 25);
		panel3.add(interes);
		
		JLabel montoLabel = new JLabel("Monto");
		montoLabel.setBounds(10, y+40, 90, 25);
		panel3.add(montoLabel);
		
		JTextField monto = new JTextField("1815.002");
		monto.setBounds(90, y+40, 90, 25);
		panel3.add(monto);
		
		// PANEL 3
		// =========================================
		
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);

		frame.add(mainPanel);
		frame.setVisible(true);
	}
	
}