import java.util.HashMap;
import java.util.Map;
public class StudentService {
    private Map<Integer, Student> studentMap = new HashMap<>();
    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
        System.out.println("Student added");
    }
    public void displayStudents() {
        if(studentMap.isEmpty()) {
            System.out.println("No Student");
            return;
        }
        for(Student s: studentMap.values()) {
            System.out.println(s);
        }
    }
    public Student getStudentId(int id) {
        return studentMap.get(id);
    }
    public void deleteStudentByID(int id) {
        if(studentMap.containsKey(id)) {
            studentMap.remove(id);
            System.out.println("Student removed");
        } else {
            System.out.println("Student not found.");
        }
    }
}