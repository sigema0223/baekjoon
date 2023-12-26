import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cout = Integer.parseInt(br.readLine());
        int change = 0;
        int quarter, dime, nickel, penny = 0;

        for (int i = 0; i < cout; i++){
            change = Integer.parseInt(br.readLine());
            
            quarter = change/25;
            change %= 25;

            dime = change/10;
            change %= 10;

            nickel = change/5;

            penny = change%5;

            System.out.println(quarter+" "+dime+" "+nickel+" "+penny);    
        }    
    }
}
