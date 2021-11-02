
import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        int inputServerNumber = 0;
        int inputJobNumber = 0;

        System.out.println("[ 2 ] Bob farm.");

        System.out.println("Input number of servers : ");
        Scanner getInputServer = new Scanner(System.in);
        inputServerNumber = getInputServer.nextInt();
        System.out.println("Your number of server : " + inputServerNumber);

        System.out.println("Input job number : ");
        Scanner getJobsNumber = new Scanner(System.in);
        inputJobNumber = getJobsNumber.nextInt();
        System.out.println("Your number of jobs : " + inputJobNumber);

        getInputServer.close();
        getJobsNumber.close();

        String result = distribute(inputServerNumber, inputJobNumber);
        System.out.println(result);
    }

    public static String distribute(int servers, int jobs) {
        String result = "";
        int numberOfJobperServer = (int) Math.floor(jobs / servers);
        int workBias = jobs % servers;
        int currentJob = 0;

        System.out.println("-----------------------------");
        System.out.println("You have : " + numberOfJobperServer + " jobs per server.");
        System.out.println("Work bias : " + workBias);
        System.out.println("-----------------------------");

        for (int i = 1; i <= servers; i++) {
            int turnToEach = numberOfJobperServer;
            result += "[";
            if (workBias >= i)
                turnToEach += 1;
            for (int j = 1; j <= turnToEach; j++) {
                result += currentJob + " ";
                if (j < turnToEach) {
                    result += ",";
                }
                currentJob++;
            }

            result += "]";
            if (i < servers) {
                result += ",";
            }

        }
        return "[" + result + "]";

    }
}