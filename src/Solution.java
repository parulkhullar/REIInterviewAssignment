import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args){
	}
	
	/**
	 * The purpose of this method is to take in an input array and
	 * return pairs (of Index) that appear in the list in increasing 
	 * order. 
	 * Assumptions made here are : if the length is 0 or array is null, 
	 * the function will return an empty list of ordering. This function
	 * will also return an empty list in case that there are no possible 
	 * ordering if the index in increasing order.
	 * @param inputArray
	 * @return list of pairs of indexes that appear in increasing order 
	 */
	public static List<Tuple> getIncreaseOrderPair(int[] inputArray){
		if(inputArray == null || inputArray.length == 0){
			return new ArrayList<Tuple>();
		}else{
			List<Tuple> indexRangeList = new ArrayList<Tuple>();
			int prev = inputArray[0];
			int startIndex = 0;
			for(int i = 1; i < inputArray.length; i++){
				if(prev >= inputArray[i]){
					if(startIndex < i-1){
						indexRangeList.add(new Tuple(startIndex, i-1));
					}
					startIndex = i;
				}
				
				if(i == inputArray.length-1){
					if(prev <= inputArray[i]){
						indexRangeList.add(new Tuple(startIndex, inputArray.length-1));
					}
				}
				
				prev = inputArray[i];
			}
			return indexRangeList;
		}
	}
}
