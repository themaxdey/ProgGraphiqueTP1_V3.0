package ProgGraphiqueTP1;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class ZoneDessin extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public ZoneDessin() {
		setBackground(Color.WHITE);
		setSize(1400, 400);
		setBorder(BorderFactory.createRaisedBevelBorder());
	}
	
	public ZoneDessin(Dimension dimension, String nomFichier) {
		//quand on va ouvrir un fichier
	}
}
