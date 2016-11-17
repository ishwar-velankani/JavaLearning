package shutDownHook;
class MyThread extends Thread{
	public void run(){
		System.out.println("Shutdown task has been completed");
	}
}
public class ShutDownHook1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new MyThread());
		System.out.println("Now main sleeping . press Ctrl+C");
		

	}

}
