package thread_interruption;
class MyThread extends Thread{
	static Thread mt;
	public void run(){
		try{mt.join();}
		catch(InterruptedException e){
			System.out.println(e);
		}
		for(int i=0;i<10;i++){
			System.out.println("System.out.println(Child Thread");
			
		}
	}
	
}
public class CompleteMainFirst {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}

}
