import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        int max = 0, sequence = 0;

        for (int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            str[i] = st.nextToken();

            if(Integer.parseInt(str[i])>max){
                max = Integer.parseInt(str[i]);
                sequence = i+1;
            }
        }
        System.out.println(max +"\n"+sequence);
    }
}
