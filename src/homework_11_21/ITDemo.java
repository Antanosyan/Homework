package homework_11_21;

import java.util.Arrays;

public class ITDemo {
    public static void main(String[] args) {

        ITWorker[] itWorkers = {
                new ProjectManager("Bob"),
                new TestAutomationEngineer("Armen"),
                new FrontendDeveloper("Nike"),
                new FullStackDeveloper("Sona")};

        for (ITWorker el : itWorkers) {
            el.doesWork();
            System.out.println(Arrays.toString(el.getSkills()));
            System.out.println(Arrays.toString(el.useIDE()));
            System.out.println("---------------");
        }
        System.out.println("next list:\n");
        ITWorker[] devWorkers = {
                new TestAutomationEngineer("Bob"),
                new FrontendDeveloper("Max"),
                new FullStackDeveloper("Anton")};

        for (ITWorker developer : devWorkers) {
            System.out.println(developer.name + " health check : " + developer.doHealthCheck());
            System.out.println("-----------");
        }
    }
}
