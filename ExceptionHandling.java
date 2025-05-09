import java.util.*;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try {
			int res=n1/n2;
			System.out.println(res);
		}
		catch(ArithmeticException exception){
			System.out.println("You are not supposed to divide by zero");
		}
		finally {
			System.out.println("Finally is being executed");
		}
		
	}

}
