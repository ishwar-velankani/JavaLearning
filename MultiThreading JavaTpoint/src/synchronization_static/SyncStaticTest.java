package synchronization_static;
class Table{
	public synchronized static void printTable(int n){
		for(int i=0;i<5;i++){
			System.out.println(n*i);
			try{Thread.sleep(1000);}
			catch(Exception e){}
		}
	}
}
class Mythread1 extends Thread{
	public void run(){
		Table.printTable(4);
	}
}
class Mythread2 extends Thread{
	public void run(){
		Table.printTable(2);
	}
}
class Mythread3 extends Thread{
	public void run(){
		Table.printTable(3);
	}
}
class Mythread4 extends Thread{
	public void run(){
		Table.printTable(5);
	}
}
public class SyncStaticTest {
	public static void main(String []args){
		Mythread1 t1= new Mythread1();
		Mythread2 t2= new Mythread2();
		Mythread3 t3= new Mythread3();
		Mythread4 t4= new Mythread4();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
