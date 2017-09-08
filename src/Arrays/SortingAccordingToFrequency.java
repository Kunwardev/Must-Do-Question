package Arrays;

import java.util.Arrays;
import java.util.Comparator;

class INT{
	int number, frequency;
	
	INT(int number, int frequency){
		this.number = number;
		this.frequency = frequency;
	}
}

class FreqCompare implements Comparator<INT>{

	@Override
	public int compare(INT o1, INT o2) {
		return o1.frequency - o2.frequency;
	}
	
}

public class SortingAccordingToFrequency {
	private void function(INT[] arr){
		Arrays.sort(arr, new FreqCompare());
	}

	public static void main(String[] args){
		INT[] arr = new INT[4];
		arr[0] = new INT(1, 5);
		arr[1] = new INT(5, 1);
		arr[2] = new INT(3, 3);
		arr[3] = new INT(6, 4);
		SortingAccordingToFrequency s = new SortingAccordingToFrequency();
		s.function(arr);
		for(INT p: arr){
			System.out.println(p.frequency+" "+p.number);
		}
	}
	
}
