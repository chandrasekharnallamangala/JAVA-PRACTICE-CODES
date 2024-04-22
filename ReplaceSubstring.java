import java.util.Scanner;

public class ReplaceSubstring {
    static void replacesubstring(String original,String replacestring,String replacement){
        if(!original.contains(replacestring)){
            System.out.println("Substring does not exist in original string");
        }
        else {
            String modifiedstring;
            modifiedstring = original.replaceAll(replacestring,replacement);
            System.out.println(modifiedstring);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        String replacestring = sc.next();
        String replacment = sc.next();
        replacesubstring(original,replacestring,replacment);
    }
}
