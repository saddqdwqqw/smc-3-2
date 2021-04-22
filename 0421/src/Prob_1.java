import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int sum=0;
			int a,b;
			System.out.println("a,b값입력");
			a = sc.nextInt();
			b = sc.nextInt();
			
			
			for(; a<b+1; a++){
				sum=a+sum;
				
			}
			System.out.println(a + "부터 " + b + "까지의 합은 " + sum);
			}
			
		}

	