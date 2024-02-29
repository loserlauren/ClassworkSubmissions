// TASK 1; make a method that returns an ARRAY of the first
		// and last elements of a passed array
		
		// for example {4, 7, 12, 3} --> {4, 3}
		
		int[] myArr = {2, 7, 100, 500};
		returnFirstAndLast(myArr);
		
	
		
		
		// TASK 2: make a method that changes an array, it should be
		// passed the array and the index you want to change
		// it will divide specified index by 2
		
		// for example ( {2, 4, 6, 8} , 2 ) --> {2, 4, 3, 8}
		
		int[] evenArr = {2, 4, 6, 8, 10, 12};
		int n = 4;
		divideElementByTwo(evenArr, n);
		

	}
	
	public static void divideElementByTwo(int[] evenArr, int n)
	{
    // declare an int that gets the desired number and divide by 2
		int newArr = (evenArr[n] / 2);
		evenArr[n] = newArr;
		
	}


	public static void returnFirstAndLast(int[] myArr) 
	{
    // print out the statement with first and last elements
		System.out.println("{" + myArr[0] + ", " + myArr[myArr.length - 1] + "}");
	}

