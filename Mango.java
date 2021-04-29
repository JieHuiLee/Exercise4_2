package Exercise4_2;

public class Mango extends Fruit{ //sub class of Fruit
	private String color;//c
	private double vitaminC;//v
	
	public Mango() { //constructor for sub class without argument
		super();
		this.color = " ";
		this.vitaminC = 0.00;
	}
	
	public Mango(String name, String c, double v) {//constructor for sub class with 3 argument
		super(name);
		this.color = c;
		this.vitaminC = v;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getVitaminC() {
		return this.vitaminC;
	}
	
	public String toString() {//overriding method
		return super.toString() 
				+ "\nColor\t: " + getColor()
				+ "\nVitaminC: " + getVitaminC()+" mg";
	}

}// end for class Mango extends
