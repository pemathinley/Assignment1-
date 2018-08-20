import java.util.*;
public class reverse
{
	public static void main(String[] x)
	{ 
	int n,i,r,temp,s=0;
	Scanner sc= new Scanner(System.in);
	n=sc.nextInt();
	
	temp = n;
  
     while (temp != 0) {
         r = temp%10;
         s = s*10+r;
         temp = temp/10;
      }
	  
	  System.out.print(s);
			
	}
	
}	


 
     
	
     