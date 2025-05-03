import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class wordlength {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();    //단어 읽기
        System.out.println(word.length());  //길이 출력
    }
}
