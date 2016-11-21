package threadGroup;

public class CheckMainThreadGroup {
	public static void main(String []args){
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		
	}

}
