package homework_11_21;

abstract class ITWorker {
    protected String name;

    public ITWorker(String name) {
        this.name = name;
    }

    public abstract void doesWork();

    public abstract String[] getSkills();

    public abstract String[] useIDE();

    public abstract boolean doHealthCheck();
}
