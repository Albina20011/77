package kz.aitu.oop.examples.assignment7;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled ){
        color= color;
        filled= filled;
    }

    public void setColor(String color){
        color=color;
    }
    public String getColor(){
        return color;
    }

    public void setFilled(boolean filled){
        filled= filled;
    }
    public boolean isFilled(){
        return filled;
    }
    @Override
    public String toString() {
        return String.format("%s/n color is: %s", isFilled(), getColor());
    }
    public abstract double GetArea();
    public abstract double GetPerimeter();

}
