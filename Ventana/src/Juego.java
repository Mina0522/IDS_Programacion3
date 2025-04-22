import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument.Iterator;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JPanel contentPane;
	private PaintPanel panelJ;
	public int x = 0, y = 0, xStart = 0, yStart = 0;
	public int metaX = 631, metaY = 323;
	public PaintPanel cdverde = new PaintPanel();
	
	private int tiempo = 0;
	private Timer time, timeDirecion ;
	private boolean isRunning = false;
	private JLabel lblTiempo;
	
	private int panelWidth = 666, panelHeight = 500;
	private int mapaWidth = 650, mapaHeight = 350;
	private int direccionX = 0 , direccionY = 0; 
	
	Player player;
	private ArrayList<Player> obstaculo = new ArrayList<Player>();
	private int [][] mapaL = {
			{0,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,0,0,0,1,0,0,0,0,0,0},
			{1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,1,1,1,0,1,1,1,1,1,0},
			{1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,0,0,0,1,0,0,0,0,0,0,1},
			{1,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1,0,1},
			{1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,1,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,1,1,1,1,0,1,0,1,0,1,1,1,0,1,0},
			{0,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,0,1,1,0,0,0,1,0,1,0,1,1,0,1,1,0},
			{1,0,0,0,0,0,1,0,1,1,1,0,1,0,0,0,1,0,0,1,0,1,1,1,0,1,0,1,0,0,0,1,0},
			{1,0,1,1,1,0,1,0,1,0,0,0,1,0,1,1,1,0,1,1,0,0,0,1,0,1,0,1,0,1,0,0,1},
			{1,0,0,0,1,0,0,0,1,0,1,1,0,0,1,1,1,0,0,0,1,1,0,1,0,1,0,0,0,1,1,0,1},
			{0,1,1,0,0,0,1,1,0,0,1,1,0,1,0,0,0,0,1,1,0,1,0,1,0,1,0,1,1,1,0,0,1},
			{0,1,1,0,1,0,1,0,1,0,0,1,0,1,0,1,1,1,1,0,0,0,0,1,0,1,0,0,0,1,0,1,0},
			{0,0,0,0,1,0,1,1,0,0,1,0,0,1,0,0,1,0,1,0,1,1,1,1,0,1,1,1,0,1,0,0,1},
			{1,0,1,0,1,0,0,0,1,0,0,1,0,1,1,0,0,1,0,0,1,0,0,1,1,1,0,0,0,1,1,0,1},
			{1,0,1,0,1,0,1,0,0,0,1,1,0,0,0,0,1,0,0,1,0,1,0,0,0,1,0,1,1,1,0,0,1},
			{1,0,1,0,1,0,1,1,1,1,0,0,1,0,1,1,0,0,1,1,0,1,0,1,0,1,0,0,1,1,0,1,1},
			{1,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,1,0,0,0,0,0,0,1,0,0,0,0,1,1,0,0,0},
			{0,1,1,1,0,1,1,1,1,1,0,1,0,0,0,1,0,1,1,1,1,1,1,0,1,1,1,1,0,0,1,1,1}
	};
	private int paredtam = 20;
	
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
		contentPane.setBackground(new Color(77, 77, 77));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		=== Panel con el tiempo ===
		JPanel panelTiempo = new JPanel();
		panelTiempo.setBackground(new Color(77, 77, 77));
		panelTiempo.setBounds(0, 0, 836, 43);
		contentPane.add(panelTiempo);
		panelTiempo.setLayout(null);
		
		lblTiempo = new JLabel("Tiempo: ");
		lblTiempo.setBackground(new Color(240, 240, 240));
		lblTiempo.setForeground(new Color(255, 255, 255));
		lblTiempo.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		lblTiempo.setBounds(306, 11, 275, 21);
		panelTiempo.add(lblTiempo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(633, 11, 124, 32);
		panelTiempo.add(panel_3);
		
		JPanel panel_1_10 = new JPanel();
		panel_1_10.setBounds(140, 11, 74, 66);
		panelTiempo.add(panel_1_10);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBounds(0, 0, 74, 66);
		panelTiempo.add(panel_1_5);
		
		JPanel panel_1_12_2 = new JPanel();
		panel_1_12_2.setBounds(762, 0, 74, 66);
		panelTiempo.add(panel_1_12_2);
			
//		=== Panel que llevara el juego ===
		panelJ = new PaintPanel();
		panelJ.setFocusable(true);
		panelJ.setBounds(95, 50, mapaWidth, mapaHeight);
		contentPane.add(panelJ);
		panelJ.setLayout(null);
		panelJ.addKeyListener(this);
		panelJ.setOpaque(true);
	
		obstaculo = new ArrayList<Player>();
		player = new Player (0, 0, 15, 15, Color.black);
		mapaLaberinto();
//		obstaculo.add(new Player(0, 25, 150, 5, Color.blue));
//		obstaculo.add(new Player(150, 25, 5, 150, Color.blue));
//		obstaculo.add(new Player(50, 170, 5, 150, Color.blue));
		timeDirecion = new Timer(10, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				update();
			}
		});
		timeDirecion.start();
		
