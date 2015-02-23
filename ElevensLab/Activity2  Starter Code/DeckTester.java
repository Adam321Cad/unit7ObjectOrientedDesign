/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] ranks = {"a","b","c"};
        String[] suits = {"lions","hippo"};
        int[] values = {2,1,6};
        
        Deck d = new Deck(ranks, suits, values);
        System.out.println(d.isEmpty());
        p(d.isEmpty());
        p(d.toString());
        p("hello");
    }
    
    public static void p(String s)
    {
        System.out.println(s);
    }
    public static void p(boolean s)
    {
        System.out.println(s);
    }
    public static void p(int s)
    {
        System.out.println(s);
    }
    public static void p(double s)
    {
        System.out.println(s);
    }

}
