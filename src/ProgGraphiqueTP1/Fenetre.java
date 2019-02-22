package ProgGraphiqueTP1;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class Fenetre extends JFrame {

	private static final long serialVersionUID = 1L;

	private BarreMenu barreMenu;

	private JToolBar barreOutils;
	private JToggleButton btRouge, btVert, btBleu, btBlanc, btGris, btNoir, btRougeC, btVertC, btBleuC, btBlancC,
			btGrisC, btNoirC, btOvale, btCarrer, btLigne;
	private ButtonGroup groupeCouleursContours, groupeFormes, groupeCouleursRemplissage;

	public Fenetre() {

		super("Paint REBOOT");

		setSize(1400, 787);
		ImageIcon image = new ImageIcon(Fenetre.class.getResource("img/icon.png"));
		setIconImage(image.getImage());

		ZoneDessin zoneDessin = new ZoneDessin();

		barreMenu = new BarreMenu();
		setJMenuBar(barreMenu);

		// barreOutils = new BarreOutils();
		barreOutils = createToolBar();
		// barreOutils.setSize(1400, 100);
		add(barreOutils, BorderLayout.NORTH);

		add(zoneDessin);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JToolBar createToolBar() {

		barreOutils = new JToolBar();
		barreOutils.setFloatable(false);
		// barreOutils.setOrientation(SwingConstants.HORIZONTAL);

		// Cr�ation des groupes
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
				// TODO Auto-generated method stub

			}
		});

		// Bouton Remplissage Vert
		btVert = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/green.png")));
		btVert.setToolTipText("Remplissage Vert");
		groupeCouleursRemplissage.add(btVert);
		btVert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Remplissage Bleu
		btBleu = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/blue.png")));
		btBleu.setToolTipText("Remplissage Bleu");
		groupeCouleursRemplissage.add(btBleu);
		btBleu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Remplissage Blanc
		btBlanc = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/white.png")));
		btBlanc.setToolTipText("Remplissage Blanc");
		groupeCouleursRemplissage.add(btBlanc);
		btBlanc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Remplissage Gris
		btGris = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/grey.png")));
		btGris.setToolTipText("Remplissage Gris");
		groupeCouleursRemplissage.add(btGris);
		btGris.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Remplissage Noir
		btNoir = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/black.png")));
		btNoir.setToolTipText("Remplissage Noir");
		groupeCouleursRemplissage.add(btNoir);
		btNoir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Contour Rouge
		btRougeC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourRouge.png")));
		btRougeC.setToolTipText("Contour Rouge");
		groupeCouleursContours.add(btRougeC);
		btRougeC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Contour Vert
		btVertC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourVert.png")));
		btVertC.setToolTipText("Contour Vert");
		groupeCouleursContours.add(btVertC);
		btVertC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Contour Bleu
		btBleuC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourBleu.png")));
		btBleuC.setToolTipText("Contour Bleu");
		groupeCouleursContours.add(btBleuC);
		btBleuC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Contour Blanc
		btBlancC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourBlanc.png")));
		btBlancC.setToolTipText("Contour Blanc");
		groupeCouleursContours.add(btBlancC);
		btBlancC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Contour Gris
		btGrisC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourGris.png")));
		btGrisC.setToolTipText("Contour Gris");
		groupeCouleursContours.add(btGrisC);
		btGrisC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Bouton Contour Noir
		btNoirC = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/contourNoir.png")));
		btNoirC.setToolTipText("Contour Noir");
		groupeCouleursContours.add(btNoirC);
		btNoirC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Forme Ovale
		btOvale = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/oval.png")));
		btOvale.setToolTipText("Ovale");
		groupeFormes.add(btOvale);
		btOvale.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Forme Carre
		btCarrer = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/square.png")));
		btCarrer.setToolTipText("Carr�");
		groupeFormes.add(btCarrer);
		btCarrer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Trait droit
		btLigne = new JToggleButton(new ImageIcon(Fenetre.class.getResource("img/line.png")));
		btLigne.setToolTipText("Ligne droite");
		groupeFormes.add(btLigne);
		btLigne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

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
