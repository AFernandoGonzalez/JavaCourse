
public class JavaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Variables");
		
		/*
		 * data type   size     primitive/ref  
		 * boolean     1bit     prim           
		 * byte        1bit     prim          
		 * short       2bites   prim         
		 * int         4bites   prim          
		 * long        8bites   prim        
		 * 
		 * float       4bites   prim        
		 * double      8bites   prim        
		 * 
		 * char        2bites   prim        
		 * string      varies   ref         
		*/
		
		//decaration + assingment = initialization
		int y;
		int x = 12;
		System.out.println("Value x: " + x);
		
		// type l at the end of a long variable
		long a = 1234134274274l;
		System.out.println("Displayin long nubers" + a);
		
		// type f at the end of a float variable
		float b = 12.4f;
		System.out.println("Value b: " + b);
		
		// type f at the end of a float variable
		boolean c = true;
		System.out.println("Value c: " + c);
		
		// type f at the end of a float variable
		char symbol = '@';
		System.out.println("Value symbol: " + symbol);
		
		// type f at the end of a float variable
		String s = "My name";
		System.out.println("Value s: " + s);
		
		
		//swap variables
		String d = "water";
		String e = "kool aid";
		String temp = "";
		temp=d;
		d=e;
		e=temp;
		
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		
	}

}
