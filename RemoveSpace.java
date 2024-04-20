import java.util.Scanner;

public class RemoveSpace {
    static void spaceremove(String str){
        String res = "";
        char[] ch = str.toCharArray();
        for (int i=0; i<ch.length;i++){
            if(ch[i] != ' '){
                res = res+ch[i];
            }

        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        spaceremove(str);
    }
}
