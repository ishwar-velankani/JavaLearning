/*
 * Difference between this super and this() super()
 *	multiple time			only one time
 *	used anywhere			used in constructor 
 */
package constructor;

class P{
	int x = 7;
}
class C extends P{
	int x = 10;
	public void show(){
		System.out.println("parent version: "+super.x);
		System.out.println("child version: " +this.x);
	}
}
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.show();
	}

}
