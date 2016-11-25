/*
 * best example where instance block is used
 * to count number of object created for item
 */
package constructor;

public class Demo2 {
	static int count = 0;
	{
	count++;	
	}
	//two reason for not recommended 
	// code repetition
	//if any of constructor contain this then it may call more
	// than one constructor , and may lead to wrong output.
	Demo2(){
		//count++ //not recommended
	}
	Demo2(int i){
		//count++	//not recommended
	}
	Demo2(float f){
		//count++	//not recommended
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1 = new Demo2();
		Demo2 d2 = new Demo2();
		System.out.println(count);
	}

}
