/**
* Enumeration that maintains list of grade values and boundaries.
* @author Amn 19067459
**/

package technical_school_app;

public enum Grade 
{
	APLUS(90, 100, true), A(85, 90, true), AMINUS(80, 85, true), BPLUS(75, 80, true), B(70, 75, true), BMINUS(65, 70, true), CPLUS(60, 65, true), C(55, 60, true), CMINUS(50, 55, true), D(0, 50, false);
	private int low;
	private int high;
	private boolean pass;
	
	private Grade(int l, int h, boolean p)
	{
		/**
		* Initializes the Grade enumeration 
		* @param l the low boundary of the grade to be assigned.
		* @param h the high boundary of the grade to be assigned.
		* @param p a boolean value evaluating whether the grade is a passing grade.
		* @author 19067459
		* */
		
		this.low = l;
		this.high = h;
		this.pass = p;
	}
	
	
	public boolean isPass()
	{
		/**
		* Determines whether a particular grade is a passing grade.
		* @return a boolean value indicating if the grade is a passing grade 
		* @author 19067459
		* */
		
		if (this.pass)
		{
			return true;
		}
	
		return false;
	}
	
	public int getHigh()
	{
		/**
		* Accesses the upper boundary of the grade
		* @return returns the upper boundary of the grade
		* @author 19067459
		* */
		return this.high;
	}
	
	public int getLow()
	{
		/**
		* Accesses the lower boundary of the grade
		* @return returns the lower boundary of the grade
		* @author 19067459
		* */
		return this.low;
	}
	
	public String toString() 
	{
		/**
		* Converts enum value into the character grade
		* @return returns the character grade as a string
		* @author 19067459
		* */
		
		switch(this.name())
		{
		case "APLUS":
			return "A+";
		case "A":
			return "A";
		case "AMINUS":
			return "A-";
		case "BPLUS":
			return "B+";
		case "B":
			return "B";
		case "BMINUS":
			return "B-";
		case "CPLUS":
			return "C+";
		case "C":
			return "C";
		case "CMINUS":
			return "C-";
		case "D":
			return "D";
		}
		
		return null;
	}
}
