import java.util.Scanner;

public class StringAnagram {
    static void stringanagram(String str1,String  str2){
        char[] string1 = str1.toLowerCase().toCharArray();
        char[] string2 = str2.toLowerCase().toCharArray();
        if(string1.length != string2.length){
            System.out.println("Enter strings having same length");
            System.exit(0);
        }
        else{
            int count = 0;
            for(int i=0; i<string1.length; i++){
                if(string1[i] == string2[i]){
                    count++;
                }
            }
            if(count==string2.length){
                System.out.println("Anagram");
            }
            else {
                System.out.println("Not Anagram");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        stringanagram(str1,str2);


    }
}
