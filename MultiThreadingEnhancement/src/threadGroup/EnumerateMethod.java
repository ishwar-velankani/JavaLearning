package threadGroup;

public class EnumerateMethod {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ThreadGroup g= Thread.currentThread().getThreadGroup().getParent();
		System.out.println(g);
		Thread[] t = new Thread[g.activeCount()];
		g.enumerate(t);
		for(Thread t1:t)
			System.out.println(t1.getName());
		

	}

}
