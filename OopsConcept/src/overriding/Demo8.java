/*
 * in case of throwable exception
 * we need to take care about Checked exception
 */
package overriding;
import java.io.*;
class Xe1{
	public void m1() throws IOException{
		
	}
}
class Xe2 extends Xe1{
	public void m1()throws IOException{
  //public void m1()throws Exception{ This will show error	
		
	}
}

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
