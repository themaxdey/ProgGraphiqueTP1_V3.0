import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Fenetre extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	public Fenetre() {
		
		super("AAA");
		setSize(600, 400);
		ImageIcon image = new ImageIcon(Fenetre.class.getResource("icon.png"));
		setIconImage(image.getImage());
		
		ZoneDessin zoneDessin = new ZoneDessin();
		BarreOutils barreOutils = new BarreOutils();
		BarreMenu barreMenu = new BarreMenu();
		
		add(barreMenu);
		add(barreOutils);
		add(zoneDessin);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Fenetre(String cheminFichier) {
		
		//super(nomFichier)
		//setSize()
		
		ZoneDessin zoneDessin = new ZoneDessin();
		BarreOutils barreOutils = new BarreOutils();
		BarreMenu barreMenu = new BarreMenu();
	}

}
