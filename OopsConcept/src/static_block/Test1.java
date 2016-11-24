/*
 * valid only upto 1.6v
 */
package static_block;

public class Test1 {

	static int x = m1();
	public static int m1(){
		System.out.println("Hello");
		System.exit(0);
		return 0;
	}
}
