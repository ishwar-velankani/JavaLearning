package top_10_exception;

public class StackOverflowError {
	public static void m1(){
		m2();
	}
	public static void m2(){
		m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();

	}

}
