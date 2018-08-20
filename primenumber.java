import java.util.*;
public class primenumber
{
	public static void main(String[] x)
	{
		

		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int flag;
		for(int i=1 ; i<=n ; i++){
			flag=0;
			for(int j=2 ; j<=(i/2) ; j++)
			{
				if( i%j == 0){
					flag=1;
					break;
				}
			}
			if(flag == 0){
				System.out.println(i + " ");
			}
		}
	}

}
			
	

 
     
	
     