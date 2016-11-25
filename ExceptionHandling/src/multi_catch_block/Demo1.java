package multi_catch_block;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//int x= 10/0;
			String s= null;
			System.out.println(s.length());
		}
		catch(ArithmeticException|NullPointerException e){
			System.out.println(e);
		}

	}

}
