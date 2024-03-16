

public class TraversalMethodsHW {
	
	public static void main(String[] args) 
	{
		// declare int and double arrays to be passed through methods
		int[] arr = {1, 2, 7, 1, 9};
		double[] arr1 = {2.0, 8.8, 8.8, 8.8, 9.0, 3.1};
		
		// TASK 1:
		getHighestValue(arr);
		
		// TASK 2:
		getAverage(arr1);
		
		// TASK 3:
		checkHasEven(arr);
		
		// TASK 4:
		checkIfAllEven(arr);
		
		// TASK 5: 
		checkThreeSame(arr1);


	}
	
	/**
	 * Make a method that is passed an int array and 
	 * returns the highest value in that array.
	 * @param arr
	 * @return
	 */
	public static int getHighestValue(int[] arr)
	{
		// declare a traverser to be used in our loop
		int traverser = 0;
		// declare an int to be used as storage for numbers
		// being added together
		int store = arr[0];
		// create a for loop that makes sure every element in the
		// array is being checked
		for (; traverser <= arr.length - 1; traverser++)
		{
			// create if statement that sets the highest value in
			// store int
			if (arr[traverser] > store)
			{
				store = arr[traverser];
			}
		}
		
		// print out to see if it works
		System.out.println(store);
		// return the outcome
		return store;
	}
	
	/**
	 * Make a method that is passed an array of 
	 * doubles and returns a double array consisting of their average.
	 * @param arr
	 * @return
	 */
	public static double getAverage(double[] arr)
	{
		// declare an int traverser to be used in our loop
		int traverser = 0;
		// declare an average and a sum to store our numbers
		double average = 0;
		double sum = 0;
		// create a for loop that adds numbers to get the sum
		for (; traverser <= arr.length - 1; traverser++)
		{
			sum = sum + arr[traverser];
		}
		// then divide sum by length to get the average
		average = sum / arr.length;
		
		// print out the average
		System.out.println(average);
		return average;
		
	}
	
	/**
	 * Make a method that is passed an int array and 
	 * returns whether or not the array has any even numbers in it.
	 * @param arr
	 * @return
	 */
	public static boolean checkHasEven(int[] arr)
	{
		// declare an int traverser
		int traverser = 0;
		// instantiate a boolean that is automatically equal to false
		// if the if statement doesnt work
		boolean allEven = false;
		for (; traverser <= arr.length - 1; traverser++)
		{
			int even = arr[traverser] % 2;
			if (even == 0)
			{
				allEven = true;
			}
		}
		
		// print out result
		System.out.println(allEven);
		return allEven;
	}
	
	/**
	 * Make a method that is passed an int array and 
	 * returns whether or not the array has ALL even numbers in it.
	 * @param arr
	 * @return
	 */
	public static boolean checkIfAllEven(int[] arr)
	{
		// declare int traverser
		int traverser = 0;
		boolean isEven = false;
		for (; traverser <= arr.length - 1; traverser++)
		{
			int even = arr[traverser] / 2;
			if (arr.length == even ) 
			{
				isEven = true;
			}
		}
		System.out.println(isEven);
		return isEven;
	}
	
	/**
	 * Make a method that is passed a double array 
	 * and returns whether or not three consecutive 
	 * doubles of the same value appear in the array.
	 * @param arr
	 * @return
	 */
	public static boolean checkThreeSame(double[] arr)
	{
		// declare an int to be our traverser
		int traverser = 0;
		// instantiate a boolean to false so its what prints 
		// when for loop doesnt work
		boolean hasThree = false;
		
		// create a for loop that checks every element in the array
		for (; traverser <= arr.length - 3; traverser++)
		{
			// create if statement that checks if there are 3 consecutive doubles
			if (arr[traverser] == arr[traverser + 1] && arr[traverser] == arr[traverser + 2])
			{
				hasThree = true;
			}
			
		}
		// print out to see if it works
		System.out.println(hasThree);
		// return the outcome
		return hasThree;
	}

}
