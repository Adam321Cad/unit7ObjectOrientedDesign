import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Write a description of class hbvfd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class triangle extends JComponent
{
    private int x;
    private int y;
    
    public triangle(int xfar, int yfar)
    {
        x = xfar;
        y = yfar;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        drawing d = new drawing(x, y);
        
        d.draw(g2);
    }

}

