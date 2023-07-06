
public class Monster
{
    private int würfelAnzahl;
    protected int stärke;
    protected int beute;
    
    public Monster()
    {
        würfelAnzahl=1;
        beute=0;
    }
    
    public void würfeln(int würfelAnzahl)
    {
        int n= 0;
        stärke=0;
        while(n<=würfelAnzahl)
        {
            stärke += (int)(Math.random()*7)+1;
            n++;
        }
        System.out.println("Monstestärke:"+stärke);
    }
    
    public void beute(Spieler spieler)
    {
        beute=(int)(Math.random()*spieler.punkte*5)+5;
    }
    
    
}
