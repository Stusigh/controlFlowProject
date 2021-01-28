import java.util.Scanner;

import java.lang.Math;

public class controlFlowProject {

    public static void main(String[] args) {

        asciiChars.printNumbers();
        asciiChars.printLowerCase();
        asciiChars.printUpperCase();
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
                System.out.println("What is the name of your favourite pet?");
                String userPetName = sc.nextLine();


                System.out.println("What is the first name of your favourite actor");
                String userFavActor = sc.nextLine();

                System.out.println("Who's your favourite political leader?");
                String userFavPolitical = sc.nextLine();

                System.out.println("How old are you?");
                int userAge = sc.nextInt();

                System.out.println("What is your lucky number?");
                int userLuckyNumber = sc.nextInt();

                System.out.println("What is the two digit model number of your car?");
                int userMakeCarNumber = sc.nextInt();

                int userRandomNumber;

                while(true) {
                    System.out.println("Enter a number between 0 and 50");
                    userRandomNumber = sc.nextInt();
                    boolean truthCondition = inputValidator.numberValidator(userRandomNumber, 0, 50);
                    if(truthCondition) {
                        break;
                    }
                }

                int randomInt = (int) (Math.random()*10);

                int magicBall = randomInt * userLuckyNumber;
                int lotteryNumberOne = userPetName.charAt(2) - 65;
                int lotteryNumberTwo = ((userMakeCarNumber + userLuckyNumber) - 80);
                int lotteryNumberThree = 42 * randomInt;
                int lotteryNumberFour = userRandomNumber + 15;
                int lotteryNumberFive = userFavPolitical.charAt(1) - 65;

                System.out.println("Lottery numbers: " + lotteryNumberOne + ", " + lotteryNumberTwo + ", " + lotteryNumberThree + ", " + lotteryNumberFour + ", " + lotteryNumberFive + " Magic Ball: " + magicBall);
                sc = new Scanner(System.in);
                System.out.println("Would you like to answer these questions again to generate more numbers? Yes or No.");
                quitOrNot = sc.nextLine();
                if (!(quitOrNot.equals("Yes") || quitOrNot.equals("yes") || quitOrNot.equals("y") || quitOrNot.equals("Y"))) {
                    System.exit(0);}

            }

        }


    }
}

