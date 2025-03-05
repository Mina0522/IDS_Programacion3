import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Tabla extends JFrame{

	private JButton boton, boton1;
	
	JPanel tabla = new JPanel ();
	
	public Tabla() {
		action();
		vistaPricipal();
		botones();
	}
	
	private void vistaPricipal() {
		
		// Creamos y colocamos una ventana con color.
		String color = "#015958";
		this.setSize(1000, 530);
		this.setTitle("Ventana");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabla.setLayout(null);
	
		tabla.setBackground(Color.decode(color));
		this.setBackground(Color.lightGray);
		this.getContentPane().add(tabla); 
		
		//Pantalla principal
		JLabel etiqueta = new JLabel();
		String color2 = "#023535";
		etiqueta.setText("Usuarios");
		etiqueta.setBounds(325, 10, 350, 50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setForeground(Color.white);
		etiqueta.setOpaque(true);
		etiqueta.setBackground(Color.black);
		etiqueta.setFont(new Font ("arial", Font.PLAIN,30));
		etiqueta.setBackground(Color.decode (color2));
		tabla.add(etiqueta);
		
		JLabel etiqueta1 = new JLabel();
		String color1 = "#023535";
		etiqueta1.setText("Total de usuarios: 100");
		etiqueta1.setBounds(25, 175, 350, 50);
		etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta1.setForeground(Color.white);
		etiqueta1.setOpaque(true);
		etiqueta1.setBackground(Color.black);
		etiqueta1.setFont(new Font ("arial", Font.PLAIN,30));
		etiqueta1.setBackground(Color.decode (color1));
		tabla.add(etiqueta1);
		
		this.setVisible(true);
		
	}
	
	private void action() {

		String[] columnNames = {"First Name",
	            "Last Name",
	            "Sport",
	            "# of Years",
	            "Vegetarian"};
		
		Object[][] data = {
			    {"Kathy", "Smith", "Snowboarding", 5, false},
			    {"John", "Doe", "Rowing", 3, true},
			    {"Sue", "Black", "Knitting", 2, false},
			    {"Jane", "White", "Speed reading", 4, true},
			    {"Joe", "Brown", "Pool", 1, false},
			    {"Kathy", "Smith", "Snowboarding", 5, false},
			    {"John", "Doe", "Rowing", 3, true},
			    {"Sue", "Black", "Knitting", 2, false},
			    {"Jane", "White", "Speed reading", 4, true},
			    {"Joe", "Brown", "Pool", 1, false},
			    {"Kathy", "Smith", "Snowboarding", 5, false},
			    {"John", "Doe", "Rowing", 3, true},
			    {"Sue", "Black", "Knitting", 2, false},
			    {"Jane", "White", "Speed reading", 4, true},
			    {"Joe", "Brown", "Pool", 1, false},
			    {"Kathy", "Smith", "Snowboarding", 5, false},
			    {"John", "Doe", "Rowing", 3, true},
			    {"Sue", "Black", "Knitting", 2, false},
			    {"Jane", "White", "Speed reading", 4, true},
			    {"Joe", "Brown", "Pool", 1, false},
			    {"Kathy", "Smith", "Snowboarding", 5, false},
			    {"John", "Doe", "Rowing", 3, true},
			    {"Sue", "Black", "Knitting", 2, false},
			    {"Jane", "White", "Speed reading", 4, true},
			    {"Joe", "Brown", "Pool", 1, false},
			    {"Kathy", "Smith", "Snowboarding", 5, false},
			    {"John", "Doe", "Rowing", 3, true},
			    {"Sue", "Black", "Knitting", 2, false},
			    {"Jane", "White", "Speed reading", 4, true},
			    {"Joe", "Brown", "Pool", 1, false},
			    {"Kathy", "Smith", "Snowboarding", 5, false},
			    {"John", "Doe", "Rowing", 3, true},
			    {"Sue", "Black", "Knitting", 2, false},
			    {"Jane", "White", "Speed reading", 4, true},
			    {"Joe", "Brown", "Pool", 1, false}
			};

		JTable table = new JTable(data, columnNames);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setSize(930, 200);
		scroll.setLocation(30,250);
		tabla.add(scroll);
		
		this.setVisible(true);
	}

	private void botones() {
		
		boton = new JButton("Exportar");
		boton.setBounds(650, 210, 120, 25);
		tabla.add(boton);
		
		boton1 = new JButton("Añadir");
		boton1.setBounds(780, 210, 120, 25);
		tabla.add(boton1);
	}
	public static void main(String[] args) {
		
		new Tabla();

	}

}
