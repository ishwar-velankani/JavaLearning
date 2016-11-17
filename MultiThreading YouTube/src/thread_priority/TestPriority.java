/*
 * public final int getPriority
 * public final void setPriority(int p)
 * p belong to 1 to 10
 * IllegalArguementException
 */
package thread_priority;
class MyThread extends Thread{
	public void run(){
		System.out.println("Child run");
		System.out.println(Thread.currentThread().getName());
	}
}
public class TestPriority {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

}
