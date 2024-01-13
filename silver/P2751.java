import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

// 버블 소트 시간 오래걸려서 안됨 다시 풀어야 됨


public class P2751{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

        int temp, first_value, second_value = 0;

        for(int i=1; i<num; i++){
            for(int j=0; j<num-i; j++){

                first_value = (int)list.get(j);
                second_value = (int)list.get(j+1);

                if(first_value>second_value){
                    temp = first_value;
                    list.add(j, second_value);
                    list.remove(j+1);
                    list.add(j+1, first_value);
                    list.remove(j+2);
                }
            }
        }
        for(int i=0; i<num; i++){
            System.out.println(list.get(i));
        }
    }
}