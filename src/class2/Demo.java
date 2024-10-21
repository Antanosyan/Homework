package class2;

public class Demo {
    public static void main(String[] args) {
        SmartLight light1 = new SmartLight(false, "blue", 57);
        RemoteControl remote = new RemoteControl(light1);
        remote.reserLight();
        System.out.println(light1.getBrightness());
        System.out.println(light1.getColor());
        System.out.println(light1.isON());
        remote.changeBrightness(47);
        System.out.println(light1.getBrightness());
        SmartLight status = remote.getLightStatus();
        System.out.println("Current Status: IsOn - " + status.isON() + ", Brightness - " +
                status.getBrightness() + ", Color - " + status.getColor());
    }
}


