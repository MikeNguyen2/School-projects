
public class Spielleiter
{
    private Monster monster;
    private Spieler spieler;
    private Wasserdrache wasserdrache;
    private Feuermagier feuermagier;
    private Waldelf waldelf;
    private int kämpfe;
    private boolean gewonnen;
    
    
    public Spielleiter(String spielerart)
    {
        kämpfe=0;
        gewonnen=false;
        monster=new Monster();
        System.out.println("Willkommen bei Würfelmonster!");
        System.out.println("Unter der Methode ´Hilfe´ wird dir das Spiel erklärt");
        if(spielerart=="Wasserdrache")
        {
            spieler=new Wasserdrache();
            System.out.println("Deine Klasseist: "+spielerart);
            System.out.println();
        }
        else
            if(spielerart=="Feuermagier")
            {
                spieler=new Feuermagier();
                System.out.println("Deine Klasse ist: "+spielerart);
                System.out.println();
            }
            else
                if(spielerart=="Waldelf")
                {
                    spieler=new Waldelf();
                    System.out.println("Deine Klasse ist: "+spielerart);
                    System.out.println();
                }
                else
                {
                    spieler=new Spieler();
                    System.out.println("Deine Klasse: keine");
                    System.out.println();
                }
        }
        
    public void Hilfe()
    {
        System.out.println("In diesem Spiel würfelst du, um Monster zu besiegen und neue Würfel zu kaufen.");
        System.out.println("Dein Ziel ist so schnell wie möglich 20Punkte zu erreichen.");
        System.out.println("Klassen für den Konstruktor: ´Wasserdrache´, ´Feuermagier´, ´Waldelf´.");
        System.out.println();
        System.out.println("deineStatistik: Zeigt deine Werte an.");
        System.out.println("kaufen: Hier kaufst du deine Würfel.");
        System.out.println("kämpfen: DU kämpfst gegen einen Bot, der sich deiner Punktzahl anpasst.");
        System.out.println("Um Würfel auszuwählen, gebe ´blau´, ´rot´ oder ´grün´ an.");
        System.out.println();
    }
        
    public void deineStatistik()
    {    
        spieler.zeigeStatistik();
        spieler.zeigePreise();
    }
    
    public void kämpfen(String würfelfarbe)
    {
         spieler.würfeln(würfelfarbe);
         monster.würfeln(spieler.punkte);
         kämpfe+=1;
         if(spieler.stärke > monster.stärke)
         {
             System.out.println("Du gewinnst!");
             monster.beute(spieler);
             spieler.punkte+=1;
             spieler.geld += monster.beute;
             System.out.println("Deine Beute: "+monster.beute);
             System.out.println("Dein Geld: "+spieler.geld);
             System.out.println("Deine Punkte: "+spieler.punkte); 
             System.out.println();
             if(gewonnen==false)
             {
                if(spieler.punkte==20)
                {
                    gewonnen=true;
                    System.out.println("Du hast gewonnen!");
                    System.out.println("Dafür hast du"+kämpfe+"Kämpfe benötigt.");
                    System.out.println("Von nun an kannst du weiterspielen.");
                }
             }
         }
         else
         {
             spieler.punkte-=2;
             System.out.println("Du verlierst!");
             System.out.println("Deine Punkte: "+spieler.punkte); 
             System.out.println();
         }
    }
    
    public void kaufen(int blaueWürfel,int roteWürfel,int grüneWürfel)
    {    
        spieler.kaufen(blaueWürfel,roteWürfel,grüneWürfel);
    }
}