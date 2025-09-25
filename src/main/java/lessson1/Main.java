package lessson1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Abdurashid",23, "Male", "Math" );
        student.studentInfo();

        System.out.println("Edited Student");
        student.setId(22);
        student.setName("");
        student.setAge(22);
        student.setGender("Female");
        student.setCourse("Dentist");

        System.out.println("  ID: " + student.id);
        System.out.println("  Name: " + student.name);
        System.out.println("  Age: " + student.age);
        System.out.println("  Gender: " + student.gender);
        System.out.println("  Course: " + student.course);




    }
}