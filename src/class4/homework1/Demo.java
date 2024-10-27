package class4.homework1;

public class Demo {
    public static void main(String[] args) {
        School school = new School(3, 220, 3, 2);
        school.addPupil("Armen", "petrosyan", 11);
        school.addPupil("Anahit", "Gevorgyan", 10);
        school.addPupil("Nerses", "Zimzimov", 14);
        school.printStudents();
        school.addPupil("Bob", "Williams", 14);

        System.out.println(school.getTeachersCount());

        String[] diseases = {"Arthritis", "COVID-19", "Flu", "Diabetes", "Heart Attack"};
        Hospital hospital = new Hospital(8, 240, 10, diseases);
        hospital.addMedicalStaff("Doctor Armen Poghosyan");
        hospital.addMedicalStaff("Nurse Anahit Aramyan");
        hospital.addMedicalStaff("Nurse Ani Antonyan");
        hospital.printMedicalStaff();
        System.out.println("-------------------");
        hospital.removeMedicalStaff("Nurse Ani Antonyan");
        hospital.printMedicalStaff();
    }
}
