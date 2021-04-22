import java.util.Scanner;

public class Prob_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수학과학영어순으로 점수를 입력하");
		int math =sc.nextInt();
		int science=sc.nextInt();
		int english=sc.nextInt();
		Grade me = new Grade(math,science,english);
		System.out.println("평균은"+me.average());
		
		sc.close();
	}
}
class Grade{
	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english){
		this.math=math;
		this.science=science;
		this.english=english;
		
	}
	public int average() {
		return (math+science+english)/3;
		
		
		
		
	}
}