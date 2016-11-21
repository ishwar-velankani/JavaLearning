package concurrent_lock;
import java.util.concurrent.locks.*;
public class ReentrantLockMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println(l.isLocked()); //true
		System.out.println(l.isHeldByCurrentThread()); //true
		System.out.println(l.getQueueLength());//0
		System.out.println(l.getHoldCount());//2
		l.unlock();
		System.out.println(l.isLocked());//true
		System.out.println(l.getHoldCount());//1
		l.unlock();
		System.out.println(l.isLocked());//false
		System.out.println(l.getHoldCount());//0
		System.out.println(l.isFair());//false

	}

}
