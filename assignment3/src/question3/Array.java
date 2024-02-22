package question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Array 
{
	public static void main(String []args)
	{

		ArrayList<Integer> List=new ArrayList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);

		List<Integer> OfOdd=List.stream().filter(temp ->temp%2!=0).toList();

		List<Integer> OfSquare=OfOdd.stream().map(temp ->temp*temp).toList();
//		
		int sum=OfSquare.stream().mapToInt(temp->temp).sum();

		System.out.println("Out put :"+sum);
	}
}
