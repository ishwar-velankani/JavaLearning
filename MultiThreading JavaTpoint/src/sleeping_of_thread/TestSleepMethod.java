/*
 * this is a program for testing the sleep method
 */
package sleeping_of_thread;

public class TestSleepMethod extends Thread{
	public void run(){
		for (int i =0;i <5;i++)
		{
			try{Thread.sleep(100);}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleepMethod t1 = new TestSleepMethod();
		TestSleepMethod t2 = new TestSleepMethod();
		t1.start();
		t2.start();

	}

}
