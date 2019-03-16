package ProgGraphiqueTP1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class BarreMenu extends JMenuBar {
	private static final long serialVersionUID = 1L;
	private JMenu menuFichier, menuAutres;
	private JMenuItem optionNouveau, optionEnregistrer, optionEnregistrerSous, optionOuvrir, optionQuitter,
			optionApropos;
	private boolean nouveauDoc = true;

	public BarreMenu() {
		super();

		// création du menu Fichier
		menuFichier = new JMenu("Fichier");
		menuFichier.setMnemonic(KeyEvent.VK_F);
		add(menuFichier);

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
				if (nouveauDoc) {
					//use enregistrer sous
				} else {
					//Enregistrer
				}
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
		optionOuvrir.setMnemonic(KeyEvent.VK_O);
		optionOuvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
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
				int input = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment quitter ?");

				if (input == 0) {
					System.exit(0);
				}
			}

		});

		// création du menu À Propos et de l'option
		menuAutres = new JMenu("Autres");
		add(menuAutres);

		optionApropos = new JMenuItem("À propos");
		menuAutres.add(optionApropos);
		optionApropos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));

		menuAutres.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"\nPaint REBOOT" + "\r\nPar Maxime Dery et Jean-Sebastien" + "\r\nVersion 1.3", "À propos",
						JOptionPane.INFORMATION_MESSAGE);

			}
		});

	}

}
