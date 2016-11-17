/*
 * set and get name
 * public final String getName()
 * public final void setName(String name)
 */
package create_thread_by_runnable;
class MyThread1 extends Thread{
	public void run(){
		System.out.println("Child Thread");
	}
	
}
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		MyThread1 t = new MyThread1();
		t.start();
		System.out.println(t.getName());
		t.setName("Ishwar");
		System.out.println(t.getName());
		
	}

}
