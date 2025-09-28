package SchoolJava;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CollegeList {
  //the main class
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    
    
    while (true) {
      System.out.print("Press E for Employee, F for Faculty, S for Student and B to exit the program: ");
      //to make sure that the userinput will be uppercase
      char userRole = Character.toUpperCase(scan.next().charAt(0));
     if (userRole == 'B') {
      System.out.println("Exiting the program...");
      System.out.println("Goodbye");
      break;
     }
      else if (userRole != 'E' && userRole != 'F' && userRole != 'S') {
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
      //to catch if there is inputmismatch exeption
      try {
      switch (userRole) {
        case 'E' : 
        System.out.print("Enter your salary: " );
         salary = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter your Department: ");
         department = scan.nextLine();
         System.out.println("---------------------------");
        Employee employee = new Employee(name, contactNumber, salary, department);
        System.out.println(employee);
        System.out.println("---------------------------");
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
          System.out.println("---------------------------");
        Faculty faculty = new Faculty(name, contactNumber, salary, department, facultyStatus);
        System.out.println(faculty);
        System.out.println("---------------------------");
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
          System.out.println("---------------------------");
          Student student = new Student(name, contactNumber, program, yearLevel);
          System.out.println(student);
          System.out.println("---------------------------");
        break;
      }
    }catch (InputMismatchException e) {
      System.out.println("Please enter a proper input");
      scan.nextLine();
      continue;
    }
      
    }
  }
}