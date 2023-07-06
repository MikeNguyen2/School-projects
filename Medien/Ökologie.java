import java.util.ArrayList;

public class Ökologie
{
    private ArrayList öko;
    
    public Ökologie()
    {
        öko = new ArrayList();
    }
    
    public void hinzufuegen(Umwelt umwelt)
    {
        öko.add(umwelt);
    }
    
    public void aufrufen()
    {
        int n=0;
        while(n < öko.size())
        {
            Umwelt umwelt =(Umwelt) öko.get(n);
            umwelt.auflisten();
            n++;
        }
    }
}
