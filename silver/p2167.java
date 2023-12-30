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







//부분합으로 푸는 게 더 효과적임

// public class Main {
    //     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         int N = Integer.parseInt(st.nextToken());
//         int M = Integer.parseInt(st.nextToken());
//         int[][] dp = new int[N + 1][M + 1];

//         for (int i = 1; i <= N; i++) {
//             st = new StringTokenizer(br.readLine()," ");
//             for (int j = 1; j <= M; j++) {
//                 // 2차원 배열 누적합 구하는 공식.
//                 dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + Integer.parseInt(st.nextToken());
//             }
//         }

//         int K = Integer.parseInt(br.readLine());

//         for (int l = 0; l < K; l++) {
//             st = new StringTokenizer(br.readLine()," ");
//             int i = Integer.parseInt(st.nextToken());
//             int j = Integer.parseInt(st.nextToken());
//             int y = Integer.parseInt(st.nextToken());
//             int x = Integer.parseInt(st.nextToken());
//             // 누적합을 토대로 구간합 구하기
//             int res = dp[y][x] - dp[y][j - 1] - dp[i - 1][x] + dp[i - 1][j - 1];
//             sb.append(res).append("\n");
//         }
//         System.out.println(sb);
//     }
// }