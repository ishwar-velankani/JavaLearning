/*
 * Generics Method
 * old one are given more prefrence
 */
package overloading;

public class Demo5 {
	
	public void m1(int i){
		System.out.println("Generic version");
	}
	public void m1(int... i){
		System.out.println("Args version");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 t = new Demo5();
		t.m1(); 	//args version
		t.m1(10,20); 	//args version
		t.m1(101);  	//generic version

	}

}
