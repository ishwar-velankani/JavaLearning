/*
 * When we are changing the max priority then automatically
 * newly created thread priority get changed
 * but it does not affect the other thread priority
 */
package threadGroup;

public class ThreadGroupPriority {
	public static void main(String args[]){
		ThreadGroup g1 = new ThreadGroup("First");
		Thread t1 = new Thread(g1,"Thread 1");
		Thread t2 = new Thread(g1,"Thread 2");
		g1.setMaxPriority(3);
		Thread t3 = new Thread(g1,"Thread 3");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.print(t3.getPriority());
		
	}
}
