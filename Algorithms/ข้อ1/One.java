import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        int input = 0;

        System.out.println("[ 1 ] FizzBuzz");

        Scanner myObj = new Scanner(System.in);
        input = myObj.nextInt();
        myObj.close();
        System.out.println("Your input : " + input);

        String result = fizzBuzz(input);
        System.out.println(" Fizz or Buzz : " + result);

    }

    private static String fizzBuzz(int input) {
        String fizzOrBuzz = (input % 3 == 0 && input % 5 == 0 ? "FizzBuzz" : input % 3 == 0 ? "Fizz" : input % 5 == 00 ? "Buzz" : "");
        return fizzOrBuzz;
    }

}

