/*
 * we can't have multiple catch block with same Exception
 */
package customized_exception;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e ){
			System.out.println(e);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}

	}

}
