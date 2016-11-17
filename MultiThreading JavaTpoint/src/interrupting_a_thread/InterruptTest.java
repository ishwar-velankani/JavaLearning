package interrupting_a_thread;
class InterruptTest extends Thread{
public void run(){
try{
Thread.sleep(1000);
System.out.println("task");
}catch(InterruptedException e){
throw new RuntimeException("Thread interrupted..."+e);
}

}

public static void main(String args[]){
	InterruptTest t1=new InterruptTest();
t1.start();
try{
t1.interrupt();
}catch(Exception e){System.out.println("Exception handled "+e);}

}
}
