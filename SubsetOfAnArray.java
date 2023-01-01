package assignment2;
public class SubsetOfAnArray {
public static void main(String[] args){
		
				int[] a= {89,88,81,85,83,82,80,84};
			    int n=a.length-1;
				int[] b= {90,84,81,85};
				int x=b.length-1;
				boolean king=false;
				   for(int i=0;i<=x;i++) {
					 for(int j=0;j<=n;j++) {
						if(b[i]!=a[j]) 
						{  
							if(j==n) 
							{
							   System.out.println("Not A Subset");
							      break;
							}
						}
						else 
						{   
							if(i==x) 
							{
							   System.out.println("Subset");
							     break;
							}
					    }	
				  }continue;	
             }
       }				
}			
				
				
				
				