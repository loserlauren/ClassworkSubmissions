
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
		
	}
	// method should count how many times the char shows 
		// up in the String and return that number
	private static int countChars(String name1, char char1) 
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
	
	

}
