import java.io.*;
import java.util.Scanner;

// 문제
// 알파벳 대문자와 숫자(0 ~ 9)로만 구성된 문자열이 입력으로 주어집니다. 이때 모든 알파벳을 오름차순으로 정렬하여 이어서 출력한 뒤에,
// 그 뒤에 모든 숫자를 더한 값을 이어서 출력합니다.
// 예를 들어 K1KA5CB7이라는 값이 들어오면 ABCKK13을 출력합니다. 
//
// 입력
// 첫째 줄에 하나의 문자열 S가 주어집니다. (1 <= S의 길이 <= 10000)
//
// 출력
// 첫째 줄에 문제에서 요구하는 정답을 출력합니다.

public class Main {

   public static void main(String[] args) throws IOException {
      
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      String S = br.readLine();
      List<String> str = new ArrayList<>();
      int sum = 0;
      boolean isSum = false;
      
      for(int i = 0; i < S.length(); i ++) {
         if(S.charAt(i) < 65) {
            sum += Character.getNumericValue(S.charAt(i));
            isSum = true;
         } else {
            str.add(String.valueOf(S.charAt(i)));
         }
         
         Collections.sort(str);
         String result = "";
         
         for(int i = 0; i < str.size(); i++) {
            result += str.get(i);
         }
         
         bw.write(result);
         if(isSum) {
            bw.write(sum + "");
         }
         br.close();
         bw.close();
    }
}
