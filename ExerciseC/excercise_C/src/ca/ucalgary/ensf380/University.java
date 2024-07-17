package ca.ucalgary.ensf380;

public class University {
    public static void main(String[] args) {
        Address addrProf = new Address("123 Main St", "Calgary", "AB", "T2N 1N4", "Canada");
        Address addrStudentA = new Address("456 Elm St", "Calgary", "AB", "T2N 1N4", "Canada");
        Address addrStudentB = new Address("789 Oak St", "Calgary", "AB", "T2N 1N4", "Canada");

        Professor profSmith = new Professor("Dr. Smith", "403-123-4567", "smith@ucalgary.ca", addrProf, 90000.0);
        Student studentA = new Student("Shivansh Sharma", "403-987-6543", "shivansh@.ucalgary.ca", addrStudentA, profSmith, 85.0);
        Student studentB = new Student("Mohit Narula", "403-654-3210", "mohit@.ucalgary.ca", addrStudentB, profSmith, 70.0);

        System.out.println(profSmith);
        System.out.println(studentA);
        System.out.println(studentB);
    }
}