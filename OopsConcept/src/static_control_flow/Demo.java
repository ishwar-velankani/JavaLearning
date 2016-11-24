/*
 * Static control flow
 * step 1: identification of static member
 * step 2: 	execution of static 
 * 			assignment of static variable+ static block
 * step 3:	execution of main method
 */
package static_control_flow;

public class Demo {
	static int i = 10;
	static{
		m1();
		System.out.println("First static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("Main method");
	}
	public  static void m1(){
		System.out.println(j);
	}
	static{
		System.out.println("Second Static Block");
	}
	static int j = 20;

}
