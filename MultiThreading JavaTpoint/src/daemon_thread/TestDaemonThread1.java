/* 
 * Daemon thread provide support to user thread
 * life depends on the user thread
 * if we make user thread as Daemon then we should not start a thread
 */
package daemon_thread;

public class TestDaemonThread1 extends Thread{
	public void run(){
		if (Thread.currentThread().isDaemon())
			System.out.println("Daemon thread");
		else
			System.out.println("User Thread");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDaemonThread1 t1 = new TestDaemonThread1();
		TestDaemonThread1 t2 = new TestDaemonThread1();
		TestDaemonThread1 t3 = new TestDaemonThread1();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
