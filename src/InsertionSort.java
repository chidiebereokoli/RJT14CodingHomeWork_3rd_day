
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {9,5,490,85,2,5,90,12,85,43,24,98,67,39,8,4,11,56,27,82};
	    int size = arr.length;
	   insertion_sort(arr,size);
	    for(int i=0;i<size;i++){
	       System.out.println(arr[i]+" ");
	    }
		
	}
	

public static void insertion_sort (int arr[],int size){
    for (int i=1; i<size; i++){
        int data =arr[i];
        int index = i;
        while(index>0 && data<arr[index-1]){
            arr[index] = arr[index-1];
            index--;
        }
        arr[index]= data;
    }
}

}
