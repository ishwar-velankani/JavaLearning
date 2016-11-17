/*
 * here problem exists
 * here is no context switching
 * because t1 andt2 are considered as normal switching
 */
package calling_run_method;
	
public class TestCallRun2 extends Thread {
	public void run(){
		for (int i =0;i<5;i++){
			try{Thread.sleep(500);}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCallRun2 t1 = new TestCallRun2();
		TestCallRun2 t2 = new TestCallRun2();
		t1.run();
		t2.run();
		

	}

}
