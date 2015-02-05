import java.awt.Rectangle;

/**
 * Write a description of class testRect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testRect
{
    /** description of instance variable x (add comment for each instance variable) */
    public static void main(String[] args)
    {
        BetterRectangle r = new BetterRectangle(10,10,10,10);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        
        BetterRectangle.panda();
        System.out.println(BetterRectangle.x);
        
    }

}
