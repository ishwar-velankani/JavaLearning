/*
 * if there is no run method
 * it won't show any error
 * it will use Thread class Run method
 * which is empty implementation
 * so no output
 */
package create_thread;
class MyThread4 extends Thread{
	//absence of run method
}

public class AbsentRunMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread4 t= new MyThread4();
		t.start();
	}

}
