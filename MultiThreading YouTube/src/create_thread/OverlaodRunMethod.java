/*
 * Overload of run method is possible
 * but it will call only that run method with no argument
 * we need to explicitly call the other run method
 * it will run just as normal method.
 */
package create_thread;
class MyThread3 extends Thread{
	public void run(){
		System.out.println("No arguement");
	}
	public void run(int i){
		System.out.print(i);
	}
}

public class OverlaodRunMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread3 t= new MyThread3();
		t.start();
	}

}
