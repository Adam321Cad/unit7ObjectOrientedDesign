import java.util.Scanner;

/**
 * Write a description of class TestLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestLock
{
   
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       int lock1, lock2, lock3;
       comboLock l = new comboLock(10, 20, 30);
       /*
      System.out.print ("Enter the first number for the lock: ");
      lock1 = s.nextInt();
      
      System.out.print ("Enter the second number for the lock: ");
      lock2 = s.nextInt();
      
      System.out.print ("Enter the third number for the lock: ");
      lock3 = s.nextInt();
      */
      
      l.turnClockwise(10);
      l.turnCounterClockwise(39);
      l.turnClockwise(10);
      //boolean bla = l.open
      
       if(l.open() == true)
      {System.out.println("yay!");
        }else{
            System.out.println("boo");
        }
      
      
    }

}
