package interrupting_a_thread;

public class InterruptTest3 extends Thread{

	public void run(){  
		for(int i=1;i<=2;i++){  
			if(Thread.interrupted()){  
				System.out.println("code for interrupted thread");  
			}  
		else{  
			System.out.println("code for normal thread");  
			}  
		  
		}//end of for loop  
	}  
		  
	public static void main(String args[]){  
		InterruptTest3 t1=new InterruptTest3();  
		InterruptTest3 t2=new InterruptTest3();  
		  
		t1.start();  
		t1.interrupt();  
		  
		t2.start();  
		  
	}  
}  
