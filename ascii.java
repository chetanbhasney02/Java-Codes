import java.util.*;
public class ascii {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character to check it's ASCII value:");
        char ch = sc.next().charAt(0);
        int value = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + value);
    }
}
