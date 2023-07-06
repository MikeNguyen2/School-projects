public class GrünerWürfel extends Würfel
{
    
    public GrünerWürfel()
    {
        anzahl = 1;
        preis=80;
    }

    public void anzeigen()
    {
        System.out.println("GrünerWürfel: " + preis);
    }
    
    public void würfeln()
    {
        int n= 0;
        stärke=0;
        while(n<anzahl)
        {
            stärke += (int)(Math.random()*14)+1;
            n++;
        }
    }
}
