import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        // Scanner created
        Scanner sc = new Scanner(System.in);
        // Madlib Strings
        String madLib = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        // String madLib = "Once upon a time in <adjective> land, a <noun> <adverb>
        // grew.";
        // String madLib = "I saw <proper noun> <verb> all over the land, and eating the
        // <noun> growing on the land.";

        // indexes
        int openBracketIndex1 = madLib.indexOf("<");
        int closeBracketIndex1 = madLib.indexOf(">");
        int openBracketIndex2 = madLib.indexOf("<", openBracketIndex1 + 1);
        int closeBracketIndex2 = madLib.indexOf(">", closeBracketIndex1 + 1);
        int openBracketIndex3 = madLib.indexOf("<", openBracketIndex2 + 1);
        int closeBracketIndex3 = madLib.indexOf(">", closeBracketIndex2 + 1);

        // Prompt user to enter first word
        System.out.println("Enter a " + madLib.substring(openBracketIndex1 + 1, closeBracketIndex1));
        String input1 = sc.nextLine();

        System.out.println("Enter a " + madLib.substring(openBracketIndex2 + 1, closeBracketIndex2));
        String input2 = sc.nextLine();

        System.out.println("Enter a " + madLib.substring(openBracketIndex3 + 1, closeBracketIndex3));
        String input3 = sc.nextLine();
    }
}
