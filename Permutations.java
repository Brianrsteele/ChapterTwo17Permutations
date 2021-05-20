/**
 *  From Chapter 2 of Java Programming: From Problem Analysis to Program Design
 *  by D.S. Malik
 *  
 *  Problem 17
 *  
 *  5/18/21
 *  
 *  Given three strings, output the six possible permutations of the strings
 */

package permutations;

import java.util.Scanner;

/**
 * This class will create the six possible permutations of three given strings.
 * 
 * TODO - Implement a version of the class using Heap's Algorithm that will accept an arbitrary number of strings.
 * 			https://en.wikipedia.org/wiki/Heap%27s_algorithm or https://www.geeksforgeeks.org/heaps-algorithm-for-generating-permutations/
 * 			
 * 
 * @author briansteele
 *
 */
public class Permutations {
	
	Scanner console = new Scanner(System.in);
	private String[] threeStrings;
	private String outputString;
	
	
	/**
	 * Constructor
	 */
	public Permutations() {
		this.threeStrings = new String[3];
		this.outputString = "";
	}
	
	
	/**
	 * Prompts a user for three strings to use in permutations via the command line.
	 * Strings get added to the String[] threeStrings of the Permutations object.
	 */
	public void getTheStrings() {
		System.out.println("Input the first string: ");
		String first = console.nextLine();
		this.threeStrings[0] = first;
		
		System.out.println("Input the second string: ");
		String second = console.nextLine();
		this.threeStrings[1] = second;
		
		System.out.println("Input the third string: ");
		String third = console.nextLine();
		this.threeStrings[2] = third;	
		
	}
	
	/**
	 * Creates a string that holds all six permutations of the three strings in the threeStrings array.
	 */
	public void orderStrings() {
		
		this.outputString = threeStrings[0] + ", " + threeStrings[1] + ", " + threeStrings[2] + "\n";
		this.outputString += threeStrings[0] + ", " + threeStrings[2] + ", " + threeStrings[1] + "\n";
		this.outputString += threeStrings[1] + ", " + threeStrings[0] + ", " + threeStrings[2] + "\n";
		this.outputString += threeStrings[1] + ", " + threeStrings[2] + ", " + threeStrings[0] + "\n";
		this.outputString += threeStrings[2] + ", " + threeStrings[0] + ", " + threeStrings[1] + "\n";
		this.outputString += threeStrings[2] + ", " + threeStrings[1] + ", " + threeStrings[0];
		
	}
	
	/**
	 * Get the permutations of the three strings.
	 * @return String containing the six permutations of the three strings in the threeStrings array.
	 */
	public String getThreeStrings() {
		return this.outputString;
	}
	
	/**
	 * Set the array holding the three strings to use in permutations.
	 * 
	 * @param strings String[3] holding three stings to use in permutations.
	 */
	public void setThreeStrings(String[] strings) {
		this.threeStrings = strings;
	}

}
