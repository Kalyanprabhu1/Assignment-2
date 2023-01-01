package assignment2;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar={84,88,81,85,83,89,80,82};
	    int temp=0;
	    for(int j=0;j<=ar.length-1;j++) 
	    {
	    	    int min=j; 
	      for(int i=j+1;i<=ar.length-1;i++)
	      {
	    	  if(ar[i]<ar[min]) 
        	  {
        		 min=i;
        	  }
	       }
	    	     temp=ar[j];
	    	     ar[j]=ar[min];
	    	     ar[min]=temp;
         }
	    for(int elem:ar) 
		   {
		       System.out.print(elem+" ");
		   }
		  
		}
}

