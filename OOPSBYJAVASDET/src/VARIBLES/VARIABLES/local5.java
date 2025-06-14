/*
 *  LOcal varibales:
 * --------------------------------
 * 1)varibles which are declared inside a block/constructor/method  to meet temporary requiremnts of programmer
 * is called local varibles.
 * 
 *2)we can access within the block/cosntructor/method where we declared.
 * 
 * 3)Local variables stored in stack memory area.
 * 
 * 4)local variabels also known as stack variables.
 * 
 * 5)local variables also known as automatic variables.
 * 
 * 
 * 6)lOCAL variables will be stored inside stack memory.
 * 
 * when local varibles is created?
 * ----------------------------------------------
 * while executing block which we declared the local variables will be created.
 * 
 * once the block execution completed then localvarible will be gone.
 * 
 * local varibles are thread safe. (for every thread separate copy  it maintainted).
 * 
 * local variables are temporary data.
 * -----------------------------------------------------------------------------
 * IMPORTANT POINTS;
 * --------------------------------
 * 1)for STTAIC AND INSTANCE VARIBLES IF WE NOT PERFORM INTIALIZATION JVM PROVIDE DEFAULT VALUES
 * IN CASE OF LOCAL JVM NOT PROVIDE DEFAULT VALUES.
 * 2)FOR local varibles we should perfoem intialization explicitly.
 * 
 * ---------------------------------
 * SCOPE OF LOCAL VARIBLE exactly same as the block which we declared.
 * local varibles will be crated while executing the block in which we declared it.
 * ONCE the block execution completes automatically loacl variables will be destroyed hence the
 * scope oof local varible is the block in which we declared it.
 * 
 *  
 * 
 */



package VARIBLES.VARIABLES;


	
	public class local5 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int i =0;  //  i is local varibles  of main method
			for(int j=0;j<=1;j++)  // j is local varible of method we can access only in specific method
			{
				i=i+j;
			}
			System.out.println(i );

		}

	}