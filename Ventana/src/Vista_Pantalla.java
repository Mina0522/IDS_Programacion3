import javax.swing.*;

public class Vista_Pantalla extends JFrame{
	
	//private static final long serialVersionUID = 1L;
	
	public JPanel lamina = new JPanel();
	
	public Vista_Pantalla () {
		
		this.setSize(500,500);
		this.setTitle("Ventana");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(lamina); 
		this.setVisible(true);
	}

public static void main(String[] args) {
	
    new Vista_Pantalla();
    
	}
}