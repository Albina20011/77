package kz.aitu.oop.examples.practice6;

class Singleton {

    public String str;
    private static Singleton object;
    private Singleton() {}
    public static getSingleInstance() {
        if(object == null) {
            object = new Singleton();
        }
        return object;
    }
}
