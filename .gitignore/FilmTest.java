public class FilmTest
{
	static Film m = new Film("Mein erster Film","My first movie", 2018, 0, 120, "DE", "Ich");
	static Film i = new Film("Mein erster Film","My first movie", 2018, 0, 120, "DE", "Ich");
	public static void main(String[] arg)
	{
		m.updateTitelDE("Mein erster Film", "Jetzt heißt er anders");
		m.toStringVoid();
		m.equalsMovie(m, i);
	}
}