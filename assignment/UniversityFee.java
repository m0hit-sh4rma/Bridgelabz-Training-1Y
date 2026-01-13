public class UniversityFee{
	public static void main(String[] args){
		int fee = 125000;
		int discountPercent = 10;
		
		double discountAmount = (125000/100)*10;
		
		double finalAmount = fee - discountAmount;
		
		System.out.println("The discount amount is INR " + discountAmount);
		System.out.println("The final amount is INR " + finalAmount);
	}
}