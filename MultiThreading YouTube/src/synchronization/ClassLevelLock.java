/*
 * if thread want to access static synchronized method then it need to have 
 * class level lock
 */
package synchronization;
class Display2{
	public static synchronized void wish(String name){
		for(int i= 0;i<5;i++){
			System.out.print("Good Morning :");
			try{Thread.sleep(2000);}
			catch(InterruptedException e){}
			System.out.println(name);
		}
	}
}
class MyThread2 extends Thread{
	Display2 d;
	String name;
	MyThread2(Display2 d,String name){
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}
public class ClassLevelLock {
	public static void main(String []args){
		Display2 d1 = new Display2();
		Display2 d2 = new Display2();
		MyThread2 t1 = new MyThread2(d1,"Dhoni");
		MyThread2 t2 = new MyThread2(d2,"Yuvraj");
		t1.start();
		t2.start();
	}
}
