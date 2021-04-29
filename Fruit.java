package Exercise4_2;

public class Fruit { 
	protected String name;
	
	public Fruit(){ //overloading without argument
		this.name = " ";
	}
	
	public Fruit(String name){ //overloading with 1 argument
		this.name = name;
		System.out.println(name+ " constructor is invoked.");
	}
	
	public String getName() {
		return name;
	}		
	
	public String toString() { //overriding method
		return "Eat more "+ name + " will be more healthy.";
	}		

}// end for Fruit class
