package instance_control_flow;

public class Test {
	int i =10;
	{
		m1();
		System.out.println("First Instance Block");
	}
	Test(){
		System.out.println("Test constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println("Main method");

	}
	public void m1(){
		System.out.println(j);
	}
	
	
	{
		System.out.println("Second Instance Block");
	}
	int j=20;

}
