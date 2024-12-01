//The purpose of this code is to create an object known as Fan.
public class Fan {
    //These are the constants of the Fan speed
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //Private data bank that consists of speed, radius, or if the fan is on or off, and color
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //This is the defalt fan otherwise known as the no-arg constructor
    public Fan () {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    //These are the Accessor methods
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    //These are the Mutator methods
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //This helps keeps compileing errors down
    @Override
    //This is the tostring method and it changes depending on whether the Fan is on or off
    public String toString() {
        //This loop determines if the fan is on and then prints fan speed, color, and radius
        if (on) {
            return "The Fan's speed is: " + speed + ", and it's color is: " + color + ", and it's radius is: " + radius;
        }
        //While this determines the fan is off and then prints color, radius, and Fan is off
        else {
            return "The Fan's color is: " + color + ", and it's radius is: " + radius + ", and the Fan is off";
        }
    }
}