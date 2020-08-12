package day5;

import java.util.Scanner;

public class arr5week {
	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入1-7的数字，系统将为您自动转换成星期几");
		int week = sc.nextInt();
		System.out.println("星期" + getweek(week));*/
		//@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入对应的星期范围在1-7");
		int week = sc.nextInt();

		System.out.println("星期" + getweek(week));
	}
	public static char getweek(int week) {
		char[] arr = {' ','一','二','三','四','五','六','日'};		//定义了一张星期表
		return arr[week];											//通过索引获取表中的元素
	}
}
