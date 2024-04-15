import java.util.ArrayList;

public class ArrayListMethodsInDepth {

	public static void main(String[] args) {

	// Make a class called ArrayListMethodsInDepth with a main method. 
	//In the main method, instatiate an empty ArrayList foods that stores Strings. 
	//Then add the following Strings to foods: "Apples", "Bread", "Cookies". 
	//After each task (except task 1) print out the length of the foods ArrayList.	
	
	ArrayList <String> foods = new ArrayList <String>();
	
	foods.add("Apples");
	foods.add("Bread");
	foods.add("Cookies");
	
	//Task 1: Print out the length of the foods ArrayList. 
	
	//This task prints out the length of the array, the amount of elements inside of the array
	System.out.println(foods.size());
	
	//Task 2: Inside of a print statement, add the String "Dole Whip" to foods. 
	//In the line comment for this code, state what it prints.
	
	//This task checks to see if it is able to add an element to the array, and adds it
	// It ends up returning true, but in general it would tell you true or false
	// depending on your array
	System.out.println(foods.add("Dole Whip"));
	// true
	System.out.println(foods.size());
	
	//Task 3: Inside of a print statement, use the .set(E) method to change 
	//"Bread" in foods to "Butter". Comment what it prints. 
	
	//This task replaces a certain index with the stated String
	// It ends up returning Bread, but in general prints out the element that is being replaced
	System.out.println(foods.set(1, "Butter"));
	// Bread
	System.out.println(foods.size());
	
	//Task 4: Inside of a print statement, use the .remove(int) method to remove 
	//"Cookies" from foods. Comment what it prints.
	
	//This task removes an element from a certain index
	//It returns Cookies but in general returns the element that is being removed
	System.out.println(foods.remove(2));
	// Cookies
	System.out.println(foods.size());
	
	//Task 5: For each task, go back and comment what the method you are calling does, 
	//and what the method returns (both in general and in this case).
	
		
	}

}
