/*
 * if parent class is final
 * override not possible
 * show compile time error
 */
package overriding;

class Xf{
	public  final void m1(){
		
	}
}
class Yf extends Xf{
	public  void m1(){
		
	}
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
