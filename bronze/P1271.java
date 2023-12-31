import java.io.*;
import java.math.BigInteger;

public class P1271 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        BigInteger a = new BigInteger(st[0]);
        BigInteger b = new BigInteger(st[1]);
        
        System.out.println(a.divide(b));
		System.out.println(a.remainder(b));
	}
}