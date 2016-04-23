package edu.towson.cis.cosc603.project5.coffeemaker;

// TODO: Auto-generated Javadoc
/**
 * Inventory for the coffee maker.
 *
 * @author Josh
 * @version $Revision: 1.0 $
 */
public class Inventory {
    
    /** The coffee. */
    private static int coffee;
    
    /** The milk. */
    private static int milk;
    
    /** The sugar. */
    private static int sugar;
    
    /** The chocolate. */
    private static int chocolate;
    
    /**
     * Instantiates a new inventory.
     */
    public Inventory() {
    	setCoffee(15);
    	setMilk(15);
    	setSugar(15);
    	setChocolate(15);
    }
    
    /**
     * Method getChocolate.
     * @return int
     */
    public int getChocolate() {
        return chocolate;
    }
    /**
     * Method setChocolate.
     * @param chocolate int
     */
    public void setChocolate(int chocolate) {
    	if(chocolate >= 0) {
    		Inventory.chocolate = chocolate;
    	}
    	else {
//    		Inventory.chocolate = 0;
    	}
        
    }
    /**
     * Method getCoffee.
     * @return int
     */
    public int getCoffee() {
        return coffee;
    }
    /**
     * Method setCoffee.
     * @param coffee int
     */
    public void setCoffee(int coffee) {
    	if(coffee >= 0) {
    		Inventory.coffee = coffee;
    	}
    	else {
//    		Inventory.coffee = 0;
    	}
    }
    /**
     * Method getMilk.
     * @return int
     */
    public int getMilk() {
        return milk;
    }
    /**
     * Method setMilk.
     * @param milk int
     */
    public void setMilk(int milk) {
    	if(milk >= 0) {
    		Inventory.milk = milk;
    	}
    	else {
//    		Inventory.milk = 0;
    	}
    }
    /**
     * Method getSugar.
     * @return int
     */
    public int getSugar() {
        return sugar;
    }
    /**
     * Method setSugar.
     * @param sugar int
     */
    public void setSugar(int sugar) {
    	if(sugar >= 0) {
    		Inventory.sugar = sugar;
    	}
    	else {
//    		Inventory.sugar = 0;
    	}
    }
    
    /**
     * Returns true if there are enough ingredients to make
     * the beverage.
     *
     * @param r the r
     * @return boolean
     */
    public boolean enoughIngredients(Recipe r) {
        boolean isEnough = true;
        if(Inventory.coffee < r.getAmtCoffee()) {
            isEnough = false;
        }
        if(Inventory.milk < r.getAmtMilk()) {
            isEnough = false;
        }
        if(Inventory.sugar < r.getAmtSugar()) {
            isEnough = false;
        }
        if(Inventory.chocolate < r.getAmtChocolate()) {
            isEnough = false;
        }
        return isEnough;
    }
    
    /**
     * Method toString.
     * @return String
     */
//    public String toString() {
//    	return "Coffee: " + getCoffee() + "\n" +
//			"Milk: " + getMilk() + "\n" +
//			"Sugar: " + getSugar() + "\n" +
//			"Chocolate: " + getChocolate() + "\n";
//    }
}
