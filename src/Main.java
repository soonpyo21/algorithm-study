import java.io.*;
import java.util.Scanner;

// 문제
// 행복 왕국의 왕실 정원은 체스판과 같은 8 x 8 좌표 평면입니다. 왕실 정원의 특정한 한 칸에 나이트가 서있습니다. 나이트는 매우 충성스러운 신하로서 매일 무술을 연마합니다.
// 나이트는 말을 타고 있기 때문에 이동을 할 때는 L자 형태로만 이동할 수 있으며 정원 밖으로는 나갈 수 없습니다.
// 나이트는 특정 위치에서 다음과 같은 2가지 경우로 이동할 수 있습니다.
// 1. 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
// 2. 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기
// 이처럼 8 x 8 좌표 평면 상에서 나이트의 위치가 주어졌을 때 나이트가 이동할 수 있는 경우의 수를 출력하는 프로그램을 작성하세요.
// 왕실의 정원에서 행 위치를 표현할 때는 1부터 8로 표현하며, 열 위치를 표현할 때는 a부터 h로 표현합니다.
// ex) c2에 있을 때 이동할 수 있는 경우의 수는 6가지입니다.
// ex) a1에 있을 때 이동할 수 있는 경우의 수는 2가지입니다.
//
// 입력
// 첫째 줄에 8 x 8 좌표 평면 상에서 현재 나이트가 위치한 곳의 좌표를 나타내는 두 문자로 구성된 문자열이 입력된다.
// 입력 문자는 a1처럼 열과 행으로 이뤄진다.
//
// 출력
// 첫째 줄에 나이트가 이동할 수 있는 경우의 수를 출력하시오.

public class Main {

    public static void main(String[] args) throws IOException {
         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         String[] input = br.readLine().split("");
         int row = Integer.parseInt(input[1]);
         int col = input[0].charAt(0) - 96;
         int cnt = 0;
         
         if(row - 2 > 0) {
              if(col - 1 > 0) {
                   cnt ++;
              }
              if(col + 1 < 9) {
                   cnt ++;
              }
         }
         
         if(row + 2 < 9) {
              if(col - 1 > 0) {
                   cnt ++;
              }
              if(col + 1 < 9) {
                   cnt ++;
              }
         }
         
         if(col - 2 > 0) {
              if(row - 1 > 0) {
                   cnt ++;
              }
              if(row + 1 < 9) {
                   cnt ++;
              }
         }
         
         if(col + 2 < 9) {
              if(row - 1 > 0) {
                   cnt ++;
              }
              if(row + 1 < 9) {
                   cnt ++;
              }
         }
         
         bw.write(cnt + "");
         br.close();
         bw.close();

    }
}
