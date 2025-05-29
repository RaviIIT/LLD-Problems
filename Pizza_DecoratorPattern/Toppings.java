package Pizza_DecoratorPattern;

public abstract class Toppings extends Pizza{
    Pizza pizza;
    Toppings(Pizza pizza, int cost, String name){
        super(name, cost);
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return super.getCost() + pizza.getCost();
    }

    @Override
    public String getName() {
        return super.getName() + pizza.getName();
    }

}
