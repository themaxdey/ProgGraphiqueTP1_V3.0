package metiers;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Forme{
	private static final long serialVersionUID = 1L;
	
	private int largeur;
	private int longueur;
	
	public int getLongueur() {
		return longueur;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	
	public Rectangle(int x1, int y1, Color couleurContour ,Color couleurRemplissage) {
		super(x1, y1, couleurContour, couleurRemplissage);
	}
	
	@Override
	public void setParametres(int x1, int y1, int x2, int y2) {
		this.setX1(Math.min(x1, x2));
		this.setY1(Math.min(y1, y2));
		this.longueur = Math.abs(x2 - x1);
		this.largeur = Math.abs(y2 - y1);
	}
	
	@Override
	public void tracer(Graphics g) {
		g.setColor(getCouleurContour());
		g.drawRect(getX1(), getY1(), getLongueur(), getLargeur());
		g.setColor(getCouleurRemplissage());
		g.drawRect(getX1(), getY1(), getLongueur(), getLargeur());
	}
}
