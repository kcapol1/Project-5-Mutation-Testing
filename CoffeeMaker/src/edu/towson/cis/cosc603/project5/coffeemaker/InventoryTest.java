package edu.towson.cis.cosc603.project5.coffeemaker;


import junit.framework.TestCase;


// TODO: Auto-generated Javadoc
/**
 * The Class InventoryTest.
 */
public class InventoryTest extends TestCase {

	/** The i. */
	private Inventory i;

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	public void setUp() {
		i = new Inventory();
	}
	
	/**
	 * Test setChocolate with negative input.
	 */
	public void testSetChocolate() {
		int chocolate = i.getChocolate();
		i.setChocolate(-1);
		assertEquals(chocolate,i.getChocolate(),0.001);
  	}
	
	/**
	 * Test setCoffee with negative input.
	 */
	public void testSetCoffee() {
		int coffee = i.getCoffee();
		i.setCoffee(-1);
		assertEquals(coffee,i.getCoffee(),0.001);
	}  	
	
	/**
	 * Test setMilk with negative input.
	 */
	public void testSetMilk() {
		int milk = i.getMilk();
		i.setMilk(-1);
		assertEquals(milk,i.getMilk(),0.001);
 	}
	
	/**
	 * Test setSugar with negative input.
	 */
	public void testSetSugar() {
		int sugar = i.getSugar();
		i.setSugar(-1);
		assertEquals(sugar,i.getSugar(),0.001);
	}

}
