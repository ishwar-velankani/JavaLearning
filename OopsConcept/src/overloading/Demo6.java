/*
 * Method overlaoding in the inheritacne concept
 * in overloading . method resolution takes place by compiler
 * based on reference type
 */
package overloading;

class Animal{
	
}
class Monkey extends Animal{
	
}
public class Demo6{
	public void m1(Animal a){
		System.out.println("Animal ");
	}
	public void m1(Monkey m){
		System.out.println("Monkey ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo6 t = new Demo6();
		Animal a = new Animal();
		t.m1(a);	//animal
		Monkey m = new Monkey();
		t.m1(m);	//monkey
		//method resolution is based on the refrecne type
		//taken care by compiler
		Animal a1 = new Monkey();
		t.m1(a1);	//animal
		
	}

}
