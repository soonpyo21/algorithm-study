import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

// 문제
// 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
// 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
//
// 입력
// 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
// 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
//
// 출력
// 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] values = new int[N];
        int cnt = 0;

        for(int i = 0; i < N; i ++) {
            int value = Integer.parseInt(br.readLine());
            values[i] = value;
        }

        for(int i = N-1; i > -1; i --) {
            while(K / values[i] > 0) {
                K -= values[i];
                cnt++;
            }
        }

        bw.write(cnt + "");
        br.close();
        bw.close();
    }
}

/* 위의 35 ~ 38번 라인은 아래 코드가 더 나은 방향이다. (백준 참조)
if(K >= values[i]) {
    cnt += K / values[i];
    K = K % values[i];
}
*/