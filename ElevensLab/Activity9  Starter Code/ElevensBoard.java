import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		Card[] c = this.getCards();
		// || (c[selectedCards.get(0)].pointValue()+c[selectedCards.get(1)].pointValue()+c[selectedCards.get(2)].pointValue()) == 0)
		if ((c[selectedCards.get(0)].pointValue()+c[selectedCards.get(1)].pointValue()) == 11)
		{
		    return true;
		  }
		int count = 0;
	    int count2 = 0;
	    int count3 = 0;
		for(int i = 0; i<selectedCards.size(); i++){
		    if (c[selectedCards.get(i)].suit().equals("king")){
		        count=1;
		      }
		      if (c[selectedCards.get(i)].suit().equals("queen")){
		        count2=1;
		      }
		      if (c[selectedCards.get(i)].suit().equals("jack")){
		        count3=1;
		      }
		      
		      if( count ==1 && count2 == 1 && count3 ==1){
		          return true;
		      }
		  }
		  
		  return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board cotains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		Card[] c = this.getCards();
		for(int i =0; i<c.length; i++){
		    for(int j = 0; j<c.length; j++){
		        if ((c[i].pointValue() + c[j].pointValue()) == 11){
		            return true;
		          }
		      }
		  }
	    int count = 0;
	    int count2 = 0;
	    int count3 = 0;
		for(int i = 0; i<c.length; i++){
		    if (c[i].suit().equals("king")){
		        count=1;
		      }
		      if (c[i].suit().equals("queen")){
		        count2=1;
		      }
		      if (c[i].suit().equals("jack")){
		        count3=1;
		      }
		      
		      if( count ==1 && count2 == 1 && count3 ==1){
		          return true;
		      }
		  }
		  return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		Card[] c = this.getCards();
		for(int i =0; i<selectedCards.size(); i++){
		    for(int j = 0; j<selectedCards.size(); j++){
		        if ((c[selectedCards.get(i)].pointValue() + c[selectedCards.get(j)].pointValue()) == 11){
		            return true;
		          }
		      }
		  }
		  return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		Card[] c = this.getCards();
	    int count = 0;
	    int count2 = 0;
	    int count3 = 0;
		for(int i = 0; i<c.length; i++){
		    if (c[selectedCards.get(i)].suit().equals("king")){
		        count++;
		      }
		      if (c[selectedCards.get(i)].suit().equals("queen")){
		        count2++;
		      }
		      if (c[selectedCards.get(i)].suit().equals("jack")){
		        count3++;
		      }
		      
		      if( count ==1 && count2 == 1 && count3 ==1){
		          return true;
		      }
		  }
		  return false;
	}
}
