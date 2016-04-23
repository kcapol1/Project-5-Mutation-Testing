package edu.towson.cis.cosc603.project5.coffeemaker;


import junit.framework.TestCase;


// TODO: Auto-generated Javadoc
/**
 * The Class RecipeTest.
 */
public class RecipeTest extends TestCase {

	
	/** The r1. */
	private Recipe r1;

	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	public void setUp() {

		r1 = new Recipe();
		r1.setName("Latte");
		r1.setPrice(100);
		r1.setAmtCoffee(5);
		r1.setAmtMilk(5);
		r1.setAmtSugar(5);
		r1.setAmtChocolate(5);
	}

	/**
	 * Test setAmtChocolate with negative input.
	 */
	public void testSetAmtChocolate1() {
		int chocolate = r1.getAmtChocolate();
		r1.setAmtChocolate(-1);
		assertEquals(chocolate,r1.getAmtChocolate(),0.001);
  	}
	
	/**
	 * Test setAmtChocolate with zero (0) value input.
	 */
	public void testSetAmtChocolate2() {
		r1.setAmtChocolate(0);
		assertEquals(0,r1.getAmtChocolate(),0.001);
  	}
	
	/**
	 * Test setAmtCoffee with negative input.
	 */
	public void testSetAmtCoffee1() {
		int coffee = r1.getAmtCoffee();
		r1.setAmtCoffee(-1);
		assertEquals(coffee,r1.getAmtCoffee(),0.001);
	}

	/**
	 * Test setAmtCoffee with zero (0) value input.
	 */
	public void testSetAmtCoffee2() {
		r1.setAmtCoffee(0);
		assertEquals(0,r1.getAmtCoffee(),0.001);
	}

	/**
	 * Test setAmtMilk with negative input.
	 */
	public void testSetAmtMilk1() {
		int milk = r1.getAmtMilk();
		r1.setAmtMilk(-1);
		assertEquals(milk,r1.getAmtMilk(),0.001);
	}

	/**
	 * Test setAmtMilk with zero (0) value input.
	 */
	public void testSetAmtMilk2() {
		r1.setAmtMilk(0);
		assertEquals(0,r1.getAmtMilk(),0.001);
	}

	/**
	 * Test setAmtSugar with negative input.
	 */
	public void testSetAmtSugar1() {
		int sugar = r1.getAmtSugar();
		r1.setAmtSugar(-1);
		assertEquals(sugar,r1.getAmtSugar(),0.001);
	}

	/**
	 * Test setAmtSugar with zero (0) value input.
	 */
	public void testSetAmtSugar2() {
		r1.setAmtSugar(0);
		assertEquals(0,r1.getAmtSugar(),0.001);
	}
	
	/**
	 * Test setPrice with negative input.
	 */
	public void testSetPrice1() {
		int price = r1.getPrice();
		r1.setPrice(-1);
		assertEquals(price,r1.getPrice(),0.001);
  	}
	
	/**
	 * Test setPrice with zero (0) value input.
	 */
	public void testSetPrice2() {
		r1.setPrice(0);
		assertEquals(0,r1.getPrice(),0.001);
  	}
	
	/**
	 * Test toString with expected input.
	 */
	public void testToString() {
		assertEquals("Latte",r1.toString());
  	}
	
	/**
	 * Test Equals with null recipe.
	 */
	public void testEquals() {
		Recipe r = new Recipe();
		assertFalse(r.equals(r1));
  	}
}
