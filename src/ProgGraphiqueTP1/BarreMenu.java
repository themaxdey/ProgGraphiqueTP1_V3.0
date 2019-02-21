package ProgGraphiqueTP1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class BarreMenu extends JPanel {
	private static final long serialVersionUID = 1L;
	private JMenuBar barreMenu;
	private JMenu menuFichier, menuAPropos;
	private JMenuItem optionNouveau, optionEnregistrer, optionEnregistrerSous, optionOuvrir, optionQuitter;

	public BarreMenu() {
		// création de la barre de Menu
		barreMenu = new JMenuBar();

		// création du menu Fichier
		menuFichier = new JMenu("Fichier");
		menuFichier.setMnemonic(KeyEvent.VK_F);
		barreMenu.add(menuFichier);

		// Création et ajout de l'options Nouveau
		optionNouveau = new JMenuItem("Nouveau");
		optionNouveau.setMnemonic(KeyEvent.VK_N);
		optionNouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

		menuFichier.add(optionNouveau);

		optionNouveau.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Ajouter un action pour l'option Nouveau
			}

		});

		// Création et ajout de l'options Enregistrer
		optionEnregistrer = new JMenuItem("Enregistrer");
		menuFichier.add(optionEnregistrer);
		optionEnregistrer.setMnemonic(KeyEvent.VK_S);
		optionEnregistrer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		// menuFichier.addSeparator();

		optionEnregistrer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Ajouter un action pour l'option Enregistrer
			}

		});

		// Création et ajout de l'options Enregistrer Sous
		optionEnregistrerSous = new JMenuItem("Enregistrer Sous");
		menuFichier.add(optionEnregistrerSous);

		optionEnregistrerSous.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Ajouter un action pour l'option Enregistrer Sous
			}

		});

		// Création et ajout de l'options Ouvrir
		optionOuvrir = new JMenuItem("Ouvrir");
		menuFichier.add(optionOuvrir);
		optionEnregistrer.setMnemonic(KeyEvent.VK_O);
		optionEnregistrer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		menuFichier.addSeparator();

		optionOuvrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Ajouter un action pour l'option Ouvrir
			}

		});

		// Création et ajout de l'options Quitter
		optionQuitter = new JMenuItem("Quitter");
		menuFichier.add(optionQuitter);
		optionQuitter.setMnemonic(KeyEvent.VK_Q);
		optionQuitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));

		optionOuvrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Ajouter un action pour l'option Quitter
			}

		});

		// création du menu À Propos
		menuAPropos = new JMenu("À Propos");
		barreMenu.add(menuAPropos);

		menuAPropos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Ajouter un action pour l'affichage du À Propos

			}
		});

	}

}
