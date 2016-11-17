package thread_local;

public class ThreadLcoalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get());
		tl.set("durga");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());

	}

}
