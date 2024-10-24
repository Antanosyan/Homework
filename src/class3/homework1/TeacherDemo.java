package class3.homework1;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher.setBaseParameters(4, 1500); // K = 2.5, MIN_SALARY = 1500

        Teacher teacher1 = new Teacher("Anna", "Smith", 1.7); // W = 1.2
        Teacher teacher2 = new Teacher("Max", "Johnson", 4.5); // W = 1.5

        teacher1.displaySalary();
        teacher2.displaySalary();
    }
}
