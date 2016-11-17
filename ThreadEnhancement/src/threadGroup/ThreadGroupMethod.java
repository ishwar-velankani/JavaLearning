package threadGroup;
class MyThread extends Thread{
	MyThread(ThreadGroup g,String name){
		super(g,name);
	}
	public void run(){
		System.out.println("Child Thread");
		try{Thread.sleep(5000);}
		catch(InterruptedException e){
			System.out.println(e);
		}
		
	}
}
public class ThreadGroupMethod {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ThreadGroup pg = new ThreadGroup("Parent Group");
		ThreadGroup cg = new ThreadGroup(pg,"Child Group");
		MyThread t1 = new MyThread(pg,"Parent Thread");
		MyThread t2 = new MyThread(cg,"Child Thread");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();

	}

}
