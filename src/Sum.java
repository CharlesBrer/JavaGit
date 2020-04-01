
public class Sum {
	public static void main(String[] args) {
	int[] arr ={1,3,5,7,9,11,13,15};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			for(int k=0;k<arr.length;k++)
			{
				if(arr[i]+arr[j]+arr[k]==30) 
				{		System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+"= 30");
						return ;
				}
			}
		}
	}
	System.out.println("Not Found!");
	
}
}
