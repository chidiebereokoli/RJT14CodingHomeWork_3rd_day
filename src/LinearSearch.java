
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int subject = 78998; //Number being searched for in the array
		
	    int arr [] = {9,5,490,85,2,5,90,12,85,43,24,98,67,39, 78998,90,32345, 900};
	    int size = arr.length;
	    
	    boolean is_contained= Linear_search(arr, size, subject);
	   System.out.println(is_contained + " ");
		
	}

	
	//Function to perform the linear search of an element in an array
	public static boolean Linear_search (int arr[],int size, int subject){
	    for (int i=0;i< size; i++){
	        if (arr[i] == subject) {
	            return true;}
	    }
	    return false;
	};
	
}
