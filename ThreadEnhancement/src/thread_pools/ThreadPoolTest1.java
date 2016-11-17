package thread_pools;
import java.util.concurrent.*;
class PrintJob implements Runnable{
	String name;
	PrintJob(String name){
		this.name = name;
	}
	public void run(){
		System.out.print(name+"...job started by Thread :");
		System.out.println(Thread.currentThread().getName());
		try{Thread.sleep(2000);}
		catch(Exception e){}
		System.out.print(name+"... job completed by Thread :");
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadPoolTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A group of runnable objects
		PrintJob[] jobs = {new PrintJob("Rahul"),
							new PrintJob("Ravi"),
							new PrintJob("Sumit"),
							new PrintJob("Raju"),
							new PrintJob("Shivam"),
							new PrintJob("Amit"),
							new PrintJob("Anil"),
							new PrintJob("Rakesh")};
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(PrintJob job:jobs){
			service.submit(job);
		
	}service.shutdown();
}

}
