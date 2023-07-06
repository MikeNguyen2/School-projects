/**
 * Objekte dieser Klasse repr�sentieren CDs. 
 * Sie speichern Informationen �ber eine CD, die
 * wieder abgefragt werden k�nnen.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2003-03-31
 */
public class CD extends Medium
{
    private String kuenstler;
    private int titelanzahl;

    /**
     * Konstruktor f�r Objekte der Klasse CD
     */
    public CD(String derTitel, String derKuenstler, int stuecke, int laenge)
    {
        super(derTitel, laenge);
        kuenstler = derKuenstler;
        titelanzahl = stuecke;
    }

    /**
     * Liefere den K�nstler dieser CD.
     */
    public String gibKuenstler()
    {
        return kuenstler;
    }

    /**
     * Liefere die Anzahl der Titel auf dieser CD.
     */
    public int gibTitelanzahl()
    {
        return titelanzahl;
    }
}