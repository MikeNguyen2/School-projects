public class Tier extends Umwelt
{
    private String Art; 
    private int generation;

    public Tier(int tgeneration,String uname)
    {
        super(uname);
        generation = tgeneration;
    }

    public void auflisten()
    {
        super.auflisten();
        System.out.println(generation);
    }
}
