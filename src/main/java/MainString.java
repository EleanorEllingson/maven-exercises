import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.Scanner;

public class MainString {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please type in a phrase");
        String phrase = userInput.nextLine();
        if (StringUtils.isNumeric(phrase)) {
            System.out.println(phrase + " is a number");
        } else {
            System.out.println(phrase + " is not a number");
        }
        System.out.println(StringUtils.swapCase(phrase));

        System.out.println(StringUtils.reverse(phrase));
    }
}