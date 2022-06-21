import processing.core.PApplet;

public class main extends PApplet {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;

    public static void main(String[] args) {
        PApplet.main("main",args);
    }
    Ball firstBall=new Ball(this,0,HEIGHT/5, DIAMETER);
    Ball secondBall=new Ball(this,0,2*(HEIGHT/5),DIAMETER);
    Ball thirdBall=new Ball(this,0,3*(HEIGHT/5),DIAMETER);
    Ball fourthBall=new Ball(this,0,4*(HEIGHT/5),DIAMETER);
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        firstBall.drawCircle(1);
        secondBall.drawCircle(2);
        thirdBall.drawCircle(3);
        fourthBall.drawCircle(4);
    }
}
