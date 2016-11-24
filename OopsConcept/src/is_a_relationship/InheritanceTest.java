/*
 * Every parent class method get inherited by child class
 */
package is_a_relationship;
class A{
	protected void m1(){
		System.out.println("A class method");
	}
}
class B extends A{
	public void m2(){
		System.out.println("B class method");
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.m2();
		obj.m1();
	}

}
