/*
 * override with respect to static
 * if parent or child only one is static it will show an error
 * Cannot override, method is static
 */
package overriding;

class Xs1{
	public void m1(){
		
	}
}
class Xs2 extends Xs1{
	public static void m1(){
		
	}
}

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
