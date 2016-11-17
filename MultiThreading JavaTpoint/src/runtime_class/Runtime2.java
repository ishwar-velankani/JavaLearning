/*
 * Program to shutdown
 */
package runtime_class;

public class Runtime2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec("shutdown -s -t 0");
	}

}
