package Laborator5.io;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb= new PhoneBook("src/Laborator5/io/PhoneBook.txt");
        System.out.println(pb);

        System.out.println(pb.getNumberByName("Andrei"));
        System.out.println(pb.getNumberByName("Lavinia"));
    }
}
