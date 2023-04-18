package practice;

public class LargestElement {

	public static void main(String[] args) {
    int []arr=new int[] {14,16,78,92,89};
		int lar=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>lar)
			lar=arr[i];

			}
		System.out.println("Largest element in an array:" +lar);
		}
		
		
		
		
		
		
		
		
	}


