import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class StudentService {
    private Map<Integer, Student> studentMap = new HashMap<>();
    private final String FILE_NAME = "students.txt";
    public StudentService() {
        loadFromFile();
    }
    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
        saveToFile();
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
        if(studentMap.remove(id) != null) {
            saveToFile();
            System.out.println("Student removed");
        } else {
            System.out.println("Student not found.");
        }
    }
    private void saveToFile() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for(Student s : studentMap.values()) {
                bw.write(s.getId() + "," + s.getName() + "," + s.getDepartment() + "," + s.getCgpa());
                bw.newLine();
            }
        } catch(IOException e) {
            System.out.println("Error saving data.");
        }
    }
    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if(!file.exists()) return;

        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Student s = new Student(Integer.parseInt(data[0]),data[1],data[2],Double.parseDouble(data[3]) 
            );
            studentMap.put(s.getId(),s);
            }
        } catch(IOException e) {
            System.out.println("Error loading data");
        }
    }
}