public class inputValidator {
    static boolean numberValidator(int numberToValidate, int min, int max) {
        if(numberToValidate > max || numberToValidate < min) {
            System.out.println("This number is invalid. Please enter a number between "+ min + " and " + max);
            return false;
        } else {
            return true;
        }
    }
    static boolean stringValidator(String stringToValidate) {
        if (stringToValidate.length() == 0 || stringToValidate.length() > 20) {
            System.out.println("This name is invalid. Please enter a name under 20 characters long.");
            return false;
        } else {
            return true;
        }
    }
}


