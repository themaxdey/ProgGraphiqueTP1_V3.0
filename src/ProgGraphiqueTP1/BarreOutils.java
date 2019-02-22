package ProgGraphiqueTP1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class BarreOutils extends JToolBar {
	private static final long serialVersionUID = 1L;

	private JToolBar barreOutils;
	private JToggleButton btRouge, btVert, btBleu, btBlanc, btGris, btNoir, btOvale, btCarrer, btLigne;
	private ButtonGroup groupeCouleursContours, groupeFormes, groupeCouleursRemplissage;
	JPanel panneau;

	public BarreOutils() {
		super();
		barreOutils = new JToolBar();
		barreOutils.setFloatable(false);
		//barreOutils.setOrientation(SwingConstants.HORIZONTAL);

		// Création des groupes
		groupeCouleursContours = new ButtonGroup();
		groupeCouleursRemplissage = new ButtonGroup();
		groupeFormes = new ButtonGroup();

		// Création et ajout du bouton rouge à la barre d'outils
		btRouge = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/red.gif")));
		btRouge.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btRouge.setToolTipText("Rouge");// info bulle
		groupeCouleursContours.add(btRouge);
		groupeCouleursRemplissage.add(btRouge);
		barreOutils.add(btRouge);

		// Création et ajout du bouton vert à la barre d'outils
		btVert = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/green.png")));
		btVert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btVert.setToolTipText("Vert");
		groupeCouleursContours.add(btVert);
		groupeCouleursRemplissage.add(btVert);
		barreOutils.add(btVert);

		// Création et ajout du bouton bleu à la barre d'outils
		btBleu = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/blue.png")));
		btBleu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btBleu.setToolTipText("Bleu");
		groupeCouleursContours.add(btBleu);
		groupeCouleursRemplissage.add(btBleu);
		barreOutils.add(btBleu);

		// Création et ajout du bouton blanc à la barre d'outils
		btBlanc = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/white.png")));
		btBlanc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btBlanc.setToolTipText("Blanc");
		groupeCouleursContours.add(btBlanc);
		groupeCouleursRemplissage.add(btBlanc);
		barreOutils.add(btBlanc);

		// Création et ajout du bouton blanc à la barre d'outils
		btGris = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/grey.png")));
		btGris.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btGris.setToolTipText("Jaune");
		groupeCouleursContours.add(btGris);
		groupeCouleursRemplissage.add(btGris);
		barreOutils.add(btGris);

		// Création et ajout du bouton blanc à la barre d'outils
		btNoir = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/black.png")));
		btNoir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btNoir.setToolTipText("Noir");
		groupeCouleursContours.add(btNoir);
		groupeCouleursRemplissage.add(btNoir);
		barreOutils.add(btNoir);

		// Création et ajout du bouton Ovale à la barre d'outils
		btOvale = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/oval.png")));
		btOvale.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btOvale.setToolTipText("Ovale");
		groupeFormes.add(btOvale);
		barreOutils.add(btOvale);

		// Création et ajout du bouton Carré à la barre d'outils
		btCarrer = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/square.png")));
		btCarrer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btCarrer.setToolTipText("Carré");
		groupeFormes.add(btCarrer);
		barreOutils.add(btCarrer);

		// Création et ajout du bouton Trait droit à la barre d'outils
		btLigne = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/line.png")));
		btLigne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btLigne.setToolTipText("Ligne droite");
		groupeFormes.add(btLigne);
		barreOutils.add(btLigne);
	}
}
