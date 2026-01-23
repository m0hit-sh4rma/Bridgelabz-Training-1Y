public class Loop{
	public static void main(String[] args){
		for(int i=0; i<10; i++){
			System.out.println("i: " + i);
		}
		
		int j = 10;
		while(j>0){
			System.out.println("j: " + j);
			j--;
		}
		
		int k = 10;
		do{
			System.out.println("k: " + k);
			k--;
		}while(k>0);
	}
}