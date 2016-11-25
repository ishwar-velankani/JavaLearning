package default_exception;

public class Demo1 {
	public void dostuff(){
		doMoreStuff();
		
	}
	public void doMoreStuff(){
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1();
		d.dostuff();
	}

}
