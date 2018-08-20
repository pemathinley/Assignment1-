import java.util.*;
public class armstrong1
{
	public static void main(String[] x)
	{ 
	int n,a,i,c=0,r,temp;
	double s=0;
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	
	temp = n;
  
      while (temp != 0) {
         c++;
         temp = temp/10;
      }
	  
	  temp = n;
 
      while (temp != 0) {
         r = temp%10;
         s = s+ Math.pow(r,c);
         temp = temp/10;
      }
	  
	  
	   if (n == s)
	   {
         System.out.println(n + " is an Armstrong number.");
	   }
      else
	   {
         System.out.println(n + " isn't an Armstrong number.");         
       }
			
	}
	
}	


 
     
	
     