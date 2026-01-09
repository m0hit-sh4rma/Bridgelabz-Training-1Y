public class Demo1{
	static int x = 20;
	int y = 30;
	
	public static void main(String[] args){
		int z = 10;
		
		System.out.println("Local var z: " + z);
		System.out.println("Static var x: " + x);
		
		Demo1 obj = new Demo1();
		
		System.out.println("Non-static/instance var y: " + obj.y);
	}
}