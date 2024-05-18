
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
	
	double[][] nums = new double[4][4];
	
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
	
	print2DArray(foods);
	
	allOnes2D(nums);
	
	double [][] myArr = allOnes2D(nums);
	
	print2DArray(myArr);
	
	
	}
	
	//Task 1: Create a method print2DArray() that is passed a 2D String array 
	//and will print out each element in row-major order (instead of column-major 
	//order like we did yesterday). 
	public static void print2DArray(String[][]foods)
	{
		for(int i = 0; i < foods[0].length; i++)
		{
			for(int j = 0; j < foods.length; j++)
			{
				System.out.println(foods[j][i]);
			}
		}
	}
	
	private static void print2DArray(double [][] myArr) 
	{
		for (int i = 0; i < myArr[0].length; i++) 
		{
			for(int j = 0; j < myArr.length; j++) 
			{
				System.out.println(myArr[j][i]);
			}
			
			
		}
		
	}
	
	//Task 2: Create a method allOnesDoubleArray that is passed a 2D double array, 
	//makes an array of the same column and row length but all its literals are 0.0 
	//called copyArr, and then changes each element inside to 1.0 and returns copyArr. 
	//(So it is passed a 2D array and returns a 2D array with all 1.0).
	public static double[][] allOnes2D(double[][] nums)
	{
		double [][] copyArr = new double [nums.length][nums[0].length];
		
		for (int i=0; i<copyArr.length; i++) 
		{
			for(int j = 0; j< copyArr[0].length ; j++) 
			{
				copyArr[i][j]=1.0;
				
			}
		}
		//print2DArray(copyArr);
		return copyArr;
	}

}
