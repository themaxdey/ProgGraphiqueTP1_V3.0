package metiers;

import java.awt.Color;
import java.awt.Graphics;

public class Ovale extends Rectangle{
	private static final long serialVersionUID = 1L;
	
	public Ovale(int x1, int y1, Color couleurContour, Color couleurRemplissage) {
		super(x1, y1, couleurContour, couleurRemplissage);
	}
	
	@Override
	public void tracer(Graphics g) {
		g.setColor(getCouleurContour());
		g.fillOval(getX1(), getY1(), getLongueur(), getLargeur());
		g.setColor(getCouleurRemplissage());
		g.fillOval(getX1(), getY1(), getLongueur(), getLargeur());
	}
}
