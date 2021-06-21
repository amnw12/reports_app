/**
* Class that creates and populates a Student object for student, and evaluates whether the student is certified.
* @author Amn 19067459
**/

package technical_school_app;

public class StudentEvaluation 
{
	public static Student axel()
	{
		/**
		* Returns Axel's details and transcript.
		* @return a Student object containing Axel's name and transcript of results.
		* @author 19067459
		* */
		
		TechnicalSchool technicalSchool = new TechnicalSchool();
		Student axel = new Student("Axel");
		
		axel.addResultToTranscript(technicalSchool.lookup("PROG101"), Grade.BPLUS);
		axel.addResultToTranscript(technicalSchool.lookup("STAT102"), Grade.C);
		axel.addResultToTranscript(technicalSchool.lookup("DATA222"), Grade.A);
		axel.addResultToTranscript(technicalSchool.lookup("INSY313"), Grade.AMINUS);
		axel.addResultToTranscript(technicalSchool.lookup("WEBS332"), Grade.A);
		axel.addResultToTranscript(technicalSchool.lookup("TECH103"), Grade.D);
		axel.addResultToTranscript(technicalSchool.lookup("MODC233"), Grade.B);
		axel.addResultToTranscript(technicalSchool.lookup("TOPG233"), Grade.B);
		axel.addResultToTranscript(technicalSchool.lookup("PROJ399"), Grade.CMINUS);
		axel.addResultToTranscript(technicalSchool.lookup("EXTO396"), Grade.C);
		
		return axel;
	}
	
	public static Student kate()
	{
		/**
		* Returns Kate's details and transcript.
		* @return a Student object containing Kate's name and transcript of results.
		* @author 19067459
		* */
		TechnicalSchool technicalSchool = new TechnicalSchool();
		Student kate = new Student("Kate");
		
		kate.addResultToTranscript(technicalSchool.lookup("PROG101"), Grade.APLUS);
		kate.addResultToTranscript(technicalSchool.lookup("STAT102"), Grade.AMINUS);
		kate.addResultToTranscript(technicalSchool.lookup("TECH103"), Grade.BPLUS);
		kate.addResultToTranscript(technicalSchool.lookup("MODC233"), Grade.A);
		kate.addResultToTranscript(technicalSchool.lookup("TOPG233"), Grade.C);
		kate.addResultToTranscript(technicalSchool.lookup("DATA222"), Grade.A);
		kate.addResultToTranscript(technicalSchool.lookup("INSY313"), Grade.BPLUS);
		kate.addResultToTranscript(technicalSchool.lookup("WEBS332"), Grade.AMINUS);
		kate.addResultToTranscript(technicalSchool.lookup("PROJ399"), Grade.B);
		kate.addResultToTranscript(technicalSchool.lookup("EXTO396"), Grade.B);
		
		return kate;
	}
	
	public static Student jim()
	{
		/**
		* Returns Jim's details and transcript.
		* @return a Student object containing Jim's name and transcript of results.
		* @author 19067459
		* */
		TechnicalSchool technicalSchool = new TechnicalSchool();
		Student jim = new Student("Jim");
		
		jim.addResultToTranscript(technicalSchool.lookup("PROG101"), Grade.A);
		jim.addResultToTranscript(technicalSchool.lookup("STAT102"), Grade.BPLUS);
		jim.addResultToTranscript(technicalSchool.lookup("DATA222"), Grade.CPLUS);
		jim.addResultToTranscript(technicalSchool.lookup("PROG202"), Grade.C);
		jim.addResultToTranscript(technicalSchool.lookup("INSY313"), Grade.C);
		jim.addResultToTranscript(technicalSchool.lookup("WEBS332"), Grade.CPLUS);
		jim.addResultToTranscript(technicalSchool.lookup("TECH103"), Grade.CMINUS);
		jim.addResultToTranscript(technicalSchool.lookup("THEO111"), Grade.D);
		jim.addResultToTranscript(technicalSchool.lookup("MODC233"), Grade.APLUS);
		jim.addResultToTranscript(technicalSchool.lookup("TOPG233"), Grade.A);
		jim.addResultToTranscript(technicalSchool.lookup("LOGI321"), Grade.B);
		jim.addResultToTranscript(technicalSchool.lookup("PROJ399"), Grade.BMINUS);
		jim.addResultToTranscript(technicalSchool.lookup("EXTO396"), Grade.APLUS);
		
		return jim;
	}
	
