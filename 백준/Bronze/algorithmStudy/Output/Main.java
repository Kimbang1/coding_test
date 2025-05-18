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

    //2741번 문제
    public static void main(String[] args) throws IOException{
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <=N; i++){
            bw.write(i + "\n");
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
