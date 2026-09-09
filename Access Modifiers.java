In Java , access modifiers controls the visibiity/accessbility of classes,methods,variables and constructors.

  There are 4 level of modifiers : Private , default , Public , Protected

  1.Private : //Accessibile only inside the same class.
    ex = 
      class Student {
           private int marks = 90;

           private void displayMarks() {
             System.out.println(marks);
           }
       } 
//Another class cannot directly access marks or displayMarks()

2.Default/Package- private : // When no access modifier is specified ,the member is accessible within the same package 

  ex = 
  class Student {
      int marks = 90;

      void displayMarks(){
        System.out.println(marks);
      }
} 
//Here,marks and displayMarks() can be accessed by other classes in the same package 

3.Protected : //Accessible within the same package and also by subclasses in other packages. 

class Animal {
  protected void sound() {
    System.out.println("Animal sound");
  }
} 

class Dog extends Animal {
  void display() {
    sound();
  }
} 

4.Public : //Accessible from anywhere , provided the class itself is accessible.

public class Student {
  public String name = "Akash" ; 

  public void display() {
    System.out.println(name);
  }
}
        
  
   
