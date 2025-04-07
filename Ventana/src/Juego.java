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


public class Juego extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panelJ;
	public int x = 100, y = 150;
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
			
//		=== Panel con el boton de reinicio ===
		JPanel panelbtn = new JPanel();
		panelbtn.setBounds(0, 411, 836, 49);
		contentPane.add(panelbtn);
		panelbtn.setLayout(null);
		
		JButton btnReiniciar = new JButton("Reiniciar\r\n");
		btnReiniciar.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		btnReiniciar.setBounds(353, 11, 133, 23);
		panelbtn.add(btnReiniciar);
		
		setVisible(true);
	}
//		=== ACCIONES DEL JUEGO ===

	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if (e.getExtendedKeyCode() == KeyEvent.VK_UP) {
			cdverde.setLocation(cdverde.getX(), cdverde.getY() - 5);
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_DOWN) {
			cdverde.setLocation(cdverde.getX(), cdverde.getY() + 5);
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
			cdverde.setLocation(cdverde.getX() - 5, cdverde.getY());
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
			cdverde.setLocation(cdverde.getX() + 5, cdverde.getY());
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
            
            int tam= 35;
            g2.setColor(Color.green);
            g2.fillRect(x, y , tam, tam);

         }
    }
    
    class Figura {
    	public int x,y,w,h;
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