package Template;
public class VegPizza extends PizzaTemplate {
 
	@Override
	public void selectBread() {
		System.out.println("Choosing Bread for Veg-Pizza!!");
	}
 
	@Override
	public void addingIngredients() {
		System.out.println("Adding ingredients in Veg-Pizza!!");
	}

    public void cooking() {
		System.out.println("Cooking Veg Pizza for 10 minutes!");
	}
}