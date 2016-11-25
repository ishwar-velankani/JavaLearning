/*
 * without try catch block
 */
package customized_exception;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Statement 1");
		try{
			System.out.println(10/0);
		}catch(Exception e){System.out.println(e);}
		
		System.out.println("Statement 2");
		

	}

}
