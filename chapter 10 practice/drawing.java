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
    public drawing(int xfar, int yfar)
    {
        x = xfar;
        y = yfar;
    }

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double dot = new Ellipse2D.Double(x, y, 15, 15);

        g2.fill(dot);
    }
}
