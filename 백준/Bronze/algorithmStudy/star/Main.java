package 백준.Bronze.algorithmStudy.star;

import java.io.IOException;
import java.util.Scanner;

// # 문제
// # 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

// # 입력
// # 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

// # 출력
// # 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

// # 예제 입력 1 
// # 1
// # 예제 출력 1 
// # *
// # 예제 입력 2 
// # 2
// # 예제 출력 2 
// #  *
// # * *
// # 예제 입력 3 
// # 3
// # 예제 출력 3 
// #   *
// #  * *
// # * * *
// # 예제 입력 4 
// # 4
// # 예제 출력 4 
// #    *
// #   * *
// #  * * *
// # * * * *
public class Main {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i= 1; i <= N; i++){
            StringBuffer sb = new StringBuffer();

            for(int j=1; j<=N-i; j++){
                sb.append(" ");
            }

            for(int k = 1; k <= (2*i)-1; k++){
                if(k % 2 ==0){
                    sb.append(" ");
                }else{
                sb.append("*");
            }
            }
            
            System.out.println(sb.toString());
        }
        sc.close();
    }
    
}
