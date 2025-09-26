package SchoolJava;
import java.util.Scanner;
public class Main {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    
    boolean isRunning = true;
    while (isRunning) {
      System.out.print("Press E for Employee, F for Faculty or S for Student");
      char userRole = scan.next().charAt(0);
      scan.nextLine();
      System.out.print("Enter your name: ");
      String name = scan.nextLine();
      System.out.print("Enter your Contact Number");
      String contactNumber = scan.nextLine();
      switch (userRole) {
        case 'E' : 
        System.out.print("Enter your salary: " );
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter your Department: ");
        String department = scan.nextLine();
        Employee employee = new Employee(name, contactNumber, salary, department);
        System.out.println( employee.toString());
        
        break;
      }
      
    }
  }
}