package SchoolJava;
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
  
  //enter users info
  
  //setters 
  public void setName(String name) {
    this.name = name;
  }
  public void setContactNumb(String contactNumb) {
    this.contactNumb = contactNumb;
  }
  
  
public Person test() {
  System.err.println("ts");
return new Student("asd", "asd", "", 1);
}

  
  @Override
  public String toString(){
    return "Name: " + this.getName() + "\n" +
    "Contact Number: " + this.getContactNumb() + "\n";
  }
}