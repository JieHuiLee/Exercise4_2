package Exercise4_2; //Overriding and Overloading

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Fruit Shop");
		System.out.print("--------------------------\n");
		
		//Fruit f = new Fruit(); //universal
		System.out.println("      Fruit Detail");
		System.out.print("=============================");
		System.out.println();
		
		Apple a = new Apple ("Apple",18.80,5);
		System.out.println("=========Apple=========\n"+a);
		System.out.println();
		
		GreenApple g= new GreenApple("Green Apple",30.09,4,"sour", 4.0, 150.00);
		System.out.println("\n=========Green Apple=========\n"+g);
		System.out.println();
		
		RedApple r = new RedApple("Red Apple",11.90,7,182.00,52);
		System.out.println("\n=========Red Apple=========\n"+r);
		System.out.println();
		
		Mango m = new Mango ("Mango","Vivid yellow",36.4);
		System.out.println("\n=========Mango Detail=========\n"+m);
		System.out.println();
		
		Blueberry b = new Blueberry("Blueberry","Small", 36);
		System.out.println("\n=========Blueberry=========\n"+b);
		System.out.println("\n=======Thank You======");
	}

}//end main class
