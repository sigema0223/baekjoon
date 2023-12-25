package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int shape = Integer.parseInt(st.nextToken());

        for (int i = 0; i < num; i++) {
            String a = br.readLine();
            char[] str = new char[shape];

            for (int j = 0; j < shape; j++) {
                str[shape - j - 1] = a.charAt(j);
            }

            System.out.println(new String(str)); // char 배열을 String으로 변환하여 출력
        }
    }
}
