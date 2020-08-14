import processing.core.PApplet;
import processing.core.PVector;



public class vectorCircle extends PApplet {

    public static void main(String[] args ) {

        PApplet.main("vectorCircle");
    }

    PVector circle = new PVector(250,250);
    PVector circle2 = new PVector(250,250);
public void settings(){

        size(500,500);
}

    @Override
    public void setup() {
        super.setup();




    }

    @Override
    public void draw() {
imageMode(3);
clear();
        pushMatrix();
        translate(250,250);
    ellipse(circle.x,circle.y,20,20);
    ellipse(circle.x,0,20,20);
        ellipse(0,circle.y,20,20);
popMatrix();

        circle.setMag(50);
        circle.rotate((float)0.0069);
    }
}
