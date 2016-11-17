/*
 * Synchronization using annonymous class
 */
package synchronization;
class Table1{
	public synchronized void printTable(int n){
		for(int i=0;i<5;i++){
			System.out.println(i*n);
			try{Thread.sleep(1000);}
			catch(InterruptedException e){
				
			}
		}
	}
}
public class SyncDemoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table1 obj = new Table1();
		Thread t1= new Thread(){
			public void run(){
				obj.printTable(5);
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				obj.printTable(4);
			}
		};
		t1.start();
		t2.start();
	}

}
