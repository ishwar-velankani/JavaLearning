/*
 * once amethod throws exception 
 * follwing code are unreachable
 */
package throw_keyword;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw new ArithmeticException("/ be zero");
		System.out.println("Hello");
	}

}
