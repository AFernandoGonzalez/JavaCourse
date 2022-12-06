
public class JavaOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car myCarOne = new Car();
//		Car myCarTwo = new Car();
//		myCarTwo.color = "Black";
//		
//		System.out.println(myCarOne.color);
//		System.out.println(myCarOne.model);
//		System.out.println();
//		System.out.println(myCarTwo.color);
//		System.out.println(myCarTwo.model);

		
		//
		Human human = new Human("Rick", 65, 120.6);
		Human human2 = new Human("Fer", 28, 170.5);
		
		System.out.println("Human 1 name: " + human.name);
		System.out.println("Human 2 age: " + human2.age);
		
		human.drink();
		human2.eat();
		
		
		//
		Garage myGarage = new Garage();
		Car myNewCar = new Car("Mustang");
		Car myNewCarTwo = new Car("Tesla");
		
		myGarage.park(myNewCar);
		myGarage.park(myNewCarTwo);
		
		

	}

}
