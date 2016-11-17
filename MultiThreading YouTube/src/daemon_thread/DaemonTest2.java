package daemon_thread;
class MyThread extends Thread{
	public void run(){
	for(int i=0;i<10;i++){
		System.out.println(i);
		try{Thread.sleep(1000);}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
}
public class DaemonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t = new MyThread();
		t.setDaemon(true);
		t.start();
		System.out.println("end of main Thread");

	}

}
