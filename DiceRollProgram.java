import java.util.Scanner;
public class DiceProgram {

	public static void main(String[] args) {
		// Make a line that prints an int between 1 and 17 inclusive
		// roll it 200 times
		int i = 1;
		
		while (i<=200) 
		{
			System.out.println((int)(Math.random()*17 + 1));
			i++;
		}
		
		String name1 = "humuhumunukunukaapuaa";
		char char1 = 'a';
		
		int n = countChars(name1, char1);
		
		System.out.println("number of characters is " + n);
		
		// Create a scanner that receives the input of the user
		Scanner myNum = new Scanner(System.in);
		// make it into a string
		String num = new String(myNum.nextLine());

		// create method
		rollDice(num);
		
		// create a string 
		String input = new String(myNum.nextLine());
		
		// create a method that removes spaces
		noSpace(input);
		
		// instantiate a string that sets to return from method
		String output = noSpace(input);
		
		// print out the input without space
		System.out.println(output);
		
		// close the scanner so my laptop doesnt explode
		myNum.close();
	}
	/**
	 * method should count how many times the char shows up in the String and return that number
	 * @param name1
	 * @param char1
	 * @return
	 */
	public static int countChars(String name1, char char1) 
	{
		
		int x = 0;
		
		for (int i = 0; i < name1.length(); i++) 
		{
			if (name1.charAt(i) == char1)
			{
				x++;
			}
		}
		
		return x;
	
	}	
	

	/**
	 *  create a method that generates random number from dice
	 */
	
	public static int rollDice(String num)
	{
		// declare strings as an int
		int i = 0;
		
		int ans = 0;
		
		//declare an int for the index
		int mid = num.indexOf('d');
				
		// create a string for both sides of the index
		String left = num.substring(0, mid);
		String right = num.substring(mid + 1);
				
		// create print statement
		System.out.println("Your first number is " + left + " and your second number is " + right);
				
		// declare strings as an int in order to add them
		int a = Integer.valueOf(left);
		int b = Integer.valueOf(right);
		
		// create a while loop generator
		while (i <= a)
		{
			// print out the result
			int roll = ((int)(Math.random()*b + 1));
			i++;
			ans += roll;
	
		}
		
		System.out.println("The sum of the numbers rolled is " + ans);

		return ans;	
		
		
	}
	
	/**
	 * make a method that takes away the spaces from the input of a string
	 * @param input
	 * @param char2
	 * @return 
	 */
	public static String noSpace(String input)
	{
		
		// declare the space as an int
		char space = ' ';
				
		//create for loop that takes away spaces
		for ( ;input.indexOf(space) > -1;)
		{
			// instantiate strings that get the parts before and after spaces
			String first = input.substring(0,input.indexOf(space));
			String second = input.substring(input.indexOf(space) + 1);
			
			// add first and second until there are no spaces
			input = first + second;
			
				
		}
		// return the final output
		return input;
	
		
	}

	
	
	

}
	

}
