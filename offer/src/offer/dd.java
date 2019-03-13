package offer;

import java.util.HashSet;
import java.util.Set;

public class dd{
	public boolean find(int[] a, int len) {
		Set<Integer> arr = new HashSet<Integer>();
		for (int i=0;i<len;i++) {
			if(arr.contains(a[i])) {
				return true;
			}
			else {
				arr.add(a[i]);
			}
		}
		return false;
	}
}
