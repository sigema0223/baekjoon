import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class P1009{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());


        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())%10;
            int b = Integer.parseInt(st.nextToken());

            int totalTest = 1;

            for(int j=0; j<b; j++){
                totalTest = (totalTest*a)%10;
            }

            if(totalTest==0){
                System.out.println(10);
            }else{
                System.out.println(totalTest);
            }
        }
    }
}