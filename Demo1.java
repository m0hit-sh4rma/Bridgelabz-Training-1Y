public class Demo1{
	static int x = 20;
	int y = 30;
	
	public static void m2(){
		int y = 50;
		System.out.println("Local var of m2 'y': " + y);
	}
	
	public static void m1(){
		int y = 40;
		System.out.println("Local var of m1 'y': " + y);
		m2();
	}
	
	public static void main(String[] args){
		int z = 10;
		
		System.out.println("Local var z: " + z);
		System.out.println("Static var x: " + x);
		
		m1();
		
		Demo1 obj = new Demo1();
		
		System.out.println("Non-static/instance var y: " + obj.y);
	}
}