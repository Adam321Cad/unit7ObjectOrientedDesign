import java.util.Random;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();
		int[] a = {1,2,3,4};
		int[] b = {4,2,1,5};
		System.out.println(DeckTester.arePermutations(a,b));

		/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
	}
	
	public static String flip(){
	    Random r = new Random();
	    int num = r.nextInt(3);
	    if (num != 0){
	        return "heads";
	       }else{return "tails";}
	   }
	
    public static boolean arePermutations(int[] x, int[] y){
        boolean count =true;
        int num = 0;
        for(int i = 0; i<x.length; i++){
            num =0;
            for (int j = 0; j<y.length; j++){
                if(x[i] == y[j]){
                    count = true;
                    num = 1;
                    break;
                }
                
            }
            if (num != 1){
                    return false;
                }
        }
        return count;
    }
	   
	
}
