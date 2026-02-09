import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
do { 
    try {
System.out.println("Student Management Menu");
System.out.println("1. Add Student");
System.out.println("2. Display All Students");
System.out.println("3. Search Student By ID");
System.out.println("4. Delete Student By ID");
System.out.println("5. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();
switch(choice) {
    case 1:
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter Dept:");
        String dept = sc.nextLine();
        System.out.print("Enter GPA:");
        double cgpa = sc.nextDouble();
        if(cgpa < 0 || cgpa > 10) {
            System.out.println("Invalid CGPA!");
            break;
        }
        service.addStudent(new Student(id, name, dept, cgpa));
        break;

   case 2:
    service.displayStudents();
    break;
    
  case 3:
    System.out.print("Enter ID to search: ");
    int searchId = sc.nextInt();
    System.out.println(
        service.getStudentId(searchId) != null ?
        service.getStudentId(searchId) : "Student not found"
    );
    break;
    
  case 4:
    System.out.print("Enter ID to delete: ");
    int delId = sc.nextInt();
    service.deleteStudentByID(delId);
    break;
    
   case 5:
    System.out.println("Exit");
    break;
    
   default:
    System.out.println("Invalid choice, try again!"); 
}
} catch(Exception e) {
    System.out.println("Invalid input! Please enter correct data.");
    sc.nextLine();
}
}while(choice != 5);
    sc.close();
}
}