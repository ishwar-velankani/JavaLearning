/*
 * Example like slide changer
 */
package thread_interruption;

public class SleepTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println(i);
			Thread.sleep(2000);
		}

	}

}
