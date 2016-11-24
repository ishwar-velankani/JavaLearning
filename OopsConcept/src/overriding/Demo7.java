/*
 * we can't reduce the scope of the access modifier
 * we can increase if we want
 * private < default < protected < Public
 * if we try to reduce  it will show an error
 * cannot override, attempting to assign weaker access privilages
 */
package overriding;

class Xp1{
	public void m1(){
		
	}
}
class Xp2 extends Xp1{
	void m1(){
		
	}
}
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
