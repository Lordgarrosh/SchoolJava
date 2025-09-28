package SchoolJava;
class Faculty extends Employee{
  private boolean status;
  
  Faculty(String name, String contactNumber, double salary, String department, boolean status) {
     //use the super class to get the data from the parent class
    super(name, contactNumber, salary, department);
    this.status = status;
  }
Faculty() {
}
  
  //getters 
  public boolean getStatus() {
    return status;
  }
  
  //setters
  public void setStatus(boolean status) {
    this.status = status;
  }
  
  //tostring methods
  public String toString() {
    return  super.toString() + "\n" +
    "Status: " + ((this.getStatus()) ? this.getName() + " is regular" : this.getName() + " is currently not regular");
  }
}