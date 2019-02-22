package ProgGraphiqueTP1;
import java.awt.BorderLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class Fenetre extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private BarreMenu barreMenu;
	
	private JToolBar barreOutils;
	private JToggleButton btRouge, btVert;
	private ButtonGroup groupeCouleurs;
	
	public Fenetre() {
		
		super("Paint REBOOT");
		
		setSize(1400, 787);
		ImageIcon image = new ImageIcon(Fenetre.class.getResource("img/icon.png"));
		setIconImage(image.getImage());
		
		ZoneDessin zoneDessin = new ZoneDessin();
		
		barreMenu = new BarreMenu();
		setJMenuBar(barreMenu);
		
		//barreOutils = new BarreOutils();
		barreOutils = createToolBar();
		//barreOutils.setSize(1400, 100);
		add(barreOutils, BorderLayout.NORTH);
		
		add(zoneDessin);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JToolBar createToolBar() {
		
		barreOutils = new JToolBar();
		
		groupeCouleurs = new ButtonGroup();
		
		btRouge = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/red.png")));
		//action listener
		btRouge.setToolTipText("Couleur Rouge");
		groupeCouleurs.add(btRouge);
		barreOutils.add(btRouge);
		
		
		barreOutils.setFloatable(false);
		return barreOutils;
		
	}

}
