package kz.aitu.oop.examples.thirdtask;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius){
        super(radius, resize(int persent));
        radius=radius;
    }
    public void setRadius (double radius){
        radius=radius;
    }
    public int getRadius(){
        return radius;
    }

    @Override
    public double resize(int persent){

            return getRadius;
        }

}
