import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * Write a description of class TriangleGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleGUI extends JFrame
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setTitle("Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MousePressListener m = new MousePressListener();
        drawing d = new drawing(m.mouseClicked());
        d.draw();

        frame.setVisible(true);

    }

    class MousePressListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            int[] bla = {x,y};
        }

        public void mousePressed(MouseEvent e) {}

        public void mouseReleased(MouseEvent e) {}

        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}
    }

}
