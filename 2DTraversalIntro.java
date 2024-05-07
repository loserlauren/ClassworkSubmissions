
public class TwoDArrayTraversal {

	public static void main(String[] args) {
	
	//TASK 1
	String[][] foods = 
			{ 
			  {"a", "b", "c", "d","e","f"}, 
			  {"g", "h", "i", "j", "k","l"},
			  {"m", "n", "o", "p", "q","r"}, 
			  {"s", "t", "u", "v", "w","x"},
			  {"y", "z", "a", "b", "c","d"},
			  {"e", "f", "g", "h", "i","j"},
			  {"k", "l", "m", "n", "o","p"} 
			};
	
	//TASK 3
	for(int i = 0; i < foods.length; i++)
	{
		System.out.println(foods[i][0]);
	}
	
	//TASK 5
	for(int i = 0; i < foods[0].length; i++)
	{
		System.out.println(foods[0][i]);
	}
	
	for(int i = 0; i < foods[0].length; i++)
	{
		System.out.println(foods[1][i]);
	}
	
	for(int i = 0; i < foods[0].length; i++)
	{
		System.out.println(foods[2][i]);
	}
	
	//TASK 6
	for(int i = 0; i < foods.length; i++)
	{
		for(int j = 0; j < foods[i].length; j++)
		{
			System.out.println(foods[i][j]);
		}
	}
	
	}
		


}
