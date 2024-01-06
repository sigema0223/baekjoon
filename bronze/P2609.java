import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class P2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int i = 1;
        
        int max = 0;

        while (i <= a || i <= b) {
                if ( (a%i) == 0 && (b%i) == 0 ) {
                    max = i;
                }
                i++;
        }
        System.out.println(max);

        int a1 = a, b1 = b; 

        while (true) {
            if ( a > b) {
               b += b1;
            } else if (b > a) {
                a += a1;
            } else {
                break;       
            }
        }
        System.out.println(a);
    }
}