//		=== Panel con el boton de reinicio ===
		JPanel panelbtn = new JPanel();
		panelbtn.setBackground(new Color(77, 77, 77));
		panelbtn.setBounds(0, 411, 836, 49);
		contentPane.add(panelbtn);
		panelbtn.setLayout(null);
		
		JButton btnReiniciar = new JButton("Reiniciar\r\n");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				player.x = xStart;
				player.y = yStart;
				setFocusable(true);
				requestFocus(); 
				
				tiempo = 0;
				cronometro();
				direccionX = 0;
				direccionY = 0;
				
				panelJ.repaint();
			}
		});
		btnReiniciar.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 15));
		btnReiniciar.setBounds(353, 11, 133, 23);
		panelbtn.add(btnReiniciar);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 28, 94, 10);
		panelbtn.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(563, 28, 157, 10);
		panelbtn.add(panel_5);
		
		JPanel panel_1_13 = new JPanel();
		panel_1_13.setBounds(269, -17, 74, 66);
		panelbtn.add(panel_1_13);
		
		JPanel panel_1_12_1 = new JPanel();
		panel_1_12_1.setBounds(762, -17, 74, 66);
		panelbtn.add(panel_1_12_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(62, 42, 74, 66);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 185, 198, 86);
		contentPane.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(638, 318, 198, 86);
		contentPane.add(panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(62, 374, 198, 43);
		contentPane.add(panel_2_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(762, 86, 74, 66);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(684, 251, 74, 66);
		contentPane.add(panel_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBounds(762, 174, 74, 66);
		contentPane.add(panel_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBounds(684, 131, 74, 66);
		contentPane.add(panel_1_4);
		
		JPanel panel_1_6 = new JPanel();
		panel_1_6.setBounds(0, 119, 74, 66);
		contentPane.add(panel_1_6);
		
		JPanel panel_1_7 = new JPanel();
		panel_1_7.setBounds(426, 42, 74, 66);
		contentPane.add(panel_1_7);
		
		JPanel panel_1_9 = new JPanel();
		panel_1_9.setBounds(219, 42, 74, 66);
		contentPane.add(panel_1_9);
		
		JPanel panel_1_11 = new JPanel();
		panel_1_11.setBounds(0, 297, 74, 66);
		contentPane.add(panel_1_11);
		
		JPanel panel_1_12 = new JPanel();
		panel_1_12.setBounds(484, 344, 74, 66);
		contentPane.add(panel_1_12);
		
		JPanel panel_1_8 = new JPanel();
		panel_1_8.setBounds(657, 54, 74, 66);
		contentPane.add(panel_1_8);
	}
	
//		=== ACCIONES DEL JUEGO ===
	public void mapaLaberinto() {
	    for (int i = 0; i < mapaL.length; i++) { // i == fila
	        for (int j = 0; j < mapaL[i].length; j++) { // j == columnas
	            if (mapaL[i][j] == 1) {
	                int x = j * paredtam;
	                int y = i * paredtam;
	                obstaculo.add(new Player(x, y, paredtam, paredtam, Color.blue));
	            }
	        }
	    }
	}

	private void cronometro() {
		time = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
		cronometro();
	    int avance = 5;
		
//		System.out.println("INICIO: x=" + x + " y=" + y + " h=" + mapaHeight + " w=" + mapaWidth);
		
		if (e.getExtendedKeyCode() == KeyEvent.VK_UP) {
			direccionX = 0;
			direccionY =- avance;
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_DOWN) {
			direccionX = 0;
			direccionY = avance;
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_LEFT) {
			direccionX =- avance;
			direccionY = 0;
		}
		if (e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
			direccionX = avance;
			direccionY = 0;
		}
//		System.out.println("FIN: x=" + x + " y=" + y + " h=" + mapaHeight + " w=" + mapaWidth);
	}
	
	private void update() {
		
		int newX = player.x + direccionX;
	    int newY = player.y + direccionY;
	    
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
			
			if (player.x >= metaX && player.y >= metaY) {
			    timeDirecion.stop();
			    JOptionPane.showMessageDialog(null, "¡Ganaste!");
			}

	        panelJ.repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}

    class PaintPanel extends JPanel {
        public PaintPanel() {
            this.setBackground(Color.white);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
  
            g.setColor(player.c);
            g.fillRect(player.x, player.y, player.w, player.h);
            
    		for(Player pared : obstaculo) {
    			g.setColor(pared.c);
                g.fillRect(pared.x, pared.y, pared.w, pared.h);
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