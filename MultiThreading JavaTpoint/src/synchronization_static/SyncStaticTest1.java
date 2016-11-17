package synchronization_static;
class Table1{
	public   static  synchronized void printTable1(int n){
		for(int i=0;i<3;i++){
			System.out.println(n*i);
			try{Thread.sleep(2000);}
			catch(Exception e){
				
			}
		}
	}
}
public class SyncStaticTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(){
			public void run(){
				Table1.printTable1(2);
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				Table1.printTable1(5);
			}
		};
		t1.start();
		t2.start();
	}

}
