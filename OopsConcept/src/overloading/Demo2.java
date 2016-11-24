/*
 * Child will get more priority
 */
package overloading;

public class Demo2 {
	public void m1(String s){
		System.out.println("String version");
	}
	public void m1(Object o){
		System.out.println("Object version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 obj = new Demo2();
		obj.m1(new Object());	//object version
		obj.m1("ishw");  		//String version
		//since null is in both object and string
		obj.m1(null); 			//string object	
		
	}

}
