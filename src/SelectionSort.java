
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {9,5,490,85,2,5,90,12,85,43,24,98,67,39};
	    int size = arr.length;
	
	    selection_sort(arr,size);
	    for(int i=0;i<size;i++){
	       System.out.println(arr[i] + " ");
	    }
		
	}


	//Function to implement selection on an array of integers
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
