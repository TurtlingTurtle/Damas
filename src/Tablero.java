import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Tablero extends JPanel{
	
	private Bloque[][] tablero;
	
	public Tablero(){
		super();
		this.setPreferredSize(new Dimension(696,696));
		this.tablero = new Bloque[8][4];
		
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 700, 700);
		
		for(int x=0; x<8;x++){
			for(int y=0; y<4;y++){
				if(y<2){
					if((x%2)!=0){
						
					}
				}
			}
		}
		
		/*g.setColor(Color.WHITE);
		g.fillRect(0, 0, 87, 87);
		g.fillRect(174, 0, 87, 87);
		g.fillRect(348, 0, 87, 87);
		g.fillRect(522, 0, 87, 87);
		
		g.fillRect(87,87, 87, 87);
		g.fillRect(261, 87, 87, 87);
		g.fillRect(435, 87, 87, 87);
		g.fillRect(609, 87, 87, 87);
		
		g.fillRect(0, 174, 87, 87);
		g.fillRect(174, 174, 87, 87);
		g.fillRect(348, 174, 87, 87);
		g.fillRect(522, 174, 87, 87);
		
		g.fillRect(87,261, 87, 87);
		g.fillRect(261, 261, 87, 87);
		g.fillRect(435, 261, 87, 87);
		g.fillRect(609, 261, 87, 87);
		
		g.fillRect(0, 348, 87, 87);
		g.fillRect(174, 348, 87, 87);
		g.fillRect(348, 348, 87, 87);
		g.fillRect(522, 348, 87, 87);
		
		g.fillRect(87,435, 87, 87);
		g.fillRect(261, 435, 87, 87);
		g.fillRect(435, 435, 87, 87);
		g.fillRect(609, 435, 87, 87);
		
		g.fillRect(0, 522, 87, 87);
		g.fillRect(174, 522, 87, 87);
		g.fillRect(348, 522, 87, 87);
		g.fillRect(522, 522, 87, 87);
		
		g.fillRect(87,609, 87, 87);
		g.fillRect(261, 609, 87, 87);
		g.fillRect(435, 609, 87, 87);
		g.fillRect(609, 609, 87, 87);
		*/
	}
}
