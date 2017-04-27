import javax.swing.JFrame;

public class VentanaTablero extends JFrame{
	
	public VentanaTablero(){
		super ("Damas Inglesas");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.add(new Panel());
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		VentanaTablero ven = new VentanaTablero();
	}
}
