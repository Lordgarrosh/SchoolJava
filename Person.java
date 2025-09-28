package SchoolJava;
//the parent class
 class Person {
  private String name;
  private String contactNumb;
  
  Person (String name, String contactNumb) {
    this.name = name;
    this.contactNumb = contactNumb;
  }
  Person() {
  }
  //getters
  public String getName(){
    return name;
  }
  public String getContactNumb() {
    return contactNumb;
  }
  
  
  //setters 
  public void setName(String name) {
    this.name = name;
  }
  public void setContactNumb(String contactNumb) {
    this.contactNumb = contactNumb;
  }
  
  

  //toString method for putting data so wit will be printed and the child classes can inherit this
  @Override
  public String toString(){
    return "Name: " + this.getName() + "\n" +
    "Contact Number: " + this.getContactNumb() + "\n";
  }
}