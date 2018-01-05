
public interface FilmRegister 
{
	/**Fügt ein Film hinzu
	 * @return */
	 static void addFilm(Film f1) {
	}
	/**Löscht ein Film*/
	void removeFilm(Film f1);
	/**Ergänst änderungen an den Parametern von Film z.B. Besatzung*/
	void updateFilm(Film f1);
	/**Liest die Elemente eines Film Objekts aus*/
	void readFilm(Film m);
	/**Erzeugt ein neuen Deutschen Titel, überschreibt den alten*/
	void updateTitelDE(String alterTitel, String neuerTitel);
	/**Erzeugt ein neuen Englischen Titel, überschreibt den alten*/
	void updateTitelEN(String alterTitel, String neuerTitel);
	
}
