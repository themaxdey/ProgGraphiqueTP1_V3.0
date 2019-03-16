package ProgGraphiqueTP1;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class BarreMenu extends JMenuBar {
	private static final long serialVersionUID = 1L;
	private JMenu menuFichier, menuAutres;
	private JMenuItem optionNouveau, optionEnregistrer, optionEnregistrerSous, optionOuvrir, optionQuitter,
			optionApropos;
	private boolean nouveauFichier = true;
	private GestionFichier gestionnaire = new GestionFichier();
	private JPanel panneau;
	private File file;
	private BufferedImage image;

	public BarreMenu(JPanel panneau) {
		super();
		this.panneau = panneau;

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
		optionEnregistrer.addActionListener(gestionnaire);

		// Création et ajout de l'options Enregistrer Sous
		optionEnregistrerSous = new JMenuItem("Enregistrer Sous");
		menuFichier.add(optionEnregistrerSous);

		optionEnregistrerSous.addActionListener(gestionnaire);

		// Création et ajout de l'options Ouvrir
		optionOuvrir = new JMenuItem("Ouvrir");
		menuFichier.add(optionOuvrir);
		optionOuvrir.setMnemonic(KeyEvent.VK_O);
		optionOuvrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		menuFichier.addSeparator();

		optionOuvrir.addActionListener(gestionnaire);

		// Création et ajout de l'options Quitter
		optionQuitter = new JMenuItem("Quitter");
		menuFichier.add(optionQuitter);
		optionQuitter.setMnemonic(KeyEvent.VK_Q);
		optionQuitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));

		optionQuitter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment quitter ?");

				if (input == 0) {
					System.exit(0);
				}
			}

		});

		// création du menu À Propos et de l'affichage
		menuAutres = new JMenu("Autres");
		add(menuAutres);

		optionApropos = new JMenuItem("À propos");
		menuAutres.add(optionApropos);
		optionApropos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));

		optionApropos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"\nPaint REBOOT" + "\r\nPar Jean-S\u00e9bastien Beaulne et Maxime Dery" + "\r\nVersion 1.3", "À propos",
						JOptionPane.INFORMATION_MESSAGE, new ImageIcon(Fenetre.class.getResource("img/icon2.png")));
			}
		});

	}
	
	private class GestionFichier implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == optionEnregistrerSous)
				enregistrerSous();
			else if (e.getSource() == optionOuvrir)
				ouvrir();
			else if(e.getSource() == optionEnregistrer)
				enregistrer();
		}
		
		private void enregistrer() {
			
			if(!nouveauFichier) {
				enregistrerSous();
				nouveauFichier = true;
			}else {
				BufferedImage bImg = new BufferedImage(panneau.getWidth(), panneau.getHeight(), BufferedImage.TYPE_INT_RGB);
				Graphics2D cg = bImg.createGraphics();
				panneau.paintAll(cg);
				
				try {
					ImageIO.write(bImg, "png", file);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(panneau, "Probl\\u00E9me d'ouverture du fichier");
				}
			}
			
		}

		private void enregistrerSous() {
			JFileChooser choixFichier = new JFileChooser();
			// Afficher la boîte de dialogue saveDialog dans le composant texte
			if (choixFichier.showSaveDialog(panneau) == JFileChooser.APPROVE_OPTION) {
				// récupérer le nom du fichier
				file = choixFichier.getSelectedFile();

				BufferedImage bImg = new BufferedImage(panneau.getWidth(), panneau.getHeight(), BufferedImage.TYPE_INT_RGB);
				Graphics2D cg = bImg.createGraphics();
				panneau.paintAll(cg);
				
				try {
					ImageIO.write(bImg, "png", file);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(panneau, "Probl\\u00E9me de sauvegarde du fichier");
				}
			}

		}

		private void ouvrir() {
			// Afficher la boîte de dialogue openDialog
			JFileChooser choixFichier = new JFileChooser();
			if (choixFichier.showOpenDialog(panneau) == JFileChooser.APPROVE_OPTION) {
				// récupérer le nom du fichier
				file = choixFichier.getSelectedFile();
				
				try {
					image = ImageIO.read(file);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(panneau, "Probl\\u00E9me d'ouverture du fichier");
				}
				
				panneau.paintComponents(panneau.getGraphics());
				panneau.getGraphics().drawImage(image, 0, 0, panneau);
				
			}
		}
	}
}
