package 백준.Bronze.algorithmStudy.Output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // //11719번 문제
    // public static void main(String[] args) throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     List<String> lines = new ArrayList<>();

    //     String line;
    //     while((line = br.readLine()) != null){
    //         lines.add(line);    
    //     }

    //     for(String s : lines){
    //         System.out.println(s);
    //     }
    // }

    //11720번 문제
    // public static void main(String[] args) throws IOException{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    //     int N = Integer.parseInt(br.readLine());
    //     String numbers = br.readLine();

    //     int sum = 0;
    //     for(int i = 0; i < N; i++){
    //         sum += numbers.charAt(i) - '0';
    //     }
    //     System.out.println(sum);
    // }

    //11721번 문제
    // public static void main(String[] args) throws IOException {
    //     // 입력을 빠르게 받기 위해 BufferedReader 사용
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    //     // 한 줄 입력받아 문자열로 저장
    //     String input = br.readLine();       

    //     // 입력된 문자열의 길이를 구함
    //     int length = input.length();        

    //     // i를 0부터 시작해서 10씩 증가시키며 문자열을 자름
    //     for (int i = 0; i < length; i += 10) {
    //         // 마지막 조각이 10자 미만일 수 있으므로, end는 문자열 길이를 넘지 않게 설정
    //         int end = Math.min(i + 10, length);

    //         // 문자열을 i부터 end 전까지 잘라서 출력 (10자씩 또는 마지막 남은 글자 수만큼)
    //         System.out.println(input.substring(i, end));
    //     }
    // }

    // //2741번 문제
    // public static void main(String[] args) throws IOException{
    
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    //     int N = Integer.parseInt(br.readLine());

    //     for (int i = 1; i <=N; i++){
    //         bw.write(i + "\n");
    //     }

    //     bw.flush();

    //     bw.close();
    //     br.close();
    // }

    //2742번 문제
//     문제
// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

// 출력
// 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
    // public static void main(String[] args) throws IOException{
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // int N = Integer.parseInt(br.readLine());

    // for(int i = N; i>= 1; i--){
    //     bw.write(i + "\n");
    // }
    // bw.flush();

    // bw.close();
    // br.close();
    // }

    //문제
// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

// 입력
// 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.

// 출력
// 출력형식과 같게 N*1부터 N*9까지 출력한다

    // public static void main(String[] args) throws Exception {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // int n = Integer.parseInt(br.readLine());

    // for(int i = 1; i <=9; i++){
    //     System.out.println(n + "*" + i + "="+ (n*i));
    // }
    // }

    // 문제 1436번
    // 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

    // X가 3으로 나누어 떨어지면, 3으로 나눈다.
    // X가 2로 나누어 떨어지면, 2로 나눈다.
    // 1을 뺀다.
    // 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

    // 입력
    // 첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.

    // 출력
    // 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n+1];
        dp[1] =0;

        for(int i= 2; i<=n; i++){
            dp[i] = dp[ i -1] + 1;

            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            }
            if(i % 3 == 0){
                dp[i] =Math.min(dp[i], dp[i /3]+1);
            }
        }
            System.out.println(dp[n]);
    }
}
