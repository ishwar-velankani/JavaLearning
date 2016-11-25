/*
 * checked Exception:
 * Exception which are checked by the compiler with the smooth exception of the program at runtime
 */
package checkedVSunchecked;
import java.io.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("hello");
	}

}
