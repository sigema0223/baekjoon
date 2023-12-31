import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//can't solve

public class P17504 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        Long[] str = new Long[num];
        double result = 0;

        for(int i=0; i<num; i++){
            str[i]=Long.parseLong(st[i]);
        }


        for(int i=num-1; i>0; i--){
            result=str[i-1]+1/str[i].doubleValue();
        }

        System.out.println(1-1/result);
    }
}
