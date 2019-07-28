package de.vitbund.vitmaze.players;

import java.util.Scanner;

/**
 * Klasse eines minimalen Bots f�r das VITMaze
 * 
 * @author Patrick.Stalljohann
 * @version 1.0
 *
 */
public class MinimalBot {

	/**
	 * Hauptmethode zum Ausf�hren des Bots
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Scanner zum Auslesen der Standardeingabe, welche Initialisierungs- und
		// Rundendaten liefert
		Scanner input = new Scanner(System.in);
		MazeUnknown maze = new MazeUnknown(input);
		MortalComBot bot = new MortalComBot(input);
		bot.startFeldEinlesen(maze);

		// TURN (Wiederholung je Runde notwendig)
		while (input.hasNext()) {
//			while (maze.getUnbekannteFelder().size() == 0 || bot.sucheSB() == true);{
				// Rundeninformationen auslesen
				bot.felderEinlesen(input);
				bot.aktuellesFeldPruefen(maze);
				bot.erzeugeBenachbarteFelder(maze);
				bot.setzeBot(maze);
				if (bot.sucheSB() == true) {
					bot.bewegeNach();
//					System.out.println(bot.geheZuSachbearbeiter());
				} else if(bot.sucheFormular()==true){
					bot.bewegeNach();
//					System.out.println(bot.formularEinsammeln());
					}
				else {
					maze.moeglicheFelder(bot);
					maze.naechstesFeld(bot);
					bot.bewegeNach();
				}

			
			//
			
			// formulare gesehen & evtl schon gesammelt; arbeite AnzahlDokumente ab;
			

			// Debug Information ausgeben (optional m�glich)
			System.err.println("Ergebnis Vorrunde: " + bot.getLastActionsResult());

			// Rundenaktion ausgeben
//			System.out.println(bot.bewegeNach());
		}

		// Eingabe schliessen (letzte Aktion)
		input.close();
	}

}
