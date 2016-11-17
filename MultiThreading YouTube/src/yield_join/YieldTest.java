package yield_join;
class MyThread extends Thread{
	public void run(){
		for (int i =0;i<10;i++){
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}
public class YieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("Parent Thread");
		}
	}

}
