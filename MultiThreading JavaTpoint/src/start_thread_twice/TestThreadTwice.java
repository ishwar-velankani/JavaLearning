/*
 * thread can never run twice
 * it will show an error
 * IllegalThreadStateException
 */
package start_thread_twice;

public class TestThreadTwice extends Thread {
	public void run(){
		System.out.println("Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThreadTwice t1= new TestThreadTwice();
		t1.start();
		t1.start();

	}

}
