public class BinaryIterativeSearch implements Practice03Search{

	public String searchName(){
		return "Binary Iterative Search";
	}

	public int search(int [] arr, int target){

		//Get the start and end of the array
		int start = 0, end = arr.length - 1;
		while(start<=end) //If start is larger than end, then the target was not found in the array
		{
			int mid = (start+end)/2; //Get middle of array
			if(arr(mid) == target) //If the target is at middle return middle
				return mid;
			else if(arr[mid] < target) //If target is greater than the middle, make the current middle the new start to check the greater half of the array
				start = mid+1;
			else if(arr[mid] > target) //If target is less than the middle, make the current middle the new end to check the lesser half of the array
				end = mid-1;
		}
		return -1; //Return -1 if target not found
	}
}