/**
 *  From Chapter 2 of Java Programming: From Problem Analysis to Program Design
 *  by D.S. Malik
 *  
 *  Problem 17
 *  
 *  5/18/21
 *  
 *  Given three strings, output the six possible permutations of the strings
 *  
 *  Main class for Permutations program
 */

package permutations;

/**
 * Main class for the CLI version of the Permutations program.
 * 
 * TODO: Accept strings from sys args.
 * 
 * @author briansteele
 *
 */
public class PermutationsController {

	public static void main(String[] args) {
		Permutations p = new Permutations();
		p.getTheStrings();
		p.orderStrings();
		System.out.println(p.getThreeStrings());

	}

}
