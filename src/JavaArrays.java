
public class JavaArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"camero", "tesla"};
		//access element
		cars[0] = "mustang";
		System.out.println(cars[1]);
		
		String[] names = new String[3];
		names[0] = "a";
		names[1] = "b";
		names[2] = "c";
		
		
		for(int i = 0 ; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		//2D array
		String[][] techs = new String[3][3];
		techs[0][0] = "js";
		techs[0][1] = "python";
		techs[0][2] = "java";
		
		techs[1][0] = "react";
		techs[1][1] = "django";
		techs[1][2] = "bootspring";
		
		techs[2][0] = "1";
		techs[2][1] = "2";
		techs[2][2] = "3";
		
		//outer
		for(int i = 0 ; i < techs.length; i ++) {
			System.out.println();
			//inner
			for(int j = 0 ; j < techs[i].length ; j++) {
				System.out.print(techs[i][j]+ " ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
