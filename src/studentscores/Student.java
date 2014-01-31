/*
 * Author: Amy Roberts
 * Date: January 2014
 * Class: Intro to Programming for Business
 * Description: Student class to be used inside Student Scores.
 * Stores last name, numerical average, and letter grade,
 * with methods included to retrieve data, print data to console,
 * and calculate dependent variables.
 * I pledge the AIC.
 * 
 */
package studentscores;

public class Student 
{
	//declare variables
	private String LastName;
	private double average;
	private char grade;
	
	//_______CONSTRUCTORS_________
	Student(String lname)
	{
		LastName = lname;
		average = 0;
		grade = 'Z';
	} //end one-parameter constructor
	
	Student()
	{
		LastName = null;
		average = 0;
		grade = 'Z';
	} //end no-parameters constructor
	
	//_______METHODS___________
	
	//gets for all variables
	String getName()
	{
		return LastName;
	}//end getName
	
	double getAvg()
	{
		return average;
	}//end getAvg
	
	char getGrade()
	{
		return grade;
	} //end getGrade
	
	
	/* define a setName() with argument rather than a readName() with input
	 * to keep all error handling and input in main(), rather than recreating
	 * buffered reader, imports, and try-catch(es) inside the class
	 */
	void setName(String lname)
	{
		LastName = lname;
	} //end readName
	
	/* calculate average and letter grade - single function is more efficient than two,
	 * especially since no data is returned, and letter grade is dependent on average
	 */
	void calcAvg(double calctotal, int calctests)
	{
		average = (calctotal / calctests);
		
		//if-else ladder to determine letter grade
		if(average >= 90)
		grade = 'A';
		else if(average >= 80)
		grade = 'B';
		else if (average >= 70)
		grade = 'C';
		else if (average >= 60)
		grade = 'D';
		else 
		grade = 'F';
	} //end calcAvg
	
	//print function to export data from class to console
	void print()
	{
		System.out.println(LastName + '\t' + '\t' + average + '\t' + '\t' + grade);
	}
	
	//print function to export data to any other output method
	String print2()
	{
		String data = LastName + " - " + ((float)Math.round(average * 100) / 100) + " - " + grade + '\n';
		return data;
	}
				  
} // end class Student
