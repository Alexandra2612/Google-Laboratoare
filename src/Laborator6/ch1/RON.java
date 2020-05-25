package Laborator6.ch1;

public class RON extends Currency {
    public RON(){super();}
    public RON(double units) {
        super(units);
    }

    @Override
    public String toString() {
        return "RON:"+getUnits();
    }
}
