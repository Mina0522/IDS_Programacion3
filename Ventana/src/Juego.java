import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument.Iterator;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Juego extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panelJ;
	public int x = 0, y = 0, xStart = 415, yStart = 165; // 415, 165
	public PaintPanel cdverde = new PaintPanel();
	
	private ArrayList<Point> puntos = new ArrayList<Point>();
	List<List<Point>> listaDePuntos = new ArrayList<>(); 
	List<Integer> trazosG = new ArrayList<>();
	List<Color> trazoC = new ArrayList<>();
	List<Figura> figuras = new ArrayList();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
		setResizable(false);
		addKeyListener(this);
		setFocusable(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		=== Panel con el tiempo ===
		JPanel panelTiempo = new JPanel();
		panelTiempo.setBounds(0, 0, 836, 43);
		contentPane.add(panelTiempo);
		panelTiempo.setLayout(null);
		
		JLabel tiempo = new JLabel("00:00:00");
		tiempo.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		tiempo.setBounds(378, 11, 101, 21);
		panelTiempo.add(tiempo);
		
//		=== Panel que llevara el juego ===
		panelJ = new JPanel();
		panelJ.setBackground(new Color(0, 0, 0));
		panelJ.setBounds(0, 42, 836, 367);
		contentPane.add(panelJ);
		panelJ.setLayout(null);
		
		cdverde = new PaintPanel();
		panelJ.add(cdverde);
		cdverde.setLocation(xStart, yStart);
			
//		=== Panel con el boton de reinicio ===
		JPanel panelbtn = new JPanel();
		panelbtn.setBounds(0, 411, 836, 49);
		contentPane.add(panelbtn);
		panelbtn.setLayout(null);
		
		JButton btnReiniciar = new JButton("Reiniciar\r\n");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				// posicionar el cuadro en el centro
				cdverde.setLocation(xStart, yStart);
				cdverde.repaint();
				setFocusable(true);
				requestFocus(); 
			}
		});
		btnReiniciar.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		btnReiniciar.setBounds(353, 11, 133, 23);
		panelbtn.add(btnReiniciar);
	}
//		=== ACCIONES DEL JUEGO ===

	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {

		int x = cdverde.getX();
		int y = cdverde.getY();
		
		// debug
		System.out.println("x=" + x + " y=" + y + " h=" + panelJ.getHeight() + " w=" + panelJ.getWidth());
		
		if (e.getExtendedKeyCode() == KeyEvent.VK_UP) {
			if (y == 0) {	
				return;
			}
			cdverde.setLocation(x, y - 5);
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_DOWN) {
			if (y == 335) {	
				return;
			}
			cdverde.setLocation(x, y + 5);
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
			if (x == 0) {	
				return;
			}
			cdverde.setLocation(x - 5, y);
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
			if (x == 800) {	
				return;
			}
			cdverde.setLocation(x + 5, y);
		}
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}
    class PaintPanel extends JPanel {
        public PaintPanel() {
            this.setBackground(Color.black);
    		this.setBounds(0, 0, 836, 367);
    		setLayout(null);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            
            int tamanio = 35;
            g2.setColor(Color.green);
            g2.fillRect(0, 0, tamanio, tamanio);

         }
    }
    
    class Figura {
    	public int x, y, w, h;
		public String t;
		public Color color;
        public int grosor;
    	
    	public Figura (int x, int y, int w, int h, String t, Color color, int grosor )
    	{
    		this.x = x;
    		this.y = y;
    		this.w = w;
    		this.h = h;
    		this.t = t;
    		this.color = color;
    		this.grosor = grosor;
    	}
    	
    	public void setTam(int ancho, int alto) {
    		this.w = ancho;
    		this.h = alto;
    	}
    }
}
//  System.out.println(");