import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
   //Student 1
   Student student1 = new Student();

   student1.setName("Arnold Spielberg");
   student1.setGPA(4.0);
   student1.setMajor("Electrical Engineering");
   student1.print();

   //Student2
   Student student2 = new Student();

   student2.setName("Jiun Kim");
   student2.setGPA(4.3);
   student2.setMajor("Information System and Marketing");
   student2.print();

   double sum = 0;
   ArrayList<Double> gpas = new ArrayList<Double>();
   
   gpas.add(student1.gpa);
   gpas.add(student2.gpa);

   for(int i = 0; i < gpas.size(); i++)
   {
     sum += gpas.get(i);
   }

   System.out.println("The average GPA is: " + (sum / gpas.size()));

  }
}

class Student {
  String name;
  double gpa;
  String major;

  String getName() {
    return name;
  }
  double getGPA() {
    return gpa;
  }
  String getMajor() {
    return major;
  }
  void setName(String theName) {
    name = theName;
  }
  void setGPA(double theGPA) {
    gpa = theGPA;
  }
  void setMajor(String theMajor){
    major = theMajor;
  }

  void print(){
    System.out.println("The student's name is " + name);
    System.out.println("The student's GPA is " + gpa);
    System.out.println("The student's major is " +major);
  }
}

