package day6Object;

public class day916Student {
 public static void main(String[] args){
	 stud st = new stud();
	 print(st);
	 new stud().age = 11;
	 new stud().name = "繁华";
	 new stud().play();
 }
 public static void print(stud s){
	 s.name="绕鸡";
	 s.age = 18;
	 s.play();
 }
}
class stud{
	 static String name;
	 //static int age;
	 int age;
	 public void play(){
		 System.out.println(age+"岁的"+name+"在打游戏");
	 }
}