import java.util.Scanner;

public class Prob_01 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("수학 과학 영어 순으로 3개의 점수 입력");
		Gread me=new Gread();
		me.m= scan.nextInt();
		me.s=scan.nextInt();
		me.e=scan.nextInt();
		System.out.println("평균은" +me.average());
	}
		
		
	}
class Gread{
	int m;
	int s;
	int e;
	public int average(){
		return ((m+s+e)/3);
	}
}


