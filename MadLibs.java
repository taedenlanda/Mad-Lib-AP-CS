import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        // Scanner created
        Scanner sc = new Scanner(System.in);
        // Madlib Strings
        String madLib1 = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        String madLib2 = "Once upon a time in <adjective> land, a <noun> <adverb> grew.";
        String madLib3 = "I saw <proper noun> <verb> all over the land, and eating the <noun> growing on the land.";

        // Enter noun
        System.out.println("Enter a Noun: ");
        String nounOne = sc.nextline();

        // Enter a plural noun
        System.out.println("Enter a plural noun: ");
        String pluralNoun = sc.nextline();

        // Enter a number
        System.out.println("Enter a number: ");
        String number = sc.nextline();

    }
}
