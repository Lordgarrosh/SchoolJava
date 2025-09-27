package SchoolJava;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    
    boolean isRunning = true;
    while (isRunning) {
      System.out.print("Press E for Employee, F for Faculty or S for Student: ");
      char userRole = Character.toUpperCase(scan.next().charAt(0));
      if (userRole != 'E' && userRole != 'F' && userRole != 'S') {
        System.out.println("Please enter only from the choices given only");
        continue;
      }
      scan.nextLine();
      System.out.print("Enter your name: ");
      String name = scan.nextLine();
      System.out.print("Enter your Contact Number: ");
      String contactNumber = scan.nextLine();
      double salary;
      String department;
      char status;
      String program;
      int yearLevel;
      try {
      switch (userRole) {
        case 'E' : 
        System.out.print("Enter your salary: " );
         salary = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter your Department: ");
         department = scan.nextLine();
        Employee employee = new Employee(name, contactNumber, salary, department);
        System.out.println( employee.toString());
        break;
        case 'F' :
        System.out.print("Enter your salary: " );
         salary = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter your Department: ");
         department = scan.nextLine();
        System.out.println("Press Y if you are Regular and N if not");
         status = Character.toUpperCase(scan.next().charAt(0));
         if (status == 'Y' || status == 'N') {
          boolean facultyStatus = status == 'Y'  ? true : false;
          System.out.println(facultyStatus);
        Faculty faculty = new Faculty(name, contactNumber, salary, department, facultyStatus);
        System.out.println(faculty);
         }
         else {
          System.out.println("Please enter proper intput only");
          continue;
         }
         break;
        case 'S' : 
          System.out.print("Enter your enrolled program: ");
          program = scan.nextLine();
          System.out.print("Enter your current year level: ");
          yearLevel = scan.nextInt();
          Student student = new Student(name, contactNumber, program, yearLevel);
          System.out.println(student);
        break;
        default : 
        System.out.println("Please enter a proper input only");
        continue;
      }
    }catch (InputMismatchException e) {
      System.out.println("Please enter a proper input");
      continue;
    }
      
    }
  }
}