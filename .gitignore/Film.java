/**
 * Die Klasse stellt grundlegende Variablen zur Verfügung
 */
public class Film implements FilmRegister
{
	/*
	 * Hir stehen die Klassenvariablen	
	 */
	//Jahr der Veröffentlichung
	private static int jahr;
	// Länge des Films
	private static int laenge;
	// Alters begrenzung
	private static int fsk;
	// Deutscher Titel des Films
	private static String titelDE;
	//Englischer Titel des Films
	private static String titelEN;
	//Sprache des Films
	private static String sprache;
	// Wichtige Darsteller
	private static String besatzung;
/*Ende der Klassen Variablen -----------------------------------------*/
	/*Hir beginnen die Methoden
	 * 
	 */
	/**
	 * Der Konstruktor für die Klasse {@link #Items(String, int, int, int, String, String)}
	 * @param nameDE
	 * @param nameEN  
	 * @param jahr
	 * @param fsk
	 * @param laenge
	 * @param sprache
	 * @param besatzung
	 * @throws FilmDatenException 
	 */
	public Film(String nameDE, String nameEN, int jahr, int fsk, int laenge, String sprache,String besatzung) 
	{
		titelDE = nameDE;
		titelEN = nameEN;
		this.jahr = jahr;
		this.laenge = laenge;
		this.sprache = sprache;
		this.besatzung = besatzung;
		this.fsk = fsk;	
	}
	/**
	 * Set Methode für den Deutschen Titel des Films
	 * @param name
	 */
	public void setTitelDE(String nameDE)
	{
		titelDE = nameDE;
	}
	/**
	 * get Methode für den Titel
	 * @return titelDE 
	 */
	public String getTitelDE()
	{
		return titelDE;
	}
	/**
	 * Set Methode für den Deutschen Titel des Films
	 * @param name
	 */
	public void setTitelEN(String nameEN)
	{
		titelEN = nameEN;
	}
	/**
	 * get Methode für den Titel
	 * @return titelEN 
	 */
	public String getTitelEN()
	{
		return titelEN;
	}
	/**
	 * Set Methode für Jahr
	 * @param jahr
	 */
	public void setJahr(int jahr)
	{
		this.jahr = jahr;
	}
	/**
	 * Get Methode für jahr
	 * @return jahr gibt das Jahr zurück
	 */
	public int getJahr()
	{
		return jahr;
	}
	/**
	 * Stellt eine set Methode füer die Laenge des Filmes zur verfügung
	 * @param laenge
	 */
	public void setLaenge(int laenge)
	{
		this.laenge = laenge;
	}
	/**
	 * Get Methode für die Länge
	 * @return laenge
	 */
	public int getLaenge()
	{
		return laenge;
	}
	/**
	 * Stellt die Set Methode für Sprache zur verfügung
	 * @param sprache
	 */
	public void setSprache(String sprache)
	{
		this.sprache = sprache;
	}
	/**
	 *Get Methode für Sprache 
	 * @return
	 */
	public String getSprache()
	{
		return sprache;
	}
	/**
	 * Stellt die Set Methode für Besatzung 
	 * @param besatzung
	 */
	public void setBesatzung(String besatzung)
	{
		this.besatzung = besatzung;
	}
	/**
	 * Get Methode für Besatzung
	 * @return besatzung 
	 */
	public String getBesatzung()
	{
		return besatzung;
	}
	/**
	 * Set Methode fuer FSK. Diese Methode vergleicht  mit if und else if, ob 
	 * die eingegebene Zahl auch der FSK entspricht. 
	 * @param fsk
	 */
	public void setFsk(int fsk) 
	{
		if(fsk == 0) this.fsk = fsk;
		else if (fsk == 6)  this.fsk = fsk;
		else if (fsk == 12) this.fsk = fsk;
		else if (fsk == 16) this.fsk = fsk;
		else if (fsk == 18) this.fsk = fsk;
		else
		{
			System.err.println("Fehler!!! in setFSK; kein Akzeptierter Wert.");
			return;
		}
	}
	public int getFsk()
	{
		return this.fsk;
	}
/*Hir enden die Paramete für desn Datentype Film	
*-----------------------------------------------------------------------------*/
	/**
	 * Meine Überschreibene equals() Methode
	 * In der Methode steht volgende if Anweisung
	 * <code><br> if(this.titelDE.equals(m2.getTitelDE()) && this.titelEN.equals(m2.getTitelEN()) 
		   && this.laenge == m2.getLaenge() && this.jahr == m2.getJahr())<br>
		  	return true;<br>
			return false;<br></code>
	 */
	public boolean equals(Object m) 
	{
		//Hir wird Objekt zu Film gekastet und zu f2 zugewiesen
		Film m2 =(Film)m; 
		/*Die if Bedingung prüft, ob die Einzelnen bestandteile gleich sind.
		 * Titel muss mit .equals verglichen werden, weil Tiel String(Objekt) ist
		 */
		if(this.titelDE.equals(m2.getTitelDE()) && this.titelEN.equals(m2.getTitelEN()) 
		   && this.laenge == m2.getLaenge() && this.jahr == m2.getJahr())
		  	return true;
			return false;
	}
	/**
	 * Diese Methode prüft ob die Filme gleich sind. 
	 * Sie greift dabei auf die Methode {@link #equals(Object)} zurück
	 * 
	 * @param m1 erster Film
	 * @param m2 zweiter Film
	 */
	public void equalsMovie(Film m1, Film m2)
	{
		if(!(m1.equals(m2))) System.out.println("Die Filme sind nicht identisch");
		else System.err.println("Sind  gleich");	
	}
	
	@Override
	public String toString() {
		return "Erscheinungsjahr " + jahr +"\n"+ "Länge=" + laenge +"\n"+ ", fsk=" + fsk +" \n"+ "deutscher Titel" + titelDE +"\n"+ "englischer Titel"
				+ titelEN + ", sprache=" + sprache + ", besatzung=" + besatzung + "\n";
	}
	public void toStringVoid() {
		System.out.print("Erscheinungsjahr " + jahr +"\n"+ "Länge=" + laenge +"\n"+ ", fsk=" + fsk + ", titelDE=" + titelDE + ", titelEN="
				+ titelEN + ", sprache=" + sprache + ", besatzung=" + besatzung+ "\n");
	}
	
	/**
	 * Diese Klasse erzeugt einen neuen Film
	 * @param f1
	 */
	public static void addFilm(Film f1) 
	{
		f1 = new Film(titelDE,titelEN,jahr,fsk,laenge,sprache,besatzung);
		
	}
	
	@Override
	public void removeFilm(Film f1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateFilm(Film f1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void readFilm(Film m) {
		
		
	}
	@Override
	public void updateTitelDE(String alterTitel, String neuerTitel) {
		/*Eine Hilfsvariable speicher wird erstelt, um den neune Titel zwischen zu speichern.*/ 
		String speicher;
		titelDE = alterTitel;
		speicher = neuerTitel;
		titelDE = speicher;
		
		
	}
	@Override
	public void updateTitelEN(String alterTitel, String nuerTitel) {
		// TODO Auto-generated method stub
		
	}
	
}
