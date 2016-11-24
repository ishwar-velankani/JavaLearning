/*
 * if two function are at same then compiler error
 * Ambiguity error
 */
package overloading;

public class Demo3 {
	public void m1(String s){
		System.out.println("String version");
	}
	public void m1(StringBuffer sb){
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 t =new Demo3();
		t.m1("class"); 		//string version
		t.m1(new StringBuffer("ishw"));	 	//StringBuffer 
		//since null is in both class
		t.m1(null);

	}

}
