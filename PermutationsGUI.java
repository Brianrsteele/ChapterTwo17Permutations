package permutations;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


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
 *  GUI version of the program using Swing
 */




/**
 * Swing GUI main class for Permutations program
 * 
 * TODO: Use a better grid layout than null, make a better looking interface.
 * TODO: implement menu items
 * TODO: Accept arbitrary number of strings via GUI interface.
 * 
 * @author briansteele
 *
 */
/**
 * @author briansteele
 *
 */
public class PermutationsGUI implements ActionListener{
	
	JTextField firstField, secondField, thirdField;
	JTextArea stringOutput;
	JButton createPermutationsB, resetB;
	Permutations p;
	
	/**
	 * Constructor for Swing GUI
	 */
	public PermutationsGUI() {
		
		//create window
		JFrame f = new JFrame("Permutations Program");
		//make sure it exits on close
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//set up the Input and Output labels on right colum
		JLabel in = new JLabel("Input");
		in.setBounds(50, 50, 200, 50);
		in.setFont(new Font("Sans Serif", Font.BOLD, 14));
		f.add(in);
		
		JLabel out = new JLabel("Output");
		out.setBounds(300, 50, 200, 50);
		out.setFont(new Font("Sans Serif", Font.BOLD, 14));
		f.add(out);
		
		//create the input labels and textfields on left column
		JLabel first = new JLabel("First String:");
		first.setBounds(50, 100, 200, 50);
		f.add(first);
		
		firstField = new JTextField();
		firstField.setBounds(50, 150, 200, 50);
		f.add(firstField);
		
		JLabel second = new JLabel("Second String:");
		second.setBounds(50, 200, 200, 50);
		f.add(second);
		
		secondField = new JTextField();
		secondField.setBounds(50, 250, 200, 50);
		f.add(secondField);
		
		JLabel third = new JLabel("Third String:");
		third.setBounds(50, 300, 200, 50);
		f.add(third);
		
		thirdField = new JTextField();
		thirdField.setBounds(50, 350, 200, 50);
		f.add(thirdField);
		
		//create the text area
		stringOutput = new JTextArea("");
		stringOutput.setBounds(300, 100, 200, 300);
		f.add(stringOutput);
		
		//create the buttons
		//"create permutations" - creates the string
		createPermutationsB = new JButton("Create Permutations");
		createPermutationsB.setBounds(300, 425, 200, 50);
		//add actionlistener to button
		createPermutationsB.addActionListener(this);
		f.add(createPermutationsB);
		
		//"Reset Button" - clears textfields and textarea
		resetB = new JButton("Reset");
		resetB.setBounds(50, 425, 200, 50);
		//add actionlister to button
		resetB.addActionListener(this);
		f.add(resetB);
		
		//size, layout, make visible.
		f.setSize(550, 525);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	
	/**
	 * Actions on button press
	 */
	public void actionPerformed(ActionEvent e) {
		
		// if Create Permutations button pressed...
		if (e.getSource() == createPermutationsB) {
			String s1 = firstField.getText();
			String s2 = secondField.getText();
			String s3 = thirdField.getText();
			String[] results = {s1, s2, s3};
			p = new Permutations();
			p.setThreeStrings(results);
			p.orderStrings();
			stringOutput.setText(p.getThreeStrings());
		// if reset button pressed
		} else if (e.getSource() == resetB) {
			firstField.setText("");
			secondField.setText("");
			thirdField.setText("");
			stringOutput.setText("");
		}
		
		
	}
	
	
	

	/**
	 * Main method for GUI version - start the Swing GUI
	 * @param args
	 */
	public static void main(String[] args) {
		PermutationsGUI pg = new PermutationsGUI();
		

	}

}
