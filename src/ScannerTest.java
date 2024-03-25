import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Are you a member:");
		boolean member = sc.nextBoolean();
		System.out.println(member);	
		if (!member) {
			System.out.println("You are not a memmebr.");
			if (age > 70) {
				
			}
		}
	}

}
