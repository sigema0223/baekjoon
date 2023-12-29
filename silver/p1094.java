import java.io.*;

public class p1094{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int finalLength = Integer.parseInt(br.readLine());
        int initialLength = 64, count = 0;

        while(true){
            if(finalLength<initialLength){
                initialLength/=2;
            }else{
                finalLength-=initialLength;
                count++;
            }
            if(finalLength==0) break;
        }

        // while(finalLength>0){
        //     if(initialLength>finalLength){
        //         initialLength/=2;
        //     }else{
        //         finalLength-=initialLength;
        //         count++;
        //     }
        // }
        System.out.println(count);
    }
}