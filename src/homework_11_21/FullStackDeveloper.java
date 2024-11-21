package homework_11_21;

import java.util.Random;

public class FullStackDeveloper extends Developer {
    public FullStackDeveloper(String name) {
        super(name);
    }

    @Override
    public void doesWork() {

        System.out.println(name + " is developing frontend and backend.");
    }

    @Override
    public String[] getSkills() {
        return new String[]{"Java", "Node.js", "React"};
    }

    @Override
    public String[] useIDE() {
        return new String[]{"IntelliJ IDEA", "Sublime Text", "VS Code", "GitHub"};
    }

    @Override
    public boolean doHealthCheck() {
        String baseUrl1 = "http://URL1.com/BE";
        System.out.println("Calling to API " + baseUrl1 + "/HealthCheck");
        boolean beHealthCheck = new Random().nextBoolean();

        String baseUrl2 = "http://URL2.com/FE";
        System.out.println("Calling to API " + baseUrl2 + "/HealthCheck");
        boolean feHealthCheck = new Random().nextBoolean();

        return beHealthCheck && feHealthCheck;
    }
}
