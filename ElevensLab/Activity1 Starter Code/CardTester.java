
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("king", "hearts", 13);
		Card c2 = new Card("king", "hearts", 13);
		Card c3 = new Card("ace", "clubs", 1);
		Card c4 = new Card("king", "clubs", 13);
		
		System.out.println(c1.suit()+c1.rank()+c1.pointValue());
		System.out.println(c2.suit()+c2.rank()+c2.pointValue());
		System.out.println(c3.suit()+c3.rank()+c3.pointValue());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println(c1.matches(c2));
		System.out.println(c1.matches(c3));
		System.out.println(c1.matches(c4));
	}
}
