package kz.aitu.oop.examples.practice6;

public class Singleton {

    public String str;
    private static Singleton object;
    pricate Singleton() {}
    public static getSingleInstance() {
        if(oblect == null) {
            object = new Singlton();
        }
        return object;
    }
}
