//The purpose of this code is to test the object Fan.
public class TestFan {
    public static void main(String[] args) {

        //This creates fan1
        Fan fan1 = new Fan();
        //This sets fan1 speed
        fan1.setSpeed(Fan.FAST);
        //This sets fan1 radius
        fan1.setRadius(10);
        //This sets fan1 color
        fan1.setColor("yellow");
        //This sets fan1 to on or off
        fan1.setOn(true);

        //This creates fan2
        Fan fan2 = new Fan();
        //This sets fan2 speed
        fan2.setSpeed(Fan.MEDIUM);
        //This sets fan2 radius
        fan2.setRadius(5);
        //This sets fan2 color
        fan2.setColor("blue");
        //This sets fan2 to on or off
        fan2.setOn(false);

        //This prints out both fan1 and fan2
        System.out.println(fan1);
        System.out.println(fan2);
    }
}