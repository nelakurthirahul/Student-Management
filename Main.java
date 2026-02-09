public class Main{
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.addStudent(new Student(1, "Rahul", "ECE",8.5));
        service.addStudent(new Student(2, "Ankit", "CSE", 8.1));
        service.displayStudents();
    }
}