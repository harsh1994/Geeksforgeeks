//Can be solved using Hashing as well

public class ArraySubsetOtherArray {
	public static void main(String[] args)
	{
		int[] arr1 = {11,1,13,21,3,7};
		int[] arr2 = {11,3,7,1};
		
		int x=0;
		int y=0;
		int z;
		for(int i:arr1)
			x^=i;
		
		for(int j:arr2)
			y^=j;
		
		z = x^y;
		
		int k = z^y;
		if(k==x)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
