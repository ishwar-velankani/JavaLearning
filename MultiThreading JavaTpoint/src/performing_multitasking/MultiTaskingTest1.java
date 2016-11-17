package performing_multitasking;

public class MultiTaskingTest1 extends Thread{
	public void run(){
		System.out.println("This is the task need to be executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiTaskingTest1 t1 = new MultiTaskingTest1();
		MultiTaskingTest1 t2 = new MultiTaskingTest1();
		MultiTaskingTest1 t3 = new MultiTaskingTest1();
		t1.start();
		t2.start();
		t3.start();

	}

}