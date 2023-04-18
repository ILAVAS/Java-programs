package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondSmallest{
	public static int getSecondSmallest (int[] arr)
	{
	List<Integer>array=new ArrayList<Integer>();
	for (Integer it:arr) {	
	array.add (it);
	}

	Collections.sort (array);
	int result = array.get(1);
	return result;
	}

	public static void main(String[] args) 
	{

	int[] arr = {12,54,18,76,89};
	
    System.out.println("Second smallest element is: " +getSecondSmallest(arr));



	}
}