
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int arr [] = {9,5,490,85,2,5,90,12,85,43,24,98,67,39,8,4,11,56,27,82};
		    int size = arr.length;
	
		   bubble_sort(arr,size);
		    for(int i=0;i<size;i++){
		       System.out.println(arr[i]+ " ");
		    }
		
	}

	public static int bubble_sort (int arr[],int size){
		for (int i=0;i<size-1;i++){
		    if (arr[i]>arr[i+1])
		    {
		    	//Implementation of the swap function
		        int temp = arr[i+1];
		        arr[i+1] = arr[i];
		        arr[i] = temp;
		    }
		}
		for (int i=0;i<size-1;i++){
		    if (arr[i]>arr[i+1])
		        return bubble_sort(arr, size-1);					//With bubble sort, even though the 
		    														//smallest may not be at the left, the 
		    														//biggest WILL always be on the right
		  //Thus, there is no need to recurse again with the full size, recursing with size-1 will be fine.
		}
		return 0;
		}
	
//////////Non Recursive Implementation (not as efficient as what I have above, my humble opinion)
/*public static int bubble_sort (int arr[],int size){
int i,j;
for ( i=0;i<size-1;i++){
for (j=0;j<size-i-1;j++){ //Since the biggest element always goes to the last position, 
//we do not need to go to this last position in the subsequent iterations
  if (arr[j]>arr[j+1]){
  				//Implementation of the swap function
      		        int temp = arr[i+1];
		        arr[i+1] = arr[i];
		        arr[i] = temp;
      }
  }
}
}*/
	
}
