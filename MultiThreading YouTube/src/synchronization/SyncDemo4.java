/*
 * here me get mixed output
 * if we want proper output we need to add synchronized to diplayn and dispalyc
 * so that at a time only one can work
 */
package synchronization;
class Display4{
	public synchronized void displayn(){
		for(int i=0;i<10;i++){
			System.out.println(i);
			try{Thread.sleep(2000);}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
	public synchronized void displayc(){
		for(int i=65;i<75;i++){
			System.out.println((char)i);
			try{Thread.sleep(2000);}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}
class Mythread1 extends Thread{
	Display4 d;
	Mythread1(Display4 d){
		this.d = d;
	}
	public void run(){
		d.displayn();
	}
}
class Mythread2 extends Thread{
	Display4 d;
	Mythread2(Display4 d){
		this.d = d;
	}
	public void run(){
		d.displayc();
	}
}
public class SyncDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display4 d = new Display4();
		Mythread1 t1 = new Mythread1(d);
		Mythread2 t2 = new Mythread2(d);
		t1.start();
		t2.start();
	}

}
