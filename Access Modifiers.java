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

2.Default/Package- private : // When no access modifier 
   
