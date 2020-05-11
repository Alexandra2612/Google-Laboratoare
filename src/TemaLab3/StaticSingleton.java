package TemaLab3;

public class StaticSingleton {
    private static StaticSingleton instance;
    private StaticSingleton(){}
    static{
        try{
            instance=new StaticSingleton();
        }catch(Exception e){
            throw new RuntimeException("m");
        }
    }
    public static StaticSingleton getInstance(){return instance;}
}
