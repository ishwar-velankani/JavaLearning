/*
 * Example of multi-threading using the runnable interface
 * when we are not extending the Thread class
 * We need to manually create the thread object 
 */
package creating_a_thread;

 class Multi3 implements Runnable {
	public void run(){
		System.out.println("Thread gets started");
	}
	public static void main(String []args){
		Multi3 m1= new Multi3();
		//we need to explicitly create the thread object
		Thread t1 = new Thread(m1);
		t1.start(); 
		
	}
}
