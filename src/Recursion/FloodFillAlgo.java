package Recursion;

public class FloodFillAlgo {
	private void function(int[][] mat, int i, int j){
		
		if(i < mat.length && j < mat[0].length && i>=0 && j>=0 && mat[i][j] == 0){
			mat[i][j] = 1;
			function(mat, i+1, j);
			function(mat, i, j+1);
			function(mat, i-1, j);
			function(mat, i, j-1);
		}

	}
	
	public static void main(String[] args){
		int[][] mat = new int[][]{{2,0,0,2},
							  {0,0,0,0},
							  {0,0,0,0},
							  {2,0,0,2}};
		FloodFillAlgo f = new FloodFillAlgo();
		f.function(mat, 1,1);
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+" ");
			}System.out.println();
		}
	}
	
}
