package framework.utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpUtils {
    public static String getCountResult(String text) {
        String regex = "[0-9]*$";
        String result  = "";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(text);
        matcher.find();
        return matcher.group(0);


    }
}
