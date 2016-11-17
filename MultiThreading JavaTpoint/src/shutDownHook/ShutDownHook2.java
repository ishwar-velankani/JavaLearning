package shutDownHook;

public class ShutDownHook2 extends Thread{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new Thread(){
			public void run(){
				System.out.println("shut down task has been completed");
			}
		}

	);
		System.out.println("Now main sleeping");

	}
}
