package metiers;

import java.awt.Color;
import java.awt.Graphics;

public class Trait extends Forme{
	private static final long serialVersionUID = 1L;
	
	private int x2;
	private int y2;
	
	public int getX2() {
		return x2;
	}
	
	public int getY2() {
		return y2;
	}
	
	public void setX2(int x2) {
		this.x2 = x2;
	}
	
	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public Trait(int x1, int y1, Color couleurContour, Color couleurRemplissage) {
		super(x1, y1, couleurContour, couleurRemplissage);
	}
	
	@Override
	public void setParametres(int x1, int y1, int x2, int y2) {
		this.setX1(x1);
		this.setY1(y1);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void tracer(Graphics g) {
		g.setColor(getCouleurContour());
		g.setColor(getCouleurRemplissage());
		g.drawLine(getX1(), getY1(), this.x2, this.y2);
	}
}
