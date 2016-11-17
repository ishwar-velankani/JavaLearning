package inter_thread_communication;
class Customer{
	int amount = 1000;
	synchronized void withdraw(int amount){
		if(this.amount< amount){
			System.out.println("Less cash); waiting for desposit");
			try{wait();}catch(Exception e){}
		}
		this.amount -= amount;
		System.out.println("Withdraw completed");
	}
	synchronized void deposit(int amount){
		System.out.println("Going to deposit");
		this.amount += amount;
		System.out.println("Deposit completed");
		notify();
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		new Thread(){
			public void run(){
				c.deposit(20000);
			}
		}.start();
		new Thread(){
			public void run(){
				c.withdraw(52000);
			}
		}.start();

	}

}
