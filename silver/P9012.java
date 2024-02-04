import java.io.*;
import java.util.*;


public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();
        
            Stack<Integer> stack = new Stack<Integer>();
            boolean bl = true;
        
            for (int j = 0; j < str.length(); j++) {
                if (ch[j] == '(') {
                    stack.add(1);
                } else {
                    try {
                        stack.pop();
                    } catch (EmptyStackException e) {
                        bl = false;
                        System.out.println("NO");
                        break;  // 예외 발생 시 루프 탈출
                    }
                }
            }
        
            if (bl) {
                if (stack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
    }
}