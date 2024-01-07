import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int count = 0;

        // 주어진 숫자 N!의 뒤에서부터 연속된 0의 개수를 찾는 공식을 이용
        // 10이 곱해지는 횟수 = 소인수분해했을 때 2와 5의 개수 중 작은 값
        // 5의 개수가 항상 2의 개수보다 적으므로 5의 개수를 찾으면 됨
        for (int i = 5; i <= N; i *= 5) {
            count += N / i;
        }

        System.out.println(count);
    }
}
