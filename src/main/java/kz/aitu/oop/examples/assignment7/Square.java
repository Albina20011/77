package kz.aitu.oop.examples.assignment7;

public class Square extends Rectangle {
    private double side;
    public Rectangle (String color, boolean filled, double length, double width, double side  ) {
        super(color, filled, length, width);
    side= side; }
    public void setSide(double side){
        side= side;;
    }
    public double getSide(){
        return side;
    }
    @Override
    public double GetArea()
    {
        return getSide()*getSide();
    }
    public double GetPerimeter()
    {
        return getSide()*4;
    }

    @Override
    public String toString()
    {
        return
                super.toString()+ "the area and perimeter of square with sides"+getSide()+"are: "+ getArea()+"and"+getPerimeter();
    }

}
