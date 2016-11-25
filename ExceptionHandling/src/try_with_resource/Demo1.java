/*
 * it will lead to error if we try to re initialize br 
 */
package try_with_resource;
import java.io.*;
public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try(BufferedReader br = new BufferedReader(new FileReader
				("input.txt")))
		{
			//br = new BufferedReader(new FileReader("input.txt"));
		}

	}

}
