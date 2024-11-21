package homework_11_21;

public class ProjectManager extends ITWorker {
    public ProjectManager(String name) {

        super(name);
    }

    @Override
    public void doesWork() {
        System.out.println(name + " is managing");
    }

    @Override
    public String[] getSkills() {

        return new String[]{"Leadership", "Project Management", "Communication"};
    }

    @Override
    public String[] useIDE() {
        return new String[]{"JIRA", "Trello"};
    }

    @Override
    public boolean doHealthCheck() {
        return false;
    }
}
