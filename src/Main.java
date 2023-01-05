import java.io.*;
import java.util.Scanner;

// 문제
// 각 자리가 숫자로만 이루어진 문자열 S가 주어졌을 때, 
// 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자 사이에 'x' 혹은 '+' 연산자를 넣어 
// 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성하세요.
// 단, +보다 x를 먼저 계산하는 일반적인 방식과는 달리, 모든 연산은 왼쪽에서부터 순서대로 이루어진다고 가정합니다.
//
// 예를 들어 02984라는 문자열로 만들 수 있는 가장 큰 수는 ((((0 + 2) x 9) x 8) x 4) = 576입니다. 
// 또한 만들어질 수 있는 가장 큰 수는 항상 20억 이하의 정수가 되도록 입력이 주어집니다.
//
// 입력
// 첫째 줄에 여러개의 숫자로 구성된 하나의 문자열 S가 주어집니다. (1 <= S의 길이 <= 20)
//
// 출력
// 첫째 줄에 만들어 질 수 있는 가장 큰 수를 출력합니다.

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] S = br.readLine().split("");
        int result = Integer.parseInt(S[0]);
        
        for(int i = 0; i < S.length; i++) {
            if(i != S.length-1) {
                int num = Integer.parseInt(S[i + 1]);
                
                if(num == 0 || num == 1 || result == 0) {
                    result += num;
                } else {
                    result *= num;
                }
            }
        }
        
        bw.write(result + "");
        br.close();
        bw.close();
    }
}
