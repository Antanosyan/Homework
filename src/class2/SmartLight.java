package class2;

public class SmartLight {
    private boolean isOn = false;
    private int brightness = 45;
    private String color = "blue";

    public SmartLight() {
        this.isOn = isOn;
        this.brightness = brightness;
        this.color = color;
    }

    public void toggle() {
        isOn = !isOn;        // Return the new state (on/off)
    }

    public boolean isOn() {
        return isOn = !isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("Invalid brightness value. Must be between 0 and 100.");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
