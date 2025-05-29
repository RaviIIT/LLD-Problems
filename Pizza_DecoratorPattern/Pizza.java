// Decorator Pattern
// Identifier -> Exponential explosion of combinations. Decoration of item on one item leads to object of same type.
// How to approach ?
// 1. Make an abstract class with the item to be decorated.
// 2. In the child class, add a variable of type the abstract class and take it from constructor.
// 3. In the functions of the child class, call the functions of the abstract class and modify the results a/q to use case.

package Pizza_DecoratorPattern;

public abstract class Pizza {
    int cost;
    String name;
    
    Pizza(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }
    public String getName() {
        return this.name;
    }
}
