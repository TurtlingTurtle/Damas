import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Tablero extends JPanel{
	
	private Bloque[][] tablero;
	private int turno =1;
	
	public Tablero(){
		super();
		this.setPreferredSize(new Dimension(696,696));
		this.setLayout(null);
		this.tablero = new Bloque[8][4];
		for(int y=0;y<4;y++){
			for(int x=0;x<8;x++){
				if(y==0){
					tablero[x][y]=new Bloque(-1,x,y);	
				}
				else if(y==1 && x%2==1){
					tablero[x][y]=new Bloque(-1,x,y);
				}
				else if(y==3){
					tablero[x][y]=new Bloque(1,x,y);
				}
				else if(y==2 && x%2==0){
					tablero[x][y]=new Bloque(1,x,y);
				}
				else{
					tablero[x][y]=new Bloque(0,x,y);
				}
				Bloque t=tablero[x][y];
				this.add(t);
				t.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub	
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						if(((Bloque) e.getSource()).getFicha()>=turno && turno==1){
							turno=-1;
							System.out.println(turno);
<<<<<<< Updated upstream
							checarBloques((Bloque) e.getSource());
							System.out.println((Bloque)e.getSource());
=======
							((Bloque) e.getSource()).setColor();
>>>>>>> Stashed changes
						}
						else if(((Bloque) e.getSource()).getFicha()<=turno && turno==-1){
							turno=1;
							System.out.println(turno);
						}
					}
				});
				if(x%2==0){
					t.setBounds(x*87,y*174+87,87,87);
				}
				else{
					t.setBounds(x*87,y*174,87,87);
				}
			}
		}
	}
	
	public int checarBloques(int x, int y){
		return this.tablero[x][y].getFicha();
	}
	/*public void checarBloques(Bloque bloque) throws ArrayIndexOutOfBoundsException{
		int x = bloque.getXB();
		int y = bloque.getYB();
			if((x%2)==1){
				tablero[x][y].setBlockUL(tablero[x-1][y+1].getFicha());
				tablero[x][y].setBlockUR(tablero[x+1][y+1].getFicha());
				tablero[x][y].setBlockDL(tablero[x-1][y].getFicha());
				tablero[x][y].setBlockDR(tablero[x+1][y].getFicha());
			}
			else if((x%2)==0){
				tablero[x][y].setBlockUL(tablero[x-1][y].getFicha());
				tablero[x][y].setBlockUR(tablero[x+1][y].getFicha());
				tablero[x][y].setBlockDL(tablero[x-1][y-1].getFicha());
				tablero[x][y].setBlockDR(tablero[x+1][y-1].getFicha());
			}
	}*/
	
	/*public int[] checarBloques(Bloque bloque){
		int x = bloque.getXB();
		int y = bloque.getYB();
		int[] temp= new int[4];
		if(x>0 && x<7){
			if((x%2)==1){
				if(y!=0){
					temp[0]=tablero[x-1][y-1].getFicha();
					temp[1]=tablero[x+1][y-1].getFicha();
					temp[2]=tablero[x-1][y].getFicha();//bien
					temp[3]=tablero[x+1][y].getFicha();
				}
			}
			else{
				if(y>0 && y<4){
					temp[0]=tablero[x-1][y].getFicha();
					temp[1]=tablero[x+1][y].getFicha();
					temp[2]=tablero[x-1][y-1].getFicha();
					temp[3]=tablero[x+1][y-1].getFicha();
				}
			}
		}
		if(x==0){
			if(y==0){
				temp[1]=tablero[x+1][y].getFicha();
			}
			else{
				temp[1]=tablero[x+1][y].getFicha();
				temp[3]=tablero[x+1][y-1].getFicha();
			}
		}
		else if(x==7){
			if(y==3){
				temp[2]=tablero[x-1][y].getFicha();
			}
			else{
				temp[0]=tablero[x-1][y].getFicha();
				temp[2]=tablero[x-1][y-1].getFicha();
			}
		}
		return temp;
	}*/
	
	public int[] checarBloque(Bloque bloque){
		
	}
	/*public void comer(Bloque bloque){
		this.checarBloques(bloque);
		int UL = bloque.getBlockUL();
		int UR = bloque.getBlockUR();
		int DL = bloque.getBlockDL();
		int DR = bloque.getBlockDR();
		if(turno == 1){
			if(bloque.getYB()!=3){
				
			}
		}
	}
	public void moverSencillo(Bloque bloque){ //no he considerado el comer
		this.checarBloques(bloque);
		int ficha = bloque.getFicha();
		int UL = bloque.getBlockUL();
		int UR = bloque.getBlockUR();
		int DL = bloque.getBlockDL();
		int DR = bloque.getBlockDR();
		int x = bloque.getXB();
		int y = bloque.getYB();
		if(ficha==-1){
			if((x%2)==0){
				if(UL==0){
					tablero[x-1][y].setColor();
				}
				if(UR==0){
					tablero[x+1][y].setColor();
				}
			}
			else if((x%2)==1){
				if(UL==0){
					tablero[x-1][y+1].setColor();
				}
				if(UR==0){
					tablero[x+1][y+1].setColor();
				}
			}
		}
		else if(ficha==1){
			if((x%2)==0){
				if(DL==0){
					tablero[x-1][y-1].setColor();
				}
				if(DR==0){
					tablero[x+1][y-1].setColor();
				}
			}
			else if((x%2)==1){
				if(DL==0){
					tablero[x-1][y].setColor();
				}
				if(UR==0){
					tablero[x+1][y].setColor();
				}
			}
		}
		
	}
	*/
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 696, 696);
	}
}
