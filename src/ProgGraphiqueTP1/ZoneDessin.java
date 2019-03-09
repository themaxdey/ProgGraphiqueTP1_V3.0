package ProgGraphiqueTP1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import metiers.Forme;
import metiers.Ovale;
import metiers.Rectangle;
import metiers.Trait;

public class ZoneDessin extends JPanel{
	private static final long serialVersionUID = 1L;
	
	private Color contour = Color.BLACK;
	private Color remplissage = Color.WHITE;
	private Forme forme;
	private ArrayList<Forme> listeFormes = new ArrayList<Forme>();
	private String nomFichier = null;
	private char typeForme = 't';
	MouseEvent clic;
	
	public ZoneDessin() {
		super();
		setBackground(Color.WHITE);
		setSize(1400, 400);
		setBorder(BorderFactory.createRaisedBevelBorder());
		addMouseListener(new SourisListener());
		addMouseMotionListener(new SourisListener());
	}
	
	public ZoneDessin(Dimension dimension, String nomFichier) {
		//quand on va ouvrir un fichier
	}
	
	public String getNomFichier() {
		return nomFichier;
	}
	
	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}
	
	public Forme getForme() {
		return forme;
	}
	
	public void setForme(Forme forme) {
		this.forme = forme;
	}
	
	public int getTypeForme() {
		return typeForme;
	}
	
	public void setTypeForme(char typeForme) {
		this.typeForme = typeForme;
	}
	
	public Color getContour() {
		return contour;
	}
	
	public void setContour(Color contour) {
		this.contour = contour;
	}
	
	public Color getRemplissage() {
		return remplissage;
	}
	
	public void setRemplissage(Color remplissage) {
		this.remplissage = remplissage;
	}
	
	public ArrayList<Forme> getListe(){
		return listeFormes;
	}
	
	public void setListe(ArrayList<Forme> liste) {
		this.listeFormes = liste;
	}
	
	public void setClic(MouseEvent clic) {
		this.clic = clic;
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Forme forme : listeFormes) {
			forme.tracer(g);
		}
	}
	
	private class SourisListener implements MouseListener, MouseMotionListener {
		
		@Override
		public void mousePressed(MouseEvent e) {
			clic = e;
			switch(typeForme) {
			case 't':
				forme = new Trait(e.getX(), e.getY(), contour, remplissage);
				break;
			case 'r':
				forme = new Rectangle(e.getX(), e.getY(), remplissage, contour);
				break;
			case 'o':
				forme = new Ovale(e.getX(), e.getY(), contour, remplissage);
				break;
			}
			listeFormes.add(forme);
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			forme.setParametres(clic.getX(), clic.getY(), e.getX(), e.getY());
			repaint();
		}
		@Override
		public void mouseMoved(MouseEvent arg0) {
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
		}
	}
	
}
