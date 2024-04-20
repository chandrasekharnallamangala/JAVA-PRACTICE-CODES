import java.util.Scanner;

public class StringReverse {
    private int top;
    private char[] chars;
    public char[] poparr;

    public StringReverse(int capacity) {
        top = -1;
        chars = new char[capacity];
    }
public boolean isFull() {
       return (chars.length == top+1);
    }


public boolean isEmpty() {
        return (top == -1);
}


    public void push(char ch) {
        if (isFull()) {
            throw new RuntimeException("Stack is Full");
        } else {
            top += 1;
            chars[top] = ch;
        }

    }


    public char[] pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        } else {
            int c = 0;
            poparr = new char[top + 1];

            while( c < chars.length){
                poparr[c] = chars[top];
                top -= 1;
                c++;

            }
        }
        return poparr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String str = sc.nextLine();
        int len = str.length();
        StringReverse strrev = new StringReverse(len);


        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            strrev.push(ch[i]);
        }



        char c[] = strrev.pop();
        for(int j = 0; j < c.length; j++) {
            System.out.println(c[j]);
        }



    }

}
