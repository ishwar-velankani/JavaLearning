/*
 * when thread operate on different object synchronized is not required
 * Irregular output
 * Since both got key of its own object 
 * both will start performing action
 */
package synchronization;
class Display1{
	public synchronized void wish(String name){
		for(int i= 0;i<5;i++){
			System.out.print("Good Morning :");
			try{Thread.sleep(2000);}
			catch(InterruptedException e){}
			System.out.println(name);
		}
	}
}
class MyThread1 extends Thread{
	Display1 d;
	String name;
	MyThread1(Display1 d,String name){
		this.d = d;
		this.name = name;
	}
	public void run(){
		d.wish(name);
	}
}
public class SyncDemo1 {
	public static void main(String []args){
		Display1 d1 = new Display1();
		Display1 d2 = new Display1();
		MyThread1 t1 = new MyThread1(d1,"Dhoni");
		MyThread1 t2 = new MyThread1(d2,"Yuvraj");
		t1.start();
		t2.start();
	}
}
