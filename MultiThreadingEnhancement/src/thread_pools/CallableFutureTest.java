package thread_pools;
import java.util.concurrent.*;
class MyCallable implements Callable{
	int num;
	MyCallable(int num){
		this.num = num;
	}
	public Object call()throws Exception{
		System.out.println(Thread.currentThread().getName()+
				" is responsible to find the sum of first "+num
				+" numbers");
		int sum = 0;
		for (int i=0;i<num;i++){
			sum+=i;
		}
		return sum;
	}
}
public class CallableFutureTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MyCallable[] jobs={	new MyCallable(7),
							new MyCallable(8),
							new MyCallable(4),
							new MyCallable(22),
							new MyCallable(25)};
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(MyCallable job:jobs){
			Future f = service.submit(job);
			System.out.println(f.get());
		}service.shutdown();

	}

}
