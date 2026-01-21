import java.util.Scanner;

public class SmallestFirst{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = in.nextInt();
		System.out.println("Enter second number: ");
		int b = in.nextInt();
		System.out.println("Enter third number: ");
		int c = in.nextInt();
		
		if(a<b && a<c){
			System.out.println("Is the first number is the smallest? Yes");
		}
		else{
			System.out.println("Is the first number is the smallest? No");
		}
	}
}