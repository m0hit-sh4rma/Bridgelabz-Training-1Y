import java.util.Scanner;

public class NaturalNumber{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		
		int sum = 0;
		
		if(n>0){
			System.out.println("Entered number is natural.");
			
			for(int i=1; i<=n; i++){
				sum += i;
			}
			System.out.println("Sum till the number is: " + sum);
		}
		else{
			System.out.println("Entered number isn't natural");
		}
	}
}