import java.io.*;
import java.util.Scanner;

// 문제
// 한 마을에 모험가가 N명 있습니다. 모험가 길드에서는 N명의 모험가를 대상으로 '공포도'를 측정했는데, 
// '공포도'가 높은 모험가는 쉽게 공포를 느껴 위험 상황에서 제대로 대처할 능력이 떨어집니다.
// 모험가 길드장인 동빈이는 모험가 그룹을 안전하게 구성하고자 
// 공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여해야 여행을 떠날 수 있도록 규정했습니다.
// 동빈이는 최대 몇 개의 모험가 그룹을 만들 수 있는지 궁금합니다. 
// N명의 모험가에 대한 정보가 주어졌을 때, 여행을 떠날 수 있는 그룹 수의 최댓값을 구하는 프로그램을 작성하세요.
//
// 입력
// 첫째 줄에 모험가의 수 N이 주어집니다. (1 <= N <= 100,000)
// 둘째 줄에 각 모험가의 공포도의 값을 N이하의 자연수로 주어지며, 각 자연수는 공백으로 구분합니다.
//
// 출력
// 여행을 떠날 수 있는 그룹 수의 최댓값을 출력합니다.

public class Main {

    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamReader(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String[] member = br.readLine().split(" ");
        int[] fear = new int[N];
        
        for(int i = 0; i < N; i ++) {
            fear[i] = Integer.parseInt(member[i]);
        }
        
        Arrays.sort(fear);
        
        int team = 0; // 총 그룹의 수
        int cnt = 0;  // 현재 그룹에 포함된 모험가의 수
        
        for(int i = 0; i < fear.length; i ++) { // 공포도를 낮은 순서로 하나씩 확인하며
            cnt ++;                             // 현재 그룹에 모험가를 포함시키기
            
            if(cnt >= fear[i]) {                // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
                team ++;                        // 총 그룹의 수 증가시키기
                cnt = 0;                        // 현재 그룹에 포함된 모험가의 수 초기화
            }
        }
        
        bw.write(team + "");
        br.close();
        bw.closr();
    }
}
