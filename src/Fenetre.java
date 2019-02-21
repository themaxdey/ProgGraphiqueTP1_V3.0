import javax.swing.JFrame;

public class Fenetre extends JFrame{
	
	private static final long serialVersionUID = 8164118974463460991L;
	
	public Fenetre() {
		
		super("AAA");
		setSize(600, 400);
		
		ZoneDessin zoneDessin = new ZoneDessin();
		BarreOutils barreOutils = new BarreOutils();
		BarreMenu barreMenu = new BarreMenu();
	}
	
	public Fenetre(String cheminFichier) {
		
		//super(nomFichier)
		//setSize()
		
		ZoneDessin zoneDessin = new ZoneDessin();
		BarreOutils barreOutils = new BarreOutils();
		BarreMenu barreMenu = new BarreMenu();
	}

}
