import java.util.ArrayList;

public class ArrayListSorters {

	public static void main(String[] args) {
	
	//Task 1: In the main method, instantiate two ArrayLists nums and 
	//names of Integers (remember ints wouldn't work for ArrayLists) and 
	//Strings respectively. Fill them with five unsorted values (nums out 
	//of numerical order and names out of alphabetical order). 
		
	ArrayList<Integer> nums = new ArrayList<Integer>();
	ArrayList<String> names = new ArrayList<String>();
	
	nums.add(5);
	nums.add(3);
	nums.add(7);
	nums.add(1);
	nums.add(8);
	
	names.add("Prometheus");
	names.add("Agatha");
	names.add("Beatrice");
	names.add("Yolanda");
	names.add("Katrina");
	
	//Task 2: Create a void method bubbleSortNumbers that is passed an 
	//ArrayList and bubble sorts it just like we did for arrays. 
	
	//Task 3: Create a void method bubbleSortStrings that is passed an 
	//ArrayList and bubble sorts it into alphabetical order. 
	
	bubbleSortNumbers(nums);
	bubbleSortStrings(names);

	}
	
	public static void bubbleSortNumbers(ArrayList<Integer> nums)
	{
		// declare int that is equal to array length
		Integer n = nums.size();
		// declare an int that is used as a placeholder
		int temp = 0;
				
		// create a for loop that runs through entire array
		for (int i = 0; i < n; i++)
		{
			// create for loop that runs till the character before it ends
			for (int j = 1; j < (n - 1); j++)
			{
				// create if statement that sees if previous number is smaller
				if (nums.get(j - 1) > nums.get(j))
				{
					// swap numbers
					temp = nums.set(j, nums.get(j - 1));
					nums.set((j - 1), temp);
				}
			}
		}
		System.out.println(nums);
	}
	
	public static void bubbleSortStrings(ArrayList<String> names)
	{
		Integer n = names.size();
		
		// create a for loop that runs through entire array
		for (int i = 0; i < n; i++)
		{
			// create for loop that runs till the character before it ends
			for (int j = 0; j < (n - 1); j++)
			{
				// create if statement that sees if previous number is smaller
				if (names.get(j).compareTo(names.get(j + 1)) > 0)
				{
					// swap numbers
					String temp = names.get(j);
					names.set(j,  names.get(j + 1));
					names.set(j + 1, temp);
				}
			}
		}
		System.out.println(names);
		
	}


}
