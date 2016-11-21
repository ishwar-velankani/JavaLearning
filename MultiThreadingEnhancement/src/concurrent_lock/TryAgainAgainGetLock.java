package concurrent_lock;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.*;
import java.util.concurrent.locks.*;
class Mythread extends Thread{
	static ReentrantLock l= new ReentrantLock();
	Mythread(String name){
		super(name);
	}
	public void run(){
		do{
			try{
				if(l.tryLock(5000,TimeUnit.MILLISECONDS)){
					System.out.println(Thread.currentThread().getName());
					System.out.println("....Got lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName());
					System.out.println("..Releases lock");
					break;
				}
				else{
					System.out.println(Thread.currentThread().getName());
					System.out.println("Unable to get Lock... will try again");
				}
				
			}catch(Exception e ){}
		}while(true);
	}
	
}
public class TryAgainAgainGetLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t1 = new Mythread("First");
		Mythread t2 = new Mythread("Second");
		t1.start();
		t2.start();

	}

}
