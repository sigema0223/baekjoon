import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
       
        Integer[] firstRound = new Integer[num];
        Integer[] secondRound = new Integer[num];

        String[] firstRoundInput = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            firstRound[i] = Integer.parseInt(firstRoundInput[i]);
        }

        String[] secondRoundInput = br.readLine().split(" ");
        for (int i = 0; i < num; i++) {
            secondRound[i] = Integer.parseInt(secondRoundInput[i]);
        }

        int result = 0;

        for(int i=0; i<num; i++){
            if(firstRound[i]<0){
                firstRound[i]*=-1;
            }
            if(secondRound[i]>0){
                secondRound[i]*=-1;
            }

            result+=firstRound[i]-secondRound[i];
        }

            System.out.println(result);          
    }
}
