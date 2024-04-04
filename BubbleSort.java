public class BubbleSorter {

	public static void main(String[] args) 
	{
	
	int[] randomNumbers = makeRandom();
	
	bubbleSort(randomNumbers);
	
	printArr(randomNumbers);
	
	}
	
	/**
	 * this method generates 2000 random numbers as ints in an array 
	 * @param arr
	 * @return
	 */
	private static int[] makeRandom() 
	{
		
		// declare an int array that contains 2000 0s
		int[] bigNums = new int[2000];
		// declare the length of the int array
		int len = bigNums.length;
		
		// create a for loop that runs till the end of the array length
		for (int i = 0; i < len; i++)
		{
			// declare int that generates a random number 
			// multiples by 1000 and adds 1, seeting the value as an int
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			// set the random number equal to the index of the array
			bigNums[i] = randomNumber;
			
		}
		// get the outcome of the new int array
		return bigNums;
		
	}
	
	/**
	 * this method sorts each element in numerical order
	 * @param arr
	 * @return
	 */
	private static int[] bubbleSort(int[] arr)
	{
		// declare int that is equal to array length
		int n = arr.length;
		// declare an int that is used as a placeholder
		int temp = 0;
		
		// create a for loop that runs through entire array
		for (int i = 0; i < n; i++)
		{
			// create for loop that runs till the character before
			// the end length
			for (int j = 1; j < (n - 1); j++)
			{
				// create if statement that sees if previous number is smaller
				if (arr[j - 1] > arr[j])
				{
					// swap numbers
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
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

}
