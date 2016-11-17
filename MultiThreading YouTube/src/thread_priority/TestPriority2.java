/*
 * Only main thread priority is 5
 * other thread priority is inherited by the parent thread
 */
package thread_priority;
class MyThead extends Thread{
	
}
public class TestPriority2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		MyThread t = new MyThread();
		System.out.println(t.getPriority());
	}

}
