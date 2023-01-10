import java.io.*;
import java.util.Scanner;

// 문제
// 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초 까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하세요.
// 예를 들어 1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각입니다.
//
// 00시 00분 03초
// 00시 13분 30초
//
// 반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안되는 시각입니다.
//
// 00시 02분 55초
// 01시 27분 45초
// 
// 입력
// 첫째 줄에 정수 N이 입력됩니다. (0 <= N <= 23)
//
// 출력
// 00시 00분 00초부터 N시 59분 59초 까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 출력합니다.

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        
        for(int i = 0; i <= N; i ++) {
            for(int j = 0; j < 60; j ++) {
                for(int k = 0; k < 60; k ++) {
                    if(String.valueOf(i).contains("3") || String.valueOf(j).contains("3") || String.valueOf(k).contains("3")) {
                        cnt ++;
                    }
                }
            }
        }
        
        bw.write(cnt + "");
        br.close;
        bw.close;
    }
}
