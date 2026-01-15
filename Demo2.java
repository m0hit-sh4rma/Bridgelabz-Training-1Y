public class Demo2{
	static int a = 10;
	int b = 20;
	void m1(){
		int d = 40;
		System.out.println("Local variable of m1: " + d);
		System.out.println("Static variable in m1: " + a);
		
		Demo2 obj2 = new Demo2();
		System.out.println("Non-static variable called in m1: " + obj2.b);
	}
	public static void m2(){
		int e = 50;
		System.out.println("Local variable of m2: " + e);
		System.out.println("Static variable called in m2: " + a);
		
		Demo2 obj3 = new Demo2();
		System.out.println("Non-static variable called in m2: " + obj3.b);
	}
	public static void main(String[] args){
		int c = 30;
		System.out.println("Local variable of main method: " + c);
		System.out.println("Static variable of the class: " + a);
		
		Demo2 obj = new Demo2();
		System.out.println("Non-static variable of the class: " + obj.b);
		obj.m1();
	}
}