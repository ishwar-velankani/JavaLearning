/*
 * Order of Catch block is very Important
 * first child catch block followed by parent
 */
package customized_exception;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e ){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
