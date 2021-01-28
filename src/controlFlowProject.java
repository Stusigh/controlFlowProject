import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class controlFlowProject {

    public static void main(String[] args) {

        asciiChars.printNumbers();
        asciiChars.printLowerCase();
        asciiChars.printUpperCase();
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("Do you wish to continue to the interactive portion?");
        String quitOrNot = sc.nextLine();
        if (!(quitOrNot.equals("Yes") || quitOrNot.equals("yes") || quitOrNot.equals("y") || quitOrNot.equals("Y"))) {
            System.exit(0);}
        else {
            while(true) {
                ArrayList<Integer> userInputNumbers = new ArrayList<>(4);
                ArrayList<String> userInputStrings = new ArrayList<>(3);

                System.out.println("What is the name of your favourite pet?");
                userInputStrings.add(sc.nextLine());


                System.out.println("What is the first name of your favourite actor?");
                userInputStrings.add(sc.nextLine());

                System.out.println("What's the last name of your favourite political leader?");
                userInputStrings.add(sc.nextLine());

                while(true) {
                    System.out.println("How old are you?");
                    userInputNumbers.add(sc.nextInt());
                    boolean truthCondition = inputValidator.numberValidator(userInputNumbers.get(0), 1, 99);
                    if(truthCondition) {
                        break;
                    }
                }

                while(true) {
                    System.out.println("What is your lucky number between 1 and 100?");
                    userInputNumbers.add(sc.nextInt());
                    boolean truthCondition = inputValidator.numberValidator(userInputNumbers.get(1), 1, 100);
                    if(truthCondition) {
                        break;
                    }
                }

                System.out.println("What is the two digit model number of your car?");
                userInputNumbers.add(sc.nextInt());

                while(true) {
                    System.out.println("Enter a number between 0 and 50");
                    userInputNumbers.add(sc.nextInt());
                    boolean truthCondition = inputValidator.numberValidator(userInputNumbers.get(3), 0, 50);
                    if(truthCondition) {
                        break;
                    }
                }


                int randomInt = (int) (Math.random()*10);
                int randomIntTwo = (int) (Math.random()*10);

                int magicBall = (randomInt * userInputNumbers.get(1))/randomIntTwo;
                int lotteryNumberOne = userInputStrings.get(0).charAt(2) - 65;
                int lotteryNumberTwo = (((userInputNumbers.get(2) + userInputNumbers.get(1)))/randomInt)/userInputStrings.get(1).charAt(1);
                int lotteryNumberThree = (42 * randomInt)/randomIntTwo;
                int lotteryNumberFour = userInputNumbers.get(3) + 15;
                int lotteryNumberFive = userInputStrings.get(2).charAt(1) - 65;

                System.out.println("Lottery numbers: " + lotteryNumberOne + ", " + lotteryNumberTwo + ", " + lotteryNumberThree + ", " + lotteryNumberFour + ", " + lotteryNumberFive + " Magic Ball: " + magicBall);
                sc = new Scanner(System.in);
                System.out.println("Would you like to answer these questions again to generate more numbers? Yes or No.");
                quitOrNot = sc.nextLine();
                if (!(quitOrNot.equals("Yes") || quitOrNot.equals("yes") || quitOrNot.equals("y") || quitOrNot.equals("Y"))) {
                    sc.close();
                    System.exit(0);}

            }

        }


    }
}

