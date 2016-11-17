package deadlock;
class A{
	public synchronized void d1(B b){
		System.out.println("Thread 1 start execution of d1 method");
		try{Thread.sleep(2000);}
		catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Thread 1 trying to call B's last method");
		b.last();
	}
	public synchronized void last(){
		System.out.println("Inside A's last method");
	}
}
class B{
	public synchronized void d2(A a){
		System.out.println("Thread 2 start execution of d2 method");
		try{Thread.sleep(2000);}
		catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Thread 2 is trying to call A's last method");
		a.last();
	}
	public synchronized void last(){
		System.out.println("Inside B's last method");
	}
}
public class DeadLockDemo extends Thread {
	A a = new A();
	B b = new B();
	public void m1(){
		this.start();
		a.d1(b); //This line executed by Main Thread
	}
	public void run(){
		b.d2(a);	//This line executed by Child Thread
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLockDemo t = new DeadLockDemo();
		t.m1();

	}

}
