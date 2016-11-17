package synchronized_block;


class Table{
	public void printTable(int n){
		synchronized(this){
		for(int i=0;i<10;i++){
			System.out.println(i*n);
			try{Thread.sleep(1000);}
			catch(InterruptedException e){}
		}
	}
}
}
class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t =t;
	}
	public void run(){
		t.printTable(5);
	}
}
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(20);
	}
}
public class SyncBlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}

}
