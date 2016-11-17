package naming_a_thread;

public class TestJoin4 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJoin4 t1 = new TestJoin4();
		TestJoin4 t2 = new TestJoin4();
		t1.start();
		t2.start();

	}

}
