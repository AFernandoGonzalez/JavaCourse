import java.util.ArrayList;
import java.util.*;

public class JavaStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Fer";
		
		//methods .equal
		boolean res =  name.equals("Fer");
//		boolean res =  name.equalsIgnoreCase("fer");
//		int res = name.length();
//		char res = name.charAt(2);
//		int res = name.indexOf("e");
//		boolean res = name.isEmpty();
//		String res = name.toUpperCase();
//		String res = name.toLowerCase();
//		String res = name.trim();
//		String res = name.replace('e', 'i');
		 
		System.out.println(res);
		
		
		//wrapper classes : 
		//autoboxing :  convert primitive to reference types.
		//unboxing: convert reference to primitive types.
		
		//primitives are faster than ref data types
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double e = 1.23;
		//string are already reference data type : advantage has usefull methods
		String f = "Fer";
		
		
		if(b=='@') {
			System.out.println("This is true");
		}
		
		
		//Array List : resizeble array
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Cake");
		food.add("pie");
		food.add("rice");
		
		
		//replace value
		food.set(1, "replaced food item");
		
		//removed
		food.remove(2);
		
		//clear all
		food.clear();
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(i + "-" + food.get(i));
		}
		
		
		
		//2d arrays
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("bread");
		bakeryList.add("garlic bread");
		bakeryList.add("pizza");
		
//		System.out.println(bakeryList);
//		System.out.println(bakeryList.get(0));
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoe");
		produceList.add("zuchinni");
		
		ArrayList<String> drinkList = new ArrayList();
		drinkList.add("pepsi");
		drinkList.add("coke");
		
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));
		
		
		
		//for each loop
//		String[] animals = { "cat", "dog", "rat"};
		ArrayList<String> animals = new ArrayList();
		
		animals.add("mouse");
		animals.add("cat");
		
		for(String i:animals) {
			System.out.println(i);
		}
		
		
	}

}
