import java.util.Scanner;

import java.lang.Math;

public class controlFlowProject {
    public static void main(String[] args) {
        // call to do all the things.
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("Do you wish to continue to the interactive portion?");
        String quitOrNot = sc.nextLine();
        if (!(quitOrNot.equals("Yes") || quitOrNot.equals("yes") || quitOrNot.equals("y") || quitOrNot.equals("Y"))) {
            System.exit(0);}
        else {
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

            System.out.println("Enter a number between 1 and 50");
            int userRandomNumber = sc.nextInt();

            int randomInt = (int) (Math.random());

            int magicBall = randomInt*userLuckyNumber;
            int lotteryNumberOne = userPetName.charAt(2)-65;
            int lotteryNumberTwo = ((userMakeCarNumber + userLuckyNumber) - 80);
            int lotteryNumberThree = 42*randomInt;
            int lotteryNumberFour = userRandomNumber + 15;
            int lotteryNumberFive = userFavPolitical.charAt(1)-65;

            System.out.println("Lottery numbers: "+ lotteryNumberOne + ' ' + lotteryNumberTwo + ' ' + lotteryNumberThree + ' ' + lotteryNumberFour + ' ' + lotteryNumberFive + " Magic Ball: "  + magicBall);



        }


    }
}

