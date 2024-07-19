package ganeralIVQ;

public class DuplicateValue 
{

	public static void main(String[] args) 
	{

		int a[] = {1,3,4,7,8,3,4};

//		int arr[] = new int [5];
//		int arr1[] = new int []{3,2,5,6,7};
		
		System.out.print("Duplicate Numbers are:  ");
		
		for (int i=0; i< a.length; i++) 
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i] == a[j]) 
				{
				System.out.print(a[i] + " , ");	
				}
			}
		}
	}

}
