import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 배열의 크기 입력
		String A = sc.next();
		int sum = 0;
		for ( int i =0; i<N; i++) {
			sum += A.charAt(i)-'0'; 
		}
		
		System.out.println(sum);
		
	}

}
