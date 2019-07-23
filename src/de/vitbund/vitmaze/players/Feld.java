package de.vitbund.vitmaze.players;

public class Feld {
	private int xKoordinate;
	private int yKoordinate;
	private String typ;
	private String himmelsrichtung;
	private boolean besucht;
	private int anzahlBesuche;
	private int wegeKosten;
	/*
	 * Standard Konstruktor;
	 */
	public Feld() {
		
	}
	
	/*
	 * Konstruktor zum generieren eines Level - Feldes
	 */
	public Feld (int x, int y, String typ, String himmelsrichtung, int wegeKosten, boolean besucht, int anzahlBesuche) {
		setxKoordinate(x);
		setyKoordinate(y);
		setTyp(typ);
		setWegeKosten(wegeKosten);
		setBesucht(besucht);
		setHimmelsrichtung(himmelsrichtung);
		setAnzahlBesuche(anzahlBesuche);
	}
	
	public void setKoordinaten(String schluessel) {
		String[] key = schluessel.split(",");
		setxKoordinate(Integer.parseInt(key[0]));
		setyKoordinate(Integer.parseInt(key[1]));
	}
	
	public void anzahlBesucheErhoeen(int zahl) {
		this.anzahlBesuche += zahl;
	}


	public int getxKoordinate() {
		return xKoordinate;
	}

	public void setxKoordinate(int xKoordinate) {
		this.xKoordinate = xKoordinate;
	}

	public int getyKoordinate() {
		return yKoordinate;
	}

	public void setyKoordinate(int yKoordinate) {
		this.yKoordinate = yKoordinate;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getHimmelsrichtung() {
		return himmelsrichtung;
	}

	public void setHimmelsrichtung(String himmelsrichtung) {
		this.himmelsrichtung = himmelsrichtung;
	}

	public String getSchluessel() {
		return getxKoordinate()+","+getyKoordinate();
	}

	public boolean isBesucht() {
		return besucht;
	}

	public void setBesucht(boolean besucht) {
		this.besucht = besucht;
	}

	public int getWegeKosten() {
		return wegeKosten;
	}

	public void setWegeKosten(int wegeKosten) {
		this.wegeKosten = wegeKosten;
	}

	public int getAnzahlBesuche() {
		return anzahlBesuche;
	}

	public void setAnzahlBesuche(int anzahlBesuche) {
		this.anzahlBesuche = anzahlBesuche;
	}

}
