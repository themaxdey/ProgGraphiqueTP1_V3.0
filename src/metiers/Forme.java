package metiers;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;

public abstract class Forme implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public abstract void setParametres(int x1, int y1, int x2, int y2);
	public abstract void tracer(Graphics g);
	
	private int x1;
	private int y1;
	private Color couleurContour;
	private Color couleurRemplissage;
	
	public Forme(int x1, int y1, Color couleurContour, Color couleurRemplissage) {
		this.x1 = x1;
		this.y1 = y1;
		this.couleurContour = couleurContour;
		this.couleurRemplissage = couleurRemplissage;
	}
	
	public int getX1() {
		return x1;
	}
	
	public int getY1() {
		return y1;
	}
	
	public void setX1(int x1) {
		this.x1 = x1;
	}
	
	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	public Color getCouleurContour() {
		return couleurContour;
	}
	
	public Color getCouleurRemplissage() {
		return couleurRemplissage;
	}
	
	public void setCouleurContour(Color couleurContour) {
		this.couleurContour = couleurContour;
	}
	
	public void setCouleurremplissage(Color couleurRemplissage) {
		this.couleurRemplissage = couleurRemplissage;
	}
}
