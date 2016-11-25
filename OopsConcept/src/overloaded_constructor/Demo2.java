/*
 * If we are dealing with inheritance we need to take specail care about constructor 
 * 	Acceptable
 * 		A(){}
 * 		B(int i){}
 * Not acceptable
 * 		A(int i){}
 * 		B{}
 */
package overloaded_constructor;
class A{
	A(int i){
	}
}
class B extends A{
	B(int i){
		super(10);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