	public static Student robin()
	{
		/**
		* Returns Robin's details and transcript.
		* @return a Student object containing Robin's name and transcript of results.
		* @author 19067459
		* */
		TechnicalSchool technicalSchool = new TechnicalSchool();
		Student robin = new Student("Robin");
		
		robin.addResultToTranscript(technicalSchool.lookup("PROG101"), Grade.C);
		robin.addResultToTranscript(technicalSchool.lookup("DATA222"), Grade.C);
		robin.addResultToTranscript(technicalSchool.lookup("INSY313"), Grade.CPLUS);
		robin.addResultToTranscript(technicalSchool.lookup("WEBS332"), Grade.CPLUS);
		robin.addResultToTranscript(technicalSchool.lookup("TECH103"), Grade.CPLUS);
		robin.addResultToTranscript(technicalSchool.lookup("MODC233"), Grade.CMINUS);
		robin.addResultToTranscript(technicalSchool.lookup("TOPG233"), Grade.CMINUS);
		robin.addResultToTranscript(technicalSchool.lookup("PROJ399"), Grade.APLUS);
		
		return robin;
	}
	
	public static Student blossom()
	{
		/**
		* Returns Blossom's details and transcript.
		* @return a Student object containing Blossom's name and transcript of results.
		* @author 19067459
		* */
		TechnicalSchool technicalSchool = new TechnicalSchool();
		Student blossom = new Student("blossom");
		
		blossom.addResultToTranscript(technicalSchool.lookup("PROG101"), Grade.APLUS);
		blossom.addResultToTranscript(technicalSchool.lookup("THEO111"), Grade.APLUS);
		blossom.addResultToTranscript(technicalSchool.lookup("TECH103"), Grade.APLUS);
		blossom.addResultToTranscript(technicalSchool.lookup("MODC233"), Grade.APLUS);
		blossom.addResultToTranscript(technicalSchool.lookup("TOPG233"), Grade.APLUS);
		blossom.addResultToTranscript(technicalSchool.lookup("WEBS332"), Grade.APLUS);
		blossom.addResultToTranscript(technicalSchool.lookup("INSY313"), Grade.APLUS);
		blossom.addResultToTranscript(technicalSchool.lookup("EXTO396"), Grade.APLUS);
		blossom.addResultToTranscript(technicalSchool.lookup("PROJ399"), Grade.APLUS);
		blossom.addResultToTranscript(technicalSchool.lookup("PROG202"), Grade.APLUS);
		
		return blossom;
	}
	
	public static Student jono()
	{
		/**
		* Returns Jono's details and transcript.
		* @return a Student object containing Jono's name and transcript of results.
		* @author 19067459
		* */
		TechnicalSchool technicalSchool = new TechnicalSchool();
		Student jono = new Student("Jono");
		
		jono.addResultToTranscript(technicalSchool.lookup("PROG101"), Grade.APLUS);
		jono.addResultToTranscript(technicalSchool.lookup("THEO111"), Grade.APLUS);
		jono.addResultToTranscript(technicalSchool.lookup("TECH103"), Grade.APLUS);
		jono.addResultToTranscript(technicalSchool.lookup("MODC233"), Grade.APLUS);
		jono.addResultToTranscript(technicalSchool.lookup("TOPG233"), Grade.APLUS);
		jono.addResultToTranscript(technicalSchool.lookup("WEBS332"), Grade.D);
		jono.addResultToTranscript(technicalSchool.lookup("INSY313"), Grade.APLUS);
		jono.addResultToTranscript(technicalSchool.lookup("EXTO396"), Grade.APLUS);
		jono.addResultToTranscript(technicalSchool.lookup("PROJ399"), Grade.APLUS);
		jono.addResultToTranscript(technicalSchool.lookup("PROG202"), Grade.APLUS);
		
		return jono;
	}
	
