import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1546{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");

        float max = 0;
        float sum = 0;

        for(int i = 0; i < num; i++){
            if (Float.parseFloat(st[i]) >= max) {
                max = Float.parseFloat(st[i]);
            }
            sum += Float.parseFloat(st[i]);
        }

        float average = (sum / max * 100) / num;

        System.out.println(average);
    }
}