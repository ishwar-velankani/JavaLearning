package create_thread;
class MyThread1 extends Thread{
	public void run(){
		for (int i=0;i<10;i++){
			System.out.println("Child thread");
		}
	}
}
public class DiffRunStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 obj = new MyThread1();
		obj.run();
		for(int i =0;i< 10;i++){
			System.out.println("Parent Thread");
		}
	}

}