	public static Student brick()
	{
		/**
		* Returns Brick's details and transcript.
		* @return a Student object containing Brick's name and transcript of results.
		* @author 19067459
		* */
		TechnicalSchool technicalSchool = new TechnicalSchool();
		Student brick = new Student("Brick");
		
		brick.addResultToTranscript(technicalSchool.lookup("PROG101"), Grade.A);
		brick.addResultToTranscript(technicalSchool.lookup("STAT102"), Grade.APLUS);
		brick.addResultToTranscript(technicalSchool.lookup("DATA222"), Grade.APLUS);
		brick.addResultToTranscript(technicalSchool.lookup("PROG202"), Grade.APLUS);
		brick.addResultToTranscript(technicalSchool.lookup("INSY313"), Grade.A);
		brick.addResultToTranscript(technicalSchool.lookup("WEBS332"), Grade.APLUS);
		brick.addResultToTranscript(technicalSchool.lookup("TECH103"), Grade.AMINUS);
		brick.addResultToTranscript(technicalSchool.lookup("THEO111"), Grade.A);
		brick.addResultToTranscript(technicalSchool.lookup("MODC233"), Grade.APLUS);
		brick.addResultToTranscript(technicalSchool.lookup("TOPG233"), Grade.A);
		brick.addResultToTranscript(technicalSchool.lookup("LOGI321"), Grade.A);
		brick.addResultToTranscript(technicalSchool.lookup("PROJ399"), Grade.AMINUS);
		brick.addResultToTranscript(technicalSchool.lookup("EXTO396"), Grade.APLUS);
		
		return brick;
	}
	
	public static Student boomer()
	{
		/**
		* Returns Boomer's details and transcript.
		* @return a Student object containing Boomer's name and transcript of results.
		* @author 19067459
		* */
		TechnicalSchool technicalSchool = new TechnicalSchool();
		Student boomer = new Student("Boomer");
		
		boomer.addResultToTranscript(technicalSchool.lookup("PROG101"), Grade.B);
		boomer.addResultToTranscript(technicalSchool.lookup("DATA222"), Grade.B);
		boomer.addResultToTranscript(technicalSchool.lookup("INSY313"), Grade.BPLUS);
		boomer.addResultToTranscript(technicalSchool.lookup("WEBS332"), Grade.BPLUS);
		boomer.addResultToTranscript(technicalSchool.lookup("TECH103"), Grade.BPLUS);
		boomer.addResultToTranscript(technicalSchool.lookup("MODC233"), Grade.AMINUS);
		boomer.addResultToTranscript(technicalSchool.lookup("TOPG233"), Grade.BMINUS);
		boomer.addResultToTranscript(technicalSchool.lookup("PROJ399"), Grade.APLUS);
		
		return boomer;
	}
	
	public static void main(String[] args)
	{
		/**
		* A main method printing the student transcript and evaluation of certification.
		* @author 19067459
		* */
		TechnicalSchool technicalSchool = new TechnicalSchool();
		System.out.println(robin() +"\n" +technicalSchool.isCertified(robin()) +"\n");
		System.out.println(kate() +"\n" +technicalSchool.isCertified(kate()) +"\n");
		System.out.println(axel() +"\n" +technicalSchool.isCertified(axel()) +"\n");
		System.out.println(jim() +"\n" +technicalSchool.isCertified(jim()) +"\n");
		System.out.println(blossom() +"\n" +technicalSchool.isCertified(blossom()) +"\n"); 
		System.out.println(jono() +"\n" +technicalSchool.isCertified(jono()) +"\n");
		System.out.println(brick() +"\n" +technicalSchool.isCertified(brick()) +"\n");
		System.out.println(boomer() +"\n" +technicalSchool.isCertified(boomer()) +"\n");
	}
	
}
