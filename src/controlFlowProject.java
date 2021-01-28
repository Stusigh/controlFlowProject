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



                while(true) {
                    System.out.println("Do you have a favorite quarterback?");
                    String userInput = sc.next();
                    if (!(userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"))) {
                        userInputNumbers.add(1);
                        break;
                    } else {
                        System.out.println("What is their jersey number?");
                        Integer nextUserInput = sc.nextInt();
                        boolean truthCondition = inputValidator.numberValidator(nextUserInput, 1, 99);
                        if (truthCondition) {
                            userInputNumbers.add(nextUserInput);
                            break;
                        }
                    }
                }

                while(true) {
                    System.out.println("What is the age of your favourite pet, in years?");
                    Integer userInput = sc.nextInt();
                    boolean truthCondition = inputValidator.numberValidator(userInput, 1, 100);
                    if(truthCondition) {
                        userInputNumbers.add(userInput);
                        break;
                    }
                }

                while(true) {
                    System.out.println("What is your lucky number between 1 and 100?");
                    Integer userInput = sc.nextInt();
                    boolean truthCondition = inputValidator.numberValidator(userInput, 1, 100);
                    if(truthCondition) {
                        userInputNumbers.add(userInput);
                        break;
                    }
                }
                while(true) {
                    System.out.println("What is the two digit model number of your car?");
                    Integer userInput = sc.nextInt();
                    boolean truthCondition = inputValidator.numberValidator(userInput, 0, 99);
                    if(truthCondition) {
                        userInputNumbers.add(userInput);
                        break;
                    }
                }

                while(true) {
                    System.out.println("Enter a random number between 1 and 50");
                    Integer userInput = sc.nextInt();
                    boolean truthCondition = inputValidator.numberValidator(userInput, 1, 50);
                    if(truthCondition) {
                        userInputNumbers.add(userInput);
                        break;
                    }
                }


                int randomInt = (int) (Math.random()*5);
                int randomIntTwo = (int) (Math.random()*10);
                int randomIntThree = (int) (Math.random()*20);

                int magicBall = randomInt * userInputNumbers.get(2);
                if(magicBall >75) {
                    magicBall = magicBall - 75;
                }
                int lotteryNumberOne = userInputStrings.get(0).charAt(2) - 65;

                int lotteryNumberTwo = userInputNumbers.get(4) - randomInt;
                if(lotteryNumberTwo <0) {
                    lotteryNumberTwo = userInputNumbers.get(5);
                }
                int lotteryNumberThree = (42);

                int lotteryNumberFour = userInputNumbers.get(3) + 15;

                int lotteryNumberFive = userInputStrings.get(1).charAt(1) - 65;

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

