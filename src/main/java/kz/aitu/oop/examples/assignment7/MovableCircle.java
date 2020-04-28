package kz.aitu.oop.examples.assignment7;

public class MovableCircle implements Movable {
    private MovablePoint center;
    private int radius;

    public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius){
        center=new MovablePoint(x, y, xSpeed, ySpeed );}

        public void setRadius (double radius){
            radius=radius;
        }
        public int getRadius(){
            return radius;
        }


    @Override
    public void moveUp() {
        center.y-=center.ySpeed;
    }
    public void moveDown() {
        center.y+=center.ySpeed;
    }
    public void moveRight() {
        center.x+=center.xSpeed;
    }
    public void moveLength() {
        center.x-=center.xSpeed;
    }

}
