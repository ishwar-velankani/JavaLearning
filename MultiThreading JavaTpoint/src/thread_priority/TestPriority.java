/*
 * three static variable
 * MAX_PRIORITY, NORM_PRIOIRITY, MIN_PRIORITY
 * 10 5 0
 * default is 5
 */
package thread_priority;

public class TestPriority extends Thread {
	public void run(){
		System.out.println("Priority : "+Thread.currentThread().getPriority());
		System.out.println("Name : "+Thread.currentThread().getName());
	}
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		TestPriority t1 = new TestPriority();
		TestPriority t2 = new TestPriority();
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
	}

}
