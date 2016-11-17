package create_thread_by_runnable;
class Mythread extends Thread{
	public void run(){
		System.out.println("Child thread");
	}
}
public class NotRecomended {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread r = new Mythread();
		Thread t = new Thread(r);
		t.start();
	}

}
