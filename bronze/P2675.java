import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++){
            String[] str = br.readLine().split(" ");
            String result = "";
            int repeat = Integer.parseInt(str[0]);
            for(int j=0; j<str[1].length(); j++){
                for(int k=0; k<repeat; k++){
                    result+=str[1].charAt(j);
                }
            }
            System.out.println(result);

        }
        
    }
}
