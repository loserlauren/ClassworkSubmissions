
public class ArrayTraversalTutorial {

	

	public static void main(String[] args) {
		
		
		int[] evens = {2, 4, 6, 8, 10, 12};
		
		double[] nums = {2.0, 3.7, 8.9, -1.2, 9.9};
		
		// doesnt work!!!
		//System.out.println(evens);
		
		printArr(nums);
		
		// declare method into double variable
		double sum = sumArrElements(nums);
		// print out sum
		System.out.println("The sum is " + sum);
		
		// declare an int array to method
		int[] one = makeEveryOtherOne(evens);
	
		
	}
	
	/**
	 * this method is passed an array and prints out
	 * each element one by one
	 * @param arr
	 */
	public static void printArr(double[] arr)
	{
		
		// TASK 1: make a variable to be the "traverser"
		int traverser;
		
		// TASK 2: make a loop, we want it to traverse every character, so it
		// should go from start to finish of the loop
		for (traverser = 0; traverser <= arr.length - 1; traverser++)
		{
			// TASK 3: prove that it can count along
			// with right amount of indeces
			System.out.println(arr[traverser]);
			
			// TASK 4: change TASK 3 to print each
			// element instead of each index
		}
		
	}
	
	/**
	 * this method will add each element of the array together
	 * @param arr
	 * @return
	 */
	public static double sumArrElements(double[] arr)
	{
		int index = 0;
		double sum = 0;
		// create for loop that adds previous number to next number until it
		// reaches the length of the array
		for (; index <= arr.length - 1; index++)
		{
			sum += arr[index];
			
		}
		// return the sum of the array's elements
		return sum;
		
		
	}
	
	/**
	 * this method makes every other element in the array equal to 1
	 * @param arr
	 * @return
	 */
	public static int[] makeEveryOtherOne(int[] arr)
	{
		int i = 1;
		
		// create a for loop that gets the index of i and sets equal to 1
		// then adds 2, in order to make it every other element instead of every element
		for(; i <= arr.length - 1; i++)
		{
			if (i % 2 != 0)
			{
				arr[i] = 1;
			}
			else
			{
				arr[i] = arr[i];
			}
			
			System.out.print("{" + arr[i] + "}");
		}
		
		return arr;	
		
	}

}
