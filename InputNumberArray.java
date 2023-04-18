package practice;

import java.util.Arrays;

public class InputNumberArray {
	
	private static void check(int[] arr, int toCheckValue)
	{
		boolean test=false;
		for(int element:arr) {
			if(element==toCheckValue)
			{
				test=true;
				break;
			}
		} System.out.println("Is " + toCheckValue + " present in the array: " + test);
	}	

	public static void main(String[] args) {		
		
		int arr[]= {8,9,4,3,5,12};
		int toCheckValue=12;
		System.out.println("Array: "+ Arrays.toString(arr) );
        check(arr,toCheckValue);
	}

}
