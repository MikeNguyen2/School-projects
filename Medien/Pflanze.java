public class Pflanze extends Umwelt
{
    private String Art; 

    public Pflanze(String art,String uname, int uanzahl)
    {
        super(uname);
        Art = art;
    }

    public void auflisten()
    {
        super.auflisten();
        System.out.println(anzahl);
        System.out.println(Art);
    }
}
