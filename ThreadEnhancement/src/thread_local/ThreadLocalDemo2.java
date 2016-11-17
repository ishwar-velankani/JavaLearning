//overriding of initial value method
package thread_local;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal tl = new ThreadLocal(){
			public Object initialValue(){
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("durga");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());

	}

}
