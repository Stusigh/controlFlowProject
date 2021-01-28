public class asciiChars {
    public static void printNumbers()
    {
        System.out.println("These are the valid numbers: ");
        for(int i = 48; i<=57; ++i) {
            char validCharacter = (char)i;
            System.out.print(validCharacter+", ");
        }
        System.out.println("\n");
    }

    public static void printLowerCase()
    {
        System.out.println("These are the valid lowercase letters:");
        for(int i = 97; i<=122; ++i) {
            char validCharacter = (char)i;
            System.out.print(validCharacter+", ");
        }
        System.out.println("\n");
    }

    public static void printUpperCase()
    {
        System.out.println("These are the valid uppercase letters:");
        for(int i = 65; i<=90; ++i) {
            char validCharacter = (char)i;
            System.out.print(validCharacter+", ");
        }
        System.out.println("\n");
    }
}
