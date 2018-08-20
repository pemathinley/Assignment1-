import java.util.*;

public class sortarray
{
	public static void main(String[] x)
	{
		int y[] = new int[] {1,1,1,1,0,0,1,0};
		int i , j , l;
		l = y.length;
		for(i=0 ; i<l ; i++)
		{
			for(j = 0 ; j<l ; j++)
			{
				if( y[j] > y[i] )
				{
					int t = y[j];
					y[j] = y[i];
					y[i] = t;
				}
			}			
		}
		
				for(i=0;i<l;i++)
				{
			System.out.print(y[i] + " ");
				}
	}
}


 
     
	
     