public class Spieler
{
    protected int geld;
    protected int stärke;
    protected int punkte;
    protected BlauerWürfel blauerWürfel;
    protected RoterWürfel roterWürfel;
    protected GrünerWürfel grünerWürfel;
    
    public Spieler()
    {
        geld=50;
        stärke=0;
        punkte=0;
        blauerWürfel=new BlauerWürfel();
        roterWürfel=new RoterWürfel();
        grünerWürfel=new GrünerWürfel();
    }

    public void würfeln(String würfelfarbe)
    {
           if(würfelfarbe=="blau")
           {
               blauerWürfel.würfeln();
               stärke=blauerWürfel.stärke;
           }
           
           if(würfelfarbe=="rot")
           {
               roterWürfel.würfeln();
               stärke=roterWürfel.stärke;
           }
           
           if(würfelfarbe=="grün")
           {
               grünerWürfel.würfeln();
               stärke=grünerWürfel.stärke;
           }
           System.out.println("Deine Stärke:"+stärke);
    }
    
    public void zeigePreise()
    {
        System.out.println("Dein Shop:");
        roterWürfel.anzeigen();
        blauerWürfel.anzeigen();
        grünerWürfel.anzeigen();
        System.out.println();
    }
    
    public void kaufen(int blaueWürfel,int roteWürfel,int grüneWürfel)
    {    
        int preis = blauerWürfel.preis*blaueWürfel+roterWürfel.preis*roteWürfel+grünerWürfel.preis*grüneWürfel;
        if(geld>=preis)
        {
            geld -= preis;
            blauerWürfel.erhöhen(blaueWürfel);
            roterWürfel.erhöhen(roteWürfel);
            grünerWürfel.erhöhen(grüneWürfel);
            System.out.println("Ihr Einkauf war erfolgreich!");
            zeigeStatistik();
        }
        else
        {
             System.out.println("Nicht genügend Geld!");
             System.out.println();
        }
    }
    
    public void zeigeStatistik()
    {
        System.out.println("Blaue Würfel: "+blauerWürfel.anzahl+"  (Zahlen 1-10 + Anzahl der Würfel)");
        System.out.println("Rote Würfel: "+roterWürfel.anzahl+"  (Zahlen 1-6 + Anzahl*2)");
        System.out.println("Grüne Würfel: "+grünerWürfel.anzahl+"  (Zahlen 1-15)");
        System.out.println("Geld: "+geld);
        System.out.println("Punkte: "+punkte); 
        System.out.println();   
    }
}
