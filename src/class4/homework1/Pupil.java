package class4.homework1;

public class Pupil {
    private  String firstName;
    private  String lastName;
    private  int age;

    public Pupil(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String printStudentInfo() {
        return  "Pupil: " + firstName + " " + lastName + ", Age: " + age;
    }
}
