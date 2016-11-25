/*
 * Unchecked Exception:
 * Exception which are not checked by the compiler with the smooth exception of the program at runtime
 */
package checkedVSunchecked;
import java.io.*;
public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("hello");
		System.out.println(10/0);
	}

}
