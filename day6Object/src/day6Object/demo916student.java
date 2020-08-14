package day6Object;

public class demo916student {
	public static void main(String[] args){
		System.out.println("Monster Hunter World——ice");
		student 小明 = new student();
		小明.name = "路过的王小明";
		小明.age = 22;
		小明.gender = "男";
		小明.study();
		student faiz = new student();
		faiz.name = "巧爷";
		faiz.study();
		//System.out.println(小明.name);
	}

}
class student{
	String name;
	int age;
	String gender;
	public void study(){
		System.out.println(name+"在学习");
	}
}
class ohone{
	String brand;
	int price;
	public void play(){
		System.out.println("猛汉王启动！");
	}
	public void call(){
		System.out.println("110");
	}public void message(){
		System.out.println("编辑hello world");
	}
}