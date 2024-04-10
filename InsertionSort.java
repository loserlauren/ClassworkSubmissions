public class InsertionSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an index that could be used for the method
		int index = 2;
		
		int[] arr = {2, 5, 1, 7, 8, 6};
		
		int[] arr1 = {3, 7, 1, 9};
		
		arrayShifter(arr, index);
		
		printArr(arr);
		
		insertionSort(arr1);
		
		printArr(arr);
	}
	
	/**
	 * when passed an array of ints, will take the last 
	 * element and sort it into the right place
	 * 
	 * Change the previous method so that it is passed an int 
	 * index and will sort the value at that index instead of the last index
	 * @param arr
	 * @return
	 */
	private static int[] arrayShifter(int[] arr, int index) 
	{
	
		// declare an int that is used as a placeholder
		int temp = 0;
		// set the index to a new variable
		int i = index;
				
		// create a while loop that checks if element is less than previous element
		while (i > 0 && arr[i] < arr[i - 1])
		{
				// set the temp equal to a new value
				temp = arr[i - 1];
				// set the previous value to the one you want to swap with
				arr[i - 1] = arr[i];
				// set that one to the initial
				arr[i] = temp;
				// subtract one to run through the array backwards
				i--;
		}
		// get the outcome
		return arr;
	}
	
	/**
	 * this method prints the array that is passed
	 * @param arr
	 */
	public static void printArr(int[] arr)
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
	 * Create a method insertionSort (that is passed an int array) with a 
	 * for loop that traverses the array from left to right. On each iteration
	 * of the loop (in the work) write code that calls the arrayShifter method 
	 * and passes it the array and the current loop index.

	 */
	private static void insertionSort(int[] arr1)
	{
		// declare a traverser
		int i = 0;
		int n = arr1.length - 1;
		// create for loop that runs through entire array
		for(; i < n; i++)
		{
			// call method to run through and sort
			arrayShifter(arr1, i);
		}
	}
}
