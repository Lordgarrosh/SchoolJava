 class Person {
  private String name;
  private String contactNumber;
  
  Person (String name, String contactNumb) {
    this.name = name;
    this.contactNumb = contactNumb;
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
}