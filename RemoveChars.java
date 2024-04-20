import java.util.Scanner;

public class RemoveChars {
    static void removechars(String str){
        String res = "";
        char[] ch = str.toCharArray();
        for (int i=0; i<ch.length;i++){
            if((ch[i] == 48) || (ch[i] <= 57)){
                res = res+ch[i];
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        removechars(str);
    }
}
