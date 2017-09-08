package StacksQueue;

class PetrolPump{
	int petrol, distance;
	
	public PetrolPump(int petrol, int distance){
		this.petrol = petrol;
		this.distance = distance;
	}
	
}

public class CircularTour {
	
	private int function(int n, PetrolPump[] arr){
		int start = 0, end = 1, curr_petrol = arr[start].petrol - arr[start].distance;
		while(end != start || curr_petrol < 0){
			while(curr_petrol < 0 && end != start){
				curr_petrol -= arr[start].petrol - arr[start].distance;
				start = (start+1)%n;
				if(start == 0)
					return -1;
			}
			curr_petrol += arr[end].petrol - arr[end].distance;
			end = (end+1)%n;
		}
		return start;
	}
	
	public static void main(String[] args){
		PetrolPump[] arr = {new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)};
		CircularTour c = new CircularTour();
		int start = c.function(arr.length ,arr);
		System.out.println(start);
	}
	
}
