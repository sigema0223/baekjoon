import java.io.*;
import java.util.Scanner;

public class p2739{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int product = 0;
        
        for (int i = 1; i < 10; i++){
            product = a*i;
            System.out.println(a+" * "+i+" = "+product);
        }
    }
}