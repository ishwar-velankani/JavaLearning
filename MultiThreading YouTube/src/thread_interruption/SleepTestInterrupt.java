package thread_interruption;
class MyThread4 extends Thread{
	public void run(){
			for(int i=0;i<10000;i++){
				System.out.println("Child Thread"+i);
			}
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				System.out.println("I got Interrupted");
			}
		}
	}
public class SleepTestInterrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 t = new MyThread4();
		t.start();
		t.interrupt();

	}

}
