package class2;

public class Demo {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        RemoteControl remote = new RemoteControl(light);

        // initial state of the light
        System.out.println("light is On: " +
                light.isOn() + ", Brightness: " +
                light.getBrightness() + ", Color: " +
                light.getColor());

        // Toggle the light on
        remote.getLightStatus().toggle();
        System.out.println("Light toggled  On: " + light.isOn());

        // Change brightness
        remote.changeBrightness(75);
        System.out.println("New Brightness: " + light.getBrightness());

        // Reset light
        remote.resetLight();
        System.out.println("Light after reset -> On: " +
                light.isOn() + ", Brightness: " +
                light.getBrightness() + ", Color: " +
                light.getColor());
    }
}

