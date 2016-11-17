package thread_interruption;
class MyThread3 extends Thread{
	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("Child Thread");
				Thread.sleep(2000);
			}
		}
		
			catch(InterruptedException e){
				System.out.println("I got Interrupted");
			}
		}
	}
public class InterruptMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 t = new MyThread3();
		t.start();
		t.interrupt();

	}

}
