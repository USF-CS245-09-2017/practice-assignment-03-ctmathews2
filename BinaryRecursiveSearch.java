public class BinaryRecursiveSearch implements Practice03Search{

	public String searchName(){
		return "Binary Recursive Search";
	}

	public int search(int [] arr, int target, int start, int end){ //Get the start and end of the array

		if (start <= end) {  // If start is larger than end, then the target was not found in the array
			int mid = (start+end)/2; 

			if (arr[mid] == target) //Get middle of array
				return mid; //If the target is at middle return middle

			if (arr[mid] > target) //If target is less than the middle, make the current middle the new end to check the lesser half of the array. Recall function with new Parameters
				return search(arr, target, start, mid-1); 

			return search(arr, target, mid+1, end); //If the other two ifs did not work then the target is greater than the middle, make the current middle the new start to check the greater half of the array. Recall function with new Parameters
		} 
		return -1;  //Return -1 if target not found
	}
}