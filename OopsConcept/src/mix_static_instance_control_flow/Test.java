package mix_static_instance_control_flow;

public class Test {
	{
		System.out.println("First Instance Block");
	}
	static{
		System.out.println("First Static Block");
	}
	Test(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		System.out.println("Main method");
		Test t2 = new Test();
	}
	{
		System.out.println("Second Instance Block");
	}
	static{
		System.out.println("Second Static Block");
	}

}
