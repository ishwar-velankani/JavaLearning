package daemon_thread;

public class DaemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isDaemon());
		Thread t = new Thread();
		System.out.println(t.isDaemon());
		t.start();
		t.setDaemon(true);
		
		System.out.println(t.isDaemon());
	}

}
