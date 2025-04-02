import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;

public class logicaPaint implements MouseListener, MouseMotionListener {

	private JFrame frame;
	public PaintPanel panel_2;
	public int grosorP = 3;
	public Color colorp = Color.BLACK;
	public String figura_selec = "";
	public Point inicio = null;
	public int borrador;
	
	
	
	private ArrayList<Point> puntos = new ArrayList<Point>();
	List<List<Point>> listaDePuntos = new ArrayList<>(); 
	List<Integer> trazosG = new ArrayList<>();
	List<Color> trazoC = new ArrayList<>();
	List<Figura> figuras = new ArrayList();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logicaPaint window = new logicaPaint();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public logicaPaint() {
		logica();
		panel_2 = new PaintPanel();
        panel_2.addMouseListener(this);
	}

    private void logica() {
	    frame = new JFrame();
	    frame.setBounds(100, 100, 839, 567);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	    JPanel panel = new JPanel();
	    frame.getContentPane().add(panel, BorderLayout.CENTER);
	    panel.setLayout(new BorderLayout(0, 0));
	
	    JPanel panel_1 = new JPanel();
	    panel.add(panel_1, BorderLayout.WEST);
	    panel_1.setLayout(new GridLayout(5, 1, 0, 0));
	    
	    JLabel lblNewLabel = new JLabel("Dibujar");
	    lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
	    panel_1.add(lblNewLabel);
	
	    panel_2 = new PaintPanel();
	    panel_2.addMouseListener(this);
	    panel_2.addMouseMotionListener(this);
	    panel.add(panel_2, BorderLayout.CENTER);

    }
    
    public JPanel getPaintPanel() {
    	return panel_2;
    }
    
    public void limpiarD() {
    	listaDePuntos.clear();
    	trazosG.clear();
    	trazoC.clear();
    	puntos.clear();
    	figuras.clear();
    	panel_2.repaint();
    }
    
    public void borrar() {
    	
    }
    
    public void setGrosorPincel(int grosor) {
    	this.grosorP = grosor;
    }
    
    public void setColorP(Color c) {
    	if(!colorp.equals(c)) {
    		colorp = c;
    	}
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        puntos = new ArrayList<>();
        puntos.add(e.getPoint());
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        if (!puntos.isEmpty()) {
            listaDePuntos.add(new ArrayList<>(puntos));
            trazosG.add(grosorP);
            trazoC.add(colorp);
            puntos.clear();
        }
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        puntos.add(e.getPoint());
        panel_2.repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if(figura_selec.isEmpty()) {
			return;
		}else if("Cuadrado".equals(figura_selec)) {
    		figuras.add(new Figura(x, y, 80, 80, "Cuadrado", colorp, grosorP));
    	}else if ("Circulo".equals(figura_selec)) {
    		figuras.add(new Figura(x, y, 80, 80, "Circulo", colorp, grosorP));
    	}else if ("linea".equals(figura_selec)) {
    		if(inicio == null) {
    			inicio = new Point(x, y);
    		}else {
    			figuras.add(new Figura(inicio.x, inicio.y, x, y, "Linea", colorp, grosorP));
    			
    		}
    	}
    	panel_2.repaint();
    }
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseMoved(MouseEvent e) {}

    class PaintPanel extends JPanel {
        public PaintPanel() {
            this.setBackground(Color.white);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            
            for(Figura f : figuras) {
            	g2.setStroke(new BasicStroke(f.grosor));
            	g2.setColor(f.color);
            	
            	if ("Pincel".equals(f.t)) {
            		g2.drawLine(f.x, f.y, f.x, f.y);
            	}else if("Cuadrado".equals(f.t)) {
            		g2.drawRect(f.x, f.y , f.w, f.h);
            	}else if("Circulo".equals(f.t)) {
            		g2.drawOval(f.x, f.y , f.w, f.h);
            	}else if("Linea".equals(f.t)) {
            		g2.drawLine(f.x, f.y, f.w, f.h);
            	}
            }
            
            for(int i = 0; i < listaDePuntos.size(); i++) {
            	List<Point> trazo = listaDePuntos.get(i);
            	int grosor = trazosG.get(i);
            	Color color = trazoC.get(i);
            	g2.setStroke(new BasicStroke(grosor));
            	g2.setColor(color);
            	
                for (int j = 1; j < trazo.size(); j++) {
                    Point p1 = trazo.get(j - 1);
                    Point p2 = trazo.get(j);
                    g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
            
            if(!puntos.isEmpty()) {
            	g2.setStroke(new BasicStroke(grosorP));
            	g2.setColor(colorp);
            	
            	 for (int i = 1; i < puntos.size(); i++) {
                     Point p1 = puntos.get(i - 1);
                     Point p2 = puntos.get(i);
                     g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                 }
            }
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
    }
}
