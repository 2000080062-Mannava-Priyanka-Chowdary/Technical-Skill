class SortAsc 
{
	public static void main(String[] args) 
	{    
        	int [] arr = new int[] {5,2,8,7,1};     
        	int temp = 0;
		int len =  arr.length;
        	System.out.println("Elements of original array: ");    
        	for (int i = 0; i < len; i++)    
            		System.out.print(arr[i] + " ");   
        	for (int i = 0; i < len; i++)
		{     
            		for (int j = i+1; j < len; j++)
			{     
               			if(arr[i] > arr[j])
				{    
                   			temp = arr[i];    
                   			arr[i] = arr[j];    
                   			arr[j] = temp;    
               			}     
            		}     
        	}    
          
        	System.out.println();
	        System.out.println("Elements of array sorted in ascending order: ");    
        	for (int i = 0; i < len; i++)    
            		System.out.print(arr[i] + " ");
    	}    
}    