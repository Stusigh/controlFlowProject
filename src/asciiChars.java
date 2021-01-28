public class asciiChars {
    public static void printNumbers()
    {
        // TODO: print valid numeric input
        System.out.println("You've reached the printNumbers method.");
        for(int i = 48; i<=57; ++i) {
            int asciiValue = i;
            char validCharacter = (char)asciiValue;
            System.out.println(validCharacter);
        }
    }

    public static void printLowerCase()
    {
        // TODO: print valid numeric input
        System.out.println("You've reached the printLowerCase method.");
        for(int i = 97; i<=122; ++i) {
            int asciiValue = i;
            char validCharacter = (char)asciiValue;
            System.out.println(validCharacter);
        }
    }

    public static void printUpperCase()
    {
        // TODO: print valid numeric input
        System.out.println("You've reached the printUpperCase method.");
        for(int i = 65; i<=90; ++i) {
            int asciiValue = i;
            char validCharacter = (char)asciiValue;
            System.out.println(validCharacter);
        }
    }
}
