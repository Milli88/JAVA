import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		int rating;
		Scanner sc = new Scanner(System.in);
		int rating = sc.next(int);
		
		
		switch(rating)
		{
		case 1: System.out.println("Poor rating");
		break;
		case 2: System.out.println("Good rating");
		break;
		case 3: System.out.println("Great rating");
		break;
		case 4: System.out.println("Excellent rating");
		break;
		}
		
	
		

	}

}
