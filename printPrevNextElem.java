		
		// printPrevNextElement
		double[] doubleArr = {7.51, 4.98, 1.27, 9.06, 4.24};
		int n1 = 3;
		printPrevNextElement(doubleArr, n1);

	}
	
	private static void printPrevNextElement(double[] doubleArr, int n1)
	{
		
		double prevElem = doubleArr [n1-1];
		double nextElem = doubleArr [n1+1];
		
		System.out.println("The number before the element at index " + n1 +
				" is " + prevElem + " and the number after the element at index " + n1 + " is " + nextElem + ".");
	
	}
