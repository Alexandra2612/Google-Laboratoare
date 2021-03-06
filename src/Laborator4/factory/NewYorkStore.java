package Laborator4.factory;

public class NewYorkStore extends PizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=new DefaultPizza();
        if(type.equals("Spicy")){
            pizza = new NYSpicyPizza();
        }
        else
            if(type.equals("Cheese")){
            pizza = new NYCheesePizza();
        }
            else
                if(type.equals("Veggie")){
                    pizza=new NYVeggiePizza();
                }
                else
                    if(type.equals("Clam")){
                        pizza=new NYClamPizza();
                    }

        return pizza;
    }
}
