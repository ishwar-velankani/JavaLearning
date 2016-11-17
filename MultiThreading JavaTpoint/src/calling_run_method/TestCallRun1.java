/*
 * each thread start in separate call stack
 * Invoking run method can lead to go to current stack
 * rather than moving to beginning of new call stack
 */
package calling_run_method;

public class TestCallRun1 extends Thread{
	public void run(){
		System.out.println("thread....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCallRun1 t1= new TestCallRun1();
		t1.run(); // it works but does not start a separate call stack

	}

}
