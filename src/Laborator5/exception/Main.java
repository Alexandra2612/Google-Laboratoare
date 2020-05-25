package Laborator5.exception;

public class Main {
    public static void main(String[] args) {
        SomeClass sc=new SomeClass();
        sc.methodUncheckedException(2);
        //sc.methodUncheckedException(0);

        try {
            sc.methodCheckedException(2);
        } catch(ChException exception){
            System.out.println(exception.getStackTrace());
           // exception.printStackTrace();
        } finally{
            System.out.println("finally");
        }
        System.out.println("after exception ");
    }
}