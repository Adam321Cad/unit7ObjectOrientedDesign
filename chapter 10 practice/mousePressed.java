import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 * Write a description of class mousePressed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mousePressed
{
        public void mousePressed(MouseEvent event)
    {
        int x = event.getX();
        int y = event.getY();
        component.moveRectangleTo(x,y);
    }

}
