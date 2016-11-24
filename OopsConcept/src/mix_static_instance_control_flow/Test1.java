package mix_static_instance_control_flow;

public class Test1 {
	private static String msg(String msg){
		System.out.println(msg);
		return msg;
	}
	public Test1(){
		m = msg("1");
	}
	{
		m = msg("2");
	}
	String m = msg("3");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Test1();
	}

}
