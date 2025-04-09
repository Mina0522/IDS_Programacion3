import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
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
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Juego extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panelJ;
	public int x = 0, y = 0, xStart = 415, yStart = 165; // 415, 165
	public PaintPanel cdverde = new PaintPanel();
	
	private int tiempo = 0;
	private Timer time;
	private boolean isRunning = false;
	private JLabel lblTiempo;
	
	private int panelWidth = 666, panelHeight = 500;
	private int mapaWidth = 650, mapaHeight = 350;
	
	Player player;
	private ArrayList<Player> obstaculo = new ArrayList<Player>();
	
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
		
		lblTiempo = new JLabel("Tiempo: ");
		lblTiempo.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		lblTiempo.setBounds(378, 11, 101, 21);
		panelTiempo.add(lblTiempo);
		
//		=== Panel que llevara el juego ===
		panelJ = new JPanel();
		panelJ.setBackground(new Color(0, 0, 0));
		panelJ.setBounds(0, 42, 836, 367);
		contentPane.add(panelJ);
		panelJ.setLayout(null);
		
		cdverde = new PaintPanel();
		panelJ.add(cdverde);
		cdverde.setLocation(xStart, yStart);
		
		player = new Player (xStart, yStart, 20, 20, Color.green);
		
		obstaculo = new ArrayList<Player>();
		obstaculo.add(new Player(50, 50, 120, 50, Color.red));
		obstaculo.add(new Player(450, 50, 120, 50, Color.red));
		
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
				
				tiempo = 0;
				cronometro();
			}
		});
		btnReiniciar.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		btnReiniciar.setBounds(353, 11, 133, 23);
		panelbtn.add(btnReiniciar);
	}
//		=== ACCIONES DEL JUEGO ===

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
	
	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int newX = player.x;
	    int newY = player.y;
	    int avance = 10;
		
		System.out.println("INICIO: x=" + x + " y=" + y + " h=" + mapaHeight + " w=" + mapaWidth);
		
		if (e.getExtendedKeyCode() == KeyEvent.VK_UP) {
			newY -= avance;
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_DOWN) {
			newY += avance;
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
			newX -= avance;
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
			newX += avance;
		}
		
	    if (newX < 0 || newX + player.w > panelJ.getWidth() ||
	        newY < 0 || newY + player.h > panelJ.getHeight()) {
	            return;
	    }
		
		Player p1 = new Player (newX, newY, player.w, player.h, player.c);
		
		boolean colision2 = false;
		
		for(Player par : obstaculo) {
			if (p1.colision(par)) {
				colision2 = true;
				break;
			}
		}
		
		if(!colision2) {
			player.x = newX;
			player.y = newY;
		}

        panelJ.repaint();
		
		// debug
		System.out.println("FIN: x=" + cdverde.getX() + " y=" + cdverde.getY() + " h=" + mapaHeight + " w=" + mapaWidth);
		
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
            
            g2.setColor(player.c);
            g2.fillRect(player.x, player.y, player.w, player.h);
            
    		for(Player pared : obstaculo) {
    			
    			g2.setColor(pared.c);
                g2.fillRect(pared.x, pared.y, pared.w, pared.h);
    		}

         }
    }
    
    class Player {
    	
     	public int x, y, w, h;
     	Color c;

    	public Player(int x, int y, int w, int h , Color c) {
    		
    		this.x = x;
    		this.y = y;
    		this.w = w;
    		this.h = h;
    		this.c = c;
    	}
    		
    	public Boolean colision(Player target) {
    		
    	 return (this.x < target.x + target.w &&
            this.x + this.w > target.x &&
            this.y < target.y + target.h &&
            this.y + this.h > target.y);    		
    	}
    }    	
}