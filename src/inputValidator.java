public class inputValidator {
    static boolean numberValidator(int numberToValidate, int min, int max) {
        if(numberToValidate > max && numberToValidate < min) {
            System.out.println("This number is invalid. Please enter a number between "+ min + " and " + max);
            return false;
        }
        return true;
    }
}
