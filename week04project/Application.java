package week04project;

public class Application {

	public static void main(String[] args) {
		/*
		 * 
		 * 1. Create an array of int called ages that contains the following 
		 * values: 3, 9, 23, 64, 2, 8, 28, 93.
			a. Programmatically subtract the value of the first element in 
			the array from the value in the last element of the array
			(i.e. do not use ages[7] in your code). 
			Print the result to the console.  
				
			b. Create a new array with 9 elements (one more than the ages array)
			Repeat the step above to ensure it is dynamic
			(works for arrays of different lengths).

			c. Use a loop to iterate through the array and calculate the average
			age. Print the result to the console.
		 */
		
		// a.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		/* Take the last element from the array then subtract it
		 * from the first element.
		 */
		System.out.println("1.)");
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("a. Result: " + result);
		
		// b.
		//create new array with 1 more element.
		int[] arr = {99, 89, 29, 45, 3, 10, 14, 22, 63};
		// the step from before
		int outcome = arr[arr.length - 1] - arr[0];
		System.out.println("b. Outcome: "+ outcome);
		
		//c.
		//Initialize the variables.
		int sum = 0;
		double average;
		// this loop calculates the sum of elements in ages array.
		for(int age: ages) {
			sum += age;
		}
		// calculate the average.
		average = (double) sum / ages.length;
		// print.
		System.out.println("c. Average age: " + average);
		System.out.println("\n");
		
		/*
		 * 2. Create an array of String called names that contains the following
		 * values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			a. Use a loop to iterate through the array and calculate the average
			number of letters per name. Print the result to the console.

			b. Use a loop to iterate through the array again and concatenate all
			the names together, separated by spaces, and print the result to the 
			console.
		 */
		System.out.println("2.)");
		// a.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		// Initialize the variables.
		int totalLetters = 0;
		double ave;
		// This loop calculate the total number of letters in every name.
		for (String name : names) {
			totalLetters += name.length();
		}
		// calculate the average.
		ave = (double) totalLetters / names.length;
		// print
		System.out.println("a. Average letters per name: " + ave);
		
		// b.
		// Initialize an empty string for concatenation.
		String concatenatedNames = "";
		// This for loop concatenates names with spaces.
		for (int i = 0; i < names.length; i++) {
			concatenatedNames += names[i];
			// If the index is not at the last element, add space.
			if (i < names.length -1) {
				concatenatedNames += " ";
			}	
		}
		//print.
		System.out.println("b. Concatenated Names: " + concatenatedNames);
		System.out.println("\n");
		
		/*
		 * 3.) How do you access the last element of any array?
		 * Use the array's length method and then subtract it by one to get
		 * the last element.
		 */
		
		/*
		 * 4.) How do you access the first element of any array?
		 * First, initialize the array, then write the array with zero inside
		 * as the index. Zero is the first element of the array.
		 */
		
		/*
		 * 5.) Create a new array of int called nameLengths. 
		 * Write a loop to iterate over the previously created names array and
		 * add the length of each name to the nameLengths array.
		 */
		
		System.out.println("5.)");
		// create an array to store name lengths
		int[] nameLengths = new int[names.length];
		// this loop calculates and stores name lengths
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.print("Name Lengths: ");
		// use a for loop to print all the name lengths.
		for (int length: nameLengths) {
			System.out.print(length + " ");
		}
		System.out.println("\n");
		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate
		 * the sum of all the elements in the array. Print the result to the
		 * console.
		 */
		
		// Initialize a variable to store the sum.
		
		int sum1 = 0;
		// Use a loop to calculate the sum of name lengths
		for (int length : nameLengths) {
			sum1 += length;
		}
		// print.
		System.out.println("6.)");
		System.out.println("Sum of Name Lengths: " + sum1);
		System.out.println("\n");
		 
		System.out.println("7.)");
		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments 
		 * and returns the word concatenated to itself n number of times.
		 * (i.e. if I pass in “Hello” and 3, I expect the method
		 * to return “HelloHelloHello”).
		 */
		
		String result1 = concatenatedWord("Hello", 3);
		System.out.println(result1);
		System.out.println("\n");
		System.out.println("8.)");
	
		/*
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the
full name should be the first and the last name as a String separated by a space).
		 */

		String firstName = "Ben";
		String lastName = "Dover";
		String fullName = createFullName(firstName, lastName);
		System.out.println("Full Name: " + fullName);
		System.out.println("\n");
		System.out.println("9.)");
		/*
		 * 9. Write a method that takes an Array of int and returns true if the sum of all the ints in the 
		 * Array is greater than 100.
		 */
		int[] numbers1 = {30, 40, 35, 10};
		boolean result2 = isSumGreaterThan100(numbers1);
		isSumGreaterThan100(numbers1);
		System.out.println("Sum greater than 100: " + result2); // It will output true
		System.out.println("\n");
		System.out.println("10.)");
		/*
		 * 10. Write a method that takes an Array of double and returns the average of all the elements in
the Array.
		 */
		double[] numbers = {1.5, 2.0, 3.5, 4.0, 5.5};
		double avg = calculateAverage(numbers);
		System.out.println("Average: " + avg); // This will output the average of the numbers.
		System.out.println("\n");
		System.out.println("11.)");
		/*
		 * 11. Write a method that takes two Arrays of double and returns true if the average of the
elements in the first Array is greater than the average of the elements in the second Array.
		 */
		double[] arr1 = {10.5, 15.0, 20.5};
		double[] arr2 = {5.0, 7.0, 8.0, 10.0};
		boolean result3 = isAverageGreaterThan(arr1, arr2);
		System.out.println("Average of arr1 > Average of arr2: " + result3);
		System.out.println("\n");
		System.out.println("12.)");
		/*
		 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double
moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 */
		boolean hotOutside = true;
		double money = 12.0;
		boolean outcome2 = willBuyDrink(hotOutside, money);
		System.out.println("Will buy a drink: " + outcome2);
		System.out.println("\n");
		System.out.println("13.)");
		/*
		 * 13. Create a method of your own that solves a problem. In comments, write what the method
does and why you created it.
		 */
		int[] digits = {10, 5, 23, 17, 8};
		int maxNumber = findMaximum(digits); // This method finds the maximum number in the array.
		// I chose to do this method because it is straight forward.
		System.out.println("Maximum number in the array: " + maxNumber);
		
		
		
		
		
	}
 // Methods:
	public static String concatenatedWord(String word, int n) {
		String concatenatedWord = "";
		for (int i = 0; i < n; i++) {
			concatenatedWord += word;
		}
		return concatenatedWord;
	}
	public static double calculateAverage(double[] arr) {
		if (arr.length == 0) {
			// This handles the case where the array is empty so that it doesn't divide by 0.
			return 0.0;
		}
		double sum = 0.0;
		for (double num: arr) {
			sum += num;
		}
		// calculate the average by dividing the sum by the number of elements 
		double average = sum / arr.length;
		return average;
		}
	public static boolean isSumGreaterThan100(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return sum > 100;
	}
	public static String createFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	public static boolean isAverageGreaterThan(double[] arr1, double[] arr2) {
		double sum1 = 0.0;
		double sum2 = 0.0;
		for (double num: arr1) {
			sum1 += num;
		}
		for (double num: arr2) {
			sum2 += num;
		}
		double avg1 = sum1 / arr1.length;
		double avg2 = sum2 / arr2.length;
		return avg1 > avg2;
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && (moneyInPocket > 10.50);
	}
	public static int findMaximum(int[] arr) {
		if (arr.length == 0) {
			System.out.println("Array is empty.");
		}
		int max = arr[0];
		for (int num: arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
}
