import java.util.Scanner;

public class RemoveBracks {
    static void removebracks(String  str){
        String result = "";
        result = str.replaceAll("[\\[\\](){}]","");
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removebracks(str);
    }
}
