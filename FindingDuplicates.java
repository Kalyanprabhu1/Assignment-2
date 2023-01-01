package assignment2;
import java.util.Arrays;
class kalyan{
	int[] ar= {84,89,81,85,83,86,82,80,84,81,88};
	public void sort() {
	  Arrays.sort(ar);
	   for(int elem:ar) 
	   {
	       System.out.print(elem+" ");
	   }
	   System.out.println();
	}
	public void Dup() {   
	    Arrays.sort(ar);
	    for(int i=1;i<=ar.length-1;i++) 
        {
		      if(ar[i]==ar[i-1])
             System.out.println("duplicate="+ar[i]);
		}
	}
}
  public class FindingDuplicates {
     public static void main(String[] args) {
		kalyan obj=new kalyan();
		obj.sort();
		obj.Dup();
		}
}
