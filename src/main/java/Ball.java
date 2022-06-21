import processing.core.PApplet;

public class Ball {
    public PApplet mainClass;
    private int diameter;
    private int yLocation;
    private int xLocation;
    public Ball(PApplet mainClass,int xLocation, int yLocation, int diameter)
    {
        this.mainClass=mainClass;
        this.xLocation=xLocation;
        this.yLocation=yLocation;
        this.diameter=diameter;

    }
    public void drawCircle(int speed)
    {
//        System.out.println(xLocation+" "+yLocation+" "+diameter+" "+diameter);
        mainClass.ellipse(xLocation,yLocation,diameter,diameter);
        xLocation=xLocation+speed;
    }
}
