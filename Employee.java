 package SchoolJava;
 class Employee extends Person{
  private double salary;
  private String department;
  
  Employee (String name, String contactNumb, double salary, String department) {
    //use the super class to get the data from the parent class
    super(name,contactNumb);
   this.salary = salary;
   this.department = department;
  }
  
  Employee() {
  }
  //getters 
  public double getSalary() {
    return salary;
  }
 public String getDepartment() {
   return department;
 }

//setters
public void setSalary(double salary) {
  this.salary = salary;
}
public void setDepartment(String department) {
  this.department = department;
}


@Override
public String toString(){
  return super.toString() +
   "Salary: " + String.format("%.2f", this.getSalary())  + "\n" + 
   "Department: " + this.getDepartment();
}
}