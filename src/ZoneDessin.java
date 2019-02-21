import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ZoneDessin extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public ZoneDessin(Dimension dimension) {
		setSize((int) (dimension.getWidth() * 0.95), (int) (dimension.getHeight() * 0.75));
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createRaisedBevelBorder());
	}
	
	public ZoneDessin(Dimension dimension, String nomFichier) {
		//quand on va ouvrir un fichier
	}
}
