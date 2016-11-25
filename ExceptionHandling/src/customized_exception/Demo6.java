package customized_exception;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class TooOld extends RuntimeException{
	TooOld(String s){
		super(s);
	}
}
class TooYoung extends RuntimeException{
	TooYoung(String s){
		super(s);
	}
}
public class Demo6 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(br.readLine());
		if (i < 16)
		{
			throw new TooYoung("You are not allowed");
		}
			
		else if(i>70){
			throw new TooOld("NOt possible you crtossed");
		}
			
		else
			System.out.println("Welcome");
		
	}

}
