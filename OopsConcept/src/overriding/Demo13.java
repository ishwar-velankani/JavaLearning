/*
 * variable do not override
 */
package overriding;
class Pv1{
	int x= 111;
}
class Cv1 extends Pv1{
	int x= 222;
}
public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pv1 p = new Pv1();
		System.out.println(p.x);
		Cv1 c = new Cv1();
		System.out.println(c.x);
		Pv1 p1 = new Cv1();
		System.out.println(p1.x);
	}

}
