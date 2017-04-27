import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Tablero extends JPanel{
	
	private Bloque[][] tablero;
	
	public Tablero(){
		super();
		this.setPreferredSize(new Dimension(696,696));
		this.setLayout(null);
		this.tablero = new Bloque[8][4];
		for(int y=0;y<4;y++){
			for(int x=0;x<8;x++){
				if(y==0){
					tablero[x][y]=new Bloque(new FichaN());	
				}
				else if(y==1 && x%2==1){
					tablero[x][y]=new Bloque(new FichaN());
				}
				else if(y==3){
					tablero[x][y]=new Bloque(new FichaB());
				}
				else if(y==2 && x%2==0){
					tablero[x][y]=new Bloque(new FichaB());
				}
				else{
					tablero[x][y]=new Bloque(new Ficha());
				}
				Bloque t=tablero[x][y];
				this.add(t);
				if(x%2==0){
					t.setBounds(x*87,y*174+87,87,87);
				}
				else{
					t.setBounds(x*87,y*174,87,87);
				}
			}
		}
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 696, 696);

	}
}
