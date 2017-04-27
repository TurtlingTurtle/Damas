import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Panel extends JPanel{
	private Color color2=Color.BLACK;
	private Color color1=Color.BLACK;
	
	public Panel(){
		super();
		this.setLayout(null);
		this.setPreferredSize(new Dimension(750, 750));
		Tablero tablero = new Tablero();
		this.add(tablero);
		tablero.setBounds(27,50,696,696);
		
	}
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.setFont(new Font("Helvatica",100,40));
		g.setColor(color2);
		g.drawString("JUGADOR 1", 27, 40);
		g.setColor(color1);
		g.drawString("JUGADOR 2", 500, 40);
	}
	public void setColor2(Color color2) {
		this.color2 = color2;
	}
	public void setColor1(Color color1) {
		this.color1 = color1;
	}
	
}
