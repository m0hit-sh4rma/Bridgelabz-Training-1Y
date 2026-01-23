public class Updation{
	public static void main(String[] args){
		int i = 0;
		System.out.println("value of i: " + i); //0
		
		i++;
		System.out.println("value of i: " + i++); //1
		System.out.println("value of i: " + i);   //2
		
		++i;
		System.out.println("value of i: " + i++); //3
		System.out.println("value of i: " + i++);   //4
		
		//int z = i + i++ + ++i + i + ++i + i++;
		//System.out.println("value of z: " + z);
		//System.out.println("value of i: " + i);
		
		int z = i - i++ - --i + i - ++i + i++;
		System.out.println("value of z: " + z);
		System.out.println("value of i: " + i);
	}
}