Arrays : stores elements of same data types in a contiguous memory allocation.
  //Syntax : datatype[] name ;
  //eg : int[] age ;
  Declaration: 
  int[] rollNums = new int[3] ;
//int[] : datatype of array
//rollNums : identifiers name of array 
//new : special keyword = Allocate memory in heap.
//int[3] : size of array .

indexing : starts from 0
  //eg : rollnums[0] = 101 ;
  //.    rollnums[1] = 102 ;
  //.    rollnums[2] = 102 ; 
  System.out.println(rollnums[0]) ; //101
  System.out.println(rollnums[1]) ; //102
  System.out.println(rollnums[2]) ; //103

//Using loops to iterate in Array
//
int[] rollNums = new int[3] ;
int x = 101 ;
for(int i = 0 ; i < 3; i++ ) {
  rollNums[i] = x ;
  x++ ;
}
System.out.println(x);
} 
//Output : 104 

// print size of array 
int[] rollNums = new int[3] ;
int x = 101 ;
for(int i = 0 ; i < rollNums.length; i++ ) {
  rollNums[i] = x ;
  x++ ;
}
System.out.println(rollNums.length);
} 
//output : 3
