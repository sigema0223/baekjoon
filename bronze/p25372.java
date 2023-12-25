package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p25372 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String password = "";
        String[] result = new String[num]; // StringBuilder 찾아보기

        for(int i=0; i<num; i++){
            password = br.readLine();
            if (password.length()<6 || password.length()>9){
                result[i] = "no";
            }else{
                result[i] = "yes";
            }
        }
        for(int i=0; i<num; i++){
            System.out.println(result[i]);
        }
    }
}
