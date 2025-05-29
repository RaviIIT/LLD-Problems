package Pizza_DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new TomatoToppings(new WheatBase());
        pizza.getCost();
    }
}
