package BackTracking;

public class SolveSudoku {
	
	private void printGrid(int[][] grid){
		for(int row = 0;row < grid.length;row++){
			for(int col=0; col < grid.length; col++){
				System.out.print(grid[row][col]+" ");
			}System.out.println();
		}
	}
	
	private boolean usedInRow(int[][] grid, int row, int num){
		for(int i=0;i<9;i++){
			if(grid[row][i] == num)
				return true;
		}
		return false;
	}
	
	private boolean usedInCol(int[][] grid, int col, int num){
		for(int i=0;i<9;i++){
			if(grid[i][col] == num)
				return true;
		}
		return false;
	}
	
	private boolean usedInBox(int[][] grid, int row, int col, int num){
		for(int boxrow = 0;boxrow < 3;boxrow++){
			for(int boxcol = 0;boxcol < 3;boxcol++){
				if(grid[boxrow+row][boxcol+col] == num)
					return true;
			}
		}
		return false;
	}
	
	private int[] UnassignedLocation(int[][] grid){
		int[] arr = new int[]{9,9};
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid.length;j++){
				if(grid[i][j] == 0){
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		return arr;
	}
	
	private boolean solveSudoku(int[][] grid){
		int[] arr = UnassignedLocation(grid);
		if(arr[0] == 9 && arr[1] == 9)
			return true;
		for(int num=1;num<=9;num++){
			if(!usedInRow(grid, arr[0], num) && !usedInCol(grid, arr[1], num) && !usedInBox(grid, arr[0]-arr[0]%3, arr[1]-arr[1]%3, num)){
				grid[arr[0]][arr[1]] = num;
				if(solveSudoku(grid))
					return true;
				grid[arr[0]][arr[1]] = 0;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int[][] grid = new int[][]{{3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        SolveSudoku s = new SolveSudoku();
        s.solveSudoku(grid);
        s.printGrid(grid);
        
	}
	
}
