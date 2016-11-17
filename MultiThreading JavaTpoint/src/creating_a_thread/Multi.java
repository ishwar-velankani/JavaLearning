/*
 * Java thread example by Extending Thread class
 */
package creating_a_thread;

public class Multi extends Thread{
	public void run(){
		System.out.println("Thread is running");
		System.out.println("We will write the statement, whwat we want to execute ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi t1 = new Multi();
		t1.start(); //start the methods
					//if we don't extend the the Thread class 
					//this line show error
					//say start method not found

	}

}
