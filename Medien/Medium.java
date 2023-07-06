/**
 * Objekte dieser Klasse repr�sentieren Medien in einer
 * Multimedia-Datenbank. Sie speichern Informationen �ber ein
 * Medium, die wieder abgefragt werden k�nnen.
 * Diese Klasse dient als Oberklasse f�r speziellere Medientypen.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2003-03-31
 */
public class Medium
{
    private String titel;
    private int spielzeit;
    private boolean habIch;
    private String kommentar;

    public Medium(String derTitel, int laenge)
    {
        titel = derTitel;
        spielzeit = laenge;
        habIch = false;
        kommentar = "";
    }

    public void setzeKommentar(String kommentar)
    {
        this.kommentar = kommentar;
    }

    public String gibKommentar()
    {
        return kommentar;
    }

    public void setzeVorhanden(boolean vorhanden)
    {
        habIch = vorhanden;
    }

    public boolean gibVorhanden()
    {
        return habIch;
    }

    public void ausgeben()
    {
        System.out.print("Titel: " + titel + " (" + spielzeit + " Min)");
        if(habIch) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + kommentar);
    }
}