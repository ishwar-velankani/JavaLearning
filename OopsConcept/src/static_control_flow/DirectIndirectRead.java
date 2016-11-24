package static_control_flow;

public class DirectIndirectRead {
	static int i =10;
	static{
		m1();
		System.out.println(i); //Direct Read
		
	}
	public static void m1(){
		System.out.println(i); //Indirect Read
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
