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
		// instantiate string and char
		String name1 = "humuhumunukunukaapuaa";
		char char1 = 'a';
		// declare an int for the char counter
		int n = countChars(name1, char1);
		// print out the number of characters
		System.out.println("number of characters is " + n);
		
		// Create a scanner that receives the input of the user
		Scanner myNum = new Scanner(System.in);
		// make it into a string
		String num = new String(myNum.nextLine());
		
		//declare an int for the index
		int mid = num.indexOf('d');
		
		// create strings for both sides of the index
		String left = num.substring(0, mid);
		String right = num.substring(mid + 1);
		
		// create print statement for both numbers
		System.out.println("Your first number is " + left + " and your second number is " + right);
		
		// declare strings as an int in order to add them
		int a = Integer.valueOf(left);
		int b = Integer.valueOf(right);

		// add two numbers together
		int sum = a + b;
		// print put out the sum
		System.out.println("The sum of the two numbers is " + sum);
		
		// close the scanner so my laptop doesnt explode
		myNum.close();
	}
	
	private static int countChars(String name1, char char1) 
	{
		// declare int set to 0
		int x = 0;
		//create a for loop that finds the number of the assigned character
		for (int i = 0; i < name1.length(); i++) 
		{
			if (name1.charAt(i) == char1)
			{
				x++;
			}
		}
		// return the number of characters for that letter
		return x;
	
	}	
	
	
	
	

}
