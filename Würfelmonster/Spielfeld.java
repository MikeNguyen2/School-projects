import java.awt.*;
import javax.swing.*;


/**
 * Eine grafische Ansicht des Simulationsfeldes.
 
 */
public class Spielfeld 
{
    private Feldansicht feldansicht;
    JLabel myTestLabel;
    

    /**
     * Erzeuge eine Ansicht mit der gegebenen Breite und Höhe.
     */
    public Spielfeld()
    {
              
        JFrame myFrame = new JFrame("Mein neuens Spielfeld");
        /* Wir setzen die Breite und die Höhe 
           unseres Fensters auf 200 Pixel */        
        myFrame.setSize(500,500);
       
        myTestLabel = new JLabel("Hallo", JLabel.CENTER);
        myFrame.setTitle("MEinqqqqqqq aktuelles Spielfeld");
       
        
        myFrame.setLocation(200, 100);
        
        feldansicht = new Feldansicht();
    

        Container inhalt = myFrame.getContentPane();
        inhalt.add(myTestLabel, BorderLayout.NORTH);
        inhalt.add(feldansicht, BorderLayout.CENTER);
        
        //myFrame.pack();
        myFrame.setVisible(true);
    }
    
     /**
   * Zeichne erneut alle Figuren auf der Leinwand.
   */
  private void erneutZeichnen()
  {
   
    feldansicht.repaint();
  }
  
  
 
    private class Feldansicht extends JPanel
    {
       private Graphics g;
     
       
       public Feldansicht()
       {
        }
     
     
       public void paint(Graphics g)
       {
           g.drawLine(50,0,50,500);
           g.setColor(Color.RED);
           g.fillOval(50,50,100,100);
        
 
       }
    }
}