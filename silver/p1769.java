package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1769 {
    public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String num = br.readLine();

            int count = 0;

            while(num.length()>1){
                int sum = 0;
                for(int i=0; i<num.length();i++){
                    sum += Character.getNumericValue(num.charAt(i));
                }
                num = Integer.toString(sum);
                count++;
            }

            System.out.println(count);

            int finalNum = Integer.parseInt(num);

            if(finalNum%3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }        
    }
}
