import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class p8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] arr = new String[num];

        for(int i=0; i<num; i++){
            arr[i] = br.readLine();
        }

        for(int i=0; i<num; i++){
            int totalScore = 0, score = 0;

            for(int j=0; j<arr[i].length(); j++){
                int weight = 0;
                if(arr[i].charAt(j)=='O'){
                    weight++;
                    score+=weight;
                }else{
                    score = 0;
                }
                totalScore += score;
            }
            System.out.println(totalScore);
        }
    }
}