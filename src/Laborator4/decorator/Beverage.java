package Laborator4.decorator;

public abstract class Beverage {
    protected String description;
    protected int cost;

    public Beverage(int cost,String description) {
        this.cost = cost;
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public int getCost() {
        return cost;
    }

}
