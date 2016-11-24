/*
 * can't override the restrictive method
 */
package data_hiding;
class A2{
	protected void msg(){
		System.out.println("Hello");
	}
}
public class Method_Overriding_Acces_Modifier extends A2 {
	protected void msg(){
		System.out.println("Hello java"); //Compile Time error
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Overriding_Acces_Modifier obj = new Method_Overriding_Acces_Modifier();
		obj.msg();
	}

}
