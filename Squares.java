package practice;

import java.util.HashMap;
import java.util.Map;

public class Squares {

	
	public static void main(String[] args)
		{
			int[] arr = {4,64,13,75};
			System.out.println(getSquares(arr));
			
		}
	public static Map<Integer,Integer>getSquares(int[] arr)
		{
			Map<Integer,Integer> map = new HashMap<>();
			for(int i=0;i<arr.length;i++)
			{
				map.put(arr[i],arr[i]*arr[i]);
			}
			System.out.println(map.values());
		
				
			return map;
			
			
			
		}
		
		

}
