package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[^a-z]");
        Matcher matcher = pattern.matcher("123");

        System.out.println(matcher.matches());


    }
}
