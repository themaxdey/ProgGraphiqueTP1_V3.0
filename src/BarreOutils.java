
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class BarreOutils extends JPanel {
	private static final long serialVersionUID = 1L;

	private JToolBar barreOutils;
	private JToggleButton btRouge, btVert, btBleu, btBlanc, btJaune, btNoir, btOvale, btCarrer, btTrait;
	private ButtonGroup groupeCouleursContours, groupeFormes, groupeCouleursRemplissage;

	public BarreOutils() {
		barreOutils = new JToolBar();
		barreOutils.setFloatable(false);
		barreOutils.setOrientation(SwingConstants.HORIZONTAL);

		// Création des groupes
		groupeCouleursContours = new ButtonGroup();
		groupeCouleursRemplissage = new ButtonGroup();
		groupeFormes = new ButtonGroup();

		// Création et ajout du bouton rouge à la barre d'outils
		btRouge = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/rouge.gif")));
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
		btVert = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/vert.gif")));
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
		btBleu = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/bleu.gif")));
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
		btBlanc = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/blanc.gif")));
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
		btJaune = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/jaune.gif")));
		btJaune.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btJaune.setToolTipText("Jaune");
		groupeCouleursContours.add(btJaune);
		groupeCouleursRemplissage.add(btJaune);
		barreOutils.add(btJaune);

		// Création et ajout du bouton blanc à la barre d'outils
		btNoir = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/noir.gif")));
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
		btOvale = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/ovale.gif")));
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
		btCarrer = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/carrer.gif")));
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
		btTrait = new JToggleButton(new ImageIcon(BarreOutils.class.getResource("img/trait.gif")));
		btTrait.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});
		btTrait.setToolTipText("Trait droit");
		groupeFormes.add(btTrait);
		barreOutils.add(btTrait);
	}
}
