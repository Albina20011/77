package kz.aitu.oop.examples.thirdtask;

public class Circle implements GeoObject {
    private double radius;

    public Circle(double radius){
        radius= radius; }

    public void setRadius (double radius){
        radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    @Override
    public double getPerimeter(){
        return "there are no way"
    }
    public double getArea(){
        return Math.PI* getRadius()*getRadius();
    }

}
