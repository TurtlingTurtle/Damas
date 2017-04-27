import java.awt.Dimension;

import javax.swing.JPanel;


public class Panel extends JPanel{
	public Panel(){
		super();
		this.setLayout(null);
		this.setPreferredSize(new Dimension(750, 750));
		Tablero tablero = new Tablero();
		this.add(tablero);
		tablero.setBounds(50,50,648,648);
		
	}
}
