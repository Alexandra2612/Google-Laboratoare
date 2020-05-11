package Laborator4.factory;

public class ChicagoStore extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=new DefaultPizza();
        if(type.equals("Pepperoni")){
            pizza = new ChicagoPepperoniPizza();
        }
        else
        if(type.equals("Mushroom")){
            pizza = new ChicagoMushroomPizza();
        }
        else
        if(type.equals("Pineapple")){
            pizza=new ChicagoPineapplePizza();
        }
        else
        if(type.equals("QuatroFormagi")){
            pizza=new ChicagoQuatroFormagiPizza();
        }

        return pizza;
    }

}
