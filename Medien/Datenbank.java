import java.util.ArrayList;

/**
 * Die Klasse Datenbank bieten M�glichkeiten zum Speichern
 * von CD- und Video-Objekten. Eine Liste aller CDs und Videos
 * kann auf der Konsole ausgegeben werden.
 * 
 * Diese Version speichert die Daten nicht im Dateisystem und
 * bietet keine Suchfunktion.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2003-03-31
 */
public class Datenbank
{
    private ArrayList medien;

    /**
     * Erzeuge eine leere Datenbank.
     */
    public Datenbank()
    {
        medien = new ArrayList();
    }

    /**
     * Erfasse das gegebene Medium in dieser Datenbank.
     */
    public void erfasseMedium(Medium dasMedium)
    {
        medien.add(dasMedium);
    }


    public void auflisten()
    {
         int anzahl = medien.size();   
         for(int n=0; n<anzahl;n++)
         {
             Medium medium = (Medium)medien.get(n);
             medium.ausgeben();
             System.out.println();   // eine Leerzeile als Abstand
         }
    }
}