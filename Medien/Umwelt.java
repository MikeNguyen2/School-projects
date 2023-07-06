public class Umwelt
{
    protected String name;
    protected int anzahl;
    
    public Umwelt(String uname)
    {
        name = uname;
    }
    
    public Umwelt(String uname, int uanzahl)
    {
        name = uname;
        anzahl = uanzahl;
    }

    public void auflisten()
    {
        System.out.println(name);
        System.out.println();
    }
}
