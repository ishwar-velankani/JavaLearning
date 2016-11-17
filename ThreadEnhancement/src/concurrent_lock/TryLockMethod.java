package concurrent_lock;
import java.util.concurrent.locks.*;
class MyThread4 extends Thread{
	MyThread4(String name){
		super(name);
	}
	static ReentrantLock l= new ReentrantLock();
	public void run(){
		if(l.tryLock()){
			System.out.println(Thread.currentThread().getName()+"got lock and start performing operation");
			try{Thread.sleep(2000);}
			catch(Exception e){}
		}
		else{
			System.out.println("Thread dint got lock. performing alternative operation");
		}
		
	}
}
public class TryLockMethod {
	public static void main(String []args){
		MyThread4 t1 = new MyThread4("First");
		MyThread4 t2 = new MyThread4("Second");
		t1.start();
		t2.start();
	}

}
