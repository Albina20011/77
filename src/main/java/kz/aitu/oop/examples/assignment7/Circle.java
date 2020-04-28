package kz.aitu.oop.examples.assignment7;

public class Circle extends Shape{
    private double radius;
    public Circle (String color, boolean filled, double radius ){
        super(color, filled);
        radius=radius;
    }
    public void setRadius(double radius){
        radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public double GetArea()
    {
        return getRadius()*getRadius()*Math.PI;
    }
    @Override
    public String toString()
    {
        return
                super.toString()+ "the area of circle with radius"+getRadius()+"is: "+ GetArea();
    }
}
