/*package day5;


public class array1 {
	public static void main(String[] args){
		System.out.println("hello!");
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		int arr3[] = arr2;
		System.out.println(arr1[0]);
		System.out.println(arr1);
		arr1[0]=10;arr1[1]=20;arr2[0]=30;arr3[1]=40;arr3[0]=50;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr3[1]);
		System.out.println(arr2);
		System.out.println(arr3);
		arr1 = null;
		System.out.println(arr1[0]);
		//System.out.println(arr1[1]);
		//System.out.println(arr3[4]);
	}
}
import java.util.Random;

public class array1 {

	public enum Weekdays{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		int day = rd.nextInt(7) + 1;
		System.out.println(day);
		
		
		switch (day) {
		case MONDAY:
			System.out.println("今天是星期一！");
			break;
		case TUESDAY:
			System.out.println("今天是星期二！");
			break;
		case WEDNESDAY:
			System.out.println("今天是星期三！");
			break;
		case THURSDAY:
			System.out.println("今天是星期四！");
			break;
		case FRIDAY:
			System.out.println("今天是星期五！");
			break;
		case SATURDAY:
			System.out.println("今天是星期六！");
			break;
		default:
			System.out.println("今天是星期日！");
			break;
		}
	}
}*/