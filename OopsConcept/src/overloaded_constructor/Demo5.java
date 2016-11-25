/*
 * if parent throws any exception
 * child must throw exception
 */
package overloaded_constructor;
class P1{
	P1()throws IOException{
		
	}
}
class C1 extends P1{
	C1(){
		
	}
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
