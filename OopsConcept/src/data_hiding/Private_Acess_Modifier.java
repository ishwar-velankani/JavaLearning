package data_hiding;

class A{
	private int data = 40;
	private msg(){
		System.out.println("Hello Java");
	}

}
public class Private_Acess_Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		System.out.println(obj.data); // compile time error
		obj.msg(); //compile time error
	}

}
