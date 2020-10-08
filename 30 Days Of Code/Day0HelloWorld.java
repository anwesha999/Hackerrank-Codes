/**
 * 
 * Problem Statement- To complete this challenge, you must save a line of input from stdin to a variable, 
 * print Hello, World. on a single line, and finally, print the value of your variable on a second line.
 * [Hello, World](https://www.hackerrank.com/challenges/30-hello-world)
 *
 * @gayatripalkar
 */


import java.util.Scanner;


public class Day0HelloWorld {
	public static void main(String[] args) {
		// Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in);

		// Read a full line of input from stdin and save it to our variable,
		// inputString.
		String inputString = scan.nextLine();

		// Close the scanner object, because we've finished reading
		// all of the input from stdin needed for this challenge.
		scan.close();

		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");

		System.out.println(inputString);

	}
}
