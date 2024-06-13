import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class P1551{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());;

        String[] str = br.readLine().split(",");
        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int[] result = new int[K];

        for(int j=0;j<N;j++){
            for(int i=0;i<K-1;i++){
                result[i]=arr[i+1]-arr[i];
            }
        }
        
        for(int i=0;i<K-N;i++)  System.out.println(result[i]);
    }
}