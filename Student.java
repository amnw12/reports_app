/**
* Class that stores and maintains the results transcript for a particular student.
* @author Amn 19067459
**/

package technical_school_app;

public class Student 
{
	private String name;
	private final static int MAX_TRANSCRIPT_LENGTH = 20;
	private int nResults;
	private Result[] transcript; 
	
	public Student(String n)
	{
		/**
		* Initializes the Student class 
		* @param n the student name to be assigned.
		* @author 19067459
		* */ 
		
		this.name = n;
		this.transcript = new Result[Student.MAX_TRANSCRIPT_LENGTH];
		this.nResults = 0;
	}
	
	public void addResultToTranscript(Module module, Grade grade)
	{
		/**
		* Adds a result to the student's transcript
		* @param module the module to be added to transcript
		* @param grade the grade to be added to transcript
		* @author 19067459
		* */
		if (this.nResults < 20)
		{
			this.transcript[this.nResults] = new Result(module, grade);
			++this.nResults;
		}
		else
		{
			System.out.println("Error. Transcript is already full");
		}
	}
	
	public Result[] getTranscript()
	{
		/**
		* Gets an array containing the student's results
		* @return an array of the student's results
		* @author 19067459
		* */ 
		Result[] returnTranscript = new Result[this.nResults];
		
		for (int k = 0; k < this.nResults; ++k)
		{
			returnTranscript[k] = this.transcript[k];
		}
		
		return returnTranscript;
	}
	
	public int getNResults()
	{
		/**
		* Accesses the number of results on the student's transcript
		* @return the number of results on the transcript
		* @author 19067459
		* */
		return this.nResults;
	}
	
	public String getName()
	{
		/**
		* Accesses the student's name
		* @return the student's name
		* @author 19067459
		* */
		return this.name;
	}
	
	public void setTranscript(Result[] t)
	{
		/**
		* Assigns the student's transcript
		* @param t the transcript to be assigned.
		* @author 19067459
		* */
		this.transcript = t;
	}
	
	public void setNResults(int r)
	{
		/**
		* Assigns a value to the number of results on the transcript
		* @param r the number of results to be assigned.
		* @author 19067459
		* */
		this.nResults = r;
	}
	
	public void setName(String n)
	{
		/**
		* Assigns a value to the name of the Student
		* @param n the name to be assigned.
		* @author 19067459
		* */
		this.name = n;
	}
	
	public String toString()
	{
		/**
		* Returns a text representation of the student's transcript.
		* @return a string displaying the student name and transcript of results.
		* @author 19067459
		* */
		String returnStudent = "Transcript for " +this.name; 
		
		for (int k = 0; k < this.nResults; ++k)
		{
			returnStudent += "\n" +this.transcript[k];
		}
		
		return returnStudent;
	}
}
