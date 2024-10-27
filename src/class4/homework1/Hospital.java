package class4.homework1;

public class Hospital extends Building{
    private int wards;
    private String[] diseasesTreated;
    private String[] newDiseasesTreated;
    private String[] medicalStaff;
    private int staffCount;

    public Hospital(int drainageOutlets, int electricityVoltage, int wards, String[] diseases) {
        super(drainageOutlets, electricityVoltage);
        this.wards = wards;
        this.diseasesTreated = diseases;
        this.medicalStaff = new String[5];
        this.staffCount = 0;
    }

    public void addMedicalStaff(String name) {
        if (staffCount >= medicalStaff.length) {
            System.out.println("Cannot add more medical staff. Maximum capacity reached.");
        } else {
            medicalStaff[staffCount] = name;
            staffCount++;
        }
    }

    public void removeMedicalStaff(String name) {
        boolean found = false;
        for (int i = 0; i < staffCount; i++) {
            if (medicalStaff[i] == name) {

                medicalStaff[staffCount - 1] = null; // Remove last element
                staffCount--;
                found = true;
                System.out.println("Removed employee: " + name);
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found: " + name);
        }
    }

    public void printMedicalStaff() {
        if (staffCount == 0) {
            System.out.println("No medical staff available.");
        } else {
            System.out.println("Medical Staff:");
            for (int i = 0; i < staffCount; i++) {
                System.out.println(medicalStaff[i]);
            }
        }
    }
}
