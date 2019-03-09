package ProgGraphiqueTP1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;

	private BarreMenu barreMenu;

	private JToolBar barreOutils;
	private JToggleButton btRouge, btVert, btBleu, btBlanc, btGris, btNoir, btRougeC, btVertC, btBleuC, btBlancC,
			btGrisC, btNoirC, btOvale, btCarrer, btLigne;
	private ButtonGroup groupeCouleursContours, groupeFormes, groupeCouleursRemplissage;
	
	private ZoneDessin zoneDessin;

	public Fenetre() {

		super("Paint REBOOT");

		setSize(1400, 787);
		ImageIcon image = new ImageIcon(Fenetre.class.getResource("img/icon.png"));
		setIconImage(image.getImage());
		
		Container conteneur = getContentPane();
		zoneDessin = new ZoneDessin();
		barreMenu = new BarreMenu();
		setJMenuBar(barreMenu);

		// barreOutils = new BarreOutils();
		barreOutils = createToolBar();
		// barreOutils.setSize(1400, 100);
		add(barreOutils, BorderLayout.NORTH);

		add(zoneDessin);
		conteneur.add(zoneDessin);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JToolBar createToolBar() {
		
		//On voulait initialement que la barre outil soit externe sauf qu'on arrive pas a le faire fonctionne d'une autre facon que interne... A regler plus tard

		barreOutils = new JToolBar();
		barreOutils.setFloatable(false);

		// Création des groupes
		groupeCouleursContours = new ButtonGroup();
		groupeCouleursRemplissage = new ButtonGroup();
		groupeFormes = new ButtonGroup();

		// Bouton Remplissage Rouge
		btRouge = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/red.png")));
		btRouge.setToolTipText("Remplissage Rouge");
		groupeCouleursRemplissage.add(btRouge);
		btRouge.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setRemplissage(Color.red);
			}
		});

		// Bouton Remplissage Vert
		btVert = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/green.png")));
		btVert.setToolTipText("Remplissage Vert");
		groupeCouleursRemplissage.add(btVert);
		btVert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setRemplissage(Color.green);
			}
		});

		// Bouton Remplissage Bleu
		btBleu = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/blue.png")));
		btBleu.setToolTipText("Remplissage Bleu");
		groupeCouleursRemplissage.add(btBleu);
		btBleu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setRemplissage(Color.blue);

			}
		});

		// Bouton Remplissage Blanc
		btBlanc = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/white.png")));
		btBlanc.setToolTipText("Remplissage Blanc");
		groupeCouleursRemplissage.add(btBlanc);
		btBlanc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setRemplissage(Color.white);

			}
		});

		// Bouton Remplissage Gris
		btGris = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/grey.png")));
		btGris.setToolTipText("Remplissage Gris");
		groupeCouleursRemplissage.add(btGris);
		btGris.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setRemplissage(Color.gray);

			}
		});

		// Bouton Remplissage Noir
		btNoir = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/black.png")));
		btNoir.setToolTipText("Remplissage Noir");
		groupeCouleursRemplissage.add(btNoir);
		btNoir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setRemplissage(Color.black);

			}
		});

		// Bouton Contour Rouge
		btRougeC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourRouge.png")));
		btRougeC.setToolTipText("Contour Rouge");
		groupeCouleursContours.add(btRougeC);
		btRougeC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setContour(Color.red);

			}
		});

		// Bouton Contour Vert
		btVertC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourVert.png")));
		btVertC.setToolTipText("Contour Vert");
		groupeCouleursContours.add(btVertC);
		btVertC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setContour(Color.green);

			}
		});

		// Bouton Contour Bleu
		btBleuC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourBleu.png")));
		btBleuC.setToolTipText("Contour Bleu");
		groupeCouleursContours.add(btBleuC);
		btBleuC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setContour(Color.blue);
			}
		});

		// Bouton Contour Blanc
		btBlancC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourBlanc.png")));
		btBlancC.setToolTipText("Contour Blanc");
		groupeCouleursContours.add(btBlancC);
		btBlancC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setContour(Color.white);
			}
		});

		// Bouton Contour Gris
		btGrisC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourGris.png")));
		btGrisC.setToolTipText("Contour Gris");
		groupeCouleursContours.add(btGrisC);
		btGrisC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setContour(Color.gray);

			}
		});

		// Bouton Contour Noir
		btNoirC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourNoir.png")));
		btNoirC.setToolTipText("Contour Noir");
		groupeCouleursContours.add(btNoirC);
		btNoirC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setContour(Color.black);

			}
		});

		// Forme Ovale
		btOvale = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/oval.png")));
		btOvale.setToolTipText("Ovale");
		groupeFormes.add(btOvale);
		btOvale.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setTypeForme('o');

			}
		});

		// Forme Carre
		btCarrer = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/square.png")));
		btCarrer.setToolTipText("Carré");
		groupeFormes.add(btCarrer);
		btCarrer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setTypeForme('r');

			}
		});

		// Trait droit
		btLigne = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/line.png")));
		btLigne.setToolTipText("Ligne droite");
		groupeFormes.add(btLigne);
		btLigne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				zoneDessin.setTypeForme('t');

			}
		});

		// Ajout des boutons dans la barre outils
		barreOutils.add(btRouge);
		barreOutils.add(btVert);
		barreOutils.add(btBleu);
		barreOutils.add(btBlanc);
		barreOutils.add(btGris);
		barreOutils.add(btNoir);
		barreOutils.add(btRougeC);
		barreOutils.add(btVertC);
		barreOutils.add(btBleuC);
		barreOutils.add(btBlancC);
		barreOutils.add(btGrisC);
		barreOutils.add(btNoirC);
		barreOutils.add(btOvale);
		barreOutils.add(btCarrer);
		barreOutils.add(btLigne);

		return barreOutils;

	}

}
