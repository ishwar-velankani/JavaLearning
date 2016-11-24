/*
 * Static control flow
 * step 1: identification of static member
 * step 2: 	execution of static 
 * 			assignment of static variable+ static block
 * step 3:	execution of main method
 */
package static_control_flow;

public class Base {
	static int i = 10;
	static{
		m1();
		System.out.println("Base static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("Base Main method");
	}
	public  static void m1(){
		System.out.println(j);
	}
	static int j = 20;

}
class Derived extends Base{
	static int x = 100;
	static{
		m2();
		System.out.println("Derived static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m2();
		System.out.println("Derived Main method");
	}
	public  static void m2(){
		System.out.println(y);
	}
	static{
		System.out.println("Derived 2nd static block");
	}
	static int y = 200;
	
}
