import java.util.Scanner;

public class WhileLoopCountdown{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = in.nextInt();
		
		while(n != 0){
			System.out.println(n);
			n--;
		}
	}
}