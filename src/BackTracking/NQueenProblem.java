package BackTracking;

public class NQueenProblem {
	
	private boolean isSafe(int[][] mat, int row, int col){
		int i,j;
		for(i=0;i<col;i++){
			if(mat[row][i] > 0)
				return false;
		}
		for(i=row, j=col; i>=0 && j>=0;i--,j--){
			if(mat[i][j] > 0)
				return false;
		}
		for(i=row,j=col;j>=0 && i<mat.length;i++,j--){
			if(mat[i][j] > 0)
				return false;
		}
		return true;
	}
	
	private boolean solveNQUtil(int[][] mat, int col){
		if(col >= mat.length)
			return true;
		for(int i=0;i<mat.length;i++){
			if(isSafe(mat, i, col)){
				mat[i][col] = 1;
				if(solveNQUtil(mat, col+1))
					return true;
				mat[i][col] = 0;
			}
		}
		return false;
	}
	
	private boolean solveNQ(){
		int[][] mat = new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		if(solveNQUtil(mat, 0) == false){
			System.out.println("THE SOLUTION DOES NOT EXISTS");
			return false;
		}
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat.length;j++){
				System.out.print(mat[i][j]+" ");
			}System.out.println();
		}
		return true;
	}
	
	public static void main(String[] args){
		NQueenProblem n = new NQueenProblem();
		n.solveNQ();
	}
	
}
