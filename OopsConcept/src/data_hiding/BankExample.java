/*
 * we can't access the private member outside the class
 * to access we write methods
 * in method proper validation takes places.
 */
package data_hiding;

class Account{
	private double balance;
	//......
	//..........
	public double getBalance(){
		return balance;
	}
}
public class BankExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account suraj = new Account();
		System.out.println(suraj.getBalance());
	}

}
