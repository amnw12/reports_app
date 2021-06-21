/**
* Class that maintains instances for the type, title, code, and level of a module.
* @author Amn 19067459
**/

package technical_school_app;

public class Module 
{
	private String title;
	private String code;
	private Level level;
	private ModuleType type;
	
	public Module(ModuleType T, String t, String c, Level l)
	{
		/**
		* Initializes the ModuleType class 
		* @param T the module type to be assigned.
		* @param t the module title to be assigned.
		* @param c the module code to be assigned.
		* @param l the module level to be assigned
		* @author 19067459
		* */
		
		this.code = c;
		this.level = l;
		this.title = t;
		this.type = T;
	}
	
	public String getTitle()
	{
		/**
		* Accesses the title of the module
		* @return the module title
		* @author 19067459
		* */
		return this.title;
	}
	
	public String getCode()
	{
		/**
		* Accesses the code for the module
		* @return the module code
		* @author 19067459
		* */
		return this.code;
	}
	
	public Level getLevel()
	{
		/**
		* Accesses the level of the module
		* @return the module level
		* @author 19067459
		* */
		return this.level;
	}
	
	public ModuleType getType()
	{
		/**
		* Accesses the module's type
		* @return the module type
		* @author 19067459
		* */
		return this.type;
	}
	
	public void setTitle(String t)
	{
		/**
		* Assigns a value to the title of the Module
		* @param t the title to be assigned.
		* @author 19067459
		* */
		this.title = t;
	}
	
	public void setCode(String c)
	{
		/**
		* Assigns a value to the code for the Module
		* @param c the code to be assigned.
		* @author 19067459
		* */
		this.code = c;
	}
	
	public void setLevel(Level l)
	{
		/**
		* Assigns a value to the level of the Module
		* @param l the level to be assigned.
		* @author 19067459
		* */
		this.level = l;
	}
	
	public void setType(ModuleType T)
	{
		/**
		* Assigns a value to the type of the Module
		* @param T the type to be assigned.
		* @author 19067459
		* */
		this.type = T;
	}
	
	public String toString()
	{
		/**
		* Returns a text representation of the module.
		* @return a string displaying the module title, code, level, and type.
		* @author 19067459
		* */
		return "Title: " +this.title +"\nCode: " +this.code + "\nLevel: " +this.level.name() +"\nModule Type: " +this.type.name();
	}
}
