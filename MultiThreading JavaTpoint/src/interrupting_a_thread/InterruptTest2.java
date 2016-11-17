package interrupting_a_thread;

public class InterruptTest2 extends Thread {
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptTest2 t1 = new InterruptTest2();
		t1.start();
		t1.interrupt();
	}

}
