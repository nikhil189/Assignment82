/**
 * 
 */
package acadglidAssignment;

/**
 * @author nikhil13686
 *
 */
public class NegativeAgeException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ErrorMessage;
	
	/**
	 * Constructor to initialize Error Message
	 */
	public NegativeAgeException(String ErrorMessage) 
	{
		this.ErrorMessage = ErrorMessage;
	}
	
	public String getMessage()  // overriding getMEssage for Exception
	{ 
		return ErrorMessage; 
	} 
}
