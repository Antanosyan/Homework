package homework_11_21;

abstract class Developer extends ITWorker {
    public Developer(String name) {
        super(name);
    }

    public abstract boolean doHealthCheck();
}
