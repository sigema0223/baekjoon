import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int v = Integer.parseInt(str[2]);

        int totalDays = (v - b - 1) / (a - b) + 1; // 올림을 적용하여 계산

        System.out.println(totalDays);
    }
}
