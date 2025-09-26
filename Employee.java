 package School;
 class Employee extends Person{
  private double salary;
  private String department;
  
  Employee (String name, String contactNumb, double salary, String department) {
    super(name,contactNumb);
   this.salary = salary;
   this.department = department;
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

//toString method for putting data
@Override
public String toString(){
  return super.toString() +
   "Salary: " + this.getSalary + "\n" + 
   "Department: " + this.getDepartment + "\n";
}
}