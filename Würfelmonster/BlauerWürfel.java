
public class BlauerWürfel extends Würfel
{

    public BlauerWürfel()
    {
        preis = 60;
        anzahl = 1;
    }
    
    public BlauerWürfel(String deinName)
    {
        preis = 50;
        anzahl = 1;
    }
    
    public void anzeigen()
    {
        System.out.println("BlauerWürfel: " + preis);
    }
    
    public void würfeln()
    {
        int n= 0;
        stärke=0;
        while(n<anzahl)
        {
            stärke += (int)(Math.random()*9)+1;
            n++;
        }
        stärke+=anzahl;
    }
}