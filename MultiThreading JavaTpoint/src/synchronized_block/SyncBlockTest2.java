package synchronized_block;

/*
 * Synchronization using annonymous class
 */
class Table1{
	public  void printTable(int n){
		synchronized(this){
		for(int i=0;i<5;i++){
			System.out.println(i*n);
			try{Thread.sleep(1000);}
			catch(InterruptedException e){
				
			}
		}
	}
}
}
public class SyncBlockTest2 {

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
