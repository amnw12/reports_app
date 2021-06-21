/**
* Class that maintains the Semester 1 Module Offerings.
* @author Amn 19067459
**/

package technical_school_app;

public class TechnicalSchool 
{
	private Module[] offerings; 
	
	public TechnicalSchool()
	{
		/**
		* Initializes the offerings array with the semester 1 offerings.
		* */
		this.offerings = TechnicalSchool.semesterOneModuleOfferings();
	}
	
	public Module[] getSemesterOfferings()
	{
		/**
		* Accesses the module offerings of the semester
		* @return the offerings for the semester
		* @author 19067459
		* */
		 return this.offerings;
	}
	
	 public Module lookup(String code)
	 {
		/**
		* Accesses the module offerings of the semester
		* @param code the code of the Module to search for
		* @return the module details corresponding to the coded
		* @author 19067459
		* */
		 
		 for (int k = 0; k < this.offerings.length; ++k)
		 {
			 if (this.offerings[k].getCode() == code)
			 {
				 return this.offerings[k];
			 }
		 }
		 
		 return null;
	 }
	 
	 private static Module[] semesterOneModuleOfferings()
	{
	 	/**
		* Populates the Semester 1 module offerings
		* @return the offerings for the semester
		* @author 19067459
		* */
		Module[] semester1= new Module[13];
			
		semester1[0] = new Module(ModuleType.TAUGHT, "Programming", "PROG101", Level.ONE);
		semester1[1] = new Module(ModuleType.TAUGHT, "Statistics", "STAT102", Level.ONE);
		semester1[2] = new Module(ModuleType.TAUGHT, "Database Design", "DATA222", Level.TWO);
		semester1[3] = new Module(ModuleType.TAUGHT, "Object-Oriented Programming", "PROG202", Level.TWO);
		semester1[4] = new Module(ModuleType.TAUGHT, "Information Systems", "INSY313", Level.THREE);
		semester1[5] = new Module(ModuleType.TAUGHT, "Web Services", "WEBS332", Level.THREE);
		semester1[6] = new Module(ModuleType.SELF_STUDY, "Technology Applications", "TECH103", Level.ONE);
		semester1[7] = new Module(ModuleType.SELF_STUDY, "Theory of Computation", "THEO111", Level.ONE);
		semester1[8] = new Module(ModuleType.SELF_STUDY, "Model Checking", "MODC233", Level.TWO);
		semester1[9] = new Module(ModuleType.SELF_STUDY, "Topology", "TOPG233", Level.TWO);
		semester1[10] = new Module(ModuleType.SELF_STUDY, "Logic", "LOGI321", Level.THREE);
		semester1[11] = new Module(ModuleType.PROJECT, "Web App Dev", "PROJ399", Level.THREE);
		semester1[12] = new Module(ModuleType.CLIENT_PROJECT, "Great Code Company", "EXTO396", Level.THREE);

		return semester1;
	}
	 
	 public boolean isCertified(Student student)
	 {
		 /**
		* Evaluates whether a student is certified of not
		* @param student the student to be evaluated
		* @return a boolean value to determine if the student is certified
		* @author 19067459
		* */
		 
		 Result[] checkTranscript = student.getTranscript();
		 int passedLvl1 = 0;
		 int passedLvl2 = 0;
		 int lvl2andSelfStudy = 0;
		 int passedLvl3 = 0;
		 int lvl3andTaught = 0;
		 int projectPassed = 0;
		 
		 
		 for (int k = 0; k < student.getNResults(); ++k)
		 {
			if (checkTranscript[k].getGrade().isPass())
			{
				if (checkTranscript[k].getModule().getLevel() == Level.ONE && (checkTranscript[k].getModule().getType() == ModuleType.SELF_STUDY || checkTranscript[k].getModule().getType() == ModuleType.TAUGHT)) 
				{
					++passedLvl1;
				}
				else if (checkTranscript[k].getModule().getLevel() == Level.TWO)
				{
					++passedLvl2;
				 
					if (checkTranscript[k].getModule().getType() == ModuleType.SELF_STUDY)
					{
						++lvl2andSelfStudy;
					}
				}
				else if (checkTranscript[k].getModule().getLevel() == Level.THREE)
				{
					++passedLvl3;
					
					if (checkTranscript[k].getModule().getType() == ModuleType.TAUGHT)
					{
						++lvl3andTaught;
					} 
				}
				
				if(checkTranscript[k].getModule().getType() == ModuleType.PROJECT || checkTranscript[k].getModule().getType() == ModuleType.CLIENT_PROJECT)
				{
					++projectPassed;
				}
			}
		 }
		 
		 if (passedLvl1 >= 3 && passedLvl2 >= 3 && passedLvl3 >= 4)
		 {
			if (lvl2andSelfStudy > 1 && lvl3andTaught >= 2)
			{
				if (projectPassed >= 1)
				{
					return true;
				}
			}
		}
			
		return false;
	 }
}
