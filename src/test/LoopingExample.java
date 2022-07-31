package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 2;
		
		while (num<=10) {
			
			if(num==6) {
				num = num+2;
				//continue;
				break;	
				
			}//else {
				System.out.println(num);
				//}
		
		 // num++;
		
		num = num+2;
		
	}
System.out.println("After While Loop");

 //for loop

  for(int index=1;index<=10;index++){
	  if(index==6) {
		  continue;
	  }
	  System.out.println(index);
  }
 
  System.out.println("After FOR lOOP");
  int[] array1 = {10,20,30,40,50,60};
  
  for(int num1:array1) {
	  System.out.println(num1);
  }
  System.out.println("After For Each Loop");
int[] array2 = {2,3,4,5,6};
//int i=0;

for(int i =0; i<array2.length; i++ ) {
	System.out.println(array2[i]);
	
}




	}
}



