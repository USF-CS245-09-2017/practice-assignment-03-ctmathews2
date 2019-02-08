public class LinearSearch implements Practice03Search{

	public String searchName(){
		return "Linear Search";
	}

	public int search(int [] arr, int target){

		//Iterates through enitre array
		int arrayLength = arr.length; 
    	for(int i = 0; i < arrayLength; i++) 
   		{
   			//If target is found, return index, exit loop
   			if(arr[i] == target)
   				return i;
   		}
   		//If target is not found return -1
   		return -1; 
	}
}