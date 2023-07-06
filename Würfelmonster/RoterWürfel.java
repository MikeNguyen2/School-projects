
public class RoterWürfel extends Würfel
{

    public RoterWürfel()
    {
        anzahl = 1;
        preis=40;
    }
    
    public void anzeigen()
    {
        System.out.println("RoterWürfel: " + preis);
    }
    
    public void würfeln()
    {
        int n= 0;
        stärke=0;
        while(n<anzahl)
        {
            stärke += (int)(Math.random()*5)+1;
            n++;
        }
        stärke+=anzahl*2;
       
    }

}
