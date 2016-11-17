package thread_group;

public class ThreadGroupTest implements Runnable {
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroupTest runnable = new ThreadGroupTest();
		ThreadGroup tg1 = new ThreadGroup("ThreadGroup");
		Thread t1 = new Thread(tg1,runnable,"One");
		Thread t2 = new Thread(tg1,runnable,"two");
		Thread t3 = new Thread(tg1,runnable,"three");
		t1.start();
		t2.start();
		t3.start();
		System.out.println(tg1.getName());
		tg1.list();  
		

	}

}
