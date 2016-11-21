/*
 * we need to change the Thread local with the InheritableThreadLocal
 * If we want separate value for the child then we need to 
 * override the childValue mthod
 */
package thread_local;
class ParentThread extends Thread{
	//static ThreadLocal tl = new ThreadLocal();
	static InheritableThreadLocal tl = new InheritableThreadLocal(){
		public Object childValue(Object P){
			return "cc";
		}
	};
	public void run(){
		tl.set("PP");
		System.out.println(tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread{
	public void run(){
		System.out.println(ParentThread.tl.get());
	}
}
public class ThreadLocalDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentThread pt = new ParentThread();
		pt.start();

	}

}
