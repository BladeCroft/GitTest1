package day5;

public class array3 {
	public static void main(String[] args){
		int arr[] = {11,22,44,88,15,17,99,33};
		int max = getmax(arr);
		System.out.println(max);
	} 
	public static int getmax(int[] arr){
		int getmax = arr[0];
		for(int i=0;i<7;i++){
			if(getmax<arr[i])
				getmax = arr[i];
		}
		return getmax;
	}
}
