package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p5073 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[3];

        while(true){
            str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);
            
            if(a == 0 && b == 0 && c ==0) break;

            if(a==b && b==c) {
                System.out.println("Equilateral");
            }else if(a+b <= c || b+c <= a || c+a <= b){
                System.out.println("Invalid");
            }else if(a != b && b != c && c != a){
                System.out.println("Scalene");
            }else{
                System.out.println("Isosceles");
            }
        }
    }
}
