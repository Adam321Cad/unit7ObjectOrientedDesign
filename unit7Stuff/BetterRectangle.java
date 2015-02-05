import java.awt.Rectangle;

/**
 * Write a description of class BetterRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetterRectangle extends Rectangle
{
    /** description of instance variable x (add comment for each instance variable) */
    static int x = 1;
    /**
     * Default constructor for objects of class BetterRectangle
     */
    public BetterRectangle(int x, int y, int w, int h)
    {
       super(x,y,w,h);
    }

    public double getArea()
    {
        double height = super.getHeight();
        double width = super.getWidth();
        double area = height*width;
        return area;
    }
    
    public double getPerimeter()
    {
        double height = super.getHeight();
        double width = super.getWidth();
        double perimeter = 2*height + 2* width;
        return perimeter;
    }
    
    public static void panda()
    {
        System.out.println("pandas are cool");
    }

}
