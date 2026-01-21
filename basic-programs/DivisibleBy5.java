import java.util.Scanner;

public class DivisibleBy5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		
		if (n % 5 == 0){
			System.out.println("Is this number " + n + " divisible by 5? YES");
		}
		else{
			System.out.println("Is this number " + n + " divisible by 5? NO");
		}
	}
}