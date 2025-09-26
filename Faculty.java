package SchoolJava;
class Faculty extends Employee{
  private boolean status;
  
  Faculty(String name, String contactNumber, double salary, String department, boolean status) {
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
    "Status: " + ((this.getStatus()) ? this.getName() + " is available" : this.getName() + " is currently not available");
  }
}