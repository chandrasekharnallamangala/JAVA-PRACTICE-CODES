import java.util.Arrays;
import java.util.Scanner;

public class CharacterFrequency {
    static void characterfrequency(String str){
        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[ch.length];
        Arrays.fill(visited,false);
        for(int i=0; i<ch.length;i++) {
            if (visited[i]) {
                continue;
            } else {
                int count = 1;
                for (int j = i + 1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(ch[i] + " occurs" + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        characterfrequency(str);
    }
}
