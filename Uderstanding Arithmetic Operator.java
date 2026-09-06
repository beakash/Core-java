public class Operators{
  public static void main(String[] args){
    int yourSalary = 1000;
    int increament = 500;
    int deduction = 500;
    int monthlyTotal = yourSalary + increament;
    int monthlyTotal = yourSalary - deduction;
    int yearlyTotal = monthlyTotal * 12;
    int perChild = yearlyTotal / 3; 
    System.out.println(perChild); 

    //Modulo  Operator returns remainder
    int a = 5;
    int b = 6;
    int c = a % b;
    System.out.println(c); 

    //Addition 
     int a = 3;
    double b = 10.11;
    double c = a + b;
    System.out.println(c);

    //Float and Long addition
       float a = 10.1f;
	     long b = 12345;
	     float c = a + b; //float will considerd because float has a scientific notation ;
		   System.out.println(c); 
   //Long and integer 

    long a = 438347634;
    int  a = 438347634; //Not valid due to out of range of integer
    long i = a * 24223;
    System.out.println(i); 

    //Operator precedence : based on rules of BODMAS.
    // Compound assignment operator : Shorthand method to arithmetic and bitwise operation with assignment
     ex = int a = 10;
           a-= 1;
           a%= 2; 
    ex = byte a = 5;
         a += 1;
          System.out.println(a);
  
    
   }
} 
