package runTypeException;

import java.util.Scanner;
public class NumberFormatlException_1 {

  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str="100";
	  int i=Integer.parseInt(str);
	  System.out.println(i);
	  String str1="abc";
	  int[] arr=new int[5];
	  try {
		 int i1=Integer.parseInt(str1);
		 System.out.println(i1);
	  }catch(NumberFormatException e) {
		  e.printStackTrace();
	  }finally {
		  try {
			  for(int j=0;j<5;j++) {
				  arr[j]=sc.nextInt();
			  }
			  for(int j=0;j<5;j++) {
				  System.out.println(arr[j]);
			  }
			  System.out.println(arr[6]);
		  }catch(Exception e1) {
			  e1.printStackTrace();
		  }
		  
	  }
	  
	
  }
}
