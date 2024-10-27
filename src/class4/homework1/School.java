package class4.homework1;

public class School extends Building{
    private int maxStudents;
    private Pupil[] pupils;
    private int studentCount;
    private int teachersCount;

    public School(int drainageOutlets, int voltage, int maxStudents, int teachersCount) {
        super(drainageOutlets,voltage);
        this.maxStudents = maxStudents;
        this.teachersCount = teachersCount;
        this.pupils = new Pupil[maxStudents];
        this.studentCount = 0;
    }

    public int getTeachersCount() {
        return teachersCount;
    }

    public void addPupil(String firstName, String lastName, int age) {
        if (studentCount >= maxStudents) {
            System.out.println("Cannot add student");
            return;
        }
        pupils[studentCount] = new Pupil(firstName, lastName, age);
        System.out.println("Added: " + pupils[studentCount].printStudentInfo()); // Debugging statement
        studentCount++;
    }

    public void printStudents() {
        if (studentCount == 0) {
            System.out.println("No student");
        } else {
            System.out.println("Pupils:");
            for (int i = 0; i < studentCount; i++) {
                System.out.println(pupils[i].printStudentInfo()); // This will call the overridden toString() method
            }
        }
    }
}
