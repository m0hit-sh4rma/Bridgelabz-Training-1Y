import java.util.Scanner;

public class BiggestOutOfThree{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = in.nextInt();
		System.out.print("Enter second number: ");
		int b = in.nextInt();
		System.out.print("Enter third number: ");
		int c = in.nextInt();
		
		if(a>b){
			if(a>c){
				System.out.println("Is the first number the largest?...Yes");
			}
			else{
				System.out.println("Is the third number the largest?...Yes");
			}
		}
		else{
			if(b>c){
				System.out.println("Is the second number the largest?...Yes");
			}
			else{
				System.out.println("Is the third number the largest?...Yes");
			}
		}
		in.close();
	}
}