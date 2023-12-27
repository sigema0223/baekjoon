import java.io.*;
import java.util.StringTokenizer;

public class p30007{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        for(int i = 0; i < num; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int x = Integer.parseInt(str.nextToken());

            System.out.println(a*(x-1)+b);
        }
    }
}