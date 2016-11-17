package synchronized_block;


class Display{
	public  void wish(String name){
		;;;;;;;;;;;;;;;;;//One thousand line of codes
		synchronized(this){
			for(int i= 0;i<5;i++){
				System.out.print("Good Morning :");
				try{Thread.sleep(2000);}
				catch(InterruptedException e){}
				System.out.println(name);
			}
		}
		;;;;;;;;;;;;;// one thousand line of codes
	}
}
class MyThread extends Thread{
	Display d;
	String name;
	MyThread(Display d,String name){
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}
public class SyncBlockDemo {
	public static void main(String []args){
		Display d1 = new Display();
		MyThread t1 = new MyThread(d1,"Dhoni");
		MyThread t2 = new MyThread(d1,"Yuvraj");
		t1.start();
		t2.start();
	}
}
