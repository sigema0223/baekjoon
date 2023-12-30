import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2167 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        Integer[][] arr = new Integer[N][M];

        for(int i=0; i<N; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            
            for(int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(st2.nextToken());
            }
        }

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st3.nextToken());    

        int i, j, x, y=0;

        for(int a=0; a<num; a++){
            int sum = 0;
            StringTokenizer st4 = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st4.nextToken())-1;
            j = Integer.parseInt(st4.nextToken())-1;
            x = Integer.parseInt(st4.nextToken())-1;
            y = Integer.parseInt(st4.nextToken())-1;

            for(int b=i; b<x+1; b++){
                for(int c=j; c<y+1; c++){
                    sum+=arr[b][c];
                }
            }
            
            System.out.println(sum);
        }
    }
}
