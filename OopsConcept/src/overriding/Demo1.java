package overriding;
class Father{
	public void property(){
		System.out.println("Cash+Land");
	}
	public void marry(){	//overridden method
		System.out.println("Puja");
	}
}
//son want other implementation of marry
class Son extends Father{
	public void marry(){ 	//overriding method
		System.out.println("Sristy"); 
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		f.marry();	//father choice puja
		Son s = new Son();
		s.marry();	//son choice sristy
		Father f1 = new Son();
		f1.marry();	//son choice sristy

	}

}
