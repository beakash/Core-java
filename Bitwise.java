Integer.toBinaryString : this keyword is use to show binary values of integer 

  //we can use bitwise operators on Operands( byte, short, int , long )

  OPerators : . and operator &
              . or operator |
              . xor ^ 
              . not ~ 
              . left shift <<
              . right shift >>
              . unsigned right shift >>> 

  //and operator & : means multiple of of binary values

  ex : 
      int c = 5 & 4 ;
      System.out.println(c) ;
output : 4 // & operator take binary values of 5 , 4 and multiple them and print the integer of that binary value.

//Or operator means | : means if any bit is 1 then it will give 1 .

  ex : 
   int c = 5 & 7 ;
   System.out.println(c) ;

output : 7 

  //xor ^   : means same bit gives 0 and different bit gives 1 .

  ex:  int c = 5 & 7 ;
   System.out.println(c) ; 

  output : 2

  // not Operator ~ : it flips 0 -> 1
                               1 -> 0 
  Shortcut =  ~x = -(x + 1 ) 
  ex = 
    int a = 5;
  System.out.println( ~a) ;
  output : -6 

  //Left shift <<  :  left shift number k bits ko left side position krta hai
  ex : 
    int a = 5 ;
    System.out.println( a << 1 ) ;
   output : 
   10 // 101 ko leftshift kra to 1010 which is the binary value of 10 

  //Right shift >> :  Right shift number k bits ko Right side position krta hai 
     ex : 
       int a = 5;
       System.out.println( a >> 1 ) ;
       output : 2 // 101  ko Rightshift kra to 10 which is the binary value of 2 
