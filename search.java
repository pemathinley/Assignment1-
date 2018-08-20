import java.util.*;
public class search
{
	public static void main(String[] x)
	{ 
	int i,search,flag=0;
	Scanner sc= new Scanner(System.in);
	
	int y[]=new int[7];
	for(i=0;i<7;i++)
	{
			y[i]=sc.nextInt();
    }   
	
	Scanner se= new Scanner(System.in);
	search=se.nextInt();
	
	
	for(i=0;i<7;i++)
	{ 
       
		   if(search==y[i])
		   {
			flag=1;
			
		   }
	  
	   
	}
if (flag==1)
	   {
		   System.out.print("Number found");
	   }
else 
{
	System.out.print("Number not found");
}
	
	}
	
}	


 
     
	
     