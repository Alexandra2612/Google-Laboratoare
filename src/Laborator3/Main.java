package Laborator3;

public class Main {
    public static void main(String[] args) {
        LazyInit lazyInit=LazyInit.getInstance();
        System.out.println(lazyInit.getName());

        LazyInit lazyInit1=LazyInit.getInstance();
        System.out.println(lazyInit.getName());
    }
}
