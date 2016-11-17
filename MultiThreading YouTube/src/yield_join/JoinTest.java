/*
 * public final void join()
 * public final void join(long ms)
 * public final void join(long ms,int ns)
 */
package yield_join;
class MyThread1 extends Thread{
	public void run(){
		for(int i =0;i<10;i++){
			System.out.println("Child Thread");
			try{Thread.sleep(2000);}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		
	}
}
public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t = new MyThread1();
		t.start();
		try{t.join(10000);}
		catch(InterruptedException e){
			System.out.println(e);
		}
		
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
			
		}
	}

}
