package kz.aitu.oop.examples.assignment7;

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public void setX(int x){
        x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        y=y;
    }
    public int getY(){
        return y;
    }
    public void setXSpeed(int xSpeed){
        xSpeed=xSpeed;
    }
    public int getXSpeed(){
        return xSpeed;
    }
    public void setYSpeed(int y){
        ySpeed=ySpeed;
    }
    public int getYSpeed(){
        return ySpeed;
    }
 @Override
  public void moveUp() {
        y-=ySpeed;
 }
    public void moveDown() {
        y+=ySpeed;
    }
    public void moveRight() {
        x+=xSpeed;
    }
    public void moveLeft() {
        x-=xSpeed;
    }

}
