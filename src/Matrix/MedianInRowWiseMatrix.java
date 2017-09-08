package Matrix;

import java.util.Arrays;

public class MedianInRowWiseMatrix {
	private int binaryMedian(int[][] M, int r, int c){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<r;i++){
			if(M[i][0] < min){
				min = M[i][0];
			}
			if(M[i][c-1] > max){
				max = M[i][c-1];
			}
		}
		int desired = (r * c + 1)/2;
		while(min < max){
			int mid = min + (max - min)/2;
			int place = 0;
			int get = 0;
			for(int i=0;i<r;i++){
				get = Arrays.binarySearch(M[i], mid);
				if(get < 0){
					get = Math.abs(get) - 1;
				}else{
					get += 1;
				}
				place += get;
			}
			if(place < desired)
				min = mid + 1;
			else
				max = mid;
			
		}
		return min;
	}
	
	public static void main(String[] args){
		int[][] M = new int[][]{{1,3,5}, {2,6,9}, {3,6,9}};
		MedianInRowWiseMatrix m = new MedianInRowWiseMatrix();
		System.out.println(m.binaryMedian(M, 3, 3));
	}
	
}
