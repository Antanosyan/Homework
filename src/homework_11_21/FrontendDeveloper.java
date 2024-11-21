package homework_11_21;

import java.util.Random;

public class FrontendDeveloper extends Developer {
    public FrontendDeveloper(String name) {
        super(name);
    }

    @Override
    public void doesWork() {
        System.out.println(name + " is developing the frontend of the application.");
    }

    @Override
    public String[] getSkills() {
        return new String[]{"HTML", "CSS", "JavaScript", "React", "Vue.js"};
    }

    @Override
    public String[] useIDE() {
        return new String[]{"VS Code", "Sublime Text", "WebStorm"};
    }

    @Override
    public boolean doHealthCheck() {
        String baseUrl = "http://URL3.com/FE";
        System.out.println("Calling to API " + baseUrl + "/HealthCheck");
        return new Random().nextBoolean();
    }
}
