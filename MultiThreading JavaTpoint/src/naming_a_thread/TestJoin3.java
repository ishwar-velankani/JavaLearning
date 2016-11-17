/*
 * An example to explain
 * getName
 * setName
 */
package naming_a_thread;

public class TestJoin3 extends Thread {
	public void run(){
		System.out.println("Running.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJoin3 t1 = new TestJoin3();
		TestJoin3 t2 = new TestJoin3();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		t2.start();
		t1.setName("Changed name of thread");
		System.out.println(t1.getName());
	}

}
