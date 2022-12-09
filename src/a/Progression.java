package a;

/**
 A class for numeric progression 
 */

public class Progression {
	
	/** First value of progression. */
	protected long first;
	
	/**Current value of progression. */
	protected long cur;
	
	/** Default constructor. */
	Progression() {
		cur=first=0;
	}
	
	/**
	 * Resets the progression to the first value
	 * @return first value
	 * */
	protected long firstValue() {
		cur = first;
		return cur;
	}
	
	/**
	 * Advances the progression to the next value
	 * @return next value of the progression
	 * */
	protected long nextValue() {
		return ++cur;
	}
	 /* Prints the next n values of the progression, separated by spaces. */
	 public void printProgression(int n) {
	 System.out.print(nextValue()); // print first value without leading space
	 for (int j=1; j < n; j++)
	 System.out.print(" " + nextValue()); // print leading space before others
	 System.out.println( ); // end the line
	 }
}


