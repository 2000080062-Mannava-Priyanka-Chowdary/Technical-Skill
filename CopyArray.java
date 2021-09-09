// int[] source = {1,2,3,4,5,6};
// int[] destination = new int[10];
// System.arraycopy(source,0,destination,0,source.length);
//example:-  arrcopy(A,1,B,0,3) A={1,2,3,4,5,6} We should copy A values of 2,3,4 into B 
//here 1--> index from where to copy the values in A and 0--> index from where to Paste the values in B

class CopyArray
{
	public static void main(String[] args)
	{
		int[] source = {100,200,300};
		int[] dest = new int[3];
		System.arraycopy(source,0,dest,0,source.length);
		for (int i=0;i<dest.length;i++)
			System.out.println("Elements at index"+i+":"+dest[i]);
	}
}
//o/p:-
//Elements at index0:100
//Elements at index1:200
//Elements at index2:300
// if int[] dest = new int[6] is given o/p is
//Elements at index0:100
//Elements at index1:200
//Elements at index2:300
//Elements at index3:0
//Elements at index4:0
//Elements at index5:0
// if System.arraycopy(source,0,dest,0,6); 
//it gives an exception because we are trying to access the index beyong the given range