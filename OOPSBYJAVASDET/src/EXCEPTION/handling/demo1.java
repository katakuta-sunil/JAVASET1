/*
 * EXCEPTION HANDLING:
 * ----------------------
 * 1)what is exception?
 * ----------------------
 * an unexpected /unwanted event that distrubs the normal flow of  execution.
 * 
 * 
 * unexpected event means ==> power failure ....etc.
 * 
 * 
 * 
 * EX: 1
 * -------
 * when class is teaching the teacher when i am listening suddenly sleep coming
 * here sleep is the exception that disturbs the flow of execution.
 * 
 * EX 2:
 * read data from the file if file is not there
 * then error is "file not found exception".
 * 
 * INTRODUCTION:
 * ----------
 * purpose of exception handling:
 * -----------------------------
 * 1)graceful termination of the program.
 * 
 * what is exception handing?
 * --------------------------
 * defining alternative way to continue the rest of the program normally.
 * 
 * ---------------------------------------------------------------------------------------
 * 1)read data from remote file located at london?
 *    read that file
 *  2)read data from remote file locating at london?
 *  
 *  if london file not avaliable then use local file.
 *  
 *  use that data
 *  ---------------------------------
 *  try
 *  {
 *  read data from london file
 *  }
 *  catch(FILENOTFOUND)
 *  {
 *  use local file AND CONTINUE.
 *  
 *  }
 *  
 * 
 * -------------------------------------------------------------------------------------------------------------

External factors like file I/O and database connection cause the checked Exception.

Programming bugs like logical Error cause the unchecked Exception.

Checked exceptions are checked at compile time.

Unchecked exceptions are checked at run time.

checked exception must be handled using try-catch block or must be declared using throw keyword

No handling is required in unchecked exception.

Examples

IOException, SQLException, FileNotFoundException.   EXAMPLES of checked exception

NullPointerException, ArrayIndexOutOfBoundsException.   examples of unchecked example
 */


package EXCEPTION.handling;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
