package kz.aitu.oop.examples.assignment7;

public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle (String color, boolean filled, double length, double width ) {
        super(color, filled);

        length = length;
        width = width;
    }
    public void setLength(double length){
        length=length;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        width = width;
    }
    public double getWidth(){
        return width;
    }
    @Override
    public double GetArea()
    {
        return getLength()*getWidth();
    }
    public double GetPerimeter()
    {
        return 2*(getLength()+getWidth());
    }

    @Override
    public String toString()
    {
        return
                super.toString()+ "the area and perimeter of rectangle with length"+getLength()+"and width"+getWidth()+"are: "+ GetArea()+"and"+GetPerimeter();
    }

}
