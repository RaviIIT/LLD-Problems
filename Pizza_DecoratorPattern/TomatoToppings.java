package Pizza_DecoratorPattern;

public class TomatoToppings extends Toppings{
    TomatoToppings(Pizza pizza) {
        super(pizza, 100, "Tomato");
    }
}
