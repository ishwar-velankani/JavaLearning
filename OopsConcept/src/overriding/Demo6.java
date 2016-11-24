/*
 * if parent is not abstract 
 * we can make child abstract
 * Biggest advantage
 * 	To stop availability of parent implementation to 
 * further child classes
 */
package overriding;
class A1{
	public void m1(){
		
	}
}
abstract class A2 extends A1{
	abstract public void m1();
}
class A3 extends A2{
	public void m1(){
		
	}
}
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
