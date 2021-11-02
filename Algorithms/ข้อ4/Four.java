import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        int inputNumber = 0;

        Scanner getInputNumber = new Scanner(System.in);
        System.out.println("How many Fibonicci do you want? :");
        inputNumber = getInputNumber.nextInt();
        System.out.println("You ask for " + inputNumber);
        getInputNumber.close();

        System.out.println("" + fiboCalculate(inputNumber));

    }

    public static String fiboCalculate(int number) {
        long currentFn = 1;
        long currentFPass = 1;
        long currentFLongPass = 0;
        String result = "";

        if (number <= 3) {
            result += currentFLongPass + " " + currentFPass + " " + currentFn;
        } else {
            result += currentFLongPass + " ";

            for (int i = 1; i < number; i++) {
                currentFn = currentFPass + currentFLongPass;
                currentFPass = currentFLongPass;
                currentFLongPass = currentFn;
                result += currentFn + " ";
            }
        }

        return result + "  Your result at F"+number+" is " + currentFn;
    }

}
