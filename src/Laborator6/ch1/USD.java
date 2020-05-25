package Laborator6.ch1;

public class USD extends Currency {
    public USD(){super();}
    public USD(double units) {
        super(units);
    }

    @Override
    public String toString() {
        return "USD:"+ getUnits();
    }
}
