
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString;
        System.out.print("Enter Your input string expression : ");
        inputString = input.next( );

        if (isPalindrome( inputString )){
            System.out.println(inputString+" is a palindrome.");
        }
        else{
            System.out.println(inputString+" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < input.length( ); i++){
            q.offer(input.charAt(i));
            s.push(input.charAt(i));
        }
        while (!q.isEmpty( )){
            if (q.poll().equals(s.pop())) {
            } else {
                return false;
            }
        }
        return true;
    }
}
