/**
* Class that stores and maintains the grade achieved in a particular module.
* @author Amn 19067459
**/

package technical_school_app;

public class Result 
{
	private Module module;
	private Grade grade;
	
	public Result(Module m, Grade g) 
	{
		/**
		* Initializes the Result class 
		* @param m the module to be assigned.
		* @param g the grade to be assigned.
		* @author 19067459
		* */
		this.module = m;
		this.grade = g;
	}
	
	public Module getModule()
	{
		/**
		* Accesses the graded module
		* @return the graded module 
		* @author 19067459
		* */
		return this.module;
	}
	
	public Grade getGrade()
	{
		/**
		* Accesses the grade for the module
		* @return the grade achieved
		* @author 19067459
		* */
		return this.grade;
	}
	
	public void setModule(Module m)
	{
		/**
		* Assigns the module to the result.
		* @param m the module to be assigned.
		* @author 19067459
		* */
		this.module = m;
	}
	
	public void setGrade(Grade g)
	{
		/**
		* Assigns a grade to the result
		* @param g the grade to be assigned.
		* @author 19067459
		* */
		this.grade = g;
	}
	
	public String toString()
	{
		/**
		* Returns a text representation of the student's results.
		* @return a string displaying the module code and corresponding grade.
		* @author 19067459
		* */
		return this.module.getCode() +" " +this.grade;
	}
	
	
}
