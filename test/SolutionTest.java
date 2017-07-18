import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;


public class SolutionTest {
	
	@Test
	public void testGetIncreaseOrderPair() {
		int[] testArray1 = {1,2,3,4,5,6,3,6,8,5,8,9,4,3,5};
		List<Tuple> exp = new ArrayList<Tuple>();
		exp.add(new Tuple(0,5)); exp.add(new Tuple(6,8)); exp.add(new Tuple(9,11)); exp.add(new Tuple(13,14));
		
		List<Tuple> test = Solution.getIncreaseOrderPair(testArray1);
		assertTrue(equateList(exp, test));
		
		
		int[] testArray2 = {1,2,3,4,5,6,7,8,9,10};
		exp = new ArrayList<Tuple>();
		exp.add(new Tuple(0, testArray2.length-1));
		test = Solution.getIncreaseOrderPair(testArray2);
		assertTrue(equateList(exp, test));
		
		int[] testArray3 = {10,9,8,7,6,5,4,3,2,1};
		exp = new ArrayList<Tuple>();
		test = Solution.getIncreaseOrderPair(testArray3);
		assertTrue(equateList(exp, test));
		
		int[] testArray4 = {2,1};
		exp = new ArrayList<Tuple>();
		test = Solution.getIncreaseOrderPair(testArray4);
		assertTrue(equateList(exp, test));
		
		int[] testArray5 = {};
		test = Solution.getIncreaseOrderPair(testArray5);
		assertTrue(equateList(exp, test));
		
		int[] testArray6 = {1,1,1,0,4,5,6,6,7,8};
		exp.add(new Tuple(3,6)); exp.add(new Tuple(7,9));
		test = Solution.getIncreaseOrderPair(testArray6);
		assertTrue(equateList(exp, test));
	}

	public boolean equateList(List<Tuple> exp, List<Tuple> test){
		for(int i = 0; i < exp.size(); i++){
			Tuple expT = exp.get(i);
			Tuple testT = test.get(i);
			if(expT.startIndex != testT.startIndex || expT.endIndex != testT.endIndex){
				return false;
			}
		}
		return true;
	}

}
