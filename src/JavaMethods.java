
public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Bro";
		int age = 21;
		
		hello(name, age);
		
		
		int a = 2;
		int b = 3;
		int c = add(a,b);
		System.out.println("result: " + c);
		
		
		// overloaded methods
		
//		int x = sum(1,2,3,4);
//		System.out.println("result: " + x);
		
		double x = sum(1.0,2.4,3.1,4.0);
		System.out.println("result: " + x);
		
		
		System.out.printf("this is a format string %d",123);
		System.out.printf("%dthis is a format string ",123);
		
		
	}
	
	static void hello(String nameTitle, int age) {
		System.out.println("Hi " + nameTitle + " and Your age is " + age);
	}
	
	static int add(int x, int y) {
		int r = x + y; 
		return r;
	}
	
	
	
   //overloaded methods
	
	static int sum(int a, int b) {
		System.out.println("---Method Overloaded 1---");
		return a+ b;
	}
	
	static int sum(int a, int b, int c) {
		System.out.println("---Method Overloaded 2---");
		return a+ b + c;
	}
	
	static int sum(int a, int b, int c, int d) {
		System.out.println("---Method Overloaded 3---");
		return a+ b + c + d;
	}
	
	//
	static double sum(double a, double b) {
		System.out.println("---Method Overloaded 4---");
		return a+ b;
	}
	
	static double sum(double a, double b, double c) {
		System.out.println("---Method Overloaded 5---");
		return a+ b + c;
	}
	
	static double sum(double a, double b, double c, double d) {
		System.out.println("---Method Overloaded 6---");
		return a+ b + c + d;
	}
	

}
