package performing_multitasking;

public class MutiTaskingTest4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(){
			public void run(){
				System.out.println("Task one");
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				System.out.println("Task two");
			}
		};
		
		t1.start();
		t2.start();
	}

}
