package Laborator4.factory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory1= new NewYorkStore();
        Pizza p1 = pizzaFactory1.orderPizza("Cheese");
        System.out.println();
        Pizza p2 = pizzaFactory1.orderPizza("Spicy");
        System.out.println();
        System.out.println(p1);
        System.out.println(p2);


    }
}
