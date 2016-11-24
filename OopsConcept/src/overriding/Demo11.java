/*
 * It is not overriding 
 * it is overloading
 */
package overriding;
class Z1{
	
	public void m1(int... i){
		System.out.println("Parent");
	}
	
}
class Z2 extends Z1{
	public void m1(int i){
		System.out.println("Child");
	}
}
public class Demo11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z1 p = new Z1();
		p.m1(10); 	// Child
		Z2 c = new Z2();
		c.m1(10); 	// Child
		Z1 p1 = new Z2();
		p.m1(10); 	// Child

	}

}
