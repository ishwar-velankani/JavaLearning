package performing_multitasking;

public class MultiTaskingTest2 implements Runnable {
	public void run(){
		System.out.println("This is the task");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MultiTaskingTest2());
		Thread t2 = new Thread(new MultiTaskingTest2());
		t1.start();
		t2.start();

	}

}
