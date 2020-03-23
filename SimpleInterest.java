import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		double a;
		double p;
		double r;
		double si;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the amount");
		a=sc.nextDouble();
	    
		System.out.println("What is the amount");
		p=sc.nextDouble();
		
		System.out.println("What is the amount");
		r=sc.nextDouble();
		
		si = (a*p*r/100);
		
		System.out.println("The rate is "+si);
				
				

		
	}

}
