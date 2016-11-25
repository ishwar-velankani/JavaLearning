/*
 * Method to print Exception Information
 * e.toString	//name Description
 * e.getMessage	//Description
 * e.printStackTrace //name Description Stacktrace
 */
package customized_exception;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e ){
			System.out.println(e);
			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}

	}

}
