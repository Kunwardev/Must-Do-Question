package Algorithms;

public class PrimeSpiral {
	
	private void spiralSlicer(int input){
		int step_count = 1;
		int step_limit = 2;
		int adder = 1;
		int x = 0, y = 0;
		for(int n=2; n != input+1; n++, step_count++){
			if(step_count <= step_limit/2)
				x+=adder;
			else if(step_count <= step_limit)
				y+=adder;
			if(step_count == step_limit){
				adder *= -1;
				step_limit += 2;
				step_count = 0;
			}
		}
		System.out.println(x+" "+y);
	}
	
	private int primeIndex(int input){
		int j, cnt, prime_c = 0;
		for(int i=2;i<=1000000;i++){
			cnt = 0;
			for(j=2;j<=i;j++){
				if(i%j==0)
					cnt++;
			}
			if(cnt == 1){
				prime_c++;
				if(input == i){
					input = prime_c;
					break;
				}
			}
		}
		return input;
	}
	
	public static void main(String[] args){
		int input = 2;
		PrimeSpiral p = new PrimeSpiral();
		p.spiralSlicer(input);
	}
	
}