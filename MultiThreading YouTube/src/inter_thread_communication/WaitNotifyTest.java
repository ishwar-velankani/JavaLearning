package inter_thread_communication;
class MyThread extends Thread{
	int total =0;
	public void run(){
		synchronized(this){
			System.out.println("Child thread start calculation");
			for(int i =0;i<=100;i++){
				total+=i;
			}
			System.out.println("Notification sent");
			this.notify();
		}
		
	}
}
public class WaitNotifyTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(10000); //not recommended
		//t.join();	//not recommended
		synchronized(t){
			System.out.println("Main Thread Waiting for Updation");
			t.wait(1000);
			//its not mandatory that every time main thread will only get control
			//so to solve that problem we should
			//use wait with time limit
			System.out.println("Main thread got notification");
		}
		System.out.println(t.total);
	}

}
