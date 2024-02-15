/**
 * this class is meant to store the grades of a student
 * using attributes and properties to do so
 */
public class ClassWritingPractice 
{
	// declare data attributes and make them private
	// so that other people cant access them
	private double scienceGrade;
	private double mathGrade;
	private double theologyGrade;
	private int gradeLevel;
	
	String name = new String();
	
	/**
	 * this constructor sets the initial values to 
	 * the properties in the parameters
	 * @param a
	 * @param b
	 * @param c
	 * @param x
	 */
	public ClassWritingPractice (double a, double b, double c, int x, String y)
	{
		a = scienceGrade;
		b = mathGrade;
		c = theologyGrade;
		x = gradeLevel;
		y = name;
	}
	
	/**
	 * this method prints out that they are a student
	 * and what grade they are in
	 * @param gradeLevel
	 */
	public void introduceSelf()
	{
		System.out.println("I am a student in grade " + 
				gradeLevel + " . My name is " + name + 
				". My average GPA is " + getGPA());
	}
	
	/**
	 * this method finds their total GPA from every subject
	 * by adding all attributes and dividing them by
	 * the amount of subjects that they have
	 */
	private double getGPA()
	{
		double sum = scienceGrade + mathGrade + theologyGrade;
		double average = sum / 3;
		
		return average;
	}
	
}
