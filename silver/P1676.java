import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//아직 못 풀음

public class P1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int count = 0;
        int factorial = 1;

        for (int i=1; i<=a; i++){
            factorial *= i;
            if (factorial%10 == 0 && factorial > 10){
                factorial/=10;
                count++;
            }
        }

        System.out.println(count);
    }
}
