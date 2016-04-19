package edu.towson.cis.cosc603.project5.coffeemaker;

import junit.framework.TestCase;

/**
 *
 */
public class CoffeeMakerTest extends TestCase {
	private CoffeeMaker cm;
	private Inventory i;
	private Recipe r1;
	private Recipe r2;
	private Recipe r3;
	private Recipe r4;
	private Recipe r5;

	public void setUp() {
		cm = new CoffeeMaker();
		i = cm.checkInventory();

		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);

		r2 = new Recipe();
		r2.setName("Latte");
		r2.setPrice(100);
		r2.setAmtCoffee(5);
		r2.setAmtMilk(5);
		r2.setAmtSugar(5);
		r2.setAmtChocolate(5);
		
		r3 = new Recipe();
		r3.setName("Hot Chocolate");
		r3.setPrice(100);
		r3.setAmtCoffee(0);
		r3.setAmtMilk(3);
		r3.setAmtSugar(15);
		r3.setAmtChocolate(3);
		
		r4 = new Recipe();
		r4.setName("Cappuccino");
		r4.setPrice(100);
		r4.setAmtCoffee(2);
		r4.setAmtMilk(3);
		r4.setAmtSugar(1);
		r4.setAmtChocolate(1);

		r5 = new Recipe();
		r5.setName("Cappuccino Heavy");
		r5.setPrice(100);
		r5.setAmtCoffee(2);
		r5.setAmtMilk(3);
		r5.setAmtSugar(1);
		r5.setAmtChocolate(1);
}

	public void testAddRecipe1() {
		assertTrue(cm.addRecipe(r1));
	}

	public void testAddRecipe2() {
		assertTrue(cm.addRecipe(r1));
		assertFalse(cm.addRecipe(r1));
	}
	
	public void testAddRecipe3() {
		assertTrue(cm.addRecipe(r1));
		assertTrue(cm.addRecipe(r2));
		assertTrue(cm.addRecipe(r3));
		assertTrue(cm.addRecipe(r4));
		assertFalse(cm.addRecipe(r5));
	}

	public void testDeleteRecipe1() {
		assertTrue(cm.addRecipe(r1));
		assertTrue(cm.deleteRecipe(r1));
	}
	
	public void testDeleteRecipe2() {
		assertFalse(cm.deleteRecipe(r1));
	}

	public void testEditRecipe1() {
		assertTrue(cm.addRecipe(r1));
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertTrue(cm.editRecipe(r1, newRecipe));
		assertEquals(2.00, cm.getRecipeForName(r1.getName()).getAmtSugar(),0.001);
	}
	
	public void testEditRecipe2() {
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtSugar(2);
		assertFalse(cm.editRecipe(r1, newRecipe));
	}
	
	public void testEditRecipe3() {		
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		assertTrue(cm.addRecipe(r1));
		newRecipe.setAmtCoffee(-1);
		newRecipe.setAmtMilk(-1);
		newRecipe.setAmtSugar(-1);
		newRecipe.setAmtChocolate(-1);
		assertTrue(cm.editRecipe(r1, newRecipe));
		assertEquals(0.00,cm.getRecipeForName("Coffee").getAmtCoffee(),0.001);
		assertEquals(0.00,cm.getRecipeForName("Coffee").getAmtMilk(),0.001);
		assertEquals(0.00,cm.getRecipeForName("Coffee").getAmtSugar(),0.001);
		assertEquals(0.00,cm.getRecipeForName("Coffee").getAmtChocolate(),0.001);
	}
	
	public void testAddInventory1() {
		assertTrue(cm.addInventory(1, 1, 1, 1));
		assertEquals(16.00,cm.checkInventory().getCoffee(), 0.001);
		assertEquals(16.00,cm.checkInventory().getMilk(), 0.001);
		assertEquals(16.00,cm.checkInventory().getSugar(), 0.001);
		assertEquals(16.00,cm.checkInventory().getChocolate(), 0.001);
	}
	
	public void testAddInventory2() {
		assertFalse(cm.addInventory(-1, 1, 1, 1));
		assertFalse(cm.addInventory(1, -1, 1, 1));
		assertFalse(cm.addInventory(1, 1, -1, 1));
		assertFalse(cm.addInventory(1, 1, 1, -1));
	}
	
	public void testCheckInventory1() {
		assertEquals(15.00,cm.checkInventory().getCoffee(), 0.001);
		assertEquals(15.00,cm.checkInventory().getMilk(), 0.001);
		assertEquals(15.00,cm.checkInventory().getSugar(), 0.001);
		assertEquals(15.00,cm.checkInventory().getChocolate(), 0.001);
	}
	
	public void testPurchaseBeverage1() {
		assertTrue(cm.addRecipe(r1));
		assertEquals(50,cm.makeCoffee(r1, 100),0.001);
		assertEquals(9.00,cm.checkInventory().getCoffee(), 0.001);
		assertEquals(14.00,cm.checkInventory().getMilk(), 0.001);
		assertEquals(14.00,cm.checkInventory().getSugar(), 0.001);
		assertEquals(15.00,cm.checkInventory().getChocolate(), 0.001);
		
	}

	public void testPurchaseBeverage2() {
		assertTrue(cm.addRecipe(r1));
		assertEquals(25,cm.makeCoffee(r1, 25),0.001);
		assertEquals(15.00,cm.checkInventory().getCoffee(), 0.001);
		assertEquals(15.00,cm.checkInventory().getMilk(), 0.001);
		assertEquals(15.00,cm.checkInventory().getSugar(), 0.001);
		assertEquals(15.00,cm.checkInventory().getChocolate(), 0.001);
		
	}
	
	public void testPurchaseBeverage3() {
		assertTrue(cm.addRecipe(r1));
		assertEquals(0,cm.makeCoffee(r1, 50),0.001);
		assertEquals(0,cm.makeCoffee(r1, 50),0.001);
		assertEquals(50,cm.makeCoffee(r1, 50),0.001);		
		assertEquals(3.00,cm.checkInventory().getCoffee(), 0.001);
		assertEquals(13.00,cm.checkInventory().getMilk(), 0.001);
		assertEquals(13.00,cm.checkInventory().getSugar(), 0.001);
		assertEquals(15.00,cm.checkInventory().getChocolate(), 0.001);
	}
	
	public void testPurchaseBeverage4() {
		assertEquals(50,cm.makeCoffee(r1, 50),0.001);
		assertEquals(15.00,cm.checkInventory().getCoffee(), 0.001);
		assertEquals(15.00,cm.checkInventory().getMilk(), 0.001);
		assertEquals(15.00,cm.checkInventory().getSugar(), 0.001);
		assertEquals(15.00,cm.checkInventory().getChocolate(), 0.001);
	}
	
	public void testPurchaseBeverage5() {
		assertTrue(cm.addRecipe(r1));
		Recipe newRecipe = new Recipe();
		newRecipe = r1;
		newRecipe.setAmtCoffee(15);
		newRecipe.setAmtMilk(15);
		newRecipe.setAmtSugar(15);
		newRecipe.setAmtChocolate(15);
		assertTrue(cm.editRecipe(r1, newRecipe));
		assertEquals(0,cm.makeCoffee(r1, 50),0.001);
		assertEquals(50,cm.makeCoffee(r1, 50),0.001);
		assertEquals(0.00,cm.checkInventory().getCoffee(), 0.001);
		assertEquals(0.00,cm.checkInventory().getMilk(), 0.001);
		assertEquals(0.00,cm.checkInventory().getSugar(), 0.001);
		assertEquals(0.00,cm.checkInventory().getChocolate(), 0.001);
	}

	public void testSetCoffee() {
		i.setCoffee(-1);
		assertEquals(0,i.getCoffee(),0.001);
	}  	
	
	public void testSetMilk() {
		i.setMilk(-1);
		assertEquals(0,i.getMilk(),0.001);
 	}
	
	public void testSetSugar() {
		i.setSugar(-1);
		assertEquals(0,i.getSugar(),0.001);
	}

	public void testSetChocolate() {
		i.setChocolate(-1);
		assertEquals(0,i.getChocolate(),0.001);
  	}

}