public class Main{
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.addStudent(new Student(1, "Rahul", "ECE",8.5));
        service.addStudent(new Student(2, "Ankit", "CSE", 8.1));
        System.out.println("All Students:");
        service.displayStudents();
        System.out.println("\nSearching for student with ID 1:");
        Student found = service.getStudentId(1);
        System.out.println(found != null ? found : "Student not found");
        System.out.println("\nDeleting student with ID 2:");
        service.deleteStudentByID(2);
        System.out.println("\nAll student after deletion:");
        service.displayStudents();
    }
}