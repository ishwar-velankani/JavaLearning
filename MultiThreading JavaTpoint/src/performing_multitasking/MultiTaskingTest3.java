package performing_multitasking;

class Simple1 extends Thread{
	public void run(){
		System.out.println("This is task one");
	}
}
class Simple2 extends Thread{
	public void run(){
		System.out.println("This is task two");
	}
}

public class MultiTaskingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple1 t1 = new Simple1();
		Simple2 t2 = new Simple2();
		t1.start();
		t2.start();
	}

}
