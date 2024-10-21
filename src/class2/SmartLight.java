package class2;

public class SmartLight {
    private boolean isON;
    private int brightness;
    private String color;

    public SmartLight(boolean isON, String color, int brightness) {
        this.isON = isON;
        this.color = color;
        this.brightness = brightness;
    }

    public boolean isON() {
        return isON;
    }

    public void setON(boolean ON) {
        isON = ON;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("invalid brightness");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void toggle() {
        isON = !isON;
        if (isON) {
            System.out.println("light is turned on");
        } else {
            System.out.println("light is turned off");
        }
    }
}
