import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int K = Integer.parseInt(firstLine[0]);
        int N = Integer.parseInt(firstLine[1]);

        String[] str = br.readLine().split(",");
        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        for (int j = 0; j < N; j++) {
            int[] temp = new int[K - 1 - j]; // 매번 크기가 줄어드는 배열 생성
            for (int i = 0; i < K - 1 - j; i++) {
                temp[i] = arr[i + 1] - arr[i];
            }
            arr = temp; // arr 배열을 temp 배열로 업데이트
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(",");
            }
        }

        System.out.println(sb.toString());
    }
}
