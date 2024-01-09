import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        
        while (true) {
            str = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            int c = Integer.parseInt(str.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            int aSquare = a * a;
            int bSquare = b * b;
            int cSquare = c * c;

            if (aSquare + bSquare == cSquare || cSquare + bSquare == aSquare || aSquare + cSquare == bSquare) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
