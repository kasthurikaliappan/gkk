package Strings;
import java.util.*;
public class digitsofinteger {
 public static void main(String[] args) {
	 int a,b,k,i=1; int counter = 0;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the integer");
	 a=s.nextInt();
	 b=a;
	 while(a>0)
	 {
		 a=a/10;
		 counter++;
		 
	 }
	 while(b>0)
	 {
		 k=b%10;
		 System.out.println("digital of integer"+k);
		 b=b/10;
		 counter--;
		 
		 
	 }
	 
		
	}

}

