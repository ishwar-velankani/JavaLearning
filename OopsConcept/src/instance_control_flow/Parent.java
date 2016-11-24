package instance_control_flow;

public class Parent {
	int i =10;
	{
		m1();
		System.out.println("Parent First Instance Block");
	}
	Parent(){
		System.out.println("Parent constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child t = new Child();
		System.out.println("Child Main method");

	}
	public void m1(){
		System.out.println(j);
	}
	
	
	{
		System.out.println("Parent Second Instance Block");
	}
	int j=20;

}

class Child extends Parent {
	int x =10;
	{
		m2();
		System.out.println("Child First Instance Block");
	}
	Child(){
		System.out.println(" Child  constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child t = new Child();
		System.out.println("Child Main method");

	}
	public void m2(){
		System.out.println(y);
	}
	
	
	{
		System.out.println(" Child Second Instance Block");
	}
	int y=20;

}

