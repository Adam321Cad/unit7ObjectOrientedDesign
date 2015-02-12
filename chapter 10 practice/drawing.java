import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Write a description of class feafafe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class drawing
{
    private int x;
    private int y;
    public drawing(int[] coord)
    {
        x = coord[0];
        y = coord[1];
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double dot = new Ellipse2D.Double(x, y, 5, 5);
        //Line2D.Double roofTop = new Line2D.Double(r2,r3);
        
        g2.draw(dot);
}
}
