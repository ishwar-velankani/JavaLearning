package overloaded_constructor;

public class Demo3 {
	public static void m1(){
		m2();
	}
	public static void m2(){
		m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		//if we call any method then problem exist
		//m2();
	}

}
