package Exercise4_2;

public class RedApple extends Apple { //sub class of Apple
	private double weight;//w
	private int nutrient;//n
	
	public RedApple() { //constructor for sub class without argument
		super(); 
		this.weight = 0.00;
		this.nutrient = 0;
	}
	
	public RedApple(String name,double p, int q, double w, int n) { //constructor for sub class with 5 argument
		super(name,p,q);
		this.weight = w;
		this.nutrient = n;
		
		//q = 7, w = 182grams
	    setTotalWeight(q,w); //call method for overloading
    }

    public void setTotalWeight(int q, double w) //overloading method with 2 parameters
	{
	   if (w >= 0)
	       weight = w;
	   else 
	       weight = 0;
     }
	   
	
	public double TotalWeight(){
		return quantity * weight;
	}
	
	public int getNutrient() {
		return this.nutrient;
	 }	
	
	public double calSumPrice() {
	     return super.price * super.quantity;
	}

	public String toString() {//overriding method
		return super.toString()
			+ "\nTotal Weight\t: "+ TotalWeight() + " (grams)"
			+ "\nNutrient\t: "+ getNutrient() + "calories"
			+ "\nTotal Price\t: RM " + calSumPrice();
	}
}// end for class RedApple extends 
