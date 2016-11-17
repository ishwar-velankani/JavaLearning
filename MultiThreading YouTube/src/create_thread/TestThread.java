package create_thread;
class MyThread extends Thread{
	public void run(){
		for (int i=0;i<10;i++){
			System.out.println("Child thread");
		}
	}
}
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread obj = new MyThread();
		obj.start();
		for(int i =0;i< 10;i++){
			System.out.println("Parent Thread");
		}
	}

}
