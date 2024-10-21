package class2;

public class RemoteControl {
    private SmartLight light;

    public RemoteControl(SmartLight light) {
        this.light = light;
    }

    public void reserLight() {
        light.setBrightness(50);
        light.setON(false);
        light.setColor("white");
    }

    public SmartLight getLightStatus() {
        return light;
    }

    public void changeBrightness(int newBrightness) {
        light.setBrightness(newBrightness);
    }


}
