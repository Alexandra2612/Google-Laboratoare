package Laborator4.decorator;

public class Main {
    public static void main(String[] args) {

        Beverage dr = new DarkRoast();
        Beverage drw = new Whip(dr);
        Beverage es=new Espresso();
        Beverage esm=new Milk(es);
        Beverage hb = new HouseBlend();
        hb=new Mocha(hb);
        hb=new Mocha(hb);
        hb=new Whip(hb);
        Beverage dec=new Decaf();
        dec=new Milk(dec) ;
        dec=new Soy(dec);
        dec=new Mocha(dec);


        System.out.println(esm.getDescription() + "," + esm.getCost());
        System.out.println(es.getDescription() + "," + es.getCost());
        System.out.println(drw.getDescription() + "," + drw.getCost());
        System.out.println(dr.getDescription() + "," + dr.getCost());
        System.out.println(hb.getDescription() + ", " + hb.getCost());
        System.out.println(dec.getDescription() + ", " + dec.getCost());

    }
}

