import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1292{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int sum = 0;
        int count = 0;

        for(int i = 1; i <= end; i++){
            for(int j = 1; j <= i; j++){
                count++;
                if(start<=count && count<=end){
                    sum+=i;
                }
            }     
        }
        System.out.println(sum);
    }
}

/* 2번째 방법 : 전체 배열 생성 후 원하는 구간 합 구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class trash {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] sequence = new int[end * (end + 1) / 2]; // 최대 길이의 수열 생성

        int idx = 0;
        for (int i = 1; i <= end; i++) {
            for (int j = 0; j < i; j++) {
                sequence[idx++] = i; // 수열 생성
            }
        }

        int sum = 0;
        for (int i = start - 1; i < end; i++) {
            sum += sequence[i]; // 주어진 범위의 합 계산
        }

        System.out.println(sum);
    }
}
 */