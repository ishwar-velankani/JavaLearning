package deadlock;

public class DeadlockTest {
	public static void main(String args[]){
		String resource1 = "Ishwar";
		String resource2 = "Kumar";
		
		//t1 tries to lock resource1 then resource 2
		Thread t1 = new Thread(){
		public void run(){
			synchronized(resource1){
				System.out.println("Thread 1 locked resource 1");
				try{Thread.sleep(1000);}
				catch(Exception e){}
			}
			synchronized(resource2){
				   System.out.println("Thread 1: locked resource 2");  
			}
		}
	};
	Thread t2 = new Thread(){
		public void run(){
			synchronized(resource2){
				System.out.println("Thread 2 locked resource 2");
				try{Thread.sleep(1000);}
				catch(Exception e){}
			}
			synchronized(resource1){
				   System.out.println("Thread 2: locked resource 1");  
			}
		}
	};
	t1.start();
	t2.start();
}
}
