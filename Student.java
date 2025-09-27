 package SchoolJava;
 class Student extends Person{
   private String program;
   private int yearLevel;
   
   Student(String name, String contactNumb, String program, int yearLevel) {
     super(name, contactNumb);
     this.program = program;
     this.yearLevel = yearLevel;
   }
   Student() {
   }
   
   // getters
   public String getProgram() {
     return program;
   }
   public int getYearLevel() {
     return yearLevel;
   }
   
   //setters 
   
   public void setProgram(String program) {
     this.program = program;
   }
   
   public void setYearLevel(int yearLevel) {
     this.yearLevel = yearLevel;
   }
   
   
   
   //tostrint method 
   @Override
   public String toString() {
     return super.toString() + 
     "Program: " + this.getProgram() + "\n" +
     "Year Level: " + this.getYearLevel() ;
   }
}