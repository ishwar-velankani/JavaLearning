package mix_static_instance_control_flow;

public class Test2 {
	private static String m1(String msg){
		System.out.println(msg);
		return msg;
	}
	static String m = m1("1");
	{
		m = m1("2");
	}
	static{
		m=m1("3");			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Test2();
	}

}
