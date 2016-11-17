package threadGroup;

public class ThreadConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup g1 = new ThreadGroup("First");
		System.out.println(g1.getParent());
		ThreadGroup g2 = new ThreadGroup(g1,"Second");
		System.out.println(g2.getParent());

	}

}
