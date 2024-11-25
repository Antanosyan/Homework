package homework_11_21;

import java.util.Random;

public class TestAutomationEngineer extends Developer {
    public TestAutomationEngineer(String name) {
        super(name);
    }

    @Override
    public void doesWork() {
        System.out.println(name + " writes and executes automated tests");
    }

    @Override
    public String[] getSkills() {
        return new String[]{"Selenium", "TestNG", "Java"};
    }

    @Override
    public String[] useIDE() {
        return new String[]{"IntelliJ IDEA", "Eclipse", "Selenium"};
    }

    @Override
    public boolean doHealthCheck() {
        return new Random().nextBoolean();
    }
}
