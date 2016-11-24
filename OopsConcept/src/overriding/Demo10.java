/*
 * we can have both child parent methods as static
 * but it becomes Method HIDING
 * it works like over loading
 */
package overriding;
class Pm1{
	public static void m1(){
		System.out.println("PArent");
	}
}
class Cm1 extends Pm1{
	public static void m1(){
		System.out.println("Child");
	}
}
public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pm1 p = new Pm1();
		p.m1();	//parent
		Cm1 c = new Cm1();
		c.m1();	//child
		Pm1 p1= new Cm1();
		p1.m1();	//parent
	}

}
