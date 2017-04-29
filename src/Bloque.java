import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Bloque extends JPanel {
	private int ficha,
				x,
				y;
	private Color color;
	public Bloque(int ficha,int x, int y){
		super();
		this.x=x;
		this.y=y;
		this.ficha=ficha;
		this.color=Color.BLACK;
		this.setPreferredSize(new Dimension(87, 87));
	}
	public void setColor(){
		this.color=Color.YELLOW;
		repaint();
	}
	public int getFicha(){
		return this.ficha;
	}	
	public void setFicha(int ficha){
		this.ficha=ficha;
	}
	public int getXB(){
		return this.x;
	}
	public void setXB(int xB){
		this.x=xB;
	}
	public void setYB(int yB){
		this.y=yB;
	}
	public int getYB(){
		return this.y;
	}
	public void paintComponent(Graphics g){
		g.setColor(color);
		g.fillRect(0, 0, 87, 87);
		if(ficha==-1){
			g.setColor(Color.RED);
			g.fillOval(6, 6, 75, 75);
		}
		else if(ficha==1){
			g.setColor(new Color(30,50,255));
			g.fillOval(6, 6, 75, 75);
		}
	}
	
	
	
}
