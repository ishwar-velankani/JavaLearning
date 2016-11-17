package thread_priority;
class MyThread1 extends Thread{
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println("child thread");
		}
	}
}
public class TestPriority3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t = new MyThread1();
		t.setPriority(10);
		t.start();
		for(int i =0;i<10;i++){
			System.out.println("Parent Thread");
		}
	}

}
