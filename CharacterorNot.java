import java.util.Scanner;

public class CharacterorNot {

        static void character(char c){
            if(isCharacter(c)){
                System.out.println(c + " is a Character");
            }
            else {
                System.out.println(c + " is not a Character") ;
            }
        }
        static boolean isCharacter(char c){

            return ((c >= 97 && c <= 122) || (c >= 65 && c <= 90));


        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            character(ch);
        }
    }


