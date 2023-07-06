
/**
 * Beschreiben Sie hier die Klasse Film.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Film extends Medium
{
    private String Uploader;
    
    public Film(String derTitel, int laenge, String uploader)
    {
        super(derTitel,laenge);
        Uploader = uploader;
    }
    
    public void ausgeben()
    {
        super.ausgeben();
        System.out.println("Uploader: " + Uploader);
    }
    
}
