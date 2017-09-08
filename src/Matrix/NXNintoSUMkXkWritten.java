package Matrix;

public class NXNintoSUMkXkWritten {

	private void function(int[][] mat, int k){
		int n = mat.length;
		int[][] stripSum = new int[mat.length][mat.length];
		for (int j=0; j<n; j++)
		{
			// Calculate sum of first k x 1 rectangle in this column
			int sum = 0;
			for (int i=0; i<k; i++)
				sum += mat[i][j];
			stripSum[0][j] = sum;

			// Calculate sum of remaining rectangles
			for (int i=1; i<n-k+1; i++)
			{
					sum += (mat[i+k-1][j] - mat[i-1][j]);
					stripSum[i][j] = sum;
			}
		}

		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat.length;j++){
				System.out.print(stripSum[i][j]+" ");
			}System.out.println();
		}
		
		for (int i=0; i<n-k+1; i++)
		{
			// Calculate and print sum of first subsquare in this row
			int sum = 0;
			for (int j = 0; j<k; j++)
				sum += stripSum[i][j];
			System.out.print(sum+" ");

			// Calculate sum of remaining squares in current row by
			// removing the leftmost strip of previous sub-square and
			// adding a new strip
			for (int j=1; j<n-k+1; j++)
			{
				sum += (stripSum[i][j+k-1] - stripSum[i][j-1]);
				System.out.print(sum+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		int[][] mat = new int[][]{{1,2,3,4,5},
								  {1,2,3,4,5},
								  {1,2,3,4,5},
								  {1,2,3,4,5},
								  {1,2,3,4,5}};
		NXNintoSUMkXkWritten n = new NXNintoSUMkXkWritten();
		n.function(mat, 3);
	}
	
}
