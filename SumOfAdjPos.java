package practice;

public class SumOfAdjPos {	
				
	public static int findMaximumPairs(int[]arr) {
    		
	int totalpairs=0;
	for(int i=0;i<arr.length-1;i++)
	{
		if((arr[i]+arr[i+1])%2==0)
		{
			totalpairs++;
			i++;
		}
	}
		return totalpairs;
	}
	public static void main (String[]args)
	{
		int arr[]= {13,15,34,15,15};
		System.out.println(findMaximumPairs(arr));
		
		
		
		
		
		
		
		
	}

}
