package ProgGraphiqueTP1;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Fenetre extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public Fenetre() {
		
		super("AAA");
		
		setSize(600, 400);
		ImageIcon image = new ImageIcon(Fenetre.class.getResource("img/icon.png"));
		setIconImage(image.getImage());
		setLayout(new FlowLayout());
		
		ZoneDessin zoneDessin = new ZoneDessin(this.getSize());
		BarreOutils barreOutils = new BarreOutils();
		BarreMenu barreMenu = new BarreMenu();
		
		add(barreMenu);
		add(Box.createVerticalStrut(15));
		add(barreOutils);
		add(Box.createVerticalStrut(15));
		add(zoneDessin);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
