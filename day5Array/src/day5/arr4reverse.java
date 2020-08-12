package day5;

public class arr4reverse {
	public static void main(String[] args){
		int[] arr4 = new int[10];
		int a=1;
		for(int i=0;i<arr4.length;i++){
			System.out.print("i="+i+"\t");
			arr4[i]=a++;
			System.out.println(arr4[i]);
	}
		reverseArr(arr4);
		for(int i = 0;i<arr4.length;i++){
			System.out.println("arr["+i+"]="+arr4[i]);
		}
	}
	public static void reverseArr(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp =0;
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
	}
}
