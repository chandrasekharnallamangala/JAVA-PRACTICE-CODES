import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter comma separated text  :");
        String str = sc.next();
        String[] text = str.split(",");

        int sum = Integer.parseInt(text[0]) + Integer.parseInt(text[1]);
        System.out.println(sum);
        for (String i : text){
            System.out.print(i +" ");
        }

    }
}
