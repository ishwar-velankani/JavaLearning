package create_thread_by_runnable;
class MyThread2 extends Thread{
	public void run(){
		System.out.println("Child Thread");
		System.out.println("This thread is executed by : "+Thread.currentThread().getName());
	}
}
public class CheckThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t = new MyThread2();
		t.start();
		System.out.println("This line executed by : "+Thread.currentThread().getName());
		

	}

}
