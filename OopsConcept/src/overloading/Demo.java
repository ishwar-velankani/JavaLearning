package overloading;

public class Demo {
	public void disp(){
		System.out.println("No argument");
	}
	public void disp(int n){
		System.out.println("Integer argument");
	}
	public void disp(float f){
		System.out.println("Float argument");
	}
	public void disp(double d){
		System.out.println("double argument");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		d.disp();
		d.disp(1);
		d.disp(2.3);
		d.disp(2.65f);
		d.disp('a');//automatic promotion
		d.disp(2l);

	}

}
