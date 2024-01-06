import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int weight = Integer.parseInt(st.nextToken());
        int totalBag = 0;

        int numOfBag2 = 0;

        while(true){
            if(weight % 5 == 0){
                totalBag = weight / 5 + numOfBag2;
                break;
            }else if(weight < 0){
                totalBag = -1;
                break;
            }
            weight -= 3;
            numOfBag2++;
        }
        
        System.out.println(totalBag);
    }
}