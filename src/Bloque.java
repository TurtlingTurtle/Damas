import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Bloque extends JPanel {
	private Ficha ficha;
	private Color color;
	public Bloque(Ficha ficha){
		super();
		this.ficha=ficha;
		this.color=Color.BLACK;
		this.setPreferredSize(new Dimension(87, 87));
	}
	public void setColor(){
		this.color=Color.YELLOW;
	}
	public int getCualF(){
		return this.ficha.tipo;
	}	
	public void paintComponent(Graphics g){
		g.setColor(color);
		g.fillRect(0, 0, 87, 87);
		if(ficha.getTipo()==-1){
			g.setColor(Color.RED);
			g.fillOval(6, 6, 75, 75);
		}
		if(ficha.getTipo()==1){
			g.setColor(new Color(30,50,255));
			g.fillOval(6, 6, 75, 75);
		}
	}
	
}
