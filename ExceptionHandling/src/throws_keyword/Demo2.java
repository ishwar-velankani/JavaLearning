package throws_keyword;

public class Demo2 {
	public static void doStuff()throws InterruptedException{
		doMoreStuff();
	}
	public static void doMoreStuff()throws InterruptedException{
		Thread.sleep(1000);
	}
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		Demo2 d = new Demo2();
		d.doStuff();

	}

}
