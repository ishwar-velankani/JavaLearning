/*
 * if we override start method
 * it will act like normal method
 * it won't start a new thread
 * so run will not be executed
 * 
 */
package create_thread;
class MyThread5 extends Thread{
	public void start(){
		//super.start();
		//if we want to override we can use super method
		System.out.println("Start Method");
	}
	public void run(){
		System.out.println("Run method");
	}
}

public class OverrideStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread5 t = new MyThread5();
		t.start();
		System.out.println("Main Thread");
	}

}
