package overloaded_constructor;

public class Demo1 {
	Demo1(){
		this(10);
		System.out.println("No arguement");
	}
	Demo1(int i){
		this(10.5);
		System.out.println("Int arguement");
	}
	Demo1(double d){
		System.out.println("Double Aarguement");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1(); //double int no arg
		System.out.println(" ");
		Demo1 d2 = new Demo1(10); //double int
		System.out.println(" ");
		Demo1 d3 = new Demo1(10.5);	//double
		System.out.println(" ");
		Demo1 d4 = new Demo1(10l);	//double //automatic promotion
	}

}
