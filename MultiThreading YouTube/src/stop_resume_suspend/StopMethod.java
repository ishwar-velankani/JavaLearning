package stop_resume_suspend;
class MyThread extends Thread{
	public void run(){
		for (int i=0;i<10;i++){
			System.out.println(i);
			try{Thread.sleep(2000);}
			catch(InterruptedException e){}
		}
	}
}
public class StopMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		System.out.println("Main Thread");
		t.start();
		t.stop();
	}

}
