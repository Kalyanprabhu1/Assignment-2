package assignment2;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar= {89,88,81,85,83,82,80,84};
		for(int i=0;i<=ar.length-1;i++) {
			for(int j=1;j<=ar.length-1;j++) {
				if(ar[j]<ar[j-1]) { 
					int temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
					}
				} 
		}
		for(int elem:ar)
		{
			System.out.print(elem+" ");
		}
	}
}

	
