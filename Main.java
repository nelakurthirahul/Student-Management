import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);
        int choice;
do { 
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
        service.addStudent(new Student(id, name, dept, cgpa));
        break;

   case 2:
    service.displayStudents();
    break;
    
  case 3:
    System.out.print("Enter ID to search: ");
    int searchId = sc.nextInt();
    Student found = service.getStudentId(searchId);
    System.out.println(found != null ? found : "Student not found");
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
    }while(choice != 5);
    sc.close();
}
}