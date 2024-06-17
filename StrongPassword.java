import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean islwer = false;
        boolean isupper = false;
        boolean isdigit = false;
        boolean ispcl   =  false;
        int count = 0;

        String spclstrng = "!@#$%^&*()-+" ;
        String str = sc.next();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if( ch >= 'a' && ch <= 'z' ) {
                islwer = true;
            }
            if( ch >= 'A' && ch <= 'Z') {
                isupper = true;
            }
            if ( ch >= '0' && ch <='9') {
                isdigit = true;
            }

            if(spclstrng.indexOf(ch) != -1) {
                ispcl = true;
            }
        }
        if(! islwer) {
            count++;
        }
        if(! isupper) {
            count++;
        }
        if(! isdigit) {
            count++;
        }
        if(!ispcl) {
            count++;
        }

        int len = 6 - str.length();
        if(len > count) {
            System.out.println(len);
        }
        else {
            System.out.println(count);
        }
    }
}
