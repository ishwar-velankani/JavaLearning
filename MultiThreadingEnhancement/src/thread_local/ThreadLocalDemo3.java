package thread_local;
class Customer extends Thread{
	static int custId =0;
	ThreadLocal tl = new ThreadLocal(){
		public Object initialValue(){
			return ++custId;
		}
	};
	Customer(String name){
		super(name);
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()
				+" executing with Customer Id : "+tl.get());
	}
}
public class ThreadLocalDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Rahul");
		Customer c2 = new Customer("RAvi");
		Customer c3 = new Customer("Ram");
		Customer c4 = new Customer("Shiv");
		c1.start();
		c2.start();
		c3.start();
		c4.start();

	}

}
