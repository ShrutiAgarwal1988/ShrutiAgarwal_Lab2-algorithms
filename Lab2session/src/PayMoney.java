import java.util.Scanner;
public class PayMoney {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number of transactions");
    int numberoftransactions=sc.nextInt();
    
    int a[]=new int[numberoftransactions];
    int i,m;
    System.out.println("enter the values of array");
    for(i=0;i<numberoftransactions;i++)
    {
    	a[i]=sc.nextInt();
    }
    System.out.println("enter the total number of targets that need to be achieved");
     m=sc.nextInt();
   int value;
   int flag=0;
    		while(m-- !=0)
        {
    			
        		System.out.println("enter value of transaction");
        	    value=sc.nextInt();
        	    int sum=0;
    			for(i=0;i<numberoftransactions;i++)
    			{
    			sum=sum+a[i];
    			if(sum >= value)
    		 	{
    		 		
    		 		System.out.println("target achieved after"+(i+1)+"transactions");
    		 		flag=1;
    		 		break;
    		 	}
    			
    			
    			}
        
    			 
    			if(flag == 0) {  
    				System.out.println("given target is not achieved");
    			}
	}
}

}   		
   		        
    			
         
     
 
	
