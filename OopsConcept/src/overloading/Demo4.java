/*
 * m1(float,int)
 * m1(int,float)
 * it will show error for 10,10 and 10.5,10.5
 * ambigious error
 */
package overloading;

public class Demo4 {
	public void m1(int i,float f){
		System.out.println("Int Float");
	}
	public void m1(float f,int i){
		System.out.println(" Float Int");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 t= new Demo4();
		t.m1(10, 10.5f); 	//int float
		t.m1(10.5f, 10);	//flaot int
		t.m1(10, 10); 		//ambiguity error
		t.m1(10.5f, 10.5f); 		//ambiguity error

	}

}
