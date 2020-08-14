import processing.core.PApplet;
import processing.core.PVector;



public class vectorCircle extends PApplet {

    public static void main(String[] args ) {

        PApplet.main("vectorCircle");
    }

    PVector circle = new PVector(500,500);
    PVector circle2 = new PVector(500,500);
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
        circle.setMag(50);
        circle2.setMag(50);
        circle.rotate((float)0.0072);
        circle2.rotate((float)0.05);

        pushMatrix();
        translate(250,250);
    ellipse(circle.x,circle.y,20,20);

        translate(circle.x,circle.y);
        ellipse(circle2.x,circle2.y,5,5);
        popMatrix();

    }
}
