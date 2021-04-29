package Exercise4_2;

public class Blueberry extends Fruit{ //sub class of Fruit
	private String size;//s
	private int vitaminK;//vK
	
	public Blueberry() { //constructor for sub class without argument
		super();
		this.size = " ";	
		this.vitaminK= 0;
	}
	
	public Blueberry(String name, String s, int vK) { //constructor for sub class with 3 argument
		super(name);
		this.size = s;	
		this.vitaminK= vK;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public int getVitaminK() {
		return this.vitaminK;
	}
	
	public String toString() {//overriding method
		return super.toString() 
				+ "\nSize\t: " + getSize()
				+ "\nVitaminK: " + getVitaminK() + " %";
	}

}// end for class Blueberry extends
