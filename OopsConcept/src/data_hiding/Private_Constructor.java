/*
 * if you ever create private constructor
 * you will never be able to create object of that class
 * will get compile time error
 */
package data_hiding;

class A1{
	private A(){} // private constructor
	void msg(){System.out.println("Hello java");}  
}
public class Private_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A(); //compiler error
		obj.msg();
	}

}
