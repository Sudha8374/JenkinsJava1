package sample;

import java.util.HashSet;

public class ArraySum {
	public int trip(int arr[], int sum)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		if(arr.length <= 0)
		{
			return -1;
		}
		for(int i=0; i<arr.length; ++i)
		{
			int temp = sum - arr[i];
			if(s.contains(temp))
			{
				System.out.println("Given sum can be formed by (" +arr[i] + ", "+ temp+ ")");
				return 1;
			}
			s.add(arr[i]);
		}
		return -1;
	}
}
