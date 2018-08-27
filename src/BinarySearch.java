//The Binary search algorithm utilizes the fact that an array is sorted to reduce the time taken to access 
//an Element in the array
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int subject = 200; //Number being searched for in the array
		
	    int arr [] = {9,5,490,85,2,5,90,12,85,43,24,98,67,39};
	    int size = arr.length;
	    selection_sort(arr, size);
	    int right_index = size -1;
	    int left_index = 0;
	  
	    int result = binary_search(arr, left_index,right_index,subject);
	   
	   if (result ==-1) {
		   System.out.println("Subject number not contained in Array"); 
	   }
	   else {
		  System.out.println("Subject number contained in Array"); 
	   }
	  
	    selection_sort(arr,size);
	    for(int i=0;i<size;i++){
	       System.out.println(arr[i]+ " ");
	    }
	   
		
	}

	//Binary Search function
	public static int binary_search (int arr[],int left_index, int right_index, int subject){
	    if (right_index >= left_index){
	        int mid = left_index + (right_index - left_index)/2;
	        if (arr[mid] == subject) {
	            return mid;
	        }
	        else if (arr[mid] > subject){
	            return binary_search(arr, left_index, (mid-1), subject);
	        }
	        else
	            return binary_search(arr, (mid+1), right_index,subject);
	    }
	    return -1;
	}
	//Selection sort function, this is necessary, since the binary search can only be effective if the array
	//is already sorted
	public static void selection_sort (int arr[],int size){
	    int smallest;
	    for (int i =0; i< size-1; i++){
	        smallest = i;
	        for (int j=i+1;j < size; j++){
	            if (arr[smallest]>arr[j]){
	                smallest = j;
	            }
	        }
	       
	        int temp = arr[smallest];
	        arr[smallest] = arr[i];
	        arr[i] = temp;
	    }
	}
	
}
