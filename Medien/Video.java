/**
 * Objekte dieser Klasse repr�sentieren Videos. Es werden
 * Informationen �ber ein Video verwaltet, die wieder
 * abgefragt werden k�nnen.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2003-03-31
 */
public class Video extends Medium 
{
    private String regisseur;

    /**
     * Konstruktor f�r Objekte der Klasse Video
     */
    public Video(String derTitel, String derRegisseur, int laenge)
    {
        super(derTitel, laenge);
        regisseur = derRegisseur;
    }

    /**
     * Liefere den Regisseur dieses Videos.
     */
    public String gibRegisseur()
    {
        return regisseur;
    }
}
