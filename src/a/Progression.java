package a;

/**
 A class for numeric progression 
 */

public class Progression {
	
	/**  instance variable */
	protected long current;
	
	/** Default constructor. */
	Progression() {
		this(0);
	}
	
	/** Constructs progression with current start value*/
	Progression(long start){
		current = start;
	}
	
	/**Advances the current value to the next value of the progression. */
	protected void advance() {
		current++;
	}
	
	 /** Returns the next value of the progression. */
	 public long nextValue( ) {
	 long answer = current;
	 advance( ); // this protected call is responsible for advancing the current value
	 return answer;
	 }
	
	
	 /* Prints the next n values of the progression, separated by spaces. */
	 public void printProgression(int n) {
	 System.out.print(nextValue()); // print first value without leading space
	 for (int j=1; j < n; j++)
	 System.out.print(" " + nextValue()); // print leading space before others
	 System.out.println( ); // end the line
	 }
}


