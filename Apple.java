package Exercise4_2;

public class Apple extends Fruit { //sub class of Fruit
	protected double price;//p
	protected int quantity;//q
	
	public Apple() {//constructor for sub class without argument
		super(); //inherit data,method from super class (constructor with no argument)
		this.price = 0;	
		this.quantity = 0;	
	}
	
	public Apple(String name, double p,int q) {//constructor for sub class with 3 argument
		super(name);  //called method in superclass with passing parameter
		this.price = p;	
		this.quantity = q; 
		
		setTotal(p,q); //call method for overloading
    }

   public void setTotal(double p,int q){ //overloading method with 2 parameter
      if (p >= 0)
           price = p;
     else 
           price = 0;

      if (q >= 0)
           quantity = q;
     else 
           quantity = 0;
   } 
	
	
	public String toString() {//overriding method
		return super.toString()
				+ "\nName\t: " + name 
				+ "\nPrice\t: "+ price 
				+"\nQuantity: " + quantity + " pcs";
	}
}// end for class Apple extends


