/*
 * Both class waits for each other to complete
 * so program will stuck
 */
package thread_interruption;
class MyThread1 extends Thread{
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
public class InterruptedTest2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		MyThread1.mt = Thread.currentThread();
		MyThread1 t = new MyThread1();
		t.start();
		t.join();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}

}